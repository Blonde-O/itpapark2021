package lesson35.service;

import lesson35.dto.RegionDto;
import lesson35.dto.RegionPageDto;
import org.springframework.data.domain.Pageable;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Optional;

public interface RegionService {
    List<RegionDto> findAll();
    RegionPageDto getPage(Pageable pageable);
    Optional<RegionDto> getByCode(@NotEmpty String regionCode);
    RegionDto save(@Valid RegionDto region);
    void deleteByCode(@NotEmpty String regionCode);
}
