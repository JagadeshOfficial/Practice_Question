package Instance;
//To Print the Instance Variables
public class Employee {
	
	//Instance Variable Should be Global Variable 
	int empid=110;
	String empname="Jagadesh";
	
	public static void main(String[] args) {
		Employee e = new Employee();
		
		System.out.println("Empid : "+e.empid);
		System.out.println("EmpName : "+e.empname);

	}

}
