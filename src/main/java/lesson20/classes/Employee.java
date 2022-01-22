package lesson20.classes;

import jakarta.xml.bind.annotation.*;
import lombok.Data;


@Data
@XmlType(propOrder = {"tabel", "login", "fio", "department", "postAndSalary"})

public class Employee {

    private int tabel;
    private String login;
    private String fio;
    private Department department;
    private Position postAndSalary;
}
