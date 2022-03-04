/*
package lesson31;

import lesson31.service.NewCityService;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
@RequiredArgsConstructor
public class Interraction {

    private final NewCityService newCityService;

    @ShellMethod(value = "Обновляем данные о численности", key = "up")
    public void updatePopulation(String name, long population) {
        newCityService.updatePopulation(name, population);
    }

    @ShellMethod(value = "Обновляем данные об английском названии города", key = "uen")
    public void updateEnglishName(String name, String engName) {
        newCityService.updateEngName(name, engName);
    }

    @ShellMethod(value = "Обновляем все данные города", key = "uc")
    public void updateWholeCity(String cityName, long postCode, String engName, long population) {
        newCityService.updateCity(cityName, postCode, engName, population);
    }

    @ShellMethod(value = "Выводим города с нужной населеннсотью", key = "ap")
    public void citiesAbovepopulation(long population) {
        newCityService.citiesAbovePopulation(population);
    }

    @ShellMethod(value = "Выводим города с населенностью выше средней", key = "av")
    public void cityWithPopulationBiggerThanAverage () {
        newCityService.averagePopulation();
    }
}*/
