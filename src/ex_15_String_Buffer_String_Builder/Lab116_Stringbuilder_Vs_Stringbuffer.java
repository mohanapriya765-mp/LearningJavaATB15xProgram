package ex_15_String_Buffer_String_Builder;

public class Lab116_Stringbuilder_Vs_Stringbuffer {
    public static void main(String[] args) {
        String s0 = "Mohana";
        String s1 = new String("Priya");

        StringBuffer stringBuffer = new StringBuffer("Mohana");
        StringBuilder stringBuilder = new StringBuilder("Priya");

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());

    }
}
