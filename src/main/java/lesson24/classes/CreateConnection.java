package lesson24.classes;

import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

@NoArgsConstructor
public class CreateConnection {
    private static final Properties DB_SETTINGS = new Properties();

    static {
        try {
            DB_SETTINGS.load(DbRunner.class.getResourceAsStream("/db.properties"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SneakyThrows
    public Connection startConnection() {
        Connection connection = DriverManager.getConnection(
                DB_SETTINGS.getProperty("jdbc.url"),
                DB_SETTINGS.getProperty("db.login"),
                DB_SETTINGS.getProperty("db.password"));
        return connection;
    }
}