package lesson41.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityDto {

    @NotNull
    @Size(min = 1, max = 2)
    private String code;

    @NotNull
    @Size(min = 1, max = 30)
    private String name;
}
