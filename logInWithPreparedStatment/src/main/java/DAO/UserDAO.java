package DAO;

import java.util.List;

public interface UserDAO {

    void insert(User user);

    void update(User user);

    void delete(int id);

    void deleteAll();

    List<User> selectAll();

    User selectById();

}
