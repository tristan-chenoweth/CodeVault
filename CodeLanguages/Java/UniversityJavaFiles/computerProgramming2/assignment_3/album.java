import java.util.*;

public class album
{
	// Main Method

	public static void main (String [] args)
	{
		album a1 = new album();
		System.out.println(a1.to_string());
		System.out.println();
	}


	// Attributes

	private String album_title;
	private String album_artist;
	private int year;
	private String [] album_ = new String [14];

	private String track_list = "";

	// Constructors

	album()
	{
		album_title = "Discovery";
		album_artist = "Daft Punk";
		year = 2001;

		song s1 = new song("One More Time", "Daft Punk", 5, 20);
		song s2 = new song("Aerodynamic", "Daft Punk", 3, 27);
		song s3 = new song("Digital Love","Daft Punk", 4, 58);
		song s4 = new song("Harder, Better, Faster, Stronger","Daft Punk", 3, 45);
		song s5 = new song("Crescendolls","Daft Punk", 3, 31);
		song s6 = new song("Nightvision", "Daft Punk", 1, 44);
		song s7 = new song("Superheroes", "Daft Punk", 3, 57);
		song s8 = new song("High Life", "Daft Punk", 3, 22);
		song s9 = new song("Something About Us", "Daft Punk", 3, 51);
		song s10 = new song("Voyager", "Daft Punk", 3, 47);
		song s11 = new song("Veridis Quo", "Daft Punk", 5, 44);
		song s12 = new song("Short Circuit", "Daft Punk", 3, 26);
		song s13 = new song("Face to Face", "Daft Punk", 3, 58);
		song s14 = new song("Too Long", "Daft Punk", 10, 00);

		album_ [0] = s1.to_string();
		album_ [1] = s2.to_string();
		album_ [2] = s3.to_string();
		album_ [3] = s4.to_string();
		album_ [4] = s5.to_string();
		album_ [5] = s6.to_string();
		album_ [6] = s7.to_string();
		album_ [7] = s8.to_string();
		album_ [8] = s9.to_string();
		album_ [9] = s10.to_string();
		album_ [10] = s11.to_string();
		album_ [11] = s12.to_string();
		album_ [12] = s13.to_string();
		album_ [13] = s14.to_string();

		for(int i = 0; i < album_.length; i++)
		{
			track_list += album_ [i] + "\n";
		}

	}

	// Operations

	public String to_string()
	{
		return "Title: " + album_title + "\n" + "Artist: " + album_artist + "\n" + "\n" +"Tracks:" + "\n" + "\n" + track_list;
	}
}