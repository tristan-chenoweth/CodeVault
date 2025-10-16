public class TestAccounts
{
    public static void main(String[] args)
    {
        Account a1 = new Account();
        System.out.println(a1);

        System.out.println();

        a1.setID(9999999);
        a1.setBalance(1000.0);
        System.out.println(a1);

        System.out.println();

        a1.withdraw(500.0);
        System.out.println("After withdraw(): $" + a1.getBalance());

        a1.deposit(250.0);
        System.out.println("After deposit(): $" + a1.getBalance());

        System.out.println();

        Account a2 = new Account(1234567, 100.0);
        System.out.println(a2);

        System.out.println();

        CheckingAccount c1 = new CheckingAccount();
        System.out.println(c1);

        System.out.println();
        System.out.println("ID: " + c1.getID());
        System.out.println("Balance: $" + c1.getBalance());
        System.out.println("Overdraft: $" + c1.getOverdraft());
        System.out.println("Date Created: " + c1.getDateCreated());

        System.out.println();

        CheckingAccount c2 = new CheckingAccount(2222222, 1234.56, 500.0);
        System.out.println(c2);

        System.out.println();

        System.out.println("Overdraft: $" + c2.getOverdraft());
        c2.setOverdraft(2000.0);
        System.out.println("Overdraft: $" + c2.getOverdraft());

        System.out.println();

        SavingsAccount s1 = new SavingsAccount();
        System.out.println(s1);

        System.out.println();
        System.out.println("ID: " + s1.getID());
        System.out.println("Balance: $" + s1.getBalance());
        System.out.println("Annual Interest Rate: " + s1.getAnnualInterestRate());
        System.out.println("Date Created: " + s1.getDateCreated());

        System.out.println();

        SavingsAccount s2 = new SavingsAccount(3333333, 550.0, 0.15);
        System.out.println(s2);

        System.out.println();

        System.out.println("Annual Interest Rate: " + s2.getAnnualInterestRate());
        s2.setAnnualInterestRate(0.35);
        System.out.println("Annual Interest Rate: " + s2.getAnnualInterestRate());
    }
}