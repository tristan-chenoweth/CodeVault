from app.fetchers.rss import fetch_rss_articles
from app.filters.politics import is_political
from app.storage.db import SessionLocal
from app.storage.article_repository import save_articles, get_recent_articles
from app.models.article import Article


def get_political_articles(limit: int = 100):
    db = SessionLocal()

    try:
        # 1. Fetch fresh articles
        raw_articles = fetch_rss_articles()

        political_articles = []
        for article in raw_articles:
            combined_text = " ".join(
                filter(None, [article.title, article.summary, article.content])
            )

            if is_political(combined_text):
                political_articles.append(article)

        # 2. Save new ones (duplicates ignored)
        save_articles(db, political_articles)

        # 3. Read from database (single source of truth)
        rows = get_recent_articles(db, limit=limit)

        return [
            Article(
                title=row.title,
                summary=row.summary,
                content=row.content,
                source=row.source,
                url=row.url,
                published_at=row.published_at,
            )
            for row in rows
        ]

    finally:
        db.close()
