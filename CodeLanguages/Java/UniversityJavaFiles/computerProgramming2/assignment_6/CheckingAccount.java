public class CheckingAccount extends Account
{
	// Attributes

	double overdraft;
	Account acc;

	// Constructors

	CheckingAccount()
	{
		acc = new Account(0,0);
		overdraft = 0;
	}

	CheckingAccount(int id_in, double balance_in, double overdraft_in)
	{
		acc = new Account(id_in, balance_in);
		overdraft  = overdraft_in;
	}

	// Operations

	public double getOverdraft()
	{
		return overdraft;
	}

	public void setOverdraft(double overdraft_in)
	{
		overdraft = overdraft_in;
	}

	public String toString()
	{
		return "Checking Account" + "\n" + "ID: " + acc.getID() + "\n" + "Balance: $" + acc.getBalance() + "\n" + "Ovedraft: $" + overdraft + "\n" + "Date Created: " + date_created;
	}
 }