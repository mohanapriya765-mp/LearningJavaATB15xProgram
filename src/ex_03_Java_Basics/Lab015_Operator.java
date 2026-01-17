package ex_03_Java_Basics;

public class Lab015_Operator {
    public static void main(String[] args) {
    //Unary operator - 1 operand & 1 operator
    int a = +12;
    int b = 12;
        System.out.println(a+b);


    // binary operator - 2 operands & 1 operator
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

    //Relational operator
        boolean result = a >= b;
        System.out.println(result);

        // int c = a%2;
        if (a%2==0)
            System.out.printf("%d is Even number %n", a);
        else
            System.out.printf("%d is odd number %n ", a);

        System.out.println("Code ends");
}


}
