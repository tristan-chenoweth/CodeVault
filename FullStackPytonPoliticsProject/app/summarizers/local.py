from transformers import pipeline

class LocalSummarizer:
    def __init__(self):
        self.summarizer = pipeline(
            "summarization",
            model="facebook/bart-large-cnn"
        )

    def summarize(self, text: str) -> str | None:
        if not text or len(text.split()) < 100:
            return None

        try:
            result = self.summarizer(
                text[:4000],
                max_length=130,
                min_length=40,
                do_sample=False
            )
            return result[0]["summary_text"]
        except Exception:
            return None
