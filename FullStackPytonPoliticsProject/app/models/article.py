from pydantic import BaseModel
from datetime import datetime
from typing import Optional

class Article(BaseModel):
    title: str
    summary: Optional[str]
    content: Optional[str]
    source: str
    url: str
    published_at: Optional[datetime]