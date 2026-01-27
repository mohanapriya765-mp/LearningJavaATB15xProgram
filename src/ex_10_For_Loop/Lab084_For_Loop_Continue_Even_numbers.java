package ex_10_For_Loop;

import java.util.Scanner;

public class Lab084_For_Loop_Continue_Even_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        for (int i =0; i<=num; i++) {
            if (i%2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
