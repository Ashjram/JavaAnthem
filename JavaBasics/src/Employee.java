
public class Employee {
	int empid;
	String empname;
	long empphone;
	public void displayDetails()
	{
		System.out.println(empid+"\t"+empname+"\t"+empphone);
	}
	public Employee(){
		System.out.println("The data is initialized");
	}
}
