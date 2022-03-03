package lesson30.service.impl;

import lesson30.model.City;
import lesson30.repository.CityRepository;
import lesson30.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    @Override
    public void save(City city) {
        cityRepository.save(city);
    }
}
