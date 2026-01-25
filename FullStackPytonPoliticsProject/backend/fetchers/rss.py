import feedparser
from typing import List, Dict

def fetch_rss_articles(url: str, max_articles: int = 5) -> List[Dict]:
    """
    Fetches articles from an RSS feed URL.

    Args:
        url (str): The RSS feed URL.
        max_articles (int): Maximum number of articles to return.

    Returns:
        List[Dict]: A list of articles with 'title', 'link', 'published', and 'summary'.
    """
    feed = feedparser.parse(url)
    articles = []

    for entry in feed.entries[:max_articles]:
        article = {
            "title": entry.get("title", ""),
            "link": entry.get("link", ""),
            "published": entry.get("published", ""),
            "summary": entry.get("summary", "")
        }
        articles.append(article)

    return articles
