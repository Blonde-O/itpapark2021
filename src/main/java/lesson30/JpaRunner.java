package lesson30;

import lesson30.dao.CityDao;
import lesson30.model.City;
import lesson30.repository.CityRepository;
import lesson30.service.CityService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaRunner {

    public static void main(String[] args) {
        SpringApplication.run(JpaRunner.class, args);
    }
}