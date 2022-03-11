/*
package lesson33;

import lesson33.pojo.Valute;
import lesson33.service.ConverterService;
import lombok.SneakyThrows;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.util.Scanner;

public class CourseRunner {
    @SneakyThrows
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        final AnnotationConfigApplicationContext lesson33 = new AnnotationConfigApplicationContext("lesson33");
        final ConverterService valute = lesson33.getBean(ConverterService.class);
        do {
            try {
                a = 0;
                System.out.println("Введите сумму для конвертации.");

                Double amountDouble = scanner.nextDouble();
                BigDecimal amount = new BigDecimal(amountDouble);
                System.out.println(amountDouble + " USD = " + valute.multiply(amount) + " RUB.");
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод наименования валюты.");
                a = -1;
            }
        }
        while (a == -1);
    }
}*/
