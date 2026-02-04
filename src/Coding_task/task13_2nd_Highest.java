package Coding_task;

public class task13_2nd_Highest {
    public static void main(String[] args) {
        int[] arr = {56,48,23,98,52,74,12,16,15,38,64};
        //int[] arr = {10, 45, 23, 45, 90, 67};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            }
            else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second highest number found");
        } else {
            System.out.println("Second highest = " + second);
        }

    }
}
