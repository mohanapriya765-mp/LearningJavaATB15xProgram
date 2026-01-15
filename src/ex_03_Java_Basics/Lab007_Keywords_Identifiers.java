package ex_03_Java_Basics;

public class Lab007_Keywords_Identifiers {

    // package name is identifier which is unique
    // class name is identifier which is unique
    public static void main(String[] args) {


        String a = "Java";
        String b = new String("Java");

        System.out.println(a == b);      // false
        System.out.println(a.equals(b));

        String s = "Ja" + "va";
        System.out.println(s);
        System.out.println(s+a+b);


        System.out.println(2+2);
        System.out.println("2+2");
        System.out.println(0/10);


    }
}

