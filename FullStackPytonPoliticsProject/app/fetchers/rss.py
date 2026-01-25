import feedparser
from datetime import datetime
from app.models.article import Article

RSS_FEEDS = {
    "Reuters Politics": "https://www.reuters.com/world/politics/rss",
    "BBC Politics": "http://feeds.bbci.co.uk/news/politics/rss.xml",
    "AP Politics": "https://apnews.com/hub/politics?rss",
    "Al Jazeera Politics": "https://www.aljazeera.com/xml/rss/all.xml"
}

def fetch_rss_articles():
    articles = []

    for source, url in RSS_FEEDS.items():
        feed = feedparser.parse(url)

        for entry in feed.entries:
            articles.append(
                Article(
                    title=entry.get("title"),
                    summary=entry.get("summary"),
                    content=entry.get("content", [{}])[0].get("value"),
                    source=source,
                    url=entry.get("link"),
                    published_at=datetime(*entry.published_parsed[:6])
                    if "published_parsed" in entry else None
                )
            )

    return articles
