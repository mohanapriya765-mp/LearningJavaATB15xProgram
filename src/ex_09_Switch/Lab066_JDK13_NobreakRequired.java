package ex_09_Switch;

public class Lab066_JDK13_NobreakRequired {
    public static void main(String[] args) {
        int a = 001;
        switch (a) {
            case 001 -> System.out.println("1st");
            case 002 -> System.out.println("2nd");
            default -> System.out.println("Default");
        }
    }
}
