package lesson21;

import com.jayway.jsonpath.JsonPath;
import lombok.SneakyThrows;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class WeatherGetter {
    @SneakyThrows
    public static void main(String[] args) throws URISyntaxException, IOException {
        String str;
        String city = "Sochi";
        String jsonFile = "src/main/resources/weather.json";
        String jsonPath = "$.main.temp";

        URI uri = new URI("https://api.openweathermap.org/data/2.5/weather?q=" + city + "&lang=ru&appid=187732d6e9dc1954003b42a70805b7b3&units=metric&");
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

        File file = new File(jsonFile);
        InputStream fileInputStream = new FileInputStream(file);
        StringBuilder stringBuilder = new StringBuilder();
        int crt;
        while ((crt= fileInputStream.read())!=-1){
            stringBuilder.append((char) crt);
        }
        String jsonAsString = stringBuilder.toString();
        double temp = JsonPath.read(jsonAsString, jsonPath);
        System.out.println(temp);

    }
}
