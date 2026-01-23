package ex_09_Switch;

public class Lab069_switch_Interview {
    public static void main(String[] args) {
        char code = 'C';
        switch (code) {
            default:
                System.out.println("Default");
                //break;
            case 'A':
                System.out.println("Print A");
                break;
            case 'B':
                System.out.println("Print B");
                break;
        }
    }
}
