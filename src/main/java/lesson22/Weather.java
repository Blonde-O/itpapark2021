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

public class Weather {
    private final String temperaturePath = "$.main.temp";
    private final String humidityPath = "$.main.humidity";
    private final String descriptionPath = "$.weather[*].main";
    private final String windPath = "$.wind.speed";
    private final String pressurePath = "$.main.pressure";

    private final String cityName;
    private final String appId;

    @SneakyThrows
    public Weather(String cityName) {
        this.cityName = cityName;
        String appIdPath = "src/main/resources/appid.txt";
        this.appId = extractAppId(appIdPath);
    }


    @SneakyThrows
    public void getWeather() {
        System.out.println("Текущая погода в городе " + cityName + " :");
        Object temp = getObject(temperaturePath);
        System.out.println(" - температура воздуха:  " + temp + " \u00b0" + "C");
        Object description = getObject(descriptionPath);
        System.out.println(" - общая характеристика: " + description);
        Object humidity = getObject(humidityPath);
        System.out.println(" - влажность воздуха: " + humidity + "%");
        Object wind = getObject(windPath);
        System.out.println(" - скорость ветра:  " + wind + " км/ч");
        Object pressure = getObject(pressurePath);
        System.out.println(" - атмосферное давление:  " + pressure + " гПа");
    }


    @SneakyThrows
    private Object getObject(String parameterPath) {
        StringBuilder stringBuilder = new StringBuilder();
        URLConnection urlConnection = getUrlConnection(cityName, appId);
        String jsonAsString = getString(stringBuilder, urlConnection);
        return JsonPath.read(jsonAsString, parameterPath);
    }

    private String getString(StringBuilder sb, URLConnection connection) throws IOException {
        int character;
        while ((character = connection.getInputStream().read()) != -1) {
            sb.append((char) character);
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
