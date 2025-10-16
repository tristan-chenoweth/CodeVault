import java.util.*;

public class time
{
	public static void main(String [] args)
	{
		time t1 = new time();
		System.out.println(t1.to_string());
	}

	// Attributes

	int cur_time_milli;
	int cur_time_sec;
	int cur_time_min;
	int cur_time_hr;
	int cur_time_day;

	// Constructors

	time()
	{
		cur_time_milli = (int)System.currentTimeMillis();
		cur_time_sec = cur_time_milli / 1000;
		cur_time_min = cur_time_sec/60 % 60;
		cur_time_hr = cur_time_min/60 % 60;

	}

	time(int time_in)
	{
		//
	}

	// Operations
	public String to_string()
	{
		return (cur_time_hr) + ":" + (cur_time_min)  + ":" + cur_time_sec;
	}

}