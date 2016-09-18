public class TestBank
{
	public static void line()
	{
				System.out.println("===================");
	}
	public static void main(String[] args)
	{
		Bank b1 = new Bank("Wells Fargo");
		
		b1.openAccount("alice","123 apple ave",1234,1000,1,1000);
	
		/*
		b1.openAccount("jessica","141 rider ave",1121,2000,1,300);
		b1.openAccount("andrea","12th st",1874,3000,1,5200);
		b1.openAccount("emily","411 central ave",2342,4000,1,3040);
		b1.openAccount("nadia","14 seiber st",4922,5000,1,3020);
		
		b1.closeAccount(3000);
		b1.closeAccount(4000);
		b1.closeAccount(5000);
		
		
		// delete an open account and place it into null
		
		for(int i = 0; i < 3; i++)
		{
			if(b1.openAccount("andrea","324 strange st",1142,4000,1,3040.50) == false)
			{
				System.out.println("Unable to open account");
			}
		}
		*/

		b1.bankInfo();
	
	
		
		if(b1.openAccount("richard","323 1st", 1124,2000,2,34.33) == false )
			System.out.println("Could not open account: ");
		
			if(b1.updateAddress(2000,"141 alexandria rd"))
			System.out.println("address changed: ");
			else
			System.out.println("unable to change address");
	
		
		b1.bankInfo();
		b1.accountInfo(2000);
		System.out.println("==============================");
		b1.updateBalance(2000,1500.50);
		b1.accountInfo(2000);
		
	}
}

