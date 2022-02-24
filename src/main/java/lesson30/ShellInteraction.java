package lesson30;

import lesson30.model.City;
import lesson30.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.List;

@ShellComponent
@RequiredArgsConstructor
public class ShellInteraction {

    //@Autowired
   private  final CityRepository cityRepository;

    @ShellMethod(value = "Добавление города в БД", key = {"add", "a"})
    public void add (@ShellOption("-pc") long postcode,
                     @ShellOption ("-rn") String rusName,
                     @ShellOption("-en") String engName,
                     @ShellOption("-pop") long population){
        cityRepository.save(new City(postcode, rusName, engName, population));
    }
    @ShellMethod(value = "Удаление города из БД", key = {"delete", "d", "del"})
    public void deleteById(long id){
        cityRepository.deleteById(id);
    }

    @ShellMethod(value = "Очистка справочника", key = {"deleteAll", "da"})
    public void deleteAll(){
        cityRepository.deleteAll();
        System.out.println("Справочник городов успешно очищен");
    }

    @ShellMethod (value = "Поиск города по почтовому коду",  key = {"find", "f"})
    public void findById (
            @ShellOption({"-pc", "--postCode"}) long id){
        System.out.println(cityRepository.findById(id).get().getNameRus());
    }
    @ShellMethod (value = "Вывод информации о всех городах из справочника",  key = {"all", "fa"})
public void findAll(){
    List<City> cities = cityRepository.findAll();
    for(City city:cities){
        System.out.println(city.toString());
    }
}
}
