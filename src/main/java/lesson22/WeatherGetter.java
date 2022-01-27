package lesson22;

import com.jayway.jsonpath.JsonPath;
import lombok.SneakyThrows;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WeatherGetter {

    @SneakyThrows
    public static void main(String[] args) throws URISyntaxException, IOException {
        String temperaturePath = "$.main.temp";
        String humidityPath = "$.main.humidity";
        String descriptionPath = "$.weather[*].main";
        String windPath = "$.wind.speed";
        String appIdPath = "src/main/resources/appid.txt";

        String[] cities = new String[]{"Сочи", "Москва", "Волгоград", "Нижний Новгород", "Архангельск", "Тюмень", "Саранск", "Воркута", "Норильск"};
        String appId = extractAppId(appIdPath);


        for (String city : cities) {
            StringBuilder stringBuilder = new StringBuilder();
            URLConnection urlConnection = getUrlConnection(city, appId);
            String jsonAsString = getString(stringBuilder, urlConnection);
            Object temp = getObject(jsonAsString, temperaturePath);
            Object description = getObject(jsonAsString, descriptionPath);
            Object humidity = getObject(jsonAsString, humidityPath);
            Object wind = getObject(jsonAsString, windPath);
            System.out.println("Текущая погода в городе " + city + " :");
            System.out.println(" - общая характеристика: " + description);
            System.out.println(" - температура воздуха:  " + temp + " \u00b0" + "C");
            System.out.println(" - влажность воздуха: " + humidity + "%");
            System.out.println(" - скорость ветра:  " + wind + " км/ч");
        }
    }

    private static String extractAppId(String appIdPath) throws IOException {
        Path path = Paths.get(appIdPath);
        String id = Files.readString(path);
        return id;
    }

    private static Object getObject(String jsonAsString, String parameterPath) {
        Object obj = JsonPath.read(jsonAsString, parameterPath);
        return obj;
    }

    private static String getString(StringBuilder sb, URLConnection connection) throws IOException {
        int character;
        while ((character = connection.getInputStream().read()) != -1) {
            sb.append((char) character);
        }
        String jsonAsString = sb.toString();
        return jsonAsString;
    }

    private static URLConnection getUrlConnection(String city, String appId) throws URISyntaxException, IOException {
        city = city.replace("\s", "+");
        URI uri = new URI("https://api.openweathermap.org/data/2.5/weather?q=" + city + "&lang=ru&appid=" + appId +
                "&units=metric&");
        URL url = uri.toURL();
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        return urlConnection;
    }
}
