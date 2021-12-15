package lesson13;

import java.util.*;

public class CollectionRunner {

    public static void main(String[] args) {
        int d = 1;

        List<Employee> listOfEmployees = new LinkedList<>();
        listOfEmployees.add(new Employee("ДРА", 100, 5));
        listOfEmployees.add(new Employee("ДЮК", 103, 12));
        listOfEmployees.add(new Employee("КУБ", 213, 1));
        listOfEmployees.add(new Employee("ФУХ", 516, 3));
        listOfEmployees.add(new Employee("ЖУК", 608, 5));
        listOfEmployees.add(new Employee("ЖУЕ", 102, 6));
        listOfEmployees.add(new Employee("ЖАК", 951, 10));
        listOfEmployees.add(new Employee("ЗНЕ", 345, 10));
        listOfEmployees.add(new Employee("ХАУ", 412, 9));
        listOfEmployees.add(new Employee("ТОР", 691, 5));

        Actions firstTry = new Actions();
        //firstTry.findWorkAge(d, listOfEmployees);

        /*int exp = 5;
        for (Employee v : listOfEmployees) {
            if (v.getWorkAge() == exp)
                System.out.println(v.getFio());
        }
        System.out.println("--------------------------");
        Iterator<Employee> employeesIterator = listOfEmployees.listIterator();
        for (listOfEmployees.listIterator(); employeesIterator.hasNext();){
        Employee value = employeesIterator.next();
            if (value.getWorkAge() == exp)
                System.out.println(value.getFio());
        }
 public void findWorkAge (List<Object> , int m){

        }*/

        //ListIterator<Employee> employeesIterator = listOfEmployees.listIterator();
        for (ListIterator<Employee> employeesIterator = listOfEmployees.listIterator(); employeesIterator.hasPrevious();){

            Employee value = employeesIterator.previous();
            System.out.println(value);
            /*if ((a % 2) != 0){
               // System.out.println("удаляемый элемент" +value);
                employeesIterator.remove();

            }*/

    }
      // System.out.println(listOfEmployees);

    }
}
