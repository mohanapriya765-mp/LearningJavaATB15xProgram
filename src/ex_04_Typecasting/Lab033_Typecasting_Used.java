package ex_04_Typecasting;

public class Lab033_Typecasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.65f;
        int total = course + (int) GST;
        System.out.println(total);

        float t1 = course + GST;
        System.out.println(t1);
    }
}
