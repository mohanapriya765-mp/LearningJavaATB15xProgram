package ex_03_Java_Basics;

public class Lab017_Interview_Concat_Plus {
    public static void main(String[] args) {
        // +
        int a = 10;
        int b = 20;
        System.out.println(a+b);

        // string concatenation
        String f_name = "Mohana";
        String l_name = "Priya";
        System.out.println(f_name+l_name);

        //Interview question - Can we use minus, multiple, division is allowed in String
        // Ans: Only + is allowed for concatenation
        // +(plus) behaves as arithmetic for int
        // +(plus) behaves concat for String

        //Interview program

        System.out.println(a+b+f_name+l_name);
        // JVM understands from left to right
        // If first operator is for concat (String) so it will concat all the values like --> MohanaPriya1020

        System.out.println(f_name + l_name + a + b);
        // Here JVM will first add (int) next it will concat --> 30MohanaPriya

        System.out.println(f_name + l_name + (a + b));
        // Here first brackets will be taken as consideration as per Bodmas rule , then will concat --> MohanaPriya30
        // Bodmas - Bracket. order, div, mul, add, sub
    }
}
