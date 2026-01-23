package ex_09_Switch;

import java.util.Scanner;

public class Lab060_Real_Switch_UseCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser");
        String browser = scanner.next();
        browser = browser.toLowerCase();
        switch (browser) {
            case "chrome":
                System.out.println("Chrome");
                break;
            case "edge":
                System.out.println("Edge");
                break;
            case "firefox":
                System.out.println("Firefox");
                break;
            default:
                System.out.println("No system found");
                break;
        }
    }
}
