package lesson35.mapper;

import lesson35.dto.RegionDto;
import lesson35.model.Region;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Mapper
public interface RegionMapper {
    @Mapping(target = "code", source = "entity.code")
    @Mapping(target = "name", source = "entity.name")
    RegionDto toDto(Region entity);

    @Mapping(target = "code", source = "dto.code")
    @Mapping(target = "name", source = "dto.name")
    Region toEntity(RegionDto dto);

    default List<RegionDto> toDtos(List<Region> entities) {
        return entities.stream().map(this::toDto).collect(Collectors.toList());
    }

    default Optional<RegionDto> toOptionalDto(Optional<Region> entity) {
        return entity.map(this::toDto);
    }
}
