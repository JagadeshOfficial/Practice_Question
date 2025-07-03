package Loops;
import java.util.Scanner;
public class FiveTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of N");
		int n = sc.nextInt();
		int i, t=0;
		for(i = 1; i<=10; i++)
		{
			t = n * i;
			System.out.println(n + " * " +i+ " = " + t);
		}
	}

}
