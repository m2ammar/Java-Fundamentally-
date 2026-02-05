import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Enter today's temperature");
        double tempt = sc.nextDouble();

        if(tempt <10){
            System.out.println("Its freezing");
        }else if (tempt >=10 && tempt<=25){
            System.out.println("Its cool");
        }else if(tempt >=26 && tempt <=35){
            System.out.println("Its warm");
        }else {
            System.out.println("its hot");
        }*/

        /*
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        int price;
        System.out.println("Enter show time(In 24 hours format): ");
        int time = sc.nextInt();

        if(age <=12){
            if(time<=17){
                price = 5;
            }else {
                price =8;
            }
        } else if (age<=59){
            if(time<=17){
                price = 10;
            }else {
                price = 12;
            }
        }else {
            if(time<=17){
                price = 15;
            }else {
                price = 20;
            }
        }


        */
        System.out.println("Hello welcome to pizza shop");
        System.out.println("What would you like to have tell us");
        System.out.println("Large=1, Medium=2, Small=3");
        int size = sc.nextInt();

        System.out.println("Would you like to have Extra topping=1, 2+ topping=2, cheese only=3 ");
        int topping= sc.nextInt();
        int price=0;

        if(size==1){
            if(topping ==1){
                price=10;
            }else if(topping==2){
                price =15;
            }else {
                price =20;
            }
        }else if(size==2) {
            if (topping == 1) {
                price = 11;
            } else if (topping == 2) {
                price = 18;
            } else {
                price = 22;
            }
        }else if (size==3) {
            if(topping==1){
                price = 14;
            }else if (topping==2){
                price = 16;
            }else {
                price = 25;
            }
        }

        double total = price + size;
        System.out.println("Your total bill is "+total+"$");
    }
}
