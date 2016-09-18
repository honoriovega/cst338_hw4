public class Customer
{

	private int ssn;
	private String address;
	private String name;

	
	// if necessary, add more variables
	
	
	public Customer()
	{
		ssn = 0;
		address = "";
		name = "";
	}
	
	public Customer(String name, String address, int ssn)
	{
		setName(name);
		setAddress(address);
		setSSN(ssn);

	}
	
	
	public int getSSN()
	{
		return ssn;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getName()
	{
		return name;
	}
	
	void setSSN(int ssn)
	{
		this.ssn = ssn;
	}
	
	void setAddress(String address)
	{
		this.address = address;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
}
