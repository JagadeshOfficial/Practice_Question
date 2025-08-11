package Static;
	//Print the Static Variable
public class Employee {
	//Global Variable
	static String CompanyName="Bytecodee";

	//Predefined Static Method
	public static void main(String[] args) {
		//Calling Company Name using Global Varibale
				System.out.println("Company Name: "+CompanyName);
		//Calling Company Name Using Class Name 
				System.out.println("CName: "+Employee.CompanyName);
	}

}
