package Coding_task;

public class task5_TO_MAX_Three_Numbers {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        //String MAX = (n1 > n2) ? (n1 > n3 ? "N1 is Maximum" : "N3 is Maximum") : (n2>n3 ? "N2 is Maximum" : "N3 is Maximum" );
        int MAX = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2>n3 ? n2 : n3 );
        System.out.println("MAX OUT OF THREE:" +MAX);
    }

}
