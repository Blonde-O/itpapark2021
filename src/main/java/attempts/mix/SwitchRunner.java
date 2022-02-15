package attempts.mix;

import java.util.Scanner;

public class SwitchRunner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 0 до 5");
        int n = in.nextInt();
        while (0 > n || n > 5) {
            System.out.println("Введите число от 0 до 5");
            int m = in.nextInt();
            n = m;
        }

        switch (n) {
            case 0:
                System.out.println(n + ": Ноль - жизнь это боль!");
                break;
            case 1:
                System.out.println(n + ": Один - жизнь в ч/б как далматин!");
                break;
            case 2:
                System.out.println(n + ": Два - в жизни радости едва!");
                break;
            case 3:
                System.out.println(n + ": Три - жизнь рождается внути!");
                break;
            case 4:
                System.out.println(n + ": Четыре - жизнь кончается в могиле!");
                break;
            case 5:
                System.out.println(n + ": Пять - жизнь на деньги не менять!");
                break;
            default:
        }
    }
}
