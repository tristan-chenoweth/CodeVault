import java.util.*;

public class date
{
	public static void main (String [] args)
		{
			date d1 = new date();
			System.out.println("Date 1: " + d1.to_string());

			date d2 = new date(2018,2,16);
			System.out.println("Date 2: " + d2.to_string());
	}

	// Attributes

	int year;
	int month;
	int day;


	// Constructors

	date()
	{
		year = Calendar.getInstance().get(Calendar.YEAR);
		month = Calendar.getInstance().get(Calendar.MONTH)+1;
		day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	}

	date(int year_in, int month_in, int day_in)
	{
		year = year_in;
		month = month_in;
		day = day_in;
	}





	// Operations
	public String to_string()
	{
		return year + "-" + month + "-" + day;
	}

}