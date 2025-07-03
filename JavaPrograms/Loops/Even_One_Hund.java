package Loops;
import java.util.Scanner;
public class Even_One_Hund {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of N");
		int n = sc.nextInt();
		while(n<=100)
		{
			if(n%2==0)
			{
				System.out.println(+n);
				
			}n++;
		}
	}

}
