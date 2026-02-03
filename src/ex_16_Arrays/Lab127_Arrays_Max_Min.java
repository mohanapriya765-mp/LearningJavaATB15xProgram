package ex_16_Arrays;

import javax.naming.PartialResultException;
import java.util.Arrays;

public class Lab127_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] marks = {56,89,23,56,78,53,45};
        Arrays.sort(marks);
        System.out.println(marks[marks.length-1]);

        int max = marks[0];
        for (int i = 0; i<marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
            System.out.println(max);


        int min = marks[0];
        for (int i = 0; i<marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }
            System.out.println(min);

    }

}
