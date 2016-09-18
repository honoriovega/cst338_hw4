public class BankDemo
{
	public static void main(String[] args)
	{
		Bank csumbBank = new Bank("CSUMB");
		
		System.out.println("\n============ Three New Accounts ========");
		csumbBank.openAccount("Tom Smith", "123 University Center 93955",
							  77777, 1000, 1, 10.35);
		
		csumbBank.openAccount("Alice Smith", "123 University Center 93955",
							  88888, 2000, 1, 50.25);
		
		csumbBank.openAccount("Joe Otter", "2440 Ocean Avenue 93900",
							   99999, 3000, 2, 100.20);
				
		System.out.println("\n========== Bank Info ===========");
		csumbBank.bankInfo();
		
		
		System.out.println("\n================ Close Acccount =======");
		System.out.println(csumbBank.closeAccount(1000));
		System.out.println(csumbBank.closeAccount(7000));
		
		System.out.println("=============== Account Info ==========");
		csumbBank.accountInfo(2000);
		
		System.out.println(csumbBank.accountInfo(7000));
	}
	
}
/*
A sample of your program should look like:

============= Three New Accounts ===========

============= Bank Info ===============
Bank Name: CSUMB
Number of Accounts: 3
	1000: $10.00 - Tom Smith: 7777
	2000: $50.25 - Alice Smith: 88888
	3000: $100.25 - Joe Otter: 9999

Bank Total Balance: $160.60

========== Close Account ===========
Account Info: Account Number: 2000
	Checking account
	Balance: $50.25

Customer: Alice Smith
	123 University Center 93955
	SNN: 8888

false
*/
