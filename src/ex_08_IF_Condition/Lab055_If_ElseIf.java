package ex_08_IF_Condition;

import java.util.Scanner;

public class Lab055_If_ElseIf {
    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        // CLI Option
        //int age = Integer.parseInt(args[0]);

        //int age = 33;
        if (age > 34) {
            System.out.println("Valid age");
        } else if (age < 34) {
            System.out.println("Invalid age");
        }
        else {
            System.out.println("Equal age");
        }
        scanner.close();
    }
}
