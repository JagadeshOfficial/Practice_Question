//WAP to find sumEven=0, sumOdd=0; and sum of even numbers and sum of odd numbers from 1 to 100

package ControlStatements;

public class Sum_Even_Odd_1to100 {

	public static void main(String[] args) {
		int sumEven =0, sumOdd=0;
		for(int i =1; i<=100; i++)
		{
			if(i%2==0)
			{
				sumEven +=i;
				System.out.println("Sum of Even = " +sumEven);
			}
			else {
				sumOdd +=i;
				System.out.println("Sum of Odd = " +sumOdd);
			}
		}
		

	}

}
