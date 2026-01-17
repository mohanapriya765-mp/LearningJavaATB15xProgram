package ex_03_Java_Basics;

public class Lab023_All_Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);

        //Compiund assignment opearator
        int age = 10;
        age += 10;
        System.out.println(age);

        int agea = 10;
        //agea -=10;
        //agea /=10;
        agea *= 10;
        System.out.println(agea);
    }
}
