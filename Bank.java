public class Bank {

	 private String name;
	
	 // public Person people[];
	 private Account accounts[]; // can have max 5 accounts
	 int numAccounts;
	
	
	 // add more variables if necessary
	
	
	 public Bank(String name) {
	  numAccounts = 0;
	  this.name = name;
	  accounts = new Account[5];
	  for (int i = 0; i < 5; i++)
	   accounts[i] = null;
	 }
	
	 /*
	("Tom Smith", "123 University Center 93955",
								  77777, 1000, 1, 10.0);
		*/
	
	 public boolean openAccount(String name, String addr, int ssn, int accountNumber, int accountType, double balance) {
	  // add account with info given
		
		/*
		if a customer with the SSN already has an account in the bank, your method should
return false as well
		*/
	
		// it's full. cannot add more accounts
		if(numAccounts == 5)
			return false;
		
		
		// account number exists
		
		int index = search(accountNumber, ssn);
		
		
			  // if the account number exists return the adress
	  // where it is located, otherwise return -1 which
	  // means the account does not exist
		
		// if i = -1
		// means it an account exists
		
		if(index != -1)
			return false;
		
		// find the first empty stop
		for(int i = 0; i < 5; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = new Account(accountNumber, accountType, balance, new Customer(name, addr, ssn));
				break;
			}
		}
		
	  // if the account number is already take return false
	  //System.out.println("open account");
	  // public Account(int accNum, int accType, int double,Customer c)
	  numAccounts++;
	
	  return true;
	
	  // if the customer with a SNN has an account then return false
	 }
	
	
	 // try to integrate pass by reference
	 public boolean closeAccount(int accNum) {
	  System.out.println("close Account");
	  if (!accountExists(accNum) || numAccounts == 0) {
	   System.out.println("was called: ");
	   return false;
	
	  }
	  for (int i = 0; i < 5; i++) {
	
	   //System.out.println("Account number: " + accounts[i].getAccountNumber() );
	   System.out.print("\tcalled");
	   if (accounts[i] == null)
	    continue;
	
	   if (accounts[i].getAccountNumber() == accNum) {
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
	
	 public boolean updateAddress(int accNum, String addr) {
		 //+ updateAddress(accNum:int, addr:String): boolean
		 int index = search(accNum,-1);
		 if(index == -1)
			return false;
		
		accounts[index].changeAddress(addr);
		return true;
		
	 // System.out.println("updatadres");
	 
	  // return false if account doesn' exist
	 }
	
	 public void bankInfo() {
	  // display info
	  System.out.println("BankInfo");
	  System.out.println("Bank Name: " + name);
	  System.out.println("Number of Accounts: " + numAccounts);
	
	  if (numAccounts == 0)
	   return;
	  /*
				 		Bank Name: CSUMB
	Number of Accounts: 3
				*/
	
	
	
	  double totalBalance = 0;
	  for (int i = 0; i < 5; i++) {
			if (accounts[i] == null)
				continue;
	    
			System.out.println("   " + accounts[i]);
			totalBalance += accounts[i].getBalance();
	  }
	  
	  System.out.printf("\nBank Total Balance: $%.2f\n",  totalBalance);
	
	  // if account doesn exists rerutn falee
	 }
	
	 public boolean updateBalance(int accountNumber, double balance) {
		
	  if(balance < 0)
		return false;
	
	  int index = search(accountNumber, -1);
	  
	  if(index == -1)
		return false;
	
	  accounts[index].setBalance(balance);
	  //System.out.println("updateBalance");
	  // if the account number doesn't exist in the bank
	  // if the balance is negative number return false
	
	  return true;
	
	 }
	
	 public boolean accountInfo(int accNum) {
	  if (!accountExists(accNum))
	   return false;
	
	  int save = 0;
	  for (int i = 0; i < 5; i++) {
	   if (accounts[i] == null)
	    continue;
	
	   if (accounts[i].getAccountNumber() == accNum)
	    save = i;
	  }
	
	  System.out.printf("Account number: %d\nType of account: %s Account\nBalance: %s \n%s",
	   accounts[save].getAccountNumber(), (accounts[save].getAccountType() == 1 ? "Checking" : "Savings "),
	   accounts[save].getBalance(), accounts[save].getCustomer());
	
	  /*
	  System.out.println("Account number: " + accounts[save].getAccountNumber() +
	  				 "\nType of account: " + (accounts[save].getAccountType() == 1 ? "Checking" : "Savings ") +  "Account\nBalance: " + accounts[save].getBalance() 
	  				 + accounts[save].getCustomer() );
	  */
	
	  /*
			Account Info: Account Number: 2000
		Checking account
		Balance: $50.25
	
	Customer: Alice Smith
		123 University Center 93955
		SNN: 8888
	
			*/
	
	  return true;
	
	
	 }
	
	 private boolean accountExists(int accNumber) {
	  for (int i = 0; i < 5; i++) {
	   // skip it
	   if (accounts[i] == null)
	    continue;
	
	   if (accounts[i].getAccountNumber() == accNumber)
	    return true;
	  }
	
	  return false;
	  // loop through and find
	 }

	// if found return index
	// other wise return -1
	
	  // if the account number exists return the adress
	  // where it is located, otherwise return -1 which
	  // means the account does not exist
	 private int search(int accNumber, int ssNumber) {
		 
	  for (int i = 0; i < 5; i++) {
	   // skip it
	   if (accounts[i] == null)
	    continue;
	
	   if (accounts[i].getAccountNumber() == accNumber || accounts[i].getSSNumber() == ssNumber)
	    return i;
	  }
	
	  return -1;
	  // loop through and find
	 }
	
	 // if necessary add more methods
}
