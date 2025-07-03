package ControlStatements;
import java.util.Scanner;
public class SumofFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorialSum = 0;
		System.out.println("Number Factorial");
		
		for(int n =1; n<=5; n++)
		{
			int factorial = 1;
			for(int i =1; i<=n; i++)
			{
				factorial *= i;
			}
			factorialSum += factorial;
			System.out.printf("%d      %d%n", n, factorial);
		}
		System.out.println(factorialSum);
	}

}
