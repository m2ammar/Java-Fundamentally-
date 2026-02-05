import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        //if statement
        /*
        if(Condition){
        lines of code
        }
         */
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter a number");
        x = sc.nextInt();

        if(x % 2 ==0){
            System.out.println("You have entered an even number");
        } else{
            System.out.println("You have entered an odd number");
        }

        // multiple conditions or multiple if statement
        if (x % 2== 0){
        if (x % 4== 0 ){
            System.out.println("Entered an even and multiple of 4.");
    }
  }
}
}
