package ex_15_String_Buffer_String_Builder;

import java.util.Scanner;

public class Lab121_String_Reverse_withoutSB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String reverse = "";
        for (int i = input.length() - 1; i>=0; i--) {
            reverse = reverse + input.charAt(i);
        }
        System.out.println(reverse);

    }
}
