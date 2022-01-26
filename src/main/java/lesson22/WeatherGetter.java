package lesson22;

import com.jayway.jsonpath.JsonPath;
import lombok.SneakyThrows;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class WeatherGetter {
    final static String DEGREE  = "\u00b0";

    @SneakyThrows
    public static void main(String[] args) throws URISyntaxException, IOException {
        String FORMAT_TEXT = "%s %s";
        String str;
        String city = "Нижний+Новгород";
        String jsonFile = "src/main/resources/weather.json";
        String temperaturePath = "$.main.temp";
        String humidityPath = "$.main.humidity";
        String descriptionPath = "$.weather[*].description";
        String windPath = "$.wind.speed";
        city.replace("\s", "+");

        String [] cities = new String []{"Сочи", "Москва", "Волгоград", "Киев", "Архангельск", "Тюмень", "Саранск", "Воркута", "Норильск"};

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/weather.txt", true));
        for (String town: cities) {
            URI uri = new URI("https://api.openweathermap.org/data/2.5/weather?q=" + town + "&lang=ru&appid=187732d6e9dc1954003b42a70805b7b3&units=metric&");
            URL url = uri.toURL();
            URLConnection urlConnection = url.openConnection();
            urlConnection.connect();
            StringBuilder stringBuilder1 = new StringBuilder();
            int character;
            while ((character = urlConnection.getInputStream().read()) != -1) {
                stringBuilder1.append((char) character);
            }
            String jsonAsString = stringBuilder1.toString();
            Object temp = JsonPath.read(jsonAsString, temperaturePath);
            Object description = JsonPath.read(jsonAsString, descriptionPath);

            Object humidity = JsonPath.read(jsonAsString, humidityPath);
            Object wind = JsonPath.read(jsonAsString, windPath);
            System.out.println("Текущая погода в городе " + town + " :");
            System.out.println("общая характеристика: " + description);
            System.out.println("температура воздуха:  " + temp + " " + DEGREE + "C");
            System.out.println("влажность воздуха: " + humidity);
            System.out.println("скорость ветра:  " +wind+ " км/ч");


            //String line = String.format(FORMAT_TEXT,"Текущая температура в городе" + town + " составляет: " + temp + " "  + DEGREE + "C\t");
            bufferedWriter.write(String.format(FORMAT_TEXT,"Текущая температура в городе " + town + " составляет: " + temp + " "  + DEGREE + "C", ";"));
            bufferedWriter.write(" \n");

        }
        bufferedWriter.close();





//

    }
}
