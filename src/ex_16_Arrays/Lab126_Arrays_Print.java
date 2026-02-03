package ex_16_Arrays;

public class Lab126_Arrays_Print {
    public static void main(String[] args) {
        int marks[] = { 56,56,45,89,36,100};

        for(int mark : marks) {
           // System.out.println(mark);
        }

        for(int i=0; i<marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
