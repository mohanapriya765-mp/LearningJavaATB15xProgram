package ex_16_Arrays;

import java.util.Scanner;

public interface Lab128_User_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size");
        int size = scanner.nextInt();
        String s = "=".repeat(30);
        System.out.println(s);

        int[] marks = new int[size];
        for(int i=0; i<marks.length; i++){
            System.out.println("Enter the marks");
            marks[i] = scanner.nextInt();
        }
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);

        }
        System.out.println(s);

        for (int a: marks) {
            System.out.println(a);
        }
    }

}
