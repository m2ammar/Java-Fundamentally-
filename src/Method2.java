public class Method2 {
    public static double pythagoras(double base, double per) {
        double hyp = Math.sqrt(Math.pow(base, 2) + Math.pow(per, 2));


        System.out.printf("Hyp = %.2f", hyp);
        return hyp;
    }

    public static void main(String[] args) {

        double base = 1;
        double per = 1;
        double hyp;

        hyp = pythagoras(base, per);
        System.out.printf("Hyp = %.3f",hyp );

    }
}
