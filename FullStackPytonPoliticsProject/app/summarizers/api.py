import os
from openai import OpenAI

client = OpenAI(api_key=os.getenv("OPENAI_API_KEY"))

SYSTEM_PROMPT = """
You are a political news summarizer.
Summarize the article in 3 bullet points.
Use neutral, factual language.
Avoid speculation or opinion.
"""

class ApiSummarizer:
    def summarize(self, text: str) -> str | None:
        try:
            response = client.chat.completions.create(
                model="gpt-4o-mini",
                messages=[
                    {"role": "system", "content": SYSTEM_PROMPT},
                    {"role": "user", "content": text[:12000]}
                ],
                temperature=0.2
            )

            return response.choices[0].message.content
        except Exception:
            return None
