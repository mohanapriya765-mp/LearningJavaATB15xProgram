package ex_14_String;

public class Lab112_String_Ex2 {
    public static void main(String[] args) {
        String s = "Mohana";
        char c = s.charAt(2); // check the index from 0
        System.out.println(c);
        System.out.println(s.length()); // Check the number of characters

        int result = "abc".compareTo("abc"); //this will give result in integer.
        int result1 = "ABC".compareTo("abc");
        int result2 = "abc".compareTo("ABC");
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

        int idx = "Mohana".indexOf("a");
        System.out.println(idx);

        int idx1 = "Mohana".lastIndexOf("a");
        System.out.println(idx1);

        boolean b = "".isEmpty();
        System.out.println(b);

        boolean b1 = "M P".isEmpty();
        System.out.println(b1);

        String s11 = String.join("*", "Java", "Python", "JavaScript");
        System.out.println(s11);

        String s12 = "Java".replace("a", "o");
        System.out.println(s12);

        boolean b2 = "Java".startsWith("Ja");
        System.out.println(b2);

        boolean b3 = "Java".startsWith("va");
        System.out.println(b3);

        String s14 = "Java".concat("Mava");
        System.out.println(s14);
    }

}
