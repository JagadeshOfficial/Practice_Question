package bytecode;
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[] gradeCount = new int[5]; // A, B, C, D, F
        int highest = 0, lowest = 0;

        for (int i = 0; i < n; i++) {
            int score;
            while (true) {
                System.out.print("Enter score for student " + (i + 1) + ": ");
                score = scanner.nextInt();
                if (score >= 0 && score <= 100) break;
                System.out.println("Invalid score. Please enter between 0 and 100.");
            }

            if (i == 0) {
                highest = score;
                lowest = score;
            } else {
                if (score > highest) highest = score;
                if (score < lowest) lowest = score;
            }

            if (score >= 90) gradeCount[0]++;
            else if (score >= 80) gradeCount[1]++;
            else if (score >= 70) gradeCount[2]++;
            else if (score >= 60) gradeCount[3]++;
            else gradeCount[4]++;
        }

        System.out.println("\n--- Result ---");
        System.out.println("Total students: " + n);
        System.out.println("A: " + gradeCount[0]);
        System.out.println("B: " + gradeCount[1]);
        System.out.println("C: " + gradeCount[2]);
        System.out.println("D: " + gradeCount[3]);
        System.out.println("F: " + gradeCount[4]);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
    }
}
