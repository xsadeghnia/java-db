package person_email_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionPool implements ConnectionPool{


    @Override
    public Connection getConnection() throws SQLException {
        Configuration configuration = ServiceLocator.getConfiguration();
        return DriverManager.getConnection(configuration.jdbcURL(), configuration.username(), configuration.password());
    }
}
