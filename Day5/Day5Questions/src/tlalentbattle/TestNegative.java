package tlalentbattle;

import java.util.Scanner;

public class TestNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        while (number >= 0){
            sum = sum+number;
            System.out.println("Enter Number");
            number = sc.nextInt();
        }
        System.out.println("Sum is " +sum);
        sc.close();
    }
}
