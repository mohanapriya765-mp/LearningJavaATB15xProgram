package ex_09_Switch;

public class Lab067_Multiple_condition {
    public static void main(String[] args) {
        int a = 11;
        switch (a) {
/*            case 1 , 2, 3 -> System.out.println("Print 1, 2, 3");
            case 4 -> System.out.println("Print 4");
            case 5 -> System.out.println("Print 5");
            default -> System.out.println("Print default");*/

            case 1 , 2, 3:
                System.out.println("Print 1, 2, 3");
                break;
            case 4:
                System.out.println("Print 4");
                break;
            case 5:
                System.out.println("Print 5");
                break;
            default:
                System.out.println("Print default");
                break;
        }
    }
}
