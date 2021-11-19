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
            int a = (int) Math.round(Math.random() * 100);
            array[i] = a;
        }
        System.out.println("Ваш массив: \n" + Arrays.toString(array));
        System.out.println("\nСреднее арифметическое Вашего массива равно:  " + average(array));
        System.out.println("Минимальное значение Вашего массива равно:  " + minimalValue(array));
        System.out.println("Максимальное значение Вашего массива равно:  " + maximalValue(array));
        in.close();
    }

    public static double average(int[] array) {
        double average = 0;
        for (int b : array) {
            average += b;
        }
        return average / array.length;
    }

    public static int minimalValue(int[] array) {
        int b = array[0];
        for (int i = 1; i < array.length; i++) {
            if (b >= array[i]) {
                b = array[i];
            }
        }
        return b;
    }

    public static int maximalValue(int[] array) {
        int b = array[0];
        for (int i = 1; i < array.length; i++) {
            if (b <= array[i]) {
                b = array[i];
            }
        }
        return b;
    }
}
