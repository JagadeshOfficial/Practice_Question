package Static;

public class EmailValidator {

	public static boolean validateEmail(String email)
	{
		return email.contains("@") && email.contains(".") && email.indexOf("@") < email.indexOf(".");
	}
	
	public static void main(String[] args) {
		
		System.out.println(validateEmail("jagadeswararaovana@gmail.com"));
		System.out.println(validateEmail("jagadeswararaovanagmail.com"));
	}

}
