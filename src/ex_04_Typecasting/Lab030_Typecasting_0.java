package ex_04_Typecasting;

public class Lab030_Typecasting_0 {
    public static void main(String[] args) {
        byte a = 10;
        short b = a; //Widening - Implicit casting (internally done)- automatically JVM/Java will convert.
        System.out.println(b);
        // float f = b; // possible
        // boolean f = b; // incompatible datatype not possible

        int a1 = (int)b; //Explicit widening
    }
}
