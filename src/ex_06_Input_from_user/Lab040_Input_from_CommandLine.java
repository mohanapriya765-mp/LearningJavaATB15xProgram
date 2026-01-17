package ex_06_Input_from_user;

public class Lab040_Input_from_CommandLine {
    public static void main(String[] args) {
        String s = args[1];
        System.out.println(s instanceof String);
        int age = Integer.parseInt(s);
        System.out.println(age);
        String category = (age < 18) ? "Minor" : (age>60) ? "Senior Citizen" : "Adult";
        System.out.println(category);

    }
}
