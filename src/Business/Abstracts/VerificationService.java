package Business.Abstracts;

import Entities.Concretes.User;

public interface VerificationService {

    void sendMailVerification(User user);

    boolean verifyMail(User user);

}
