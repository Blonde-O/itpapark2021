package lesson20;

import jakarta.xml.bind.annotation.*;
import lombok.Data;


@Data
@XmlType(propOrder = {"tabel", "login", "fio", "city", "postAndSalary"})
@XmlRootElement

public class Employee {

    private int tabel;
    private String login;
    private String fio;
    private Department city;
    private Position postAndSalary;

}
