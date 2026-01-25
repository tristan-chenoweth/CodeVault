from app.fetchers.rss import fetch_rss_articles
from app.filters.politics import is_political

def get_political_articles():
    raw_articles = fetch_rss_articles()
    political_articles = []

    for article in raw_articles:
        combined_text = " ".join(filter(None, [
            article.title,
            article.summary,
            article.content
        ]))

        if is_political(combined_text):
            political_articles.append(article)

    return political_articles
