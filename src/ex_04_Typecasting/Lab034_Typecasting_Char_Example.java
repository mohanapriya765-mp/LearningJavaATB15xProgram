package ex_04_Typecasting;

public class Lab034_Typecasting_Char_Example {
    public static void main(String[] args) {
        char a = 'A';
        int b = a; // implicit widening

        int num = 10;
        char ch  = (char) num;  // explicit narrowing
    }
}
