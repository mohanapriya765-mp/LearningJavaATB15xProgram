package ex_03_Java_Basics;

public class Lab022_Interview_OR_NOT_operator {
    public static void main(String[] args) {
        int salary = 12;
        // Divide and conquer technique
        boolean s = !(salary>10 || salary<5);
        System.out.println(s);
    }
}
