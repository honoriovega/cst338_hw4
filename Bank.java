public class Bank 
{
	
	private String name;
	private Account accounts[]; // can have max 5 accounts
	
	// add more variables if necessary
	
	public Bank(String name)
	{
		this.name = name;
	}
	
	public boolean openAccount(String name, String addr, int ssn)
	{
		// add account with info given
		
		
	// if the account number is already take return false
			System.out.println("open account");

			return true;

	// if the customer with a SNN has an account then return false
	}
	
	public boolean closeAccount(int accNum)
	{
		
			// delete an account
					System.out.println("close Account");
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

		// if account doesn exists rerutn falee
	}
	
	public boolean updateBalance()
	{
		System.out.println("updateBalance");
		// if the account number doesn't exist in the bank
		// if the balance is negative number return false
		
				return true;

	}
	
	// if necessary add more methods
}
