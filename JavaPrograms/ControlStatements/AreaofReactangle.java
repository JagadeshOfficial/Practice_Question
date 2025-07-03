package ControlStatements;

import java.util.Scanner;

public class AreaofReactangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of the Rectangle");
		int Length = sc.nextInt();
		System.out.println("Enter the Breadth of the Rectangle");
		int Bredth = sc.nextInt();
		int area = Length * Bredth;
		
		System.out.println("The Area of the Rectangle is :" +area);
	}

}
