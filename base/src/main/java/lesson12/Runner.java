package lesson12;

import lesson12.sources.ArrayIntroduction;
import lesson12.sources.exceptions.MyArrayDataException;
import lesson12.sources.exceptions.MyArraySizeException;

public class Runner {

    public static void main(String[] args) {
        String[][] initial = {{}, {"0", "1", "2", "3", "3"}, {"g", "5", "6", "7"}, {"0", "1", "2", "3"}, {"4", "5", "6", "7"}};
        ArrayIntroduction probe = new ArrayIntroduction(initial);
        try {
            probe.workWithArray();
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
