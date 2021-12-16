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
        listOfEmployees.add(new Employee("ДРА", 101, 5));
        listOfEmployees.add(new Employee("ДЮК", 102, 12));
        listOfEmployees.add(new Employee("КУБ", 103, 1));
        listOfEmployees.add(new Employee("ФУХ", 104, 3));
        listOfEmployees.add(new Employee("ЖУК", 105, 5));
        listOfEmployees.add(new Employee("ЖУЕ", 106, 6));
        listOfEmployees.add(new Employee("ЖАК", 107, 10));
        listOfEmployees.add(new Employee("ЗНЕ", 108, 10));
        listOfEmployees.add(new Employee("ХАУ", 109, 9));
        listOfEmployees.add(new Employee("ТОР", 110, 5));
        listOfEmployees.add(new Employee("ДРА", 111, 30));
        listOfEmployees.add(new Employee("ЦУМ", 112, 12));
        listOfEmployees.add(new Employee("ЖИВ", 113, 1));
        listOfEmployees.add(new Employee("БОК", 114, 19));
        listOfEmployees.add(new Employee("ВАХ", 115, 0));
        listOfEmployees.add(new Employee("ТОП", 116, 23));
        listOfEmployees.add(new Employee("ПОТ", 117, 10));
        listOfEmployees.add(new Employee("КАК", 118, 10));
        listOfEmployees.add(new Employee("ВОР", 119, 8));
        listOfEmployees.add(new Employee("БИМ", 120, 5));
        listOfEmployees.add(new Employee("ЗУБ", 121, 4));

        Actions firstTry = new Actions();

        try {
            int workAge = in.nextInt();
            if (workAge < 0) {
                throw new IllegalArgumentException("Неккоретный ввод. Введено отричательное число.");
            }
            firstTry.findWorkAge(workAge, listOfEmployees);
            firstTry.deleteOddElements(listOfEmployees);
        } catch (InputMismatchException e) {
            System.out.println("Неккоретный ввод. Число не введено.");
        } catch (IllegalArgumentException f) {
            System.out.println(f.getMessage());
        }
    }
}
