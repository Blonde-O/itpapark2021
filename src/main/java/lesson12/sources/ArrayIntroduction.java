package lesson12.sources;

import lesson12.sources.exceptions.MyArrayDataException;
import lesson12.sources.exceptions.MyArraySizeException;

public class ArrayIntroduction {
    private final String[][] initialArray;

    public ArrayIntroduction(String[][] initialArray) {
        this.initialArray = initialArray;
    }

    public void printArray() {
        if (!(initialArray.length == 4)) {
            throw new MyArraySizeException("Неправильный размер массива. Некорректное кол-во строк");
        }
        for (String[] value : initialArray) {
            for (int j = 0; j < value.length; j++) {
                if (!(value.length == 4)) {
                    throw new MyArraySizeException("Неправильный размер массива. Некорретное кол-во столбцов");
                }
            }
        }
        System.out.print("Распечатка вашего массива");
        for (String[] strings : initialArray) {
            System.out.println();
            for (String string : strings) {
                System.out.print(string + " ");
            }
        }
    }

    public void summarizeArray() {
        int a;
        int result = 0;
        for (int i = 0; i < initialArray.length; i++) {
            for (int j = 0; j < initialArray[i].length; j++) {
                try {
                    a = Integer.parseInt(initialArray[i][j]);
                    result += a;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("\nНеверный формат данных в ячейке с индексом " + i + "_" + j);
                }
            }
        }
        System.out.println("\nСумма элементов массива равна " + result);
    }
}