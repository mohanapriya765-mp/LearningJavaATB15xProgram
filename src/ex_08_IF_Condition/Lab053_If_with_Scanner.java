package ex_08_IF_Condition;

import java.util.Scanner;

public class Lab053_If_with_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println(age);

        if (age > 19) {
            System.out.println("Hi");
        }
    }
}
