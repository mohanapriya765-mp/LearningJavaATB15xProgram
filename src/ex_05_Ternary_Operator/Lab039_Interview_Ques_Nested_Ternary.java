package ex_05_Ternary_Operator;

public class Lab039_Interview_Ques_Nested_Ternary {
    public static void main(String[] args) {
        //Nested Ternary
        //result = condition ? expression : (condition2 ? expression2: expression3);
        int a = 21;
        int age = 37;
        String b = a>30 ? (age>25 ? "You are allowed" : "Failed in 2nd condition") : "Not allowed";
        System.out.println(b);
    }
}
