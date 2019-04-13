package person_email_example;

public class InMemoryConfiguration extends AbstractConfiguration {


    public String host() {
        return "127.0.0.1";
    }

    public int port() {
        return 3306;
    }

    public String dbName() {
        return "javadb";
    }

    public DBMS dbms() {
        return DBMS.MYSQL;
    }

    public String username() {
        return "root";
    }

    public String password() {
        return "63afsaneh63";
    }
}
