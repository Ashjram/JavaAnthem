
public class Customer {
	
	int custId;
	String custName;
	long custPhone;
	static final int countryCode=91;
	static int objectCount;
	public void displayDetails()
	{
		System.out.println(custId+"\t"+custName+"\t"+custPhone);
	}
	public Customer(){
		objectCount++;
		System.out.println("The object count" +objectCount);
	}
}
