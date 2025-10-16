public class movie
{
	public static void main (String [] args)
	{
		movie m1 = new movie();
		System.out.println("Movie 1: " + m1.to_string());

		movie m2 = new movie("Star Wars", 1997, 121);
		System.out.println("Movie 2: " + m2.to_string());
	}

	// Attributes

	String title;
	int year;
	int run_time;

	// Constructors

	movie()
	{
		title = "The Matrix";
		year = 1999;
		run_time = 136;
	}

	movie(String title_in, int year_in, int run_time_in)
	{
		title = title_in;
		year = year_in;
		run_time = run_time_in;
	}

	// Operations

	public String to_string()
	{
			return title + " (" + year + ") " + "(" + run_time + " minutes)" ;
	}
}