package Exam_11_Jan_2026;

import java.util.Scanner;

public class Ex7_Simple_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner, "Enter a:");
        int b = readInt(scanner, "Enter b:");

        int c = readInt(scanner, "Enter choice");
        switch (c) {
            case 1:
                System.out.println(add(a, b));
                break;
            case 2:
                System.out.println(sub(a, b));
                break;
            case 3:
                System.out.println(mul(a, b));
                break;
            case 4:
                System.out.println(div(a, b));
                break;
            case 5:
                System.out.println(mod(a, b));
                break;
            default:
                System.out.println("Select only from 1 to 5");
                break;
        }
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

    static  int add(int a , int b)
    {
        return a+b;
    }
    static  int sub(int a , int b)
    {
        return a-b;
    }
    static  int mul(int a , int b)
    {
        return a*b;
    }
    static  int div(int a , int b)
    {
        return a/b;
    }
    static  int mod(int a , int b)
    {
        return a%b;
    }
}
