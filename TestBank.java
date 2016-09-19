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

