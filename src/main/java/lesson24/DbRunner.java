//https://ru.stackoverflow.com/questions/901173/Импорт-файла-cvs-в-базу-данных-java?ysclid=kz4hbtw8j9
package lesson24;

import com.opencsv.CSVReader;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DbRunner {
    private static final Properties DB_SETTINGS = new Properties();
    private static final String CREATE_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS books ("
            + "isbn INTEGER NOT NULL, "
            + "name TEXT NOT NULL, "
            + "link TEXT NOT NULL, "
            + "pages INTEGER NOT NULL, "
            + "year INTEGER NOT NULL, "
            + "PRIMARY KEY (isbn))";
    private static final String INSERT_PERSON_QUERY = "INSERT IGNORE INTO books (isbn, name, link, pages, year) VALUES (?,?,?,?,?)";
    private static final String FIND_THE_BOOK = "SELECT * FROM books WHERE name LIKE 'Чужак'";

    static {
        try {
            DB_SETTINGS.load(DbRunner.class.getResourceAsStream("/db.properties"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SneakyThrows
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                DB_SETTINGS.getProperty("jdbc.url"),
                DB_SETTINGS.getProperty("db.login"),
                DB_SETTINGS.getProperty("db.password"))
        ) {
            try (Statement stmt = connection.createStatement()) {
                stmt.execute(CREATE_TABLE_QUERY);
            }
            catch (SQLException exc) {
                exc.printStackTrace();
            }

            try (CSVReader reader = new CSVReader(new FileReader("src/main/resources/bookData.csv"));
                 PreparedStatement stmt = connection.prepareStatement(INSERT_PERSON_QUERY)
                 ) {
                String[] record;
                while ((record = reader.readNext()) != null) {
                    stmt.setInt(1, Integer.valueOf(record[0]));
                    stmt.setString(2, record[1]);
                    stmt.setString(3, record[2]);
                    stmt.setInt(4, Integer.valueOf(record[3]));
                    stmt.setInt(5, Integer.valueOf(record[4]));
                    stmt.executeUpdate();
                }
                ResultSet rs = stmt.executeQuery(FIND_THE_BOOK);

                    while (rs.next()) {
                        int id = rs.getInt(1);
                        String name = rs.getString(2);
                        String link = rs.getString(3);
                        int pages =  rs.getInt(4);
                        int year =  rs.getInt(5);

                        System.out.printf("ISBN: %d, Название: %s, Ссылка: %s, Кол-во страниц: %d, Год: %d %n", id, name, link, pages, year);


                    }
                }
            catch(IOException exc) {
                exc.printStackTrace();
            }
            catch (SQLException exc) {
                exc.printStackTrace();
            }
        }
        catch (SQLException exc) {
            exc.printStackTrace();
        }


    }
}



