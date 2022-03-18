package lesson20.classes;


import lombok.Data;

import javax.xml.bind.annotation.XmlType;


@Data
@XmlType(propOrder = {"tabel", "login", "fio", "department", "postAndSalary"})

public class Employee {

    private int tabel;
    private String login;
    private String fio;
    private Department department;
    private Position postAndSalary;
}
