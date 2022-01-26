package lesson22;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AppidReader {
    @SneakyThrows
    public static void main(String[] args) {
        String city = "Нижний Новгород";
        String jsonFile = "src/main/resources/weather.json";
        String jsonPath = "$.main.temp";

        System.out.println(city.replace("\s", "+"));
        Path path= Paths.get("src/main/resources/appid.txt");
        System.out.println(Files.readString(path));
        //String newString = new String(oldString.getBytes("UTF-8"), "Cp1251");
    }
}
