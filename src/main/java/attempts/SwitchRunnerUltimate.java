package attempts;

import java.util.Scanner;

public class SwitchRunnerUltimate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 0 до 10");
        int n = in.nextInt();
        enterChecking(n);
        System.out.println("Продолжаем?");
        System.out.println("(Введите \"1\" - ДА или \"0\" - НЕТ)");
        int a = in.nextInt();
        while (a == 1) {
            System.out.println("Введите число от 0 до 10");
            n = in.nextInt();
            enterChecking(n);
            System.out.println("Продолжаем?");
            System.out.println("(Введите \"1\" - ДА или \"0\" - НЕТ)");
            int b = in.nextInt();
            a = b;
        }
        System.out.println("До встречи!");
        in.close();
    }

    public static int enterChecking(int n) {
        Scanner in = new Scanner(System.in);
        while (0 > n || n > 10) {
            System.out.println("Введите число от 0 до 10");
            int m = in.nextInt();
            n = m;
        }
        return switchRunner(n);
        }

    public static int switchRunner(int n) {
        switch (n) {
            case 0:
                System.out.println("Ноль - жизнь это боль!\n");
                break;
            case 1:
                System.out.println("Один - жизнь в ч/б как далматин!\n");
                break;
            case 2:
                System.out.println("Два - в жизни радости едва!\n");
                break;
            case 3:
                System.out.println("Три - жизнь рождается внути!\n");
                break;
            case 4:
                System.out.println("Четыре - жизнь кончается в могиле!\n");
                break;
            case 5:
                System.out.println("Пять - жизнь на деньги не менять!\n");
                break;
            case 6:
                System.out.println("Шесть - в жизни радостей не счесть !\n");
                break;
            case 7:
                System.out.println("Семь - жизни каждый важен день!\n");
                break;
            case 8:
                System.out.println("Восемь - жизнь тебя шарашит оземь!\n");
                break;
            case 9:
                System.out.println("Девять - что успел за жизнь содеять?\n");
                break;
            case 10:
                System.out.println("Десять - красив, молод, свеж и весел!\n");
                break;
            default:
        }
        return n;
    }
}

