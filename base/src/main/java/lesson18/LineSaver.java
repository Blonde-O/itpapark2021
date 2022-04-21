package lesson18;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

@RequiredArgsConstructor
public class LineSaver implements Runnable {
    private final String fileName;
    private final String startPath;

    @SneakyThrows
    @Override
    public void run() {
        System.out.println("Началось построчное сохранение файла");
        System.out.println(LineSaver.class.getResource(fileName));
        try (BufferedReader br = new BufferedReader(
                new FileReader(fileName))) {
            String line;
            String newPath;
            int count = 0;
            while ((line = br.readLine()) != null) {
                ++count;
                newPath = startPath + "" + count + ".txt";
                FileWriter fw = new FileWriter(newPath, false);
                fw.write(line);
                fw.flush();
            }
        }
    }
}