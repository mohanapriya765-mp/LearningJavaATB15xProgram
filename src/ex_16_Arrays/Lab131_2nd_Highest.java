package ex_16_Arrays;

import java.util.Arrays;

public class Lab131_2nd_Highest {
    public static void main(String[] args) {
        int[] number = {56,45,68,96,32};

        Arrays.sort(number);
        System.out.println(number[number.length-2]);
    }
}
