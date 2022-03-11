package lesson29;

import lesson29.interfaces.Unzipper;
import lesson29.interfaces.Zipper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ZipSpringBootRunner {
    public static final String ZIP_PATH = "C:\\hw28\\output.zip";
    public static final String UNZIP_PATH = "C:\\hw28";
    //C:/hw28/output.zip
    //C:/hw28/source/testFile.txt

    public static void main(String[] args) {
        SpringApplication.run(ZipSpringBootRunner.class, args);
    }
}