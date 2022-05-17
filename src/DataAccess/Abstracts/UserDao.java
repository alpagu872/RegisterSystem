package DataAccess.Abstracts;

import Entities.Concretes.User;

import java.util.List;

public interface UserDao {

    void add(User user);
    void remove(User user);
    void update(User user);

    User get(int id);

    List<User> getAllUsers();
}
