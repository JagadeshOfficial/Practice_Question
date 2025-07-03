//WAP to check whether the given age is major(>=18) or minor Note: If the given age is <0 then display "Invalid Age"

package ControlStatements;
import java.util.Scanner;
public class major_minor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = sc.nextInt();
		if(age>=18)
		{
			System.out.println("You are a Major");
		}
		else if(age<18 && age !=0)
		{
			System.out.println("You are a minor");
		}
		else if(age == 0)
		{
			System.out.println("Invalid Age");
		}
		
	}

}
