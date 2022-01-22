package lesson20;

import com.jayway.jsonpath.JsonPath;
import lombok.SneakyThrows;
import org.json.JSONObject;
import org.json.XML;

import java.io.*;
import java.util.List;

public class JsonRunner {
    public static int PRETTY_FACTOR = 4;

    //Конвертируем созданный xml в json. Получаем полный список сотрудников и выводим информацию о тех,
    //кто имеет нечетный индекс в списке.
    @SneakyThrows
    public static void main(String[] args) {
        String FilePath = "src/main/resources/employee";
        String xmlExtension =".xml";
        String jsonExtension =".json";
        String jsonPath = "$.Employees.employee[*]";

        try {
            writeJsonFile(FilePath+jsonExtension, getString(FilePath+xmlExtension));
            printAllEmployees(getString(FilePath+jsonExtension), jsonPath);
            findOddEmployees(getString(FilePath+jsonExtension), jsonPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getString(String filePath) throws IOException {
        File file = new File(filePath);
        InputStream inputStream = new FileInputStream(file);
        StringBuilder builder = new StringBuilder();
        int ptr;
        while ((ptr = inputStream.read()) != -1) {
            builder.append((char) ptr);
        }
        return builder.toString();
    }

    private static void writeJsonFile(String filePath, String xml) throws IOException {
        JSONObject jsonObj = XML.toJSONObject(xml);
        BufferedWriter bufferedWriter =
                new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write(jsonObj.toString(PRETTY_FACTOR));
        bufferedWriter.close();
    }
    private static void printAllEmployees(String file, String path) {
        System.out.println("Полный список работников:");
        List<String> allEmployees = JsonPath.read(file, path+ ".fio");
        int count =0;
        for (Object employees : allEmployees) {
            System.out.println(count + ") " + employees.toString());
            count++;
        }
    }

    public static void findOddEmployees(String file, String path) {
        System.out.println("\nИнформация о сотрудниках с нечентыми индексами:");
        List<Object> namesOfOddEmployees = JsonPath.read(file, path);
        for (int i = 1; i < namesOfOddEmployees.size(); i++) {
            if (i % 2 != 0) {
                System.out.println(namesOfOddEmployees.get(i) + "\t");
            }
        }
    }
}