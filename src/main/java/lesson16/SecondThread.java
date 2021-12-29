package lesson16;

import java.io.IOException;
import java.util.Random;

public class SecondThread extends Thread{
    private final Logger myLog;
    private final int leftLimit = 1040; // letter 'a'
    private final int rightLimit = 1103; // letter 'z'
    private final int targetStringLength = 10;
    private String level;
    Random random = new Random();

    public SecondThread(Logger myLog, String name) {
        super(name);
        this.myLog = myLog;

    }


    public void run() {

            State ts;
            ts = this.getState();
            String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            try {
                myLog.setStatus(ts);
                myLog.setMessage(generatedString);
                int randomCase = random.nextInt(6);
                switch (randomCase) {
                    case 0 -> this.level ="INFO";
                    case 1 -> this.level ="WARN";
                    case 2 -> this.level ="ERROR";
                    case 3 -> this.level ="DEBUG";
                    case 4 -> this.level ="TRACE";
                }
                myLog.writeToFile(this.level, getName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    @Override
    public void interrupt() {
        super.interrupt();
    }
}
