package Arrays;
import java.util.Scanner;

public class SearchElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array:");
        int size = sc.nextInt();
        int[] n = new int[size];

        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }

        System.out.println("The Given Elements are:");
        for(int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }

        System.out.println("\nEnter the index of the element you want to retrieve:");
        int j = sc.nextInt();

        if(j >= 0 && j < n.length) {
            System.out.println("The value at index " + j + " is: " + n[j]);
        } else {
            System.out.println("Invalid index. Please enter an index between 0 and " + (n.length - 1));
        }

        
    }
}
