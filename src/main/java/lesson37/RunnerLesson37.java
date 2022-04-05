package lesson37;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication

@EntityScan({"lesson33","lesson37"})
public class RunnerLesson37 {

    public static void main(String[] args) {
        SpringApplication.run(RunnerLesson37.class, args);
    }
}
