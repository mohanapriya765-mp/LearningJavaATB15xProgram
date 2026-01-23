package ex_09_Switch;

import java.util.Scanner;

public class Lab058_Interview_Switch_Without_Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day");
        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();
            switch (day){
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                case 3:
                    System.out.println("Tuesday");
                case 4:
                    System.out.println("Wednesday");
                case 5:
                    System.out.println("Thursday");
                case 6:
                    System.out.println("Friday");
                case 7:
                    System.out.println("Saturday");
                default:
                    System.out.println("Please enter value from 1 to 7");
            }
        }
        else {
            System.out.println("Enter only integers");
        }
    }
}
