package Exception;

class AgeException extends Exception
{
	AgeException(String msg)
	{
		super(msg);
	}
}

public class Customer {
	
	int age;
	
	void setAge(int age) throws AgeException
	{
		if(age <18 || age>60)
		{
			throw new AgeException("Age is Should between 18 and 60");
		}
		else {
			this.age = age;
			System.out.println("Age set Successfully");
		}
	}

	public static void main(String[] args) {
		Customer c = new Customer();
		try
		{
			c.setAge(70);
		}catch(AgeException e)
		{
			//System.out.println("Exception Caught = " +e.getMessage());
			e.printStackTrace();
		}

	}

}
