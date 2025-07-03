package OOPS;

class Employee2 {
	int empNum;
	String empName;
	double empSalary;
	
	void setEmpDetails(int empNum, String empName, double empSalary) {
		this.empNum = empNum;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	void dispEmpDeatils()
	{
		System.out.println("Emp Num = " +empNum);
		System.out.println("Emp Name = " +empName);
		System.out.println("Emp Salary = " +empSalary);
	}
	
}

public class EmployeeTest1 {

	public static void main(String[] args) {
		Employee2 e1 = new Employee2();
		e1.setEmpDetails(111, "Jagadesh", 100000.0);
		e1.dispEmpDeatils();
	}

}
