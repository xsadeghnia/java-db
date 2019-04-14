package person_email_example;

public class ServiceLocator {
    static Configuration configuration ;
    static {
        configuration = new InMemoryConfiguration();
    }

    public static Configuration getConfiguration(){
        return  configuration;
    }
}
