package talentbattel;

import java.util.Scanner;

public class Day7Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month");
        int a  = sc.nextInt();
        System.out.println("Enter Year");
        int b = sc.nextInt();
        if (a < 1 || a > 12){
            System.out.println("Invalid Month");
        } else if (a == 4 || a == 6 || a == 9 || a == 11) {
            System.out.println("30 days");
        } else if  ( a == 2) {
            if ((b % 4 == 0 && b % 100 != 0) || (b % 400 == 0)) {
                System.out.println("29 days");
            }else {
                System.out.println("28 days");
            }
        }else {
            System.out.println("31 days");
        }
    }
}
