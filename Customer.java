public class Customer {

 private int ssn;
 private String address;
 private String name;


 // Default Constructor
 public Customer() {
  ssn = 0;
  address = "";
  name = "";
 }

 // Argument Constructor
 public Customer(String name, String address, int ssn) {
  setName(name);
  setAddress(address);
  setSSN(ssn);
 }

 public String toString() {

  return ("Customer: " + name + "\n   " + address + "\n   SSN: " + ssn + "\n");
 }

 public int getSSN() {
  return ssn;
 }

 public String getAddress() {
  return address;
 }

 public String getName() {
  return name;
 }

 void setSSN(int ssn) {
  this.ssn = ssn;
 }

 void setAddress(String address) {
  this.address = address;
 }

 void setName(String name) {
  this.name = name;
 }
}
