public class Account 
{
	private int accNum;
	private int accType;
	private Customer accountholder; // holds the customer object for the account
	private int balance;
	
	// accType 1 is checking
	// accType 2 is savings
	
	
	
	
	public Account()
	{
		accNum = 0;
		accType = 0;
		accountholder = new Customer();
	}
	
	// Customer(String name, String address, int ssn)
	public Account(int accNum, int accType, int balance,Customer c)
	{
		setAccountNumber(accNum);
		setAccountType(accType);
		setAccountHolder(c);
		setBalance(balance);
		c = accountholder;
	}
	
	void setAccountNumber(int accNum)
	{
		this.accNum = accNum;
	}
	
	void setAccountType(int accType)
	{
		this.accType = accType;
	}
	
	void setAccountHolder(Customer c)
	{
		accountholder = c;
	}
	
	void setBalance(int balance)
	{
		this.balance = balance;
	}
	
	public int getAccountNumber()
	{
		return accNum;
	}
	
	public int getAccountType()
	{
		return accType;
	}
	
	public String toString()
	{
		/*
		Bank Name: CSUMB
Number of Accounts: 3
	1000: $10.00 - Tom Smith: 7777
	2000: $50.25 - Alice Smith: 88888
	3000: $100.25 - Joe Otter: 9999

Bank Total Balance: $160.60
		*/
		return accNum + ": $" + balance + " - " + accountholder.getName() + ": " + accountholder.getSSN();
	}
	
	// if necessary addmore variabla
	
	
	// add method for the Homework
	
}
