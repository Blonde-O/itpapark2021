package lesson26;

import lombok.SneakyThrows;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class AnotherRunner {
    @SneakyThrows
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        final AnnotationConfigApplicationContext lesson26 = new AnnotationConfigApplicationContext("lesson26.attempt");
        final Valute valute = lesson26.getBean(Valute.class);
        do {
            try {
                a = 0;
                System.out.println("Введите наименование интересующей Вас валюты.");
                String valName = scanner.nextLine();
                valute.setValuteName(valName);
                valute.getCurrentCourse();
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод наименования валюты.");
                a = -1;
            }
        }
        while (a == -1);
    }
}
