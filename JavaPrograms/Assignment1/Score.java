package Assignment1;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask user for number of students
        System.out.print("Enter number of students: ");
        int total = input.nextInt();

        // Variables to count grades
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;

        // Variables to store highest and lowest scores
        int highest = 0;
        int lowest = 0;

        for (int i = 1; i <= total; i++) {

            System.out.print("Enter score for student " + i + ": ");
            int score = input.nextInt();

            // Check if score is between 0 and 100
            while (score < 0 || score > 100) {
                System.out.print("Invalid score! Enter between 0 and 100: ");
                score = input.nextInt();
            }

            // For first student, set highest and lowest to current score
            if (i == 1) {
                highest = score;
                lowest = score;
            }

            // Update highest and lowest
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }

            // Count grades based on score
            if (score >= 90) {
                countA++;
            } else if (score >= 80) {
                countB++;
            } else if (score >= 70) {
                countC++;
            } else if (score >= 60) {
                countD++;
            } else {
                countF++;
            }
        }

        // Show final results
        System.out.println("\n--- Results ---");
        System.out.println("Total students: " + total);
        System.out.println("Grade A: " + countA);
        System.out.println("Grade B: " + countB);
        System.out.println("Grade C: " + countC);
        System.out.println("Grade D: " + countD);
        System.out.println("Grade F: " + countF);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
    }
}
