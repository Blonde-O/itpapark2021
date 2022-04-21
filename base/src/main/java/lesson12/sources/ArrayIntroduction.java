package lesson12.sources;

import lesson12.sources.exceptions.MyArrayDataException;
import lesson12.sources.exceptions.MyArraySizeException;

public class ArrayIntroduction {
    private final String[][] initialArray;

    public ArrayIntroduction(String[][] initialArray) {
        this.initialArray = initialArray;
    }

    public void workWithArray() {
        int a;
        int result = 0;
        if (!(initialArray.length == 4)) {
            throw new MyArraySizeException("Неправильный размер массива. Некорректное кол-во строк");
        }
        for (int i = 0; i < initialArray.length; i++) {
            for (int j = 0; j < initialArray[i].length; j++) {
                if (!(initialArray[i].length == 4)) {
                    throw new MyArraySizeException("Неправильный размер массива. Некорретное кол-во столбцов");
                } else {
                    try {
                        a = Integer.parseInt(initialArray[i][j]);
                        result += a;
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("\nНеверный формат данных в ячейке с индексом " + i + "_" + j);
                    }
                }
            }
        }
        System.out.println("\nСумма элементов массива равна " + result);
    }
}

