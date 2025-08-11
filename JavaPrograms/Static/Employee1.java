package Static;
	//Print the Static Block
public class Employee1 {
	
	//Global Varibles
	
	static String CompanyName;
	
	//Static Block
	static{
		CompanyName = "Bytecode";
		System.out.println(CompanyName);
		System.out.println("Inside the Block ");
		
	}
	
	//Userdefined Static Methods 
	// accessmodifer static method return type method name 
	
	public static void Printname()
	{
		System.out.println(CompanyName );
	}
	public static void main(String[] args) {
		System.out.println("Company Name :" +CompanyName);
		Printname();
	}

}
