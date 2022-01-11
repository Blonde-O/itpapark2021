package lesson16;

import lesson16.Threads.FirstThread;
import lesson16.Threads.SecondThread;
import lesson16.Threads.Thirdthread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LogRunner {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        ForLogger log = new ForLogger();
        FirstThread firstThread = new FirstThread(log, "FirstThread");
        SecondThread secondThread = new SecondThread(log, "SecondThread");
        Thirdthread thirdThread = new Thirdthread(log, "ThirdThread");
        firstThread.start();
        secondThread.start();
        thirdThread.start();
        try {
            Thread.sleep(20_000);
            firstThread.interrupt();
            secondThread.interrupt();
            thirdThread.interrupt();

        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
            Thread.currentThread().interrupt();
        }

        try (FileInputStream fin = new FileInputStream("C:\\Users\\user\\IdeaProjects\\itpapark2021\\src\\main\\java\\lesson16\\logs\\log2912.txt")) {
            System.out.printf("File size: %d bytes \n", fin.available());
            int i = -1;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
