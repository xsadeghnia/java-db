package connectionfactory_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectionFactory {
    private static ConnectionFactory instance;

    public static ConnectionFactory getInstance(){
        if (instance == null){

            instance = new ConnectionFactory();
        }
        return instance;

    }
    private ConnectionFactory(){
        loadFromFile();

    }
    private  String dbms;
    private  String host;
    private  String port;
    private  String dbname;
    private  String username = "root";
    private  String password = "63afsaneh63";

    public Connection create() throws SQLException {

       return DriverManager.getConnection(getJdbcUrl() , username, password );
    }
    private void loadFromFile(){
        try {
            Scanner scanner = new Scanner(new FileInputStream("/Users/afsaneh/db.conf"));
            dbms = scanner.next();
            host = scanner.next();
            port = scanner.next();
            dbname = scanner.next();
            username = scanner.next();
            password = scanner.next();

        } catch (FileNotFoundException e) {
            System.out.println("Can not read from conf file!");
            System.exit(1);
        }
    }
    private String getJdbcUrl(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("jdbc:")
                .append(dbms)
                .append("://")
                .append(host)
                .append(":")
                .append(port)
                .append("/")
                .append(dbname);
        return stringBuilder.toString();
    }
}
