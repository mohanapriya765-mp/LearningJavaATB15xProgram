package ex_14_String;

public class Lab114_String_Ex4 {
    public static void main(String[] args) {
        String s = "Mohana";
        System.out.println(s.substring(2));

        String s1 = "Priya".substring(4);
        System.out.println(s1);

        String s2 = "Happy".substring(5); // this will give empty string
        System.out.println(s2);
        //System.out.println(s2.repeat(2));

        char [] arr = "Java".toCharArray();
        System.out.println(arr);

        boolean b = " ".isBlank();
        System.out.println(b);

        String s3 = "ab".repeat(3);
        System.out.println(s3);

        String s5 = "=".repeat(20);
        System.out.println(s5);
        System.out.println("Here we go! ");
        System.out.println(s5);


        boolean s4 = "Java".equalsIgnoreCase("JAVA");
        System.out.println(s4);

        long count = "a\n\n\nb".lines().count();
        System.out.println(count);
    }
}
