import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Account {
	 private int accNum;
	 private int accType;
	 private Customer accountholder; // holds the customer object for the account
	 private double balance;
	
	 // accType 1 is checking
	 // accType 2 is savings
	
	
	public void changeAddress(String address)
	{
			accountholder.setAddress(address);
	} 
	

	 public Account() {
	  accNum = 0;
	  accType = 0;
	  accountholder = new Customer();
	 }
	
	 // Customer(String name, String address, int ssn)
	 public Account(int accNum, int accType, double balance, Customer c) {
	  setAccountNumber(accNum);
	  setAccountType(accType);
	  setAccountHolder(c);
	  setBalance(balance);
	  c = accountholder;
	 }
	
	 public void setAccountNumber(int accNum) {
	  this.accNum = accNum;
	 }
	
	 public void setAccountType(int accType) {
	  this.accType = accType;
	 }
	
	 public void setAccountHolder(Customer c) {
	  accountholder = c;
	 }
	
	 public void setBalance(double balance) {
	  this.balance = balance;
	 }
	
	
	 public double getBalance() {
	  return balance;
	 }
	
	 public int getAccountNumber() {
	  return accNum;
	 }
	
	 public int getAccountType() {
	  return accType;
	 }
	 
	 public int getSSNumber()
	 {
		 return accountholder.getSSN();
	 }
	

	 public String toString() {
	  /*
			Bank Name: CSUMB
	Number of Accounts: 3
		1000: $10.00 - Tom Smith: 7777
		2000: $50.25 - Alice Smith: 88888
		3000: $100.25 - Joe Otter: 9999
	
	Bank Total Balance: $160.60
			*/
			


		NumberFormat formatter = new DecimalFormat("#00000.00");    

		return accNum + ": $" + formatter.format(balance) + " - " 
					+ accountholder.getName() + ": " 
					+ accountholder.getSSN();
	 }
	
	 public Customer getCustomer() {
	   return accountholder;
	  }
	  // if necessary addmore variabla
	
	
	 // add method for the Homework

}
