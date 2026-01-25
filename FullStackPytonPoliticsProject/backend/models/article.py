from pydantic import BaseModel
from datetime import datetime
from typing import Optional


class Article(BaseModel):
    title: str
    summary: Optional[str] = None
    content: Optional[str] = None
    source: str
    url: str
    published_at: Optional[datetime] = None
