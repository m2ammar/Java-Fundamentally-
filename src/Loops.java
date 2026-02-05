import java.util.Scanner;

public class Loops{
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    int firstNum = 0,secondNum;
    char  option;
    while (true){
        int total = 0;
        System.out.println("Enter first number: ");
        firstNum = scanner.nextInt();
        System.out.println("Enter second number: ");
        secondNum = scanner.nextInt();
        System.out.printf("%d + %d = %d ", firstNum, secondNum, firstNum+secondNum);

        System.out.println("Continue <y/n>: ");
        option = scanner.next().toUpperCase().charAt(0);
        if (option != 'Y')
            break;
        }


    }
}
