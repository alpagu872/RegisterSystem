package DataAccess.Abstracts;

import Entities.Concretes.User;

public interface UserDao {

    void add(User user);
    void remove(User user);
    void update(User user);
}
