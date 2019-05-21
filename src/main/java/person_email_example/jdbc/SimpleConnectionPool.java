package person_email_example.jdbc;

import person_email_example.ServiceLocator;
import person_email_example.configuration.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionPool implements ConnectionPool {


    @Override
    public Connection getConnection() throws SQLException {
        Configuration configuration = ServiceLocator.getConfiguration();
        return DriverManager.getConnection(configuration.jdbcURL(), configuration.username(), configuration.password());

    }

    @Override
    public void disposeConnection(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {

        }

    }
}
