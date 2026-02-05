import java.util.Scanner;

public class Method1 {
    public static void pythagoras(double base, double per){
            double hyp=Math.sqrt(Math.pow(base,2)+Math.pow(per,2));

            System.out.printf("Hyp = %.2f",hyp );
        }

        public static void main(String[] args){

            double base=1;
            double per=1;
        /*
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter base: ");
        double base=scanner.nextDouble();
        System.out.println("Enter perpendicular: ");
        double per=scanner.nextDouble();
        */
        pythagoras(base,per);

    }
}
