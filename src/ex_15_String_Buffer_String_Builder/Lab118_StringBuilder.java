package ex_15_String_Buffer_String_Builder;

public class Lab118_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Mohana");
        stringBuilder.append("Priya"); // append will join 2 strings
        System.out.println(stringBuilder);

        String s1 = "Mohana";
        s1 = s1+ "Priya";
        System.out.println(s1);
    }
}
