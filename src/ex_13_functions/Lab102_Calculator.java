package ex_13_functions;

import java.util.Scanner;

public class Lab102_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner, "Enter the number a");
        int b = readInt(scanner, "Enter the number b");
/*        int result_sum = sum(a,b);
        System.out.println("sum of a+b " + result_sum );
        int result_minus = minus(a, b);
        System.out.println("Subtraction of a-b " + result_minus);
        int result_mul = mul(a, b);
        System.out.println("Multiplication of a*b " + result_mul );
        int result_div = div(a,b);
        System.out.println("Division of a/b " + result_div );
        int result_mod = mod(a,b);
        System.out.println("Modulus of a%b " + result_mod );*/

        int choice = readInt(scanner, "Enter your choice");
        switch (choice) {
            case 1 -> System.out.println("sum of a+b " + sum(a,b));
            case 2 -> System.out.println("Subtraction of a-b " + minus(a, b));
            case 3 -> System.out.println("Multiplication of a*b " + mul(a, b));
            case 4 -> System.out.println("Division of a/b " + div(a,b) );
            case 5 -> System.out.println("Modulus of a%b " + mod(a,b) );
            default -> System.out.println("Enter valid choice");
        }
        scanner.close();
    }

    static int readInt(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Enter valid number");
                scanner.next();
            /*System.exit(0);
            return 0;*/
            }
        }

    }

    static int sum(int a, int b){
        return a+b;
    }

    static int minus(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b) {
        return a / b;
    }
    static int mod(int a, int b){
        return a%b;
    }
}
