package ex_14_String;

public class Lab110_String_Interview3 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        System.out.println(s1==s3);
        System.out.println(s1==s2);
        System.out.println(s2==s3);

        System.out.println(s1==s4);
        System.out.println(s3==s5); //== check for ref // = assignment of value


        System.out.println(s1.equals(s3)); // equals to check for values
        System.out.println(s4.equals(s5));

        System.out.println(s1.equalsIgnoreCase(s2)); // equals to check for values
        System.out.println(s4.equalsIgnoreCase(s5));

    }
}
