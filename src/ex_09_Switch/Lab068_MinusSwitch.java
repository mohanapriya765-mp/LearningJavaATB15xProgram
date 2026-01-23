package ex_09_Switch;

public class Lab068_MinusSwitch {
    public static void main(String[] args) {
        int a = 11;
        switch (-1) {
            default:
                System.out.println("Print default");
                break;
            case -1:
                System.out.println("Print 10");
                break;
            case 9:
                System.out.println("Print 9");
                break;
            // this will match exactly the same
        }
    }
}
