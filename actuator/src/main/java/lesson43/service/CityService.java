package lesson43.service;

import lesson43.dto.CityDto;
import lesson43.dto.CityPageDto;
import lesson43.model.City;
import org.springframework.data.domain.Pageable;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Optional;

public interface CityService {
    List<CityDto> findAll();

    CityPageDto getPage(Pageable pageable);

    Optional<CityDto> getByCode(@NotEmpty String cityCode);

    CityDto save(@Valid CityDto city);

    void deleteByCode(@NotEmpty String cityCode);

    void delete(@Valid City city);
}