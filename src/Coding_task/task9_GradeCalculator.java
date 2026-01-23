package Coding_task;

import java.util.Scanner;

public class task9_GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the Mark:");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        if (grade >= 90 && grade <=100) {
            System.out.println("Grade A");
        } else if (grade >=80 && grade <=89) {
            System.out.println("Grade B");
        }
        else if (grade >=70 && grade <=79) {
            System.out.println("Grade C");
        }
        else if (grade >=60 && grade <=69) {
            System.out.println("Grade D");
        }
        else
            System.out.println("Grade E");
        scanner.close();
    }
}
