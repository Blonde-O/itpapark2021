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
        sortedSplittedText.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}

