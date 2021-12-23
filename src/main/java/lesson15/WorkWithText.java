package lesson15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WorkWithText {
    private String[] splittedText;
    private String [] clearText;
    private String text;

    public WorkWithText(String text) {
        this.text = text;
        this.splittedText = splittedText;
        this.clearText = clearText;
    }



    public WorkWithText() {
    }
   // p{Punct}
    public void splitText(){
        splittedText = text.split("\\p{Punct}");
        System.out.println(Arrays.toString(splittedText));
        StringBuilder buildClearedWords = new StringBuilder();
        for( int i =0; i< splittedText.length; i++){
            buildClearedWords.append(splittedText[i]);
        }
        String newText = buildClearedWords.toString();
       System.out.println(newText);
        System.out.println("______________");
        clearText = newText.split(" ");
        System.out.println(Arrays.toString(clearText));
        List<String> listOfText;
        listOfText = Arrays.asList(clearText);

        //Stream<String> stream = listOfText.stream();
        //List<String> resultedList = stream
                //.filter(String::compareTo);

    }



}
