package lesson28;

import lesson28.interfaces.Unzipper;
import lesson28.interfaces.Zipper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ZipRunner {
    public static final String FILE_PATH = "C:\\hw28\\source\\testFile.txt";
    public static final String ZIP_PATH = "C:\\hw28\\output.zip";
    public static final String UNZIP_PATH = "C:\\hw28";

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext("lesson28");
        final Zipper zipper = config.getBean(Zipper.class);
        final Unzipper unzipper = config.getBean(Unzipper.class);
        zipper.pack(FILE_PATH, ZIP_PATH);
        unzipper.unpack(ZIP_PATH, UNZIP_PATH);
    }
}
