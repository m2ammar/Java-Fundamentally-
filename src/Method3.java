import java.util.Scanner;

public class Method3 {

    public static int sum(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no. ");
        int a =sc.nextInt();
        System.out.println("Enter another no. ");
        int b = sc.nextInt();

       int result = sum(a,b);

        System.out.println(sum(a,b));
    }
}
