//WAP to find sum of digits of a given number (n = 1234)

package ControlStatements;
import java.util.Scanner;
public class sumofdigitsgivennum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		System.out.println("Enter the Value of Number::");
		int Number = sc.nextInt();
		while(Number>0)
		{
			sum = sum + Number%10;
			Number /= 10;
			
		}
		System.out.println("The Sum of a Given Number is =" +sum);

	}

}
