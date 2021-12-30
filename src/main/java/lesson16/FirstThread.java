package lesson16;

import java.io.IOException;
import java.util.Random;

public class FirstThread extends Thread {
    private final Logger myLog;
    private final int leftLimit = 0065; // letter 'A'
    private final int rightLimit = 0122; // letter 'z'
    private final int targetStringLength = 10;
    Random random = new Random();
    private String level;

    public FirstThread(Logger myLog, String name) {
        super(name);
        this.myLog = myLog;

    }

    public void run() {

            while (!isInterrupted()) {
                Thread.State ts;
                ts = this.getState();
                String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .toString();
                try {
                    myLog.setStatus(ts);
                    myLog.setMessage(generatedString);
                    int randomCase = random.nextInt(4);
                    switch (randomCase) {
                        case 0 -> this.level = "INFO";
                        case 1 -> this.level = "WARN";
                        case 2 -> this.level = "ERROR";
                        case 3 -> this.level = "DEBUG";
                        case 4 -> this.level = "TRACE";
                    }
                    myLog.writeToFile(this.level, getName());
                    int sleepingTime = random.nextInt(4);
                    try {
                        Thread.sleep((sleepingTime + 1) * 1000);
                    } catch (InterruptedException e) {
                        //e.printStackTrace();
                        break;
                    }
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
