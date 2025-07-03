package bytecode;

public class KPattern {
    public static void main(String[] args) {
        int n = 6; // Assigned value

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) == (n + 1) || j == 1) {
                    System.out.print("K");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++) {
            System.out.print("K");
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("K");
        }
    }
}