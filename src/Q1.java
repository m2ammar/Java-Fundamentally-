import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sold;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Region " + i);
            for (int j = 1; j <= 5; j++) {
                System.out.println("Products sold by rep "+j);
                sold = scanner.nextInt();
                if(sold>30){
                    sold = 30;
                }
                if(sold<10){
                    sold =10;
                }
                System.out.print("Rep " + j);
                System.out.println();
                for(int k=1;k<=sold/10;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
