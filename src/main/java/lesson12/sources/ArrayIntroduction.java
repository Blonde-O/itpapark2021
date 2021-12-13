package lesson12.sources;

public class ArrayIntroduction {
    private String [][] initialArray;

    public ArrayIntroduction(String[][] initialArray) {
        this.initialArray = initialArray;
    }

    public void printArray() {
        if (initialArray.length == 4 && initialArray[0].length == 4) {
            for (String[] strings : initialArray) {
                System.out.println();
                for (String string : strings) {
                    System.out.print(string + " ");
                }
            }
        } else {
            throw new MyArraySizeException("Неправильный размер массива");
        }

    }
}
