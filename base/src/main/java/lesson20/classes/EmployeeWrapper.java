package lesson20.classes;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@XmlRootElement(name = "Employees")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeWrapper {

    @XmlElement(name = "employee")
    private List<Employee> employees;
}
