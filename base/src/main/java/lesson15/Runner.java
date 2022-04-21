package lesson15;

import java.util.*;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {
        String text = "1, 1, 1,1 ,1 Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at " +
                "faucibus. Donec mi quam, tempor vel ipsum 2 non, faucibus suscipit massa. Morbi lacinia velit blandit " +
                "tincidunt 2 efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula " +
                "mauris, ac auctor 2 2 22  lorem. Lorem 2 ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio " +
                "nec mi tempor dignissim 2.2 2";

        String[] splittedText = text.split("\\s*(\\W|\\s)\\s*");
        HashMap<String, Integer> sortedSplittedText = new HashMap<>();
        for (String i : splittedText) {
            Integer value = sortedSplittedText.get(i);
            if (value == null) {
                sortedSplittedText.put(i, 1);
            } else {
                sortedSplittedText.put(i, ++value);
            }
        }

        /*for (String i: sortedSplittedText.keySet()){
            words.add(i);
        }
        System.out.println(words);*/

        List<String> words = sortedSplittedText.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .map(Map.Entry::getKey)
                .toList();


        System.out.println(words);
    }
}