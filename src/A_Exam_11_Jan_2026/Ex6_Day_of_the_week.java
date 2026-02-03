package A_Exam_11_Jan_2026;

import java.util.Scanner;

public class Ex6_Day_of_the_week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter number from 1 to 7: ");
                scanner.next();
                continue;
            }
            int ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Invalid Entry");
                    continue;
            }
            break;
        }
    }
}
