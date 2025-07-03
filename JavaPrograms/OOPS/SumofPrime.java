package OOPS;

public class SumofPrime {

	public static void main(String[] args) {
		int sum = 0;
		for(int n = 2; n<=100; n++)
		{
			if(prime.prime(n))
			{
				sum = sum + n;
			}
			System.out.println("Sum of the Prime Numbers are:" +sum);
		}
		
	}

}
