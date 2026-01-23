package ex_09_Switch;

import java.util.Scanner;

public class Lab059_Switch_Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
        }
    }
}

