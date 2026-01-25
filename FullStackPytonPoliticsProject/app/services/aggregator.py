from app.fetchers.rss import fetch_rss_articles
from app.filters.politics import is_political
from app.summarizers.hybrid import HybridSummarizer

summarizer = HybridSummarizer()

def get_political_articles(with_summary=True):
    raw_articles = fetch_rss_articles()
    political_articles = []

    for article in raw_articles:
        combined_text = " ".join(filter(None, [
            article.title,
            article.summary,
            article.content
        ]))

        if not is_political(combined_text):
            continue

        if with_summary:
            article.summary = summarizer.summarize(combined_text)

        political_articles.append(article)

    return political_articles
