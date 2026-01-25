from sqlalchemy import Column, Integer, String, DateTime, Text, UniqueConstraint
from app.storage.db import Base

class ArticleTable(Base):
    __tablename__ = "articles"

    id = Column(Integer, primary_key=True, index=True)
    title = Column(String, nullable=False)
    summary = Column(Text)
    content = Column(Text)
    source = Column(String, index=True)
    url = Column(String, nullable=False, unique=True)
    published_at = Column(DateTime)

    __table_args__ = (
        UniqueConstraint("url", name="uq_article_url"),
    )
