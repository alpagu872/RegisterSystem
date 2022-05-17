package DataAccess.Concretes;

import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

import java.util.List;

public class MySQLUserDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("Kullanıcı MySQL üzerine eklendi: " + user.getUserName());
        System.out.println("Onaylama maili gönderildi.");
    }

    @Override
    public void remove(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
