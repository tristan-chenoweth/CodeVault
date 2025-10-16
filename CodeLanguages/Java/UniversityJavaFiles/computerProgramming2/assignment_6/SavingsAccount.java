public class SavingsAccount extends Account
{
	// Attributes

	double annualInterestRate;
	Account acc;

	// Constructors

	SavingsAccount()
	{
		acc = new Account(0,0);
		annualInterestRate = 0;
	}

	SavingsAccount(int id_in, double balance_in, double annualInterestRate_in)
	{
		acc = new Account(id_in, balance_in);
		annualInterestRate  = annualInterestRate_in;
	}

	// Operations

	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate_in)
	{
		annualInterestRate = annualInterestRate_in;
	}

	public String toString()
	{
		return "Savings Account" + "\n" + "ID: " + acc.getID() + "\n" + "Balance: $" + acc.getBalance() + "\n" + "Annual Interest Rate: " + annualInterestRate + "\n" + "Date Created: " + date_created;
	}
 }