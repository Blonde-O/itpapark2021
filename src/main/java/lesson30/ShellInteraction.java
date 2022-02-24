package lesson30;

import lesson30.model.City;
import lesson30.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ShellInteraction {

   @Autowired
   private  CityRepository cityRepository;

    @ShellMethod(value = "Добавление города в БД", key = {"add", "a"})
    public void add (long postcode, String rusName, String engName, long population){
        cityRepository.save(new City(postcode, rusName, engName, population));
    }

}
