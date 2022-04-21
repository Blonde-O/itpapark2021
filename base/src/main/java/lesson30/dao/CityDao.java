package lesson30.dao;

import lesson30.model.City;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

public interface CityDao {
    List<City> findAll();
    Optional<City> getById(long cityPostCode);
    City save(@Valid City city);
    void deleteById(long cityPostCode);
    void delete(@Valid City city);
}
