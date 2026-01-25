from app.services.aggregator import get_political_articles

def main():
    articles = get_political_articles(with_summary=True)

    print(f"\n🗞 Political News Digest\n")

    for i, article in enumerate(articles[:10], start=1):
        print(f"{i}. {article.title}")
        print(f"   Source: {article.source}")
        print(f"   Summary:")
        print(f"   {article.summary}")
        print(f"   Link: {article.url}\n")

if __name__ == "__main__":
    main()
