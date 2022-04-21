package lesson31.service;

public interface NewCityService {

    void updateCity(String cityName, long postCode, String engName, long population);

    void updatePopulation(String name, long population);

    void updateEngName(String name, String engName);

    void citiesAbovePopulation(long population);

    void averagePopulation();
}
