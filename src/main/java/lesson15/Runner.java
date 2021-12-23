package lesson15;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {

    public static void main(String[] args) {
        String text = "Lorem Sed ipsum dolor sit Sed? amet, consectetur  1 adipiscing elit. Sed 1";
        System.out.println(text);



        String[] splittedText = text.split("\\p{Punct}");
       /*for (String words : splittedText) {
            System.out.println(words);
        }*/
        System.out.println("___________");
        StringBuilder buildClearedWords = new StringBuilder();
        for (int i = 0; i < splittedText.length; i++) {
            buildClearedWords.append(splittedText[i]);
        }
        String newText = buildClearedWords.toString();
        /* System.out.println(newText);*/
        System.out.println("______________");
        String[] clearText = newText.split(" ");
       /*for (String words : clearText) {
            System.out.println(words);
        }*/
        List<String> listOfText;
        listOfText = Arrays.asList(clearText);

        Stream<String> stream = listOfText.stream();
        List<Object> resultedList = stream
                .filter((x)-> Objects.equals(x, "1")).collect(Collectors.toList());
        System.out.println(resultedList);

    }
}

