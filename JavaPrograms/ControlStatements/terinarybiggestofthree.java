//WAP to find biggest of given three numbers using conditional operator (?)

package ControlStatements;
import java.util.Scanner;
public class terinarybiggestofthree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of N1");
		int n1 = sc.nextInt();
		System.out.println("Enter the Value of N2");
		int n2 = sc.nextInt();
		System.out.println("Enter the Value of N3");
		int n3 = sc.nextInt();
		
		int biggest = (n1>n2)? ((n1>n3) ? n1:n3) : ((n2>n3) ? n2:n3);
		System.out.println(biggest);

	}

}
