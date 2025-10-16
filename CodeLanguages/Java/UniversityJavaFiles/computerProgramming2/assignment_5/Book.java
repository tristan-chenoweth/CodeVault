public class Book
{
	// Main Method

	// Attributes

	String title;
	String author;
	long isbn;

	// Constructors

	Book()
	{
		title = "The Art of War";
		author = "Sun Tzu";
		isbn = 1111111111;
	}

	Book(String title_in, String author_in, long isbn_in)
	{
		title = title_in;
		author = author_in;
		isbn = isbn_in;
	}

	// Operations

	public String getTitle()
	{
		return title;
	}

	public void setTitle (String title_in)
	{
		title = title_in;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author_in)
	{
		author = author_in;
	}

	public long getISBN()
	{
		return isbn;
	}

	public void setISBN(long isbn_in)
	{
		isbn = isbn_in;
	}

	public String toString()
	{
		return "\"" + title + "\" by " + author + " (" + isbn + ")";
	}
}