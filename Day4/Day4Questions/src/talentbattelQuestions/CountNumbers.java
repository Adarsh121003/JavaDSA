package talentbattelQuestions;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);
        int count = 0;
        for(int i = n; i > 0; i /=10){
            count++;
        }
        if (n == 0)
        {
            count = 1;
        }
        System.out.println(count);
    }
}
