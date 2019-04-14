package DAOo;

public class Test {
    public static void main(String[] args) {
        UserDAO userDAO = new MySQLUserDAO();
        User user = new User();
        user.setId(004);
        user.setName("maryam");
        user.setFamily("rezakhani");
        user.setUsername("mari62");
        user.setPassword("mari123");
        userDAO.insert(user);

    }


}
