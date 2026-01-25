POLITICAL_KEYWORDS = {
    "election", "government", "parliament", "senate",
    "congress", "president", "prime minister",
    "policy", "law", "bill", "supreme court",
    "foreign", "diplomacy", "war", "sanctions"
}

def is_political(text: str) -> bool:
    if not text:
        return False
    text = text.lower()
    return any(keyword in text for keyword in POLITICAL_KEYWORDS)
