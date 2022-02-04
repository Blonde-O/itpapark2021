package lesson24;

import lesson24.classes.FindBook;

import java.util.Scanner;

public class BookFinder {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите название книги");
        do {
            String name = scanner.nextLine();
            if (name.toCharArray().length >= 3) {
                a = 0;
                try {
                    FindBook findBook = new FindBook(name);
                    findBook.searchBook();
                } catch (Exception e) {
                    System.out.println("База данных пуста. Наполните БД данными.");
                    e.printStackTrace();
                }
            } else {
                a = 1;
                System.out.println("Слишком короткий ввод, введите больше символов");
            }
        }
        while (a == 1);
    }
}