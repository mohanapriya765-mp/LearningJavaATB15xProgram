package Coding_task;

public class task14_Pyramid_Pattern {

    public static void main(String[] args) {
        int n = 5;
        /*for (int i=n; i>0; i--) {                  //  *
            for (int j = i-1; j<n; j++) {         //   **
                System.out.print("*");            //  ***
            }                                    //  ****
            System.out.println(" ");             // *****
        }*/
        /*for (int i=0; i<n; i++) {                // *****
            for (int j = i; j<n; j++) {         //  ****
                System.out.print("*");          //  ***
            }                                   //  **
            System.out.println(" ");            //  *
        }*/

        for (int i=1; i<=n; i++) {

            for (int j = 1; j <= n - i; j++) {      //     *
                System.out.print(" ");             //     **
            }                                      //    ***
            for (int k = 1; k <= i; k++) {         //   ****
                System.out.print("* ");             //  *****
            }

            System.out.println(" ");
        }


/*        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j <= (n - i) * 2; j++) {
               System.out.print(" ");
            }

            // Print stars with spaces between them
            for (int k = 1; k <= i; k++) {
                System.out.print("*  ");
            }

            System.out.println();
        }*/

    }
}
