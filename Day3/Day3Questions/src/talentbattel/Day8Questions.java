package talentbattel;

import java.util.Scanner;

public class Day8Questions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input values for a, b, and c
        System.out.print("Enter the values of a, b, and c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Check if it is a quadratic equation
        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
        } else {
            // Calculate the discriminant
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                // Two distinct real roots
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Roots are real and distinct.");
                System.out.printf("Root 1 = %.2f%n", root1);
                System.out.printf("Root 2 = %.2f%n", root2);
            } else if (discriminant == 0) {
                // Two equal real roots
                double root = -b / (2 * a);
                System.out.println("Roots are equal.");
                System.out.printf("Root 1 = Root 2 = %.2f%n", root);
            } else {
                // Complex roots
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("Roots are complex and imaginary.");
                System.out.printf("Root 1 = %.2f + %.2fi%n", realPart, imaginaryPart);
                System.out.printf("Root 2 = %.2f - %.2fi%n", realPart, imaginaryPart);
            }
        }

        scanner.close();
    }
}
