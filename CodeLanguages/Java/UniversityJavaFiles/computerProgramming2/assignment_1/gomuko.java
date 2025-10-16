import java.util.Scanner;

public class gomuko
{

	public static void main (String [] args)
	{
		char [][] board = new char [19][19];

		display_board(board);

		// use for loop to change player

	}


	public static void player(int player_turn)
	{

		player_turn = 1;

		while (player_turn == 1)
		{

			System.out.print("Player 1's Turn");
			System.out.print("Enter a row: ");
			System.out.print("Enter a column: ");

			player_turn = 2;

		}



		while (player_turn == 2)
		{

			System.out.print("Player 1's Turn");
			System.out.print("Enter a row: ");
			System.out.print("Enter a column: ");

			player_turn = 1;

		}


	}

	public static void display_board(char [][] board) // change to current board
	{

		for (int row = 0; row < 19; row++)
		{

			for (int col = 0; col < 19; col++)
			{

				System.out.print(". ");

			}

			System.out.println();

		}

	}

}