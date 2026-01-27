package ex_13_functions;

public class Lab098_Simple_Method {
    public static void main(String[] args) {
        System.out.println("Return types - datatype");
        no_return_type();
        return_integer();
        return_boolean();
        return_float();
    }
    static void no_return_type() {
        System.out.println("Print no return");
    }
    static int return_integer() {
        System.out.println("Print Int");
        return  10;
    }
    static boolean return_boolean() {
        System.out.println("Print boolean");
        return true;
    }

    static float return_float() {
        System.out.println("Print float");
        return 3.14f;
    }
}
