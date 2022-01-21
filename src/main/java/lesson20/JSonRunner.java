package lesson20;

import lombok.SneakyThrows;
import org.json.JSONObject;
import org.json.XML;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JSonRunner {
    @SneakyThrows
    public static void main(String[] args) {

       /*String xmlPath = "src/main/resources/employee.xml";

        FileWriter fw = new FileWriter("src/main/resources/employee.json", false);
        fw.write(String.valueOf(XML.toJSONObject(xmlPath).toString()));
        fw.flush();*/


       InputStreamReader inputStream = new InputStreamReader(JSonRunner.class.getResourceAsStream("/employee.xml"));
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(inputStream);
            StringBuilder responseStrBuilder = new StringBuilder();

            String inputStr;
            while ((inputStr = bufferedReader.readLine()) != null) {
                inputStr = inputStr+"\n";
                responseStrBuilder.append(inputStr);
            }

            JSONObject jsonObject = XML.toJSONObject(responseStrBuilder.toString());
            FileWriter fw = new FileWriter("src/main/resources/employee.json", false);
            fw.write(String.valueOf(jsonObject));
            fw.flush();
        }
    }
}
