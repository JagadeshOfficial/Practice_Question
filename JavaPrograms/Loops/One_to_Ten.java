package Loops;

import java.util.Scanner;

public class One_to_Ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value::");
		int n = sc.nextInt();
		while(n>0 && n<=10)
		{
			System.out.println(+n);
			n++;
		}

	}

}
