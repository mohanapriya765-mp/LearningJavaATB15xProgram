package ex_10_For_Loop;

public class Lab074_No_condition_Infinite_run {
    public static void main(String[] args) {
        for (int i=0; ; i++){
            System.out.println(i);
            // Exit code - 130 - forcestop
            //exit code - 0 - Successful
        }
    }
}
