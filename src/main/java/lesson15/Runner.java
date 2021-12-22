package lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
    String [] splittedText =text.split(" ");
        List<String> lines = new ArrayList<>();
        text.lines().forEach(s -> lines.add(s));

        System.out.println(lines);
        for(String words:splittedText){
            System.out.println(words);
        }

    }
}
