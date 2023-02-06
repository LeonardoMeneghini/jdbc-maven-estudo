package one.digitalinnovation.jdbc.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private static Connection connection;
    public static Connection getConnection() throws SQLException {
        if (connection != null) {
            return connection;
        }
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/db_cadastro_cliente?useTimezone=true&serverTimezone=UTC&useLegacyDate", "postgres", "adm");
    }
}
