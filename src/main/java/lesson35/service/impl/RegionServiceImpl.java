package lesson35.service.impl;

import lesson35.dto.RegionDto;
import lesson35.dto.RegionPageDto;
import lesson35.mapper.RegionMapper;
import lesson35.model.Region;
import lesson35.repository.RegionRepository;
import lesson35.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RegionServiceImpl implements RegionService {

    private final RegionRepository regionRepository;
    private final RegionMapper regionMapper;

    @Override
    @Transactional(readOnly = true)
    public List<RegionDto> findAll() {
        return regionMapper.toDtos(regionRepository.findAll());
    }

    @Override
    public RegionPageDto getPage(Pageable pageable) {
        Page<Region> currentPage = regionRepository.findAll(pageable);
        return new RegionPageDto(regionMapper.toDtos(currentPage.getContent()),
                currentPage.getNumber(),
                currentPage.getTotalPages(),
                currentPage.hasNext(),
                currentPage.hasPrevious());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<RegionDto> getByCode(@NotEmpty String regionCode) {
        return regionMapper.toOptionalDto(regionRepository.findById(regionCode));
    }

    @Override
    @Transactional
    public RegionDto save(@Valid RegionDto region) {
        return regionMapper.toDto(regionRepository.save(regionMapper.toEntity(region)));
    }

    @Override
    @Transactional
    public void deleteByCode(@NotEmpty String regionCode) {
        regionRepository.deleteById(regionCode);
    }
}
