import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        String playAgain;

        do {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int diceRoll = die1 + die2;

            System.out.println("Assignment 02: Dice Game");
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Total Roll: " + diceRoll);

            if (diceRoll == 2 || diceRoll == 3 || diceRoll == 12) {
                System.out.println("Craps! You lose!");
            } else if (diceRoll == 7 || diceRoll == 11) {
                System.out.println("Natural! You win!");
            } else {
                int point = diceRoll;
                System.out.println("The point is: " + point);
                while (true) {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    diceRoll = die1 + die2;

                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Total Roll: " + diceRoll);

                    if (diceRoll == point) {
                        System.out.println("Made point! You win!");
                        break;
                    } else if (diceRoll == 7) {
                        System.out.println("Got a seven! You lose!");
                        break;
                    } else {
                        System.out.println("Trying for point: " + point);
                    } // Ends the inner else block
                } // Ends the while loop
            } // Ends the outer else block
            // Ask the player if they want to play again
            System.out.print("Would you like to play again? (Y/N): ");
            playAgain = input.nextLine();

            // Continue asking until the player enters Y or N
            while (!playAgain.equalsIgnoreCase("Y") &&
                    !playAgain.equalsIgnoreCase("N")) {
                System.out.println("Invalid input. Please enter Y or N.");
                System.out.print("Would you like to play again? (Y/N): ");
                playAgain = input.nextLine();
            }

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
        input.close();
    }
}