package lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed 1";
        System.out.println(text);
        String[] splittedText = text.split("\\p{Punct}");
        for (String words : splittedText) {
            System.out.println(words);
        }
        System.out.println("___________");
        StringBuilder buildClearedWords = new StringBuilder();
        for( int i =0; i< splittedText.length; i++){
            buildClearedWords.append(splittedText[i]);
        }
        String newText = buildClearedWords.toString();
        System.out.println(newText);
        System.out.println("______________");
        String[] clearText = newText.split(" ");
        for (String words : clearText) {
            System.out.println(words);
        }
        List<String> ListOfText = new ArrayList<>();
        ListOfText = Arrays.asList(clearText);


    }
}

