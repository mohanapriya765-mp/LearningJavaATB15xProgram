package Coding_task;

public class task6_Increment {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Question 1 :" + (a++ + a++ + a++)); //33
        //System.out.println(a); //13

        int a1 = 3;
        int b = a1++ * ++a1;
        System.out.println("Question 2 :" +b);

        int a2 = 5;
        System.out.println("Question 3 :" + (a2++ + a2--));
    }
}
