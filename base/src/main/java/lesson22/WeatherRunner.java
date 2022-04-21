package lesson22;

import java.util.Scanner;

public class WeatherRunner {
    public static void main(String[] args) {
        int check;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Введите название города для вывода информации о текущей погоде");
                String city = scanner.nextLine();
                Weather weather = new Weather(city);
                weather.getWeather();
                break;
            } catch (Exception e) {
                System.out.println("Некорретный ввод названия города!");
                check = 1;
            }
        }
        while (check == 1);
    }
}