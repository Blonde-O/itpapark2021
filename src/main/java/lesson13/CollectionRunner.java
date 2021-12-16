package lesson13;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CollectionRunner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите интресующий Вас стаж для поиска работников");

        List<Employee> listOfEmployees = new LinkedList<>();
        listOfEmployees.add(new Employee("ДРА", 100, 5));
        listOfEmployees.add(new Employee("ДЮК", 101, 12));
        listOfEmployees.add(new Employee("КУБ", 102, 1));
        listOfEmployees.add(new Employee("ФУХ", 103, 3));
        listOfEmployees.add(new Employee("ЖУК", 104, 5));
        listOfEmployees.add(new Employee("ЖУЕ", 105, 6));
        listOfEmployees.add(new Employee("ЖАК", 106, 10));
        listOfEmployees.add(new Employee("ЗНЕ", 107, 10));
        listOfEmployees.add(new Employee("ХАУ", 108, 9));
        listOfEmployees.add(new Employee("ТОР", 109, 5));
        listOfEmployees.add(new Employee("ДРА", 110, 30));
        listOfEmployees.add(new Employee("ЦУМ", 111, 12));
        listOfEmployees.add(new Employee("ЖИВ", 112, 1));
        listOfEmployees.add(new Employee("БОК", 113, 19));
        listOfEmployees.add(new Employee("ВАХ", 114, 0));
        listOfEmployees.add(new Employee("ТОП", 115, 23));
        listOfEmployees.add(new Employee("ПОТ", 116, 10));
        listOfEmployees.add(new Employee("КАК", 117, 10));
        listOfEmployees.add(new Employee("ВОР", 118, 8));
        listOfEmployees.add(new Employee("БИМ", 119, 5));
        listOfEmployees.add(new Employee("ЗУБ", 120, 4));
        listOfEmployees.add(new Employee("КОП", 121, 2));

        Actions firstTry = new Actions(listOfEmployees);

        try {
            int workAge = in.nextInt();
            if (workAge < 0) {
                throw new IllegalArgumentException("Неккоретный ввод стажа. Введено отричательное число.");
            }
            firstTry.findWorkAge(workAge);
        } catch (InputMismatchException e) {
            System.out.println("Неккоретный ввод стажа. Число не введено.");
        } catch (IllegalArgumentException f) {
            System.out.println(f.getMessage());
        }
        firstTry.deleteOddElements();
    }
}
