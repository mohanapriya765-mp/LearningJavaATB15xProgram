package Coding_task;

import java.util.Scanner;

public class task10_Factorial {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        if (scanner.hasNextInt()) {
        int n = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println(n + "Factorial is : " + fact);
        }
        else {
            System.out.println("Please enter valid number");
        }
    }
}
