package lesson18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LineSaver {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(
                new FileReader("C:\\test\\InitialText.txt"))) {
            String line;
            String newPath;
            String path = "C:\\test\\Line";
            int count = 0;
            while ((line = br.readLine()) != null) {
                ++count;
                newPath = path + "" + count + ".txt";
                FileWriter fw = new FileWriter(newPath, false);
                fw.write(line);
                fw.flush();
            }
        }
    }
}
