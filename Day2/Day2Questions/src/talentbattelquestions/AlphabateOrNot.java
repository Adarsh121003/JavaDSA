package talentbattelquestions;

/*
Day 2 coding Statement : Write a program to identify if the character is an alphabet or not.

Description:

Take an input character from user and check whether it is an alphabet or not.

Input :

A

Output:

Alphabet

Input:

7

Output:

Not an alphabet
 */
//=============Solution=====================

import java.util.Scanner;

public class AlphabateOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if ((a >= 'a' && a<='z') ||(a >= 'A' && a <= 'Z') ){
            System.out.println("Alphabet");
        }else {
            System.out.println("Not an alphabet");
        }
    }


}
