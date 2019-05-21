package person_email_example.configuration;

public abstract class AbstractConfiguration implements Configuration {

   @Override
    public String jdbcURL(){
        chekDBMS();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("jdbc:");
        if (dbms() == DBMS.MYSQL ){
            stringBuilder.append("mysql://");
        }
        stringBuilder.append(host()).append(":").append(port()).append("/").append(dbName());
        return stringBuilder.toString();

    }

    protected void chekDBMS(){
        if(dbms() != DBMS.MYSQL){
            throw new RuntimeException("DBMS is not configured!");
        }
    }
}
