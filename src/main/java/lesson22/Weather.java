package lesson22;

import com.jayway.jsonpath.JsonPath;
import lombok.SneakyThrows;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Weather {
    private final String TEMPERATURE_PATH = "$.main.temp";
    private final String HUMIDITY_PATH = "$.main.humidity";
    private final String DESCRIPTION_PATH = "$.weather[*].description";
    private final String WIND_PATH = "$.wind.speed";
    private final String PRESSURE_PATH = "$.main.pressure";
    private final String CITY_NAME;
    private final String APP_ID;
    private String jsonString;

    @SneakyThrows
    public Weather(String cityName) {
        this.CITY_NAME = cityName;
        String appIdPath = "src/main/resources/appid.txt";
        this.APP_ID = extractAppId(appIdPath);
    }

    @SneakyThrows
    public void getWeather() {
        getStringFromJson();
        System.out.println("Текущая погода в городе " + CITY_NAME + " :");
        Object temp = JsonPath.read(jsonString, TEMPERATURE_PATH);
        System.out.println(" - температура воздуха:  " + temp + " \u00b0" + "C");
        Object description = JsonPath.read(jsonString, DESCRIPTION_PATH);
        System.out.println(" - общая характеристика: " + description);
        Object humidity = JsonPath.read(jsonString, HUMIDITY_PATH);
        System.out.println(" - влажность воздуха: " + humidity + "%");
        Object wind = JsonPath.read(jsonString, WIND_PATH);
        System.out.println(" - скорость ветра:  " + wind + " км/ч");
        Object pressure = JsonPath.read(jsonString, PRESSURE_PATH);
        System.out.println(" - атмосферное давление:  " + pressure + " гПа");
    }

    @SneakyThrows
    private void getStringFromJson() {
        StringBuilder stringBuilder = new StringBuilder();
        URLConnection urlConnection = getUrlConnection(CITY_NAME, APP_ID);
        this.jsonString = getString(stringBuilder, urlConnection);
    }

    private String getString(StringBuilder sb, URLConnection connection) throws IOException {
        int character;
        try (InputStreamReader sr = new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8)
        ) {
            while ((character = sr.read()) != -1) {
                sb.append((char) character);
            }
        }
        return sb.toString();
    }

    private URLConnection getUrlConnection(String city, String appId) throws URISyntaxException, IOException {
        city = city.replace("\s", "+");
        URI uri = new URI("https://api.openweathermap.org/data/2.5/weather?q=" + city + "&lang=ru&appid=" + appId +
                "&units=metric&");
        URL url = uri.toURL();
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        return urlConnection;
    }

    private String extractAppId(String appIdPath) throws IOException {
        Path path = Paths.get(appIdPath);
        return Files.readString(path);
    }
}