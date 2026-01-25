import os
from pathlib import Path

# =========================
# Base paths
# =========================

BASE_DIR = Path(__file__).resolve().parent.parent

# =========================
# Environment
# =========================

ENV = os.getenv("ENV", "development")
DEBUG = ENV == "development"

# =========================
# API Keys (optional)
# =========================

# OpenAI (for summarization fallback)
OPENAI_API_KEY = os.getenv("OPENAI_API_KEY", "")

# NewsAPI (optional secondary source)
NEWSAPI_KEY = os.getenv("NEWSAPI_KEY", "")

# =========================
# RSS Feeds
# =========================

RSS_FEEDS = {
    "Reuters Politics": "https://www.reuters.com/world/politics/rss",
    "BBC Politics": "http://feeds.bbci.co.uk/news/politics/rss.xml",
    "AP Politics": "https://apnews.com/hub/politics?rss",
    "Al Jazeera Politics": "https://www.aljazeera.com/xml/rss/all.xml",
    # World-focused sources
    "Reuters World": "https://www.reuters.com/world/rss",
    "BBC World": "http://feeds.bbci.co.uk/news/world/rss.xml",
}

# =========================
# Politics filtering
# =========================

POLITICAL_KEYWORDS = {
    "election", "government", "parliament", "senate",
    "congress", "president", "prime minister",
    "policy", "law", "bill", "supreme court",
    "foreign", "diplomacy", "war", "sanctions",
    "treaty", "nato", "united nations", "eu"
}

# =========================
# Summarization settings
# =========================

# Local model
LOCAL_SUMMARIZER_MODEL = "facebook/bart-large-cnn"

# Length thresholds
MIN_WORDS_FOR_SUMMARY = 100
LOCAL_MAX_INPUT_CHARS = 4_000
API_MAX_INPUT_CHARS = 12_000

# Summary size
SUMMARY_MIN_LENGTH = 40
SUMMARY_MAX_LENGTH = 130

# API fallback behavior
ENABLE_API_FALLBACK = True

# =========================
# Deduplication (future phase)
# =========================

SIMILARITY_THRESHOLD = 0.80
EMBEDDING_MODEL = "all-MiniLM-L6-v2"

# =========================
# Storage
# =========================

DATABASE_URL = f"sqlite:///{BASE_DIR}/data/news.db"

CACHE_SUMMARIES = True
SUMMARY_CACHE_TTL_HOURS = 24

# =========================
# Output / Digest
# =========================

MAX_ARTICLES_PER_DIGEST = 10
DEFAULT_TIMEZONE = "UTC"

# =========================
# Logging
# =========================

LOG_LEVEL = os.getenv("LOG_LEVEL", "INFO")
