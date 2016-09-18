public class Bank 
{
	
	private String name;
	
	// public Person people[];
	private Account accounts[]; // can have max 5 accounts
	int numAccounts;

	
	// add more variables if necessary
	
	
	public Bank(String name)
	{
		numAccounts = 0;
		this.name = name;
		accounts = new Account[5];
		for(int i = 0; i < 5; i++)
			accounts[i] = new Account();
	}
	
	/*
("Tom Smith", "123 University Center 93955",
							  77777, 1000, 1, 10.0);
	*/
	
	public boolean openAccount(String name, String addr, int ssn, int accountNumber,int accountType, int balance)
	{
		// add account with info given
		
		
	// if the account number is already take return false
			System.out.println("open account");
	// public Account(int accNum, int accType, int balance,Customer c)
		accounts[numAccounts++] = new Account(accountNumber, accountType, balance, new Customer(name, addr, ssn));
	
	return true;

	// if the customer with a SNN has an account then return false
	}
	
	
	// try to integrate pass by reference
	public boolean closeAccount(int accNum)
	{
		System.out.println("close Account");
		if(!accountExists(accNum) || numAccounts == 0)
		{
			System.out.println("was called: ");
			return false;
		
		}
		for(int i = 0; i < 5; i++)
		{
		
		//System.out.println("Account number: " + accounts[i].getAccountNumber() );
			System.out.print("\tcalled");
			if(accounts[i] == null)
				continue;
	
			if(accounts[i].getAccountNumber() == accNum)
			{
				System.out.println("should have got deleted: ");
				accounts[i] = null;
				
				break;
			}
			
		}
		
		numAccounts--;
		
		
			// delete an account
				
		return true;

			// if the account doesn't exist reutrn false
	}
	
	public boolean updateAddress(int accNum, String addr)
	{
				System.out.println("updatadres");
		return true;

		// return false if account doesn' exist
	}
	
	public void bankInfo()
	{
		// display info
			System.out.println("BankInfo");
				System.out.println("Bank Name: " + name);
			System.out.println("Number of Accounts: " + numAccounts);
			
			if(numAccounts == 0)
				return;
			/*
			 		Bank Name: CSUMB
Number of Accounts: 3
			*/
			
		
			for(int i = 0; i < 5; i++)
			{
				if(accounts[i] == null)
					continue;
				
				System.out.println(accounts[i]);
			}

		// if account doesn exists rerutn falee
	}
	
	public boolean updateBalance()
	{
		System.out.println("updateBalance");
		// if the account number doesn't exist in the bank
		// if the balance is negative number return false
		
				return true;

	}
	
	public boolean accountInfo(int accNum)
	{
		if(!accountExists(accNum))
			return false;
		
		int save;
		for(int i = 0; i < 5; i++)
		{
			if(accounts[i] == null)
				continue;
			
			if(accounts[i].getAccountNumber() == accNum)
				save = i;
		}
		
		System.out.println("Account number
		
		/*
		Account Info: Account Number: 2000
	Checking account
	Balance: $50.25

Customer: Alice Smith
	123 University Center 93955
	SNN: 8888

		*/
		
	
	}
	
	private boolean accountExists(int accNumber)
	{
		for(int i = 0; i < 5; i++)
		{
			// skip it
			if(accounts[i] == null)
				continue;
			
			if(accounts[i].getAccountNumber() == accNumber)
				return true;
		}
		
		return false;
		// loop through and find
	}
	
	// if necessary add more methods
}
