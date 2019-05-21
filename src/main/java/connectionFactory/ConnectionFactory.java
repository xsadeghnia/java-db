package connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static ConnectionFactory instance;

    public static ConnectionFactory getInstance(){
        if (instance == null){

            instance = new ConnectionFactory();
        }
        return instance;

    }
    private ConnectionFactory(){

    }
    private final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/javadb";
    private final String USERNAME = "root";
    private final String PASSWORD = "63afsaneh63";

    public Connection create() throws SQLException {

       return DriverManager.getConnection(JDBC_URL ,USERNAME , PASSWORD );
    }
}
