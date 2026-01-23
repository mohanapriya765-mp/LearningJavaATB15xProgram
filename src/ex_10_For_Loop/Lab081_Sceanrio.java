package ex_10_For_Loop;

public class Lab081_Sceanrio {
    public static void main(String[] args) {
        //To find even numbers from 1 to 50
        for (int i=0; i<=50; i++) {
            //if (i%2 == 0) // Even number
            if (i%2 != 0) // Odd number
                System.out.println(i);
        }
    }
}
