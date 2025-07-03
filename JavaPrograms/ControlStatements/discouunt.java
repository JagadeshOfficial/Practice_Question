/*WAP to accept item number, item name, rate, and quantity. Find price (rate * qty).
   If (price >= 1000 && price < 2000), discount is 10% on price
   If (price >= 2000 && price < 3000), discount is 15% on price
   If (price >= 3000 && price < 5000), discount is 20% on price
   If (price >= 5000), discount is 25% on price
   Calculate net price (price - discount).
   Display item number, item name, price, discount, and net price. */

package ControlStatements;

import java.util.Scanner;

public class discouunt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Item::");
		int item_number = sc.nextInt();
		sc.nextLine(); // Clear buffer
		System.out.println("Enter the Name of Item::");
		String item_name = sc.nextLine();
		System.out.println("Enter the value of Item Rate::");
		double item_rate = sc.nextInt();
		System.out.println("Enter the Quantity of Items::");
		int item_Qunt = sc.nextInt();
		double price = item_rate * item_Qunt;
		double discount;

		if (price >= 1000 && price < 2000) {
			 discount = price * 0.10;
		} else if (price >= 2000 && price < 3000) {
			 discount = price * 0.15;
		} else if (price >= 3000 && price < 5000) {
			discount = price * 0.20;
		} else if (price >= 5000) {
			 discount = price * 0.25;
		} else {
			discount = 0;
		}
		
		double netPrice = price - discount;
		
		System.out.println("Item Number::" + item_number);
		System.out.println("Item Name::" + item_name);
		System.out.println("Item Rate ::" + item_rate);
		System.out.println("Item Quantity::" + item_Qunt);
		System.out.println("Item price::" + price);
		System.out.println("Item Net Price::" + netPrice);

	}

}
