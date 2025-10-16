import java.util.*;
import java.lang.*;

public class pixel
{
	// Methods

	public static void main(String [] args)
	{
		pixel p1 = new pixel();
		System.out.println("Pixel 1: " + p1.to_string());

		pixel p2 = new pixel();
		p2.set_red(0);
		p2.set_green(255);
		p2.set_blue(128);
		System.out.println("Pixel 2: " + p2.to_string());

		System.out.println("Random Pixel: " + create_random_pixel());
	}

	public static String create_random_pixel()
	{
		pixel random_p = new pixel();

		random_p.set_red((int)get_random_int());
		random_p.set_green((int)get_random_int());
		random_p.set_blue((int)get_random_int());

		return random_p.to_string();
	}

	public static double get_random_int()
	{
		double min = Math.ceil(0);
		double max = Math.floor(256);
		return Math.floor(Math.random() * (max - min)) + min; //The maximum is exclusive and the minimum is inclusive
	}
	// Attributes

	private int red;
	private int green;
	private int blue;

	// Constructors

	pixel()
	{
		red = 0;
		green = 0;
		blue = 0;
	}

	pixel(int red_in, int green_in, int blue_in)
	{
		red = red_in;
		green = green_in;
		blue = blue_in;
	}

	// Operations

	public String to_string()
	{
		return "(" + red + "," + green + "," + blue + ")";
	}

	public void set_red(int red_set)
	{
		if (red_set <= 255 && red_set >=0)
		{
			red = red_set;
		}
		else if (red_set < 0)
		{
			red = 0;
		}

		else if (red_set > 255)
		{
			red = 255;
		}
	}

	public int get_red()
	{
		return red;
	}

	public void set_green(int green_set)
	{
		if (green_set <= 255 && green_set >=0)
		{
			green = green_set;
		}
		else if (green_set < 0)
		{
			green = 0;
		}

		else if (green_set > 255)
		{
			green = 255;
		}
	}

	public int get_green()
	{
		return green;
	}

	public void set_blue(int blue_set)
	{
		if (blue_set <= 255 && blue_set >=0)
		{
			blue = blue_set;
		}
		else if (blue_set < 0)
		{
			blue = 0;
		}

		else if (blue_set > 255)
		{
			blue = 255;
		}
	}

	public int get_blue()
	{
		return blue;
	}
}