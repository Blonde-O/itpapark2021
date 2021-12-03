package lesson10.secondSolution;
import java.util.Scanner;
public class AnotherRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение давления для конвертации");
        double x = in.nextDouble();
        System.out.println("Введите единицу измерения, которую хотите преобразовать");
        String first= in.next();
        System.out.println("Введите единицу измерения,  в которую хотите преобразовать");
        String second= in.next();
        Convert convertion = new Convert(first,second, x);
        convertion.startConverting();
    }

}
