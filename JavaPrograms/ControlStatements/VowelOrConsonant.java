package ControlStatements;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel");
                break;
            default:
                if (ch >= 'a' && ch <= 'z') {
                    System.out.println(ch + " is a consonant");
                } else {
                    System.out.println("Not a letter");
                }
        }

        sc.close();
    }
}