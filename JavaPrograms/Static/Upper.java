package Static;

public class Upper {
	
	public static String convertToUpper(String Name)
	{
		return Name.toUpperCase();
	}

	public static void main(String[] args) {
		String Original = "jagadesh";
		System.out.println("Upper Case of a Original Name is : "+convertToUpper(Original));

	}

}
