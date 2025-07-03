package OOPS;

class Employee1 {
	int empNum;
	String empName;
	double empSalary;
	
	void setEmpDetails(int eno, String eName, double eSalary) {
		empNum = eno;
		empName = eName;
		empSalary = eSalary;
	}
	void dispEmpDeatils()
	{
		System.out.println("Emp Num = " +empNum);
		System.out.println("Emp Name = " +empName);
		System.out.println("Emp Salary = " +empSalary);
	}
	
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		e1.setEmpDetails(111, "Jagadesh", 100000.0);
		e1.dispEmpDeatils();
	}

}
