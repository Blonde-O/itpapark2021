package lesson4;

import java.util.Scanner;

public class SqrtExtracting {

         public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Введите число, из которого извлекаете квадратный корень");
         double n = in.nextDouble();
         if (n<0){System.out.println("Недопустимое значение");
         return;}
         if (n==0){System.out.println("Результат = 0");}
         else{
         System.out.println("Результат = " +searchForArgument(n));
         System.out.println("Проверка результата  " +searchForArgument(n)*searchForArgument(n));
         }
        }

        public static double searchForArgument(double n) {
            double a = 0;
            do {
               a= a + 0.00001;            }
            while (n-(a*a)>0);
            return a;
        }
    }
