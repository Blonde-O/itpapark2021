package lesson43.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class CityDto {
    @NotNull
    @Size(min = 1, max = 3)
    private String code;

    @NotNull
    @Size(min = 1, max = 120)
    private String name;
}
