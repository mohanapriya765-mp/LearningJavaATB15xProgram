package ex_14_String;

public class Lab109_String_Interview2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello"; // No new string me created in string pool.
        String s10 = "Hello";
        String s12 = "hello"; // Now it will create new SCA


        //In case of new it will always create new object area
        String s3 = new String("Hello");
        String s5 = new String("Hello");
        String s11 = new String("hello");
    }
}
