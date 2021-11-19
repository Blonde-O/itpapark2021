package lesson6;


import java.util.Arrays;
import java.util.Scanner;

public class ActionsWithArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение длины массива");
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            int a = (int) Math.round( Math.random() * 10f);
            array[i] = a;
        }
        System.out.println("Ваш массив: \n" + Arrays.toString(array));
        System.out.println("Среднее арифметическое Вашего массива равно:  " + average(array, n));
        in.close();
    }

    public static double average(int[] array, int n) {
        double average = 0;
        for (double b : array) {
            average += b;
        }
        return average / n;
    }

}
