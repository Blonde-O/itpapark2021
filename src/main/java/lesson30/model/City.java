package lesson30.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CITY")
public class City {

    @Id
    @Column(name = "post_code", nullable = false)
    private long postCode;

    @NotEmpty
    @Column(name = "name_russ", nullable = false)
    private String nameRus;

    @NotEmpty
    @Column(name = "name_eng", nullable = false)
    private String nameEng;

    //@NotEmpty
    @Column(name = "population", nullable = false)
    private long population;

    public City(long postCode, String nameRus, String nameEng, long population) {
        this.postCode = postCode;
        this.nameRus = nameRus;
        this.nameEng = nameEng;
        this.population = population;
    }
}
