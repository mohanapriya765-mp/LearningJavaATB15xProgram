package ex_03_Java_Basics;

public class Lab009_Numeric_Datatypes {
    public static void main(String[] args) {
        byte b = 10;
        short s = 10;
        int i = 10;
        char ch = 1; //character is also integral, so we can store number but it will print ASCII
        System.out.println(ch); // It will print ASCII symbol
        char c = 'a' ; // always should be single quotes
        // char d = 'abc'  - cannot store like this
        // int n = 9876543210 - cannot store large value in int
        // long l = 9876543210 - should add 'l' or 'L' at the end

        long l1 = 9876543210l;
        long l2 = 9876543210L;

        float f = 3;
        float f1 = 3.14f;
        float f2 = 329.00F;
        System.out.println(f1);
        System.out.println(f2);

        double d = 97865643.0; //Need to check later
        System.out.println(d);

    }
}
