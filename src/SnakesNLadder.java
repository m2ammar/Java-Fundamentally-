import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class SnakesNLadder {
    public static void main(String[] args) {
        //Variable and Objects Creation
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int total = 0;
        int position = 0;
        int snake1h, snake2h, snake3h, snake4h, snake5h;
        int snake1t, snake2t, snake3t, snake4t, snake5t;
        int ladder1t, ladder2t, ladder3t, ladder4t, ladder5t;
        int ladder1b, ladder2b, ladder3b, ladder4b, ladder5b;
        int outcome;
        snake1h = 99;
        snake1t = 2;
        snake2h = 75;
        snake2t = 54;
        snake3h = 58;
        snake3t = 45;
        snake4h = 25;
        snake4t = 6;
        snake5h = 18;
        snake5t = 8;

        ladder1t = 90;
        ladder1b = 10;
        ladder2t = 80;
        ladder2b = 55;
        ladder3t = 40;
        ladder3b = 22;
        ladder4t = 60;
        ladder4b = 44;
        ladder5t = 16;
        ladder5b = 11;
        //Start Prompt
        System.out.println("Welcome to Snakes and Ladders");
        System.out.println("Developed by KSBL BS(CS) students of Fall 2025 ");
        //Prompt for the turn

        while (position <= 100) {
            System.out.println("\n" +
                    "Press enter to play your turn");
            scanner.nextLine();
            total += 1;

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
            if (position == ladder1b) {   //after position write value or assigned variable like ladder1b
                position = ladder1t;
                System.out.println("You are bitten by snake. ");
                System.out.printf("New position %d\n", position);
            } else if (position == ladder2b) {
                position = ladder2t;
                System.out.println("You are bitten by snake. ");
                System.out.printf("New position %d\n", position);
            } else if (position == ladder3b) {
                position = ladder3t;
                System.out.println("You are bitten by snake. ");
                System.out.printf("New position %d\n", position);
            } else if (position == ladder4b) {
                position = ladder4t;
                System.out.println("You are bitten by snake. ");
                System.out.printf("New position %d\n", position);
            } else if (position == ladder5b) {
                position = ladder5t;
                System.out.println("You are bitten by snake. ");
                System.out.printf("New position %d\n", position);
            }

            //Check if player lands on snake head

            else if (position == snake1h) {
                position = snake1t;
                System.out.println("You are bitten by snake. ");
                System.out.printf("New position %d\n", position);
            } else if (position == snake2h) {
                position = snake2t;
                System.out.println("You are bitten by snake. ");
                System.out.printf("New position %d\n", position);
            } else if (position == snake3h) {
                position = snake3t;
                System.out.println("You are bitten by snake. ");
                System.out.printf("New Position %d\n", position);
            } else if (position == snake4h) {
                position = snake4t;
                System.out.println("You are bitten by snake. ");
                System.out.printf("New position %d\n", position);
            } else if (position == snake5h) {
                position = snake5t;
                System.out.println("You are bitten by snake. ");
                System.out.printf("New position %d\n", position);//we can ignore braces if we have one statement like here all are snake no other statement then snake
            }
            //Check if player lands on 100

            if (position == 100)
                System.out.printf("Congratulation. You Won in " + total + " times.");

            else if (position > 100)
                position -= outcome;
            System.out.printf("You exceed 100. Stay at " + position);


        }
    }
}
