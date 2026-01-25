from sqlalchemy.orm import Session
from sqlalchemy.exc import IntegrityError

from app.storage.article_table import ArticleTable
from app.models.article import Article


def save_articles(db: Session, articles: list[Article]) -> int:
    inserted = 0

    for article in articles:
        row = ArticleTable(
            title=article.title,
            summary=article.summary,
            content=article.content,
            source=article.source,
            url=article.url,
            published_at=article.published_at,
        )

        db.add(row)
        try:
            db.commit()
            inserted += 1
        except IntegrityError:
            db.rollback()  # Duplicate URL → ignore

    return inserted


def get_recent_articles(db: Session, limit: int = 100):
    return (
        db.query(ArticleTable)
        .order_by(ArticleTable.published_at.desc())
        .limit(limit)
        .all()
    )
