import java.util.Scanner;

public class Variable2 {
    public static void main(String[] args) {
        //variable and Object Creation
        double centi, fahren;
        Scanner scanner = new Scanner(System.in);
        //Taking Input
        System.out.print("Temperature in Centigrade: ");
        centi = scanner.nextDouble();
        //Calculation
        fahren = 9/5.0*centi+32;
        System.out.printf(" Fahrenheit Equivalent: %.1f", fahren);
    }
}

