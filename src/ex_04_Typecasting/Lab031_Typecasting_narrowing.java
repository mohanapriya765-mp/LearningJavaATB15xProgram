package ex_04_Typecasting;

public class Lab031_Typecasting_narrowing {
    public static void main(String[] args) {
        int val = 300128;
        //byte b = val; // implicit narrowing - not possible n java
        byte b2 = (byte)val;
        System.out.println(b2); // explicit narrowing
    }
}
