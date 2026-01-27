package ex_10_For_Loop;

import java.util.Scanner;

public class Lab086_Factorial_Usecase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int fact = 1;
            int n = scanner.nextInt();
            for (int i = 1; i<=n; i++) {
                fact = fact*i;
            }
            System.out.println(fact);
        }
        else {
            System.out.println("Please enter valid number");
        }
    }
}

