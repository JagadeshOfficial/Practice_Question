//WAP to check whether the given number is Prime or not

package ControlStatements;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of N to Find the Prime Number or Not");
		int n = sc.nextInt();
		int divisorCount = 0;
		
		for(int i = n; i <= n; i++)
		{
			for(int j = 2; j <= i / 2; j++)
			{
				if(i % j == 0)
				{
					divisorCount++;
					break;
				}
			}
			
		}
		if(divisorCount ==0)
		{
			System.out.println("This  is a Prime Number ::" +n);
		}
		else {
			System.out.println("This is Not a Prime Number ::" +n);
		}
	}

}
