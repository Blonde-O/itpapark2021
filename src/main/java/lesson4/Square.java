package lesson4;

public class Square {
    public static void main(String[] args) {
        double n = 2;
        double m =4;
        System.out.println(sqrt(n, m));
    }

    //public static double square(double n) {
        //double a = 5;
        //double result = 1;
       // for (double i = 1; i <= n; i++) {

           // result = result * a;
       // }
       // return result;

   // }
    public static double sqrt(double n, double m) {
        double a = 1;
        double b =1;
        for (double i = 1; i <= 10; i++) {
            for (double j =1; j<=(m-1); j++){
                b = b*a;
                }
            a = a - (b/m  - n/(m*b));
                   }
    return a;

    }

}
