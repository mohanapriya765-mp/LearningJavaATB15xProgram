package Coding_task;

import java.util.Scanner;

public class task7_TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Side 1");
        int side1 = scanner.nextInt();
        System.out.println("Enter the Side 2");
        int side2 = scanner.nextInt();
        System.out.println("Enter the Side 3");
        int side3 = scanner.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("Acute triangle - All sides are equal");
        }
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
        //else if (side1 == side2 && side1 !=side3 || side2 == side3 && side2 !=side1 || side3 == side1 && side3 != side2 ) {
            System.out.println("Isosceles triangle - exactly two sides are equal");
        }
        else
            System.out.println("Scalene triangle - No sides are equal");
        scanner.close();
    }

}
