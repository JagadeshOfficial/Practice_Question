
//WAP to find sum of prime numbers from 2 to 100

package ControlStatements;
import java.util.Scanner;
public class sumof2numbers2to100 {

	public static void main(String[] args) {
		
		
		int sum = 0;
		
		for(int i = 2; i <= 100; i++)
		{
			int divisorCount = 0;
			for(int j = 2; j <= i / 2; j++)
			{
				if(i % j == 0)
				{
					divisorCount++;
					break;
				}
			}
			if(divisorCount ==0)
			{
				sum += i;
				System.out.println("This  is a Prime Number ::" +i);
				
			}
			else {
				System.out.println("This is Not a Prime Number ::" +i);
			}
			
		}
		System.out.println(sum);
		
	}

}
