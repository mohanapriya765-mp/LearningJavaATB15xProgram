package ex_15_String_Buffer_String_Builder;

public class Lab115_String_function {
    public static void main(String[] args) {
        String name = "  Mohana    Priya   ";
        System.out.println(name.trim());

        //String Builder
        StringBuilder stringBuilder = new StringBuilder("Mohana");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());
        System.out.println(sb.reverse());

    }
}
