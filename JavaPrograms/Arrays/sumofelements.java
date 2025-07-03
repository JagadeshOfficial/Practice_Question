package Arrays;
import java.util.Scanner;
public class sumofelements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the Size of the Array");
		int size = s.nextInt();
		int n[] = new int[size];
		System.out.println("Enter "+size+" Values");
		for(int i = 0; i<n.length; i++)
		{
			n[i] = s.nextInt();
			sum += n[i];
		}
		System.out.println("Given Elements are =");
		for(int i =0; i<n.length; i++)
		{
			System.out.println(n[i]);
			
		}
		System.out.println("Sum of Elements are = "+sum);

	}

}
