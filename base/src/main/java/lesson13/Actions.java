package lesson13;

import java.util.List;
import java.util.ListIterator;

public class Actions {
    private List list;
    private ListIterator<Employee> iterator;

    public Actions(List list) {
        this.list = list;
        this.iterator = list.listIterator();
    }

    public void findWorkAge(int m) {
        int a = 0;
        System.out.println("Список ФИО работников, которые имеют стаж работы " + m + " лет.");
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
    }

    public void deleteOddElements() {
        System.out.println("-------------------------");
        System.out.println("Произвели удаление нечетных сотрудников. Новый список имеет вид:");
        iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            if ((list.indexOf(iterator.previous()) % 2) != 0) {
                iterator.remove();
            }
        }
        while (iterator.hasNext()) {
            Employee value = iterator.next();
            System.out.println(value);
        }
    }
}





