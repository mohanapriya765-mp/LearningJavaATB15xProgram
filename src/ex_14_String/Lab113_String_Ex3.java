package ex_14_String;

public class Lab113_String_Ex3 {
    public static void main(String[] args) {
        CharSequence c = "Mohana";
        System.out.println(c);
        System.out.println(c.subSequence(1,5));  // starts with 0 and last will be end -1 (5-1)

        String s = "Priya";
        System.out.println(s.subSequence(1,5));
    }
}
