package SwitchStatements;

import java.util.Scanner;

public class TwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of N1::");
		int N1 = sc.nextInt();
		System.out.println("Enter the Value of N2::");
		int N2 = sc.nextInt();
		System.out.println("Choose the Value to Process::");
		int Value = sc.nextInt();
		switch (Value) {
		case 1:
			int M = N1 + N2;
			System.out.println(M);
			break;

		case 2:
			int A = N1 * N2;
			System.out.println(A);
			break;

		case 3:
			int B = N1 - N2;
			System.out.println(B);
			break;
		default:
			System.out.println("Please enter the valid Value");
		}
	}

}
