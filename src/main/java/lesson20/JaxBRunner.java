package lesson20;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import lombok.SneakyThrows;

import java.io.FileWriter;
import java.io.StringWriter;
import java.util.Arrays;

public class JaxBRunner {
    @SneakyThrows
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setTabel(100);
        employee.setLogin("doro");
        employee.setFio("DRA");
        employee.setCity(new Department("Nizhny Novgorod"));
        employee.setPostAndSalary(new Position("engineer", 55000));

        Employee employee2 = new Employee();
        employee2.setTabel(101);
        employee2.setLogin("fade");
        employee2.setFio("FEA");
        employee2.setCity(new Department("Saratov"));
        employee2.setPostAndSalary(new Position("leading engineer", 70000));

        Employee employee3 = new Employee();
        employee3.setTabel(102);
        employee3.setLogin("boei");
        employee3.setFio("BOI");
        employee3.setCity(new Department("St.Petersburg"));
        employee3.setPostAndSalary(new Position("assistant", 45000));

        Employee employee4 = new Employee();
        employee4.setTabel(103);
        employee4.setLogin("zelen");
        employee4.setFio("ZMY");
        employee4.setCity(new Department("Balakhna"));
        employee4.setPostAndSalary(new Position("technician", 25000));

        Employee employee5 = new Employee();
        employee5.setTabel(104);
        employee5.setLogin("tuma");
        employee5.setFio("TAV");
        employee5.setCity(new Department("Moscow"));
        employee5.setPostAndSalary(new Position("trade manager", 100000));

        Employee employee6 = new Employee();
        employee6.setTabel(105);
        employee6.setLogin("grosh");
        employee6.setFio("GAM");
        employee6.setCity(new Department("Semenov"));
        employee6.setPostAndSalary(new Position("guard", 12000));

        EmployeeWrapper employeeWrapper = new EmployeeWrapper();
        employeeWrapper.setEmployees(Arrays.asList(employee, employee2, employee3, employee4, employee5, employee6));
        xmlWriter(employeeWrapper);
    }

    @SneakyThrows
    private static void xmlWriter(EmployeeWrapper employee) {
        StringWriter writer = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(EmployeeWrapper.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(employee, writer);
        String result = writer.toString();
        FileWriter fw = new FileWriter("src/main/resources/employee.xml", false);
        fw.write(result);
        fw.flush();
    }
}
