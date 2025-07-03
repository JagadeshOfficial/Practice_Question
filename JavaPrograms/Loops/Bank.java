package Loops;
import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int bal, amt, ch;
		System.out.println("Ennter Your Balance");
		bal = sc.nextInt();
		do {
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Display Balance");
			System.out.println("4. Exit");
			System.out.println("5. Enter Your Choice");
			ch = sc.nextInt();
			if(ch == 4)
			{
				System.out.println("Exiting....");
				break;
			}
			
			switch (ch) {
			case 1: 
				System.out.println("Enter amount to Deposit");
				amt = sc.nextInt();
				if(amt > 0)
				{
					bal += amt;
					System.out.println(bal);
				}
				break;
			case 2:
				System.out.println("Enter Amount to Withdraw");
				amt = sc.nextInt();
				if(amt>0 && amt <=bal)
				{
					bal -= amt;
					System.out.println(bal);
				}
				break;
			case 3:
				System.out.println(bal);
				break;
				
			default:
				System.out.println("Invalid Choice! Please Try again");
			}
			
			
		}while(ch != 4);

	}

}
