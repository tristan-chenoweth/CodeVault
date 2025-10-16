import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;


public class Account
{
	// Main Method
	public static void main (String [] args)
	{
	}

	// Attributes

	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	int id;
	double balance;
	Date date_created;


	// Constructors
	Account()
	{
		id = 0;
		balance = 0.0;
		Date date = new Date();
		date_created = date;
	}

	Account(int id_in, double balance_in)
	{
		id = id_in;
		balance = balance_in;
		Date date = new Date();
		date_created = date;
	}


	// Operations
	public int getID()
	{
		return id;
	}

	public void setID(int id_in)
	{
		id = id_in;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance_in)
	{
		balance = balance_in;
	}

	public String getDateCreated()
	{
		return date_created.toString(); // Format date to print date correctly
	}

	public void deposit(double amount_in)
	{
		balance += amount_in;
	}

	public void withdraw(double amount_out)
	{
		balance -= amount_out;
	}

	public String toString()
	{
		return "Account" + "\n" + "ID: " + id + "\n" + "Balance: $" + balance + "\n" + "Date Created: " + date_created;
	}

}