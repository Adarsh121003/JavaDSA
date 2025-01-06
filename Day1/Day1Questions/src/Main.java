import java.util.Scanner;

/*
Day 1 coding Statement: Write a program to identify if the character is a vowel or consonant.

Description of the program:


Take an input character from the user and check whether the given input is a vowel or consonant.

Input

A

Output

Vowel

Input

m

Output

Consonant

Input

3

Output

Invalid Input
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char u = sc.next().charAt(0);
        if (u == 'a' || u == 'e' || u == 'i' || u == 'o' || u == 'u' ||
                u == 'A' || u == 'E' || u == 'I' || u == 'O' || u == 'U') {
            System.out.println("Vowel");
        } else if (u >= '0' && u <= '9') {
            System.out.println("Invalid input");
        } else if ((u >= 'a' && u <= 'z') || (u >= 'A' && u <= 'Z')) {
            System.out.println("Consonant");
        } else {
            System.out.println("Invalid input");
        }
    }
}