package person_email_example.dao;

import person_email_example.annotation.TableName;
import person_email_example.entity.Entity;
import person_email_example.jdbc.ConnectionPool;
import person_email_example.ServiceLocator;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public abstract class DbDao<T extends Entity> implements Dao<T> {
    @Override
    public void insert(T t) {
        executeQuery(generateInsertQuery(t));


    }

    @Override
    public void update(T t) {
        executeQuery(generateUpdateQuery(t));
    }


    @Override
    public void delete(int id) {
        executeQuery("delete from" + "where id=" + id);
    }

    @Override
    public T getById(int id) {
        return null;
    }

    @Override
    public List<T> getAll() {
        return null;
    }

    protected Connection getConnection() throws SQLException {
        ConnectionPool connectionPool = ServiceLocator.getConnectionPool();
        return connectionPool.getConnection();
    }
    protected  void  disposeConnection(Connection connection){
        ConnectionPool connectionPool = ServiceLocator.getConnectionPool();
        connectionPool.disposeConnection(connection);

    }
    protected abstract String generateInsertQuery(T t);
    protected abstract String generateUpdateQuery(T t);

    protected void executeQuery(String query){
        Connection connection = null;
        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null){
                disposeConnection(connection);
            }
        }
    }
     private String getTableName(Class clazz){
        if (!clazz.isAnnotationPresent(TableName.class)){
         throw new RuntimeException("Entities should have TableName annotation");
        }
        TableName tableName = (TableName)clazz.getAnnotation(TableName.class);
        return tableName.name();
     }
}
