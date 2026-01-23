package ex_08_IF_Condition;

public class Lab049_IF_condition {
    public static void main(String[] args) {
        System.out.println("Enter the age vis CLI option");
        int age = Integer.parseInt(args[0]);
        System.out.println(age);
        if (age > 18)
        {
            System.out.println("You can Vote");
        }
        else {
            System.out.println("You can't vote");
        }
    }
}
