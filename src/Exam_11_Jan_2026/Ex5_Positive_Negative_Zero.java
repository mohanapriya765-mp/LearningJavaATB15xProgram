package Exam_11_Jan_2026;

import java.util.Scanner;

public class Ex5_Positive_Negative_Zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number in positive, negative or zero");

        while (true) {
            if(!scanner.hasNextInt()) {
                System.out.println("Invalid input! Try again...");
                scanner.next();
                continue;
            }

            int a = scanner.nextInt();
            String res = (a > 0) ? "Positive" : (a < 0) ? "Negative" : "Zero";
            System.out.println("The given number is : " + res);
            break;
        }
    }
}
