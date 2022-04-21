package lesson24;

import lesson24.classes.CreateTable;

//Приложение запускающее передачу данных из csv-файла в таблицу БД
public class TableCreator {
    public static void main(String[] args) {
        CreateTable createTable = new CreateTable();
        createTable.makeTable();
    }
}