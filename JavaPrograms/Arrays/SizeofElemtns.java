package Arrays;
import java.util.Scanner;
public class SizeofElemtns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		int n[] = new int [size];
		System.out.println("Enter "+size+ " Values");
		for(int i = 0; i<n.length; i++)
		{
			n[i] = sc.nextInt();
			
		}
		System.out.println("Given Arrays are::");
		for(int i=0;i<n.length; i++)
		{
			System.out.println(n[i]);
		}
		
		System.out.println("Given Array Elemnts using For each");
		for(int x : n)
		{
			System.out.println(x);
		}

	}

}
