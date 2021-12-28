package lesson16;

import java.io.IOException;
import java.util.Random;

public class LogErrorThread extends Thread{
    private final Logger myLog;
    private final int leftLimit = 1040; // letter 'a'
    private final int rightLimit = 1103; // letter 'z'
    private final int targetStringLength = 10;
    private final int count;
    Random random = new Random();

    public LogErrorThread(Logger myLog, String name, int count) {
        super(name);
        this.myLog = myLog;
        this.count = count;
    }

    public void run() {
        for(int i=0; i<count; i++) {
            Thread.State ts;
            ts = this.getState();
            String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            try {
                myLog.setStatus(ts);
                myLog.setMessage(generatedString);
                myLog.writeToFile(getName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void interrupt() {
        super.interrupt();
    }
}
