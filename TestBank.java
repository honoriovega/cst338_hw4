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
	
		b1.openAccount("jessica","123 apple ave",1121,2000,1,300);
		b1.openAccount("andrea","123 apple ave",1874,3000,1,5200);
		b1.openAccount("emily","123 apple ave",2342,4000,1,3040);
		b1.openAccount("nadia","123 apple ave",4922,5000,1,3020);
	
		b1.bankInfo();
		b1.closeAccount(1000);
		line();
			b1.bankInfo();
		
		b1.closeAccount(2000);
		line();
		b1.bankInfo();
		b1.closeAccount(3000);
		line();
		b1.bankInfo();
		b1.closeAccount(4000);
		line();
		b1.bankInfo();
		line();
		b1.closeAccount(5000);
		line();
		
		b1.bankInfo();
	}
}

