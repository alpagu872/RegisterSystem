package Business.Abstracts;

import Entities.Concretes.User;

public interface UserCheckService {
    boolean passCheck(User user);
    boolean userNameCheck(User user);
    boolean validMail(User user);
    boolean userCheck(User user);


}
