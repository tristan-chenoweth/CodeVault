public class image
{
	// Methods
	public static void main (String [] args)
	{
		continue;
	}

	// Attributes

	private int width;
	private int height;
	private  pixel[][] data= new pixel[width][height];

	// Constructors

	image()
	{
		width = 5;
		height = 5;
		data = new pixel[width][height];
	}

	image(int width_in, int height_in)
	{
		width = width_in;
		height = height_in;
		pixel[][] data = pixel[width][height];
	}

	// Operations

	public int to_string()
	{
		return ;
	}

	public int get_width()
	{
		return width;
	}

	public void set_width(int width_in)
	{
		width = width_in;
	}

	public int get_height()
	{
		return height;
	}

	public void set_height(int height_in)
	{
		height = height_in;
	}
}