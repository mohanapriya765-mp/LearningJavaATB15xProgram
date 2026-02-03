package ex_16_Arrays;

public class Lab130_Sum_of_arrays {
    public static void main(String[] args) {
        int num[] = {23,56,89};

        int sum = 0;

        for (int i=0; i<=num.length-1; i++){
            sum = sum+num[i];
        }

        System.out.println(sum);

    }
}
