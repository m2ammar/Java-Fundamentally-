import java.util.Random;
import java.util.Scanner;

public class SnakesNLadder2 {
    public static void main(String[] args) {
        //Variable and Objects Creation
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int total = 0;
        int position = 0;

        int[] snaket = {2, 54, 45, 6, 8};
        int[] snakeh = {99, 75, 58, 25, 18};
        int[] laddert = {90, 80, 40, 60, 16};
        int[] ladderb = {10, 55, 22, 44, 11};
        int outcome;
        int numOfTurns = 0;
        int dieOrigin = 1, dieBound = 7;

        int player1 = 0;
        int player2 = 0;
        int currentPlayer = 1;

        //Start Prompt
        System.out.println("Welcome to Snakes and Ladders");
        System.out.println("Developed by KSBL BS(CS) students of Fall 2025 ");
        //Prompt for the turn

        while (player1 < 100 && player2 < 100) {
            System.out.println("\n" +
                    "Press enter to play your turn");
            scanner.nextLine();
            total += 1;

            if (player1 == 1) {
                position = player1;
            } else {
                position = player2;


                //Generate a random number
                //outcome =  random.nextInt(6)+1;
                outcome = random.nextInt(1, 7);
                System.out.println(outcome);
                //Update the position
                // position = position + outcome;
                //shortcut (for position)
                position += outcome;
                System.out.println(position);
                //Check if the player lands on a snake bottom

                for (int i = 0; i < 5; i++) {
                    if (position == ladderb[i]) {
                        position = laddert[i];
                        System.out.println("You landed on a ladder");
                        System.out.println("New position " + position);
                        break;
                    }
                }

                for (int i = 0; i < 5; i++) {
                    if (position == snakeh[i]) {
                        position = snaket[i];
                        System.out.println("You landed on a snake");
                        System.out.println("New position " + position);
                        break;
                    }
                }


                if (position > 100) {
                    System.out.println("you have exceed 100, Stay at " + position);
                    position -= outcome;
                }

                if (currentPlayer == 1) {
                    player1 = position;
                } else {
                    player2 = position;
                }

                System.out.println("player 1, " + player1 + " | player 2, " + player2);


                if (position == 100) {
                    System.out.println("You won " + currentPlayer + " Congratulation!!!");
                }

                if (currentPlayer == 1) {
                    currentPlayer = 2;
                } else {
                    currentPlayer = 1;
                }
            }
        }
    }
}