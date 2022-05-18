package Business.Abstracts;

import Entities.Concretes.User;

public interface UserService {
    void login(String userInfo, String pass, User user);

    void signUp(User user);
}
