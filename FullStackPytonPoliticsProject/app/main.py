from fastapi import FastAPI
from app.services.aggregator import get_political_articles

app = FastAPI(title="Political News Aggregator")

@app.get("/news")
def news():
    articles = get_political_articles()
    return articles
