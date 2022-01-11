package lesson16;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ForLogger {

    Logger log;
    private String level;
    private String message;

    public ForLogger() {
        try (FileInputStream ins = new FileInputStream("C:\\Users\\user\\IdeaProjects\\itpapark2021\\src\\main\\java\\lesson16\\log_config")) {
            LogManager.getLogManager().readConfiguration(ins);
            log = Logger.getLogger(ForLogger.class.getName());
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void writeMessage() {
        FileHandler fh = null;
        try {
            fh = new FileHandler("C:\\Users\\user\\IdeaProjects\\itpapark2021\\src\\main\\java\\lesson16\\logs\\log2912.txt");
        } catch (IOException e) {
            //e.printStackTrace();
        }
        log.addHandler(fh);
        try {
            log.log(Level.parse(level), this.message);
        } catch (Exception e) {
            log.log(Level.parse(level), this.message, e);
        }

    }
}
