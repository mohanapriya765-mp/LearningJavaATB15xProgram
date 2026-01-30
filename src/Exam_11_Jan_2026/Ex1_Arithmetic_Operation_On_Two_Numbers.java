package Exam_11_Jan_2026;
import java.util.Scanner;
public class Ex1_Arithmetic_Operation_On_Two_Numbers {
    public static void main(String[] args) {
        System.out.println("Exam 1: Arithmetic operators");
        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner, "Enter the value of a: ");
        int b = readInt(scanner, "Enter the value of b: ");
        System.out.println("Addition of a +b: " + sum(a,b));
        System.out.println("Subtraction of a-b: "+ minus(a,b));
        System.out.println("Multiplication of a*b: " + mul(a,b));
        System.out.println("division of a/b: " + div(a,b));
        System.out.println("Modulus of a%b: " + mod(a,b));
        scanner.close();
    }

    static int readInt(Scanner scanner, String prompt){
        System.out.println(prompt);
        while(true) {
            if(scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            else {
                System.out.println("Enter valid input");
                scanner.next();
/*            System.exit(0);
            return 0;*/
            }
        }
    }

    static int sum(int a, int b) {
        return a+b;
    }

    static int minus(int a, int b) {
        return a-b;
    }

    static int mul(int a, int b) {
        return a*b;
    }
    static int div(int a, int b) throws ArithmeticException {
        if(b==0)
        {
            throw new ArithmeticException("division by zero is not allowed");
        }
        return a/b;
    }
    static int mod(int a, int b) {
        return a%b;
    }
}
