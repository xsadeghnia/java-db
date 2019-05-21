package person_email_example.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionPool {
    Connection getConnection() throws SQLException;

    void disposeConnection(Connection connection);
}
