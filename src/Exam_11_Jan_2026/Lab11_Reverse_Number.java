package Exam_11_Jan_2026;

import java.util.Scanner;

public class Lab11_Reverse_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        do{
            System.out.println(i);
            i--;
        }while (i>=0);
    }
}
