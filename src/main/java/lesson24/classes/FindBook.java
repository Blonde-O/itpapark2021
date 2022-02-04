package lesson24.classes;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

//Данный класс выполняет поиск книги в БД
@RequiredArgsConstructor
public class FindBook {
    private final String NAME;

    @SneakyThrows
    public void searchBook() {
        int a = 0;
        Connection connection = new CreateConnection().startConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM books WHERE name  LIKE '%" + NAME + "%'");
        while (rs.next()) {
            long id = rs.getLong(1);
            String name = rs.getString(2);
            String link = rs.getString(3);
            int pages = rs.getInt(4);
            int year = rs.getInt(5);
            System.out.println("Надены следующие совпадения:");
            System.out.printf("ISBN: %d, Название: %s, Ссылка: %s, Кол-во страниц: %d, " +
                    "Год: %d %n", id, name, link, pages, year);
        }
        ResultSet count = stmt.executeQuery("SELECT COUNT(*) FROM books WHERE name LIKE '%" + NAME + "%'");
        while (count.next()) {
            a = count.getInt(1);
        }
        if (a == 0) {
            System.out.println("Среди доступных книг совпадений не найдено!");
        }
        connection.close();
    }
}
