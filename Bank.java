public class Bank {

 private String name;

 private Account accounts[];
 int numAccounts;

 public Bank(String name) {
  numAccounts = 0;
  this.name = name;
  accounts = new Account[5];
  for (int i = 0; i < 5; i++)
   accounts[i] = null;
 }

 public boolean openAccount(String name, String addr, int ssn,
  int accountNumber, int accountType, double balance) {

  if (numAccounts == 5)
   return false;

  int index = search(accountNumber, ssn);

  if (index != -1)
   return false;

  // Find the first available spot
  for (int i = 0; i < 5; i++) {
   if (accounts[i] == null) 
   {
    accounts[i] = new Account(accountNumber, accountType, balance, new Customer(name, addr, ssn));
    break;
   }
  }

  numAccounts++;

  return true;

 }

 public boolean closeAccount(int accNum) {

  // No accounts to close
  if (numAccounts == 0) {

   return false;

  }

  int index = search(accNum, -1);

  // Account with that account number doesn't exis
  if (index == -1)
   return false;

  // Delete the account by setting its index to null
  accounts[index] = null;


  numAccounts--;

  return true;

 }

 public boolean updateAddress(int accNum, String addr) {

  int index = search(accNum, -1);
  if (index == -1)
   return false;

  accounts[index].changeAddress(addr);
  return true;

 }

 public void bankInfo() {

  System.out.println("Bank Name: " + name);
  System.out.println("Number of Accounts: " + numAccounts);

  if (numAccounts == 0)
   return;

  double totalBalance = 0;
  for (int i = 0; i < 5; i++) {
   if (accounts[i] == null)
    continue;

   System.out.println("   " + accounts[i]);
   totalBalance += accounts[i].getBalance();
  }

  System.out.printf("\nBank Total Balance: $%.2f\n", totalBalance);

 }

 public boolean updateBalance(int accountNumber, double balance) {

  // balance is negative, return false
  if (balance < 0)
   return false;

  int index = search(accountNumber, -1);
  if (index == -1)
   return false;

  accounts[index].setBalance(balance);

  return true;

 }

 public boolean accountInfo(int accNum) {

  // No accounts to print info
  if (numAccounts == 0)
   return false;

  int index = search(accNum, -1);

  // Account with that account number doesn't exis
  if (index == -1)
   return false;

  // If the above cases failed then the program should execute
  // here
  System.out.printf("Account number: %d\nType of account: %s Account\nBalance: %s \n%s",
   accounts[index].getAccountNumber(), (accounts[index].getAccountType() == 1 ? "Checking" : "Savings "),
   accounts[index].getBalance(), accounts[index].getCustomer());

  return true;

 }

 // Linear search to find the account number
 // If it exists returnt the index, otherwise return -1
 private int search(int accNumber, int ssNumber) {

  for (int i = 0; i < 5; i++) {

   if (accounts[i] == null)
    continue;

   if (accounts[i].getAccountNumber() == accNumber || accounts[i].getSSNumber() == ssNumber)
    return i;
  }

  return -1;

 }

}
