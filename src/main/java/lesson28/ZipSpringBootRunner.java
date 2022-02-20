package lesson28;

import lesson28.interfaces.Unzipper;
import lesson28.interfaces.Zipper;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ZipSpringBootRunner {
    public static final String FILE_PATH = "C:\\hw28\\source\\testFile.txt";
    public static final String ZIP_PATH = "C:\\hw28\\output.zip";
    public static final String UNZIP_PATH = "C:\\hw28";

    public static void main(String[] args) {
        final ConfigurableApplicationContext appContext = new SpringApplicationBuilder(ZipSpringBootRunner.class)
                .bannerMode(Banner.Mode.OFF).run();
        final Zipper zipper = appContext.getBean(Zipper.class);
        final Unzipper unzipper = appContext.getBean(Unzipper.class);
        zipper.pack(FILE_PATH, ZIP_PATH);
        unzipper.unpack(ZIP_PATH, UNZIP_PATH);
    }
}
