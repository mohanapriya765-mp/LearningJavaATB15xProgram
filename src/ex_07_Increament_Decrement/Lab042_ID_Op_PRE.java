package ex_07_Increament_Decrement;

public class Lab042_ID_Op_PRE {
    public static void main(String[] args) {
        // Pre increment
        int a = 10;
        int b = ++a;
        int c = ++b;
        System.out.println(a); //11
        System.out.println(b); //12
        System.out.println(c); //12
        System.out.println(++c); //13

        // Post increment
        int d = 21;
        int e = d++;
        System.out.println(d++); //22
        System.out.println(e); //21

        System.out.println(d); // 22
        System.out.println(++d); // 23

    }
}
