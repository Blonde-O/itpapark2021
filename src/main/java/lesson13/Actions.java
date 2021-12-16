package lesson13;

import java.util.List;
import java.util.ListIterator;

public class Actions {

    public void findWorkAge(int m, List list) {
        int a = 0;
        System.out.println("Список ФИО работников, которые имеют стаж работы " + m + " лет.");
        ListIterator<Employee> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Employee value = iterator.next();
            if (value.getWorkAge() == m) {
                System.out.println(value.getFio());
                a++;
            }
        }
        if (a == 0) {
            System.out.println("Сотрудников с таким стажем не обнаружено");
        }
        System.out.println("-------------------------");
    }

    public void deleteOddElements(List list) {
        System.out.println("Произвели удаление нечетных сотрудников. Новый список имеет вид:");
        ListIterator<Employee> interator = list.listIterator(list.size());
        while (interator.hasPrevious()) {
            if ((list.indexOf(interator.previous()) % 2) != 0) {
                interator.remove();
            }
        }
        while (interator.hasNext()) {
            Employee value = interator.next();
            System.out.println(value);
        }
    }
}





