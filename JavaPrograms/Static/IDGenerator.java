package Static;

public class IDGenerator {

	static int idCount=0;
	
	public static String generateID()
	{
		idCount++;
		return String.format("Emp%03d", idCount);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Employee id is : " +generateID());
		System.out.println("Employee id is : " +generateID());
		System.out.println("Employee id is : " +generateID());
		
	}

}
