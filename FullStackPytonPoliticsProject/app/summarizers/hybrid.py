from app.summarizers.local import LocalSummarizer
from app.summarizers.api import ApiSummarizer

class HybridSummarizer:
    def __init__(self):
        self.local = LocalSummarizer()
        self.api = ApiSummarizer()

    def summarize(self, text: str) -> str:
        summary = self.local.summarize(text)

        if summary and len(summary.split()) > 30:
            return summary

        # fallback
        api_summary = self.api.summarize(text)
        if api_summary:
            return api_summary

        return "Summary unavailable."
