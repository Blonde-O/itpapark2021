package lesson31.repository;

import lesson30.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityRepository extends JpaRepository<City, String> {

    @Modifying
    @Query("update City s set s.population = :population " +
            "where s.nameRus = :cityName")
    void updatePopulation(String cityName, long population);

    @Modifying
    @Query("update City s set s.population = :population, s.nameEng = :engName, s.postCode=:postCode " +
            "where s.nameRus = :cityName")
    void updateCityById(String cityName, long postCode, String engName, long population);

    @Query("select s from City s where s.population>:population order by s.population")
    List<City> cityWithPopulation(long population);

    @Query("select s from City s where s.population>( select avg(s.population) from City s)")
    List<City> cityWithPopulationBiggerThanAverage();
}
//select avg (s.population) from City s having s.population>avg (s.population) order by s.population