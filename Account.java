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
		Customer = null;
	}
	
	public Account(int accNum, int accType, Customer c)
	{
		this.accNum = accNum;
		this.accType = accType;
		accountholder = c;
	}
	
	// if necessary addmore variabla
	
	
	// add method for the Homework
	
}
