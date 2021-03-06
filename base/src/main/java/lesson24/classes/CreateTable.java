package lesson24.classes;

import com.opencsv.CSVReader;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.sql.*;

//Данный класс создает таблицу в БД из данных ресурсного csv-файла
@NoArgsConstructor
public class CreateTable {
    private final String CREATE_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS books ("
            + "isbn BIGINT NOT NULL, "
            + "name TEXT NOT NULL, "
            + "link TEXT NOT NULL, "
            + "pages INTEGER NOT NULL, "
            + "year INTEGER NOT NULL, "
            + "PRIMARY KEY (isbn))";
    private final String INSERT_BOOK_QUERY = "INSERT IGNORE INTO books " +
            "(isbn, name, link, pages, year) VALUES (?,?,?,?,?)";

    @SneakyThrows
    public void makeTable() {
        Connection con = new CreateConnection().startConnection();

        try (Statement stmt = con.createStatement()) {
            stmt.execute(CREATE_TABLE_QUERY);
            stmt.execute("DELETE FROM books");
        } catch (
                SQLException exc) {
            exc.printStackTrace();
        }

        try (CSVReader reader = new CSVReader(new FileReader("src/main/resources/bookData.csv"));
             PreparedStatement stmt = con.prepareStatement(INSERT_BOOK_QUERY)) {
            String[] record;
            while ((record = reader.readNext()) != null) {
                stmt.setLong(1, Long.parseLong(record[0]));
                stmt.setString(2, record[1]);
                stmt.setString(3, record[2]);
                stmt.setInt(4, Integer.parseInt(record[3]));
                stmt.setInt(5, Integer.parseInt(record[4]));
                stmt.executeUpdate();
            }
            System.out.println("Таблица успешно создана в базе данных.");
        }
        con.close();
    }
}