package ex_15_String_Buffer_String_Builder;

public class Lab117_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Mohana");
        stringBuffer.append("Priya"); // append will join 2 strings
        System.out.println(stringBuffer);

        String s1 = "Mohana";
        s1 = s1+ "Priya";
        System.out.println(s1);
    }
}
