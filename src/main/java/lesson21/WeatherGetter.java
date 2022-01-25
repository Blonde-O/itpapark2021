package lesson21;

import lombok.SneakyThrows;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class WeatherGetter {
    @SneakyThrows
    public static void main(String[] args) throws URISyntaxException, IOException {
        String str;
        String city = "Moscow";
        String jsonFile = "src/main/resources/weather.json";
        String jsonPath = "$.coord.lon";

        URI uri = new URI("https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=187732d6e9dc1954003b42a70805b7b3&units=metric&");
        URL url = uri.toURL();
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        Scanner scanner = new Scanner(urlConnection.getInputStream());
//        Scanner scanner = new Scanner(url.openStream())
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(jsonFile));
        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
            bufferedWriter.write(str);
            System.out.println(str);
        }
        bufferedWriter.close();
    }
}
