package ex_06_Input_from_user;

public class Lab041_Multiple_Input_from_CommandLine {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        int s = (n1 > n2) ? (n1>n3 ? n1 : n3 ) : (n2 > n3 ? n2: n3);
        System.out.println(s);
    }
}
