package A_Exam_11_Jan_2026;

public class Lab13_Continue_Statement {
    public static void main(String[] args) {
        int i = 1;
        do{
            if(i==5){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }while (i<=10);
    }
}
