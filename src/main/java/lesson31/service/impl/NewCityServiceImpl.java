package lesson31.service.impl;

import lesson30.model.City;
import lesson31.repository.CityRepository;
import lesson31.service.NewCityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewCityServiceImpl implements NewCityService {


    private final CityRepository cityRepository;

    @Override
    @Transactional
    public void updateCity(String cityName, long postCode, String engName, long population) {
        cityRepository.updateCityById(cityName, postCode, engName, population);
    }

    @Override
    @Transactional
    public void updatePopulation(String name, long population) {
        cityRepository.updatePopulation(name, population);
    }

    @Override
    @Transactional
    public void updateEngName(String name, String engName) {
        cityRepository.findById(name)
                .ifPresent(city -> city.setNameEng(engName));
    }

    @Override
    @Transactional
    public void citiesAbovePopulation(long population) {
        System.out.println("Список городов с численностью населения более " + population + " человек.");
        List<City> cities = cityRepository.cityWithPopulation(population);
        for (int i = cities.size() - 1; i > 0; i--) {
            System.out.println(cities.get(i).getNameRus() + " " + cities.get(i).getPopulation() + " чел.");
        }
    }

    @Override
    public void averagePopulation() {
        System.out.println("Список городов с населением больше среднего");
        List<City> cities = cityRepository.cityWithPopulationBiggerThanAverage();
        for (City city : cities) {
            String nameRus = city.getNameRus();
            String nameEng = city.getNameEng();
            System.out.println(nameRus + " (" + nameEng + ")");
        }
    }
}