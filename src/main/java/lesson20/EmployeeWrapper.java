package lesson20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

import java.util.List;
@Data
@XmlRootElement (name = "Реестр_работников")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeWrapper {

    @XmlElement(name ="работник")
    private List<Employee> employees;




}
