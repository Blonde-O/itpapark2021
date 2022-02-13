package lesson26;

import lombok.SneakyThrows;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class CourseRunner {
    @SneakyThrows
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        final AnnotationConfigApplicationContext lesson26 = new AnnotationConfigApplicationContext("lesson26");
        final Valute valute = lesson26.getBean(Valute.class);
        do {
            try {
                a = 0;
                System.out.println("Введите наименование интересующей Вас валюты.");
                String valName = scanner.nextLine();
                System.out.println(valName + " = " + valute.getCurrentCourse(valName) + " RUB.");
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод наименования валюты.");
                a = -1;
            }
        }
        while (a == -1);
    }
}