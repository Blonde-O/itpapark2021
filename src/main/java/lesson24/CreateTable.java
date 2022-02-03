package lesson24;

import com.opencsv.CSVReader;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.sql.*;

@NoArgsConstructor
public class CreateTable {
    private static final String CREATE_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS books ("
            + "isbn BIGINT NOT NULL, "
            + "name TEXT NOT NULL, "
            + "link TEXT NOT NULL, "
            + "pages INTEGER NOT NULL, "
            + "year INTEGER NOT NULL, "
            + "PRIMARY KEY (isbn))";
    private static final String INSERT_BOOK_QUERY = "INSERT IGNORE INTO books (isbn, name, link, pages, year) VALUES (?,?,?,?,?)";

    @SneakyThrows
    public void makeTable() {
        Connection con = new CreateConnection().startConnection();

        try (
                Statement stmt = con.createStatement()) {
            stmt.execute(CREATE_TABLE_QUERY);
        } catch (
                SQLException exc) {
            exc.printStackTrace();
        }

        try (
                CSVReader reader = new CSVReader(new FileReader("src/main/resources/bookData.csv"));
                PreparedStatement stmt = con.prepareStatement(INSERT_BOOK_QUERY)
        ) {
            String[] record;
            while ((record = reader.readNext()) != null) {
                stmt.setLong(1, Long.valueOf(record[0]));
                stmt.setString(2, record[1]);
                stmt.setString(3, record[2]);
                stmt.setInt(4, Integer.valueOf(record[3]));
                stmt.setInt(5, Integer.valueOf(record[4]));
                stmt.executeUpdate();
            }

        }
        con.close();
    }
}
