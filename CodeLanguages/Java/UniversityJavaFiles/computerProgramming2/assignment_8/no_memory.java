import java.util.*;
import java.lang.*;

public class no_memory
{
	// Main Method
	public static void main (String [] args)
	{
		String [] s2 = new String [900000000];

		for (int i = 0; i < 900000000; i++)
		{
			s2[i] = "abcdefghijklmnopqrstuvwxyz";
		}
	}
}