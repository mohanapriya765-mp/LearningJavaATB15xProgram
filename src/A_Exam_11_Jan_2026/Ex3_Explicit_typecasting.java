package A_Exam_11_Jan_2026;

import java.util.Scanner;

public class Ex3_Explicit_typecasting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (!scanner.hasNextDouble()) {
                System.out.println("Enter valid double value");
                scanner.next();
                continue;
            }
            double d = scanner.nextDouble();
            int i = (int) d;
            System.out.println("Value of double : " + d);
            System.out.println("Explicit typecasting to int : " + i);
        break;
        }
    }
}
