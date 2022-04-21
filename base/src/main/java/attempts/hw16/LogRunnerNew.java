package attempts.hw16;

import org.apache.commons.io.IOUtils;

import java.io.FileReader;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LogRunnerNew {
    private static final String FILE_NAME = "C:\\test\\testLog.txt";

    public static void main(String[] args) throws Exception {
        List<Thread> threads = IntStream.range(0, 3).boxed().map(i ->
        {
            final LogLevel[] logLevels = LogLevel.values();
            Logger logger = new Logger(logLevels[new Random().nextInt(logLevels.length)], FILE_NAME);
            return new Thread(logger);
        }).peek(Thread::start).collect(Collectors.toList());
        for (Thread thread : threads) {
            thread.join();
        }
         try(FileReader fw = new FileReader(FILE_NAME)){
             IOUtils.copy(fw, System.out);

         }


    }
}
