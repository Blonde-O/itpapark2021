package lesson18;

import lombok.SneakyThrows;

public class LineSaverRunner {
    @SneakyThrows
    public static void main(String[] args) {
        LineSaver lineSaver = new LineSaver("C:\\test\\InitialText.txt", "C:\\test\\Line");
        Thread thread = new Thread(lineSaver);
        thread.start();
        thread.join();
        System.out.println("Работа с файлом завершена");
    }
}
