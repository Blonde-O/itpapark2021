package lesson24.classes;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@RequiredArgsConstructor
public class FindBook {
    // final String FIND_THE_BOOK = "SELECT * FROM books WHERE name  LIKE '%";
    private final String NAME;

    @SneakyThrows
    public void searchBook() {
        Connection connection = new CreateConnection().startConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM books WHERE name  LIKE '%"+NAME+"%'");
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
        connection.close();
    }
}
