package lesson20;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import lombok.SneakyThrows;

import java.io.StringWriter;

public class JaxBRunner {
    @SneakyThrows
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setTabel(100);
        employee.setLogin("doro");
        employee.setFio("DRA");
        employee.setCity(new Department("Nizhny Novgorod"));
        employee.setPostAndSalary(new Position("engineer", 50000));



        //создание объекта Marshaller, который выполняет сериализацию
        xmlWriter(employee);
    }

    private static void xmlWriter(Employee employee) throws JAXBException {
        StringWriter writer = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(Employee.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // сама сериализация
        marshaller.marshal(employee, writer);

        //преобразовываем в строку все записанное в StringWriter
        String result = writer.toString();
        System.out.println(result);
    }
}
