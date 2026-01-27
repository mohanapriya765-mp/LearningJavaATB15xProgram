package Coding_task;

import java.util.Random;
import java.util.Scanner;

public class task11_Guess_the_number {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100);
        //System.out.println(numberToGuess);
        System.out.println("enter the number to guess");
        int guess;
        int attempts = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);


            if (!scanner.hasNextInt()) {
                System.out.println("Please enter valida number");
                scanner.next();
                continue;
            }
            guess = scanner.nextInt();
            attempts++;
            if (guess < numberToGuess) {
                System.out.println("Too Low" );

            } else if (guess > numberToGuess) {
                System.out.println("Too High");
            } else {
                System.out.println("Correct! guessed the number in " + attempts + " attempts");
                break;
            }
        }
    }
}
