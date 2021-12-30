package lesson16.Threads;

import lesson16.ForLogger;

import java.util.Random;

public class FirstThread extends Thread {
    private final ForLogger myLog;
    private final int leftLimit = 0065; // letter 'A'
    private final int rightLimit = 0122; // letter 'z'
    private final int targetStringLength = 10;
    Random random = new Random();
    private String level;

    public FirstThread(ForLogger myLog, String name) {
        super(name);
        this.myLog = myLog;
    }

    public void run() {
            while (!isInterrupted()) {
                String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .toString();
                myLog.setMessage(generatedString + " " + getName());
                int randomCase = random.nextInt(4);
                switch (randomCase) {
                    case 0 -> this.level = "INFO";
                    case 1 -> this.level = "SEVERE";
                    case 2 -> this.level = "WARNING";
                    case 3 -> this.level = "FINE";
                    case 4 -> this.level = "CONFIG";
                }
                myLog.setLevel(this.level);
                myLog.writeMessage();
                int sleepingTime = random.nextInt(4);
                try {
                    Thread.sleep((sleepingTime + 1) * 1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }

    @Override
    public void interrupt() {
        super.interrupt();
    }
}
