package Exam_11_Jan_2026;

import java.util.Scanner;

public class Ex2_Even_OR_ODD_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        while(true) {
            if(!scanner.hasNextInt())
            {
                System.out.println("Enter a valid number");
                scanner.next();
                continue;
            }
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " -This is even number");
            } else {
                System.out.println(num + " -This is Odd number");
            }
            break;
        }
    }
}
