package lesson24;

import lesson24.classes.CreateTable;

public class TableCreator {
    public static void main(String[] args) {
        CreateTable createTable = new CreateTable();
        createTable.makeTable();
        System.out.println("Таблица успешно создана в базе данных.");
    }
}