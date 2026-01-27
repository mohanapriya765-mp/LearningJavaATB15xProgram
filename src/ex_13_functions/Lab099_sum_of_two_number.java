package ex_13_functions;

import java.util.Scanner;

public class Lab099_sum_of_two_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();
        int sum = sum_a_b(a,b);
        System.out.println(sum);
    }

    static int sum_a_b(int x, int y) {
        return x+y;
    }
}
