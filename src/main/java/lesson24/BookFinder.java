package lesson24;

import lesson24.classes.FindBook;
import lombok.SneakyThrows;

import java.util.Scanner;

//Приложение, выполняющее поиск книги в БД
public class BookFinder {
    @SneakyThrows
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите название книги");
        do {
            String name = scanner.nextLine();
            if (name.toCharArray().length >= 3) {
                a = 0;
                    FindBook findBook = new FindBook(name);
                    findBook.searchBook();
            } else {
                a = 1;
                System.out.println("Слишком короткий ввод, введите больше символов");
            }
        }
        while (a == 1);
    }
}