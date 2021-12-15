package lesson13;

import java.util.Iterator;
import java.util.List;

public class Actions {

    public void findWorkAge(int m, List list) {
        System.out.println("Список ФИО работников, которые имеют стаж работы " + m + " лет.");
        Iterator<Employee> employeesIterator = list.listIterator();
        for (list.listIterator(); employeesIterator.hasNext(); ) {
            Employee value = employeesIterator.next();
            if (value.getWorkAge() == m) {
                System.out.println(value.getFio());
            }
        }
    }

}

