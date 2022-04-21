package attempts.for16lesson;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ForLogger {

    private final String message;
    Logger log;

    public ForLogger(String message) {
        this.message = message;

        try(FileInputStream ins = new FileInputStream("C:\\Users\\user\\IdeaProjects\\itpapark2021\\src\\main\\java\\attempts\\for16lesson\\log_config")){
            LogManager.getLogManager().readConfiguration(ins);
            log = Logger.getLogger(ForLogger.class.getName());
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }

    public void writeMessage() {
        try {
            FileHandler fh = new FileHandler("C:\\Users\\user\\IdeaProjects\\itpapark2021\\src\\main\\java\\attempts\\for16lesson\\log2912.txt");
            log.addHandler(fh);

        } catch (SecurityException e) {
            log.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за политики безопасности.",
                    e);
        } catch (IOException e) {
            log.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за ошибки ввода-вывода.",
                    e);
        }
        log.log(Level.INFO, this.message);
    }


}
