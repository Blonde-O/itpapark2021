package lesson12.sources;

public class ArrayIntroduction {
    private final String[][] initialArray;

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

    public void summarizeArray() {
        int a;
        int result = 0;
        for (int i = 0; i < initialArray.length; i++) {
            for (int j = 0; j < 4; j++) {
                a = Integer.parseInt(initialArray[i][j]);
                result += a;
            }
        }
        System.out.println();
        System.out.println(result);
    }
}