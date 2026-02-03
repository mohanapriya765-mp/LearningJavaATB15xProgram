package ex_15_String_Buffer_String_Builder;

import java.util.Scanner;

public class Lab122_String_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user input");
        String user_input = scanner.next();
        String reverse = "";
        for (int i = user_input.length() -1; i>=0; i-- ) {
           reverse = reverse+ user_input.charAt(i);
        }
        System.out.println(reverse);

        if(reverse.equalsIgnoreCase(user_input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
