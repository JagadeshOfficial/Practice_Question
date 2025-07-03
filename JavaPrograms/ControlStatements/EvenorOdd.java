package ControlStatements;
import java.util.Scanner;
public class EvenorOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A::");
		int A = sc.nextInt();
		
		if(A%2==0)
		{
			System.out.println("A is an Even Number");
		}
		else
		{
			System.out.println("A is an Odd Number");
		}
	}

}
