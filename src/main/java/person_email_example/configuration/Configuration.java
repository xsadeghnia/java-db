package person_email_example.configuration;

public interface Configuration {
    public enum DBMS{
        MYSQL
    }
    String host();
    int port();
    String dbName();
    DBMS dbms();
    String username();
    String password();
    String jdbcURL();

}
