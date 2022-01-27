package lesson22;

public class WeatherRunner {
    public static void main(String[] args) {
        String [] cities = new String [] {"Нижний Новгород", "Санкт Петербург", "Москва", "Анапа",
                "Челябинск", "Норильск", "Семенов","Уфа", "Ялта", "Харбин"};
        for (String city: cities){
            Weather weather = new Weather(city);
            weather.getWeather();
        }
    }
}
