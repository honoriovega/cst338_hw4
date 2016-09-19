import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Account {
 private int accNum;
 private int accType;
 private Customer accountholder;
 private double balance;

 public void changeAddress(String address) {
  accountholder.setAddress(address);
 }

 public Account() {
  accNum = 0;
  accType = 0;
  accountholder = new Customer();
 }

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

 public int getSSNumber() {
  return accountholder.getSSN();
 }

 public String toString() {

  NumberFormat formatter = new DecimalFormat(".00");

  return accNum + ": $" + formatter.format(balance) + " - " + 
	accountholder.getName() + ": " + accountholder.getSSN();
 }

 public Customer getCustomer() {
  return accountholder;
 }

}
