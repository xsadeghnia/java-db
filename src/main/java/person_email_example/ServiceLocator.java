package person_email_example;

import person_email_example.configuration.Configuration;
import person_email_example.dao.DbEmailDao;
import person_email_example.dao.DbPersonDao;
import person_email_example.dao.EmailDao;
import person_email_example.dao.PersonDao;
import person_email_example.jdbc.ConnectionPool;
import person_email_example.jdbc.InMemoryConfiguration;
import person_email_example.jdbc.SimpleConnectionPool;

public class ServiceLocator {
    private static Configuration configuration ;
    private static ConnectionPool connectionPool;
    private static PersonDao personDao;
    private static EmailDao emailDao;
    static {
        configuration = new InMemoryConfiguration();
        connectionPool = new SimpleConnectionPool();
        personDao = new DbPersonDao();
        emailDao = new DbEmailDao();

    }

    public static Configuration getConfiguration(){
        return  configuration;
    }

    public static ConnectionPool getConnectionPool() {
        return connectionPool;
    }

    public static PersonDao getPersonDao() {
        return personDao;
    }

    public static EmailDao getEmailDao() {
        return emailDao;
    }
}
