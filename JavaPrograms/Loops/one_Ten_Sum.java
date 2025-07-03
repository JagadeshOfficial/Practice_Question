package Loops;
import java.util.Scanner;
public class one_Ten_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, i = 1, sum=0;
		while(i<10)
		{
			System.out.println("Enter The Value ::");
			n = sc.nextInt();
			sum = sum + n;
			i++;
		}
		System.out.println(sum);
		
	}

}
