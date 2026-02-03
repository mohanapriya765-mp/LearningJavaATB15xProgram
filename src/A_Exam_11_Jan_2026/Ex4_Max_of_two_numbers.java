package A_Exam_11_Jan_2026;

import java.util.Scanner;
public class Ex4_Max_of_two_numbers {
    public static void main(String[] args) {
        System.out.println("Maximum of two numer is ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String c = (a > b) ? "A" : "B";
        System.out.println("Maximum of 2 number is : " +c);
        scanner.close();
    }
}
