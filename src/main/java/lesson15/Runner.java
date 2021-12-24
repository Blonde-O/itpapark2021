package lesson15;

import java.util.HashMap;
import java.util.Map;

public class Runner {

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at " +
                "faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit " +
                "tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula " +
                "mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio " +
                "nec mi tempor dignissim.";
        // System.out.println(text);


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
        HashMap<String, Integer> finalOrder = new HashMap<>();
        for (String i : clearText) {
            Integer value = finalOrder.get(i);
            if (value == null) {
                finalOrder.put(i, 1);
            } else {
                finalOrder.put(i, ++value);
            }
        }

        finalOrder.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .map(Map.Entry::getKey)
                .forEach(System.out::println);



    }


}

