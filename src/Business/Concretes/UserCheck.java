package Business.Concretes;

import Business.Abstracts.UserCheckService;
import Entities.Concretes.User;

public class UserCheck implements UserCheckService {
    @Override
    public boolean passCheck(User user) {
        return false;
    }
}
