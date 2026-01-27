package ex_12_Do_while;

public class Lab095_Diff_While_DoWhile {
    public static void main(String[] args) {
        int i = 0;
/*        while (i<0)
        {
            System.out.println("Print i");
            i++;
        }*/  // --> This will not get executed

        do {
            System.out.println("Print for do while");
            i++;
        }while (i<0);  // --> This will execute atleast once and check condition
    }
}
