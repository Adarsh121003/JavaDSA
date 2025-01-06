package talentbattel;

import java.util.Scanner;

public class Day6Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > 0 && b > 0){
            System.out.println("First Quadrant");
        } else if (a < 0 && b > 0) {
            System.out.println("Second Quadrant");
        } else if (a < 0 && b < 0) {
            System.out.println("Third Quadrant");
        } else if (a > 0 && b < 0) {
            System.out.println("Fourth Quadrant");
        }
    }
}
