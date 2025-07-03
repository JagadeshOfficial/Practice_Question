package Exception;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		
		try
		{
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int res = n1/n2;
			System.out.println("Result: "+res);
		}catch(ArithmeticException e)
		{
			System.out.println("Divide Zero is Not Allowed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Divide Zero is Not Allowed");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Divide Zero is Not Allowed");
		}
		catch(Exception e)
		{
			System.out.println("Divide Zero is Not Allowed");
		}

	}

}
