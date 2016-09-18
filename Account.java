public class Account 
{
	private int accNum;
	private int accType;
	private Customer accountholder; // holds the customer object for the account
	
	
	// accType 1 is checking
	// accType 2 is savings
	
	
	
	
	public Account()
	{
		accNum = 0;
		accType = 0;
		accountholder = null;
	}
	
	public Account(int accNum, int accType, Customer c)
	{
		setAccountNumber(accNum);
		setAccountType(accType);
		setAccountHolder(c);
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
	
	public int getAccountNumber()
	{
		return accNum;
	}
	
	public int getAccountType()
	{
		return accType;
	}
	
	// if necessary addmore variabla
	
	
	// add method for the Homework
	
}
