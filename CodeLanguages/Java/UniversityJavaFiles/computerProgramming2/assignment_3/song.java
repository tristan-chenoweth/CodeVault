public class song
{
	public static void main (String [] args)
	{
		song s1 = new song();
		System.out.println("Song 1: " + s1.to_string());
		System.out.println("Song 1: " + s1.to_string_album());

		song s2 = new song("Sukiyaki", "Kyu Sakamoto", 3, 9);
		System.out.println("Song 2: " + s2.to_string());
		System.out.println("Song 2: " + s2.to_string_album());
	}
	// Attributes

	String title;
	String artist;
	int min;
	int sec;

	// Constructors

	song()
	{
		title = "Fireflies";
		artist = "Owl City";
		min = 3;
		sec = 54;
	}

	song(String title_in, String artist_in, int min_in, int sec_in)
	{
		title = title_in;
		artist = artist_in;
		min = min_in;
		sec = sec_in;
	}

	// Operations

	public String to_string()
	{
		return title + " by " + artist + " (" + min + ":" + sec + ")" ;
	}

	public String to_string_album() // for the album class
	{
		return title + " (" + min + ":" + sec + ")" ;
	}
}