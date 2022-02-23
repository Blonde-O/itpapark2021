package lesson30;

import lesson30.dao.CityDao;
import lesson30.repository.CityRepository;
import lesson30.service.CityService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaRunner {

    public static void main(String[] args) {
       final ConfigurableApplicationContext context = SpringApplication.run(JpaRunner.class, args);
       final CityService cityService = context.getBean(CityService.class);
       //cityService.save(new City(606100L, "Павлово", "Pavlovo", 56129L));
       final CityDao cityDao = context.getBean(CityDao.class);
        //System.out.println(cityDao.getById(60300L).toString());
        final CityRepository cityRep = context.getBean(CityRepository.class);
        //cityRep.deleteById(60300L);
        //cityRep.save(new City(101000L, "Москва", "Moscow", 12632409L));
        System.out.println(cityDao.findAll().toString());

    }
}
