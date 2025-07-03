package Loops;

import java.util.Scanner;

public class one_to_Ten_big {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, i = 1, big = 0;
		while(i<=10)
		{
			System.out.println("Enter the Value of N");
			n = sc.nextInt();
			if(n > big)
			{
				big = n;
			}
			i++;
		}
		System.out.println(big);
	}

}
