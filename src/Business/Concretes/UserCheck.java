package Business.Concretes;

import Business.Abstracts.UserCheckService;
import Entities.Concretes.User;

public class UserCheck implements UserCheckService {
    @Override
    public boolean passCheck(User user) {
        return false;
    }
    @Override
    public boolean userNameCheck(User user) {
        return false;
    }

    @Override
    public boolean mailCheck(User user) {
        return false;
    }

    @Override
    public boolean isSuccess(User user) {
        return false;
    }


}
