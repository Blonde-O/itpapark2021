package lesson31;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"lesson31","lesson30"})
@SpringBootApplication
public class Lesson31Runner {

    public static void main(String[] args) {
        SpringApplication.run(Lesson31Runner.class, args);
    }
}
