package Business.Abstracts;

import Entities.Concretes.User;

public interface VerificationService {

    void mailVerification(User user);

    boolean isVerificatedUser(User user);

}
