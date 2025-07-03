package OOPS;
class Employee{
	
	int empNum;
	String empName;
	double empSalary;
	
	void setEmpDetails()
	{
		empNum = 1111;
		empName = "Jagadesh";   //hard coded data
		empSalary = 90000.0;
	}
	
	void dispEmpDeatils()
	{
		System.out.println("Emp Num = " +empNum);
		System.out.println("Emp Name = " +empName);
		System.out.println("Emp Salary = " +empSalary);
	}
	
}
public class EmployeeSample {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpDetails();
		e1.dispEmpDeatils();
		Employee e2 = new Employee();
		e2.setEmpDetails();
		e2.dispEmpDeatils();

	}

}
