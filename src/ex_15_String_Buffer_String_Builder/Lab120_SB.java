package ex_15_String_Buffer_String_Builder;

public class Lab120_SB {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Mohana");
        sb.append("Priya");
        //sb.reverse();
        System.out.println(sb);

        sb.replace(0, 3, "G");
        System.out.println(sb);
    }
}
