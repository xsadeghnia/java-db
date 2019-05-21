package connectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedTest {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionFactory.getInstance().create();
        PreparedStatement preparedStatement = connection.prepareStatement("select count(*) as c from person where username = ? and password = ?");
        preparedStatement.setString(1 , "kam.cpp");
        preparedStatement.setString(2 ,"kam123");
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        if (resultSet.getInt("c") == 0){
            System.out.println("username or password is invalid!");
        } else {
            System.out.println("hello");
        }
        connection.close();


    }
}
