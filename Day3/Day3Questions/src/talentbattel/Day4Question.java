package talentbattel;

import java.util.Scanner;

public class Day4Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a < 0){
            System.out.println("Negative Number");
        } else if (a > 0) {
            System.out.println("Positive Number");
        }else {
            System.out.println("Neither Positive Nor negative");
        }
    }
}
