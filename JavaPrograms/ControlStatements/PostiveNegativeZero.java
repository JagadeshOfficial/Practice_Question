package ControlStatements;

import java.util.Scanner;

public class PostiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value ::");
		int Value = sc.nextInt();
		if (Value > 0) {
			System.out.println("The Value " + Value + " : is a Positive Number");
		} else if (Value < 0) {
			System.out.println("The Value " + Value + " : is a Negative Number");
		} else {
			System.out.println("The Value " + Value + " : is a Zero");
		}
	}

}
