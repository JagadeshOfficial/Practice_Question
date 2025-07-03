package OOPS;
import java.util.*;
public class prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of N");
		int n = sc.nextInt();
		if(prime(n))
		{
			System.out.println("This Is Prime Number");
		}
		else
		{
			System.out.println("This is Not a Prime Number");
		}

	}
	
	static boolean prime(int n)
	{
		boolean isPrime = true;
		for(int i = 2; i<n; i++)
		{
			if(n%i == 0)
			{
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
