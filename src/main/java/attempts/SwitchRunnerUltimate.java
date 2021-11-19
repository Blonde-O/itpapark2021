package attempts;

import java.util.Scanner;

public class SwitchRunnerUltimate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        char a;
        do {
            do {
                System.out.println("Введите число от 0 до 10");
                n = in.nextInt();
            }
            while (n < 0 || n > 10);
            switch (n) {
                case 0 -> System.out.println("Ноль - жизнь это боль!\n");
                case 1 -> System.out.println("Один - жизнь в ч/б как далматин!\n");
                case 2 -> System.out.println("Два - в жизни радости едва!\n");
                case 3 -> System.out.println("Три - жизнь рождается внути!\n");
                case 4 -> System.out.println("Четыре - жизнь кончается в могиле!\n");
                case 5 -> System.out.println("Пять - жизнь на деньги не менять!\n");
                case 6 -> System.out.println("Шесть - в жизни радостей не счесть !\n");
                case 7 -> System.out.println("Семь - жизни каждый важен день!\n");
                case 8 -> System.out.println("Восемь - жизнь тебя шарашит оземь!\n");
                case 9 -> System.out.println("Девять - что успел за жизнь содеять?\n");
                case 10 -> System.out.println("Десять - красив, молод, свеж и весел!\n");
            }
            System.out.println("Продолжаем?");
            System.out.println("(Введите \"д\" - ДА или \"н\" - НЕТ)");
            a = in.next().charAt(0);
        }
        while (a=='д');
        System.out.println("До встречи!");
        in.close();
    }
  }

