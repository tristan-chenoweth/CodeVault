from fastapi import FastAPI
from typing import List

from backend.models.article import Article
from backend.services.aggregator import get_political_articles

from backend.storage.db import engine, Base
from backend.storage.article_table import ArticleTable

Base.metadata.create_all(bind=engine)

# -------------------------------------------------------------------
# Application setup
# -------------------------------------------------------------------

app = FastAPI(
    title="Political News Aggregator",
    description="Aggregates and filters political news from multiple sources",
    version="0.1.0",
)

# -------------------------------------------------------------------
# Health & metadata
# -------------------------------------------------------------------

@backend.get("/", tags=["meta"])
def root():
    return {
        "name": "Political News Aggregator",
        "status": "running",
        "version": backend.version,
    }


@backend.get("/health", tags=["meta"])
def health_check():
    return {"status": "ok"}


# -------------------------------------------------------------------
# Core API endpoints
# -------------------------------------------------------------------

@backend.get(
    "/news",
    response_model=List[Article],
    tags=["news"],
    summary="Get political news articles",
)
def get_news(limit: int = 50):
    """
    Fetch and return filtered political news articles.

    - Aggregates RSS feeds
    - Filters for political relevance
    - Returns structured article data
    """
    articles = get_political_articles()
    return articles[:limit]
