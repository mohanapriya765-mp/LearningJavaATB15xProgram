package ex_10_For_Loop;

import java.util.Scanner;

public class Lab083_For_Loop_continue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        for (int i =0; i<num; i++) {
            if (i == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
