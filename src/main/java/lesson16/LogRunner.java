package lesson16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LogRunner {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        Logger log = new Logger();
        FirstThread firstThread = new FirstThread(log, "FirstThread");
        FirstThread secondThread = new FirstThread(log, "SecondThread");
        FirstThread thirdThread = new FirstThread(log, "ThirdThread");
        firstThread.start();
        firstThread.join();
        secondThread.start();
        secondThread.join();
        thirdThread.start();


        /*try(FileInputStream fin=new FileInputStream("C:/Users/blond/IdeaProjects/log2414.txt"))
        {
            System.out.printf("File size: %d bytes \n", fin.available());

            int i=-1;
            while((i=fin.read())!=-1){

                System.out.print((char)i);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }*/
    }
}
