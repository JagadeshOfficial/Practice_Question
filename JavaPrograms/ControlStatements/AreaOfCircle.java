//WAP to find area of a circle double PI = 3.14; area = PI * radius * radius;

package ControlStatements;
import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of radius");
		int radius = sc.nextInt();
		float pi = 3.14f;
		float area = (int)(pi*radius*radius);
		System.out.println(area);
	}

}
