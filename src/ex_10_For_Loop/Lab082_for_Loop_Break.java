package ex_10_For_Loop;

public class Lab082_for_Loop_Break {
    public static void main(String[] args) {
/*        for (int i = 0; i<50; i++){
            System.out.println(i);
            if (i == 5) {
                break;  // 0 to 5 will print
            }
        }*/

        for (int i = 0; i<50; i++){

            if (i == 5) {
                break;
            }
            System.out.println(i); // 0 to 4 will print
        }
        System.out.println("End");
    }
}
