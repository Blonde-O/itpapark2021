package lesson16;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger<M, S> {
    private M message;
    private S status;

    public void setMessage(M message) {
        this.message = message;
    }

    public void setStatus(S status) {
        this.status = status;
    }

    public void writeToFile(String level, String name) throws IOException {
        try (FileWriter writer = new FileWriter("log2912.txt", true)) {
            Date date = new Date();
            writer.append('\n');
            writer.write("\n" +date + "\t " + level + "\t " + this.status + "\t " + name+ "\t" +this.message+ "\n");
            writer.append('\t');
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
