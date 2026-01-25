from app.services.aggregator import get_political_articles

def main():
    articles = get_political_articles()

    print(f"\n🗞 Political News Digest ({len(articles)} articles)\n")

    for i, article in enumerate(articles[:20], start=1):
        print(f"{i}. {article.title}")
        print(f"   Source: {article.source}")
        print(f"   Link: {article.url}\n")

if __name__ == "__main__":
    main()
