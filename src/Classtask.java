import java.util.Scanner;

public class Classtask {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int a = 0, b=0, c=0;
        int z=0;
        do {
            int total = a + b;
            System.out.println("Enter first number: ");
            a = scanner.nextInt();

            System.out.println("Enter second number: ");
            b = scanner.nextInt();

            System.out.println("The sum of " + a + " and " + b + " is " +total );

            System.out.println("You wanna continue. If yes then press 1, if no then 0");
        }

        while( z == 1);

    }
}
