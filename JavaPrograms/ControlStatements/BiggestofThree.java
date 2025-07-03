package ControlStatements;

import java.util.Scanner;

public class BiggestofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of N1::");
		int N1 = sc.nextInt();
		System.out.println("Enter the Value of N2::");
		int N2 = sc.nextInt();
		System.out.println("Enter the Value of N3::");
		int N3 = sc.nextInt();
		if (N1 > N2 && N1 > N3) {
			System.out.println("The Value of N1 is Greater than N2 and N3");
		} else if (N2 > N3) {
			System.out.println("The Value of N2 is Greater than N1 and N3");
		} else {
			System.out.println("The Value of N3 is Greater than N1 and N2");
		}
	}

}
