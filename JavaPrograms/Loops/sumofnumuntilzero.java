package Loops;
import java.util.Scanner;
public class sumofnumuntilzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = 0;
		while(true)
		{
			System.out.println("Enter the Value of N::");
			int n = sc.nextInt();
			if(n==0)
			{
				break;
			}
			else {
				m = m+n;
			}
			
		}
		System.out.println("Total is " +m);
	}

}
