package lesson12;

import lesson12.sources.ArrayIntroduction;
import lesson12.sources.MyArraySizeException;

public class Runner {

    public static void main(String[] args) {
        String [][] initial = {{"0","1","2","3"},{"4","5","6","7"},{"0","1","2","3"},{"4","5","6","7"}};
        ArrayIntroduction probe = new ArrayIntroduction(initial);
        try {
            probe.printArray();
        }
        catch(MyArraySizeException e){
            System.out.println(e.getMessage());
        }
        probe.summarizeArray();
    }
}
