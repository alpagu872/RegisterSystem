package DataAccess.Concretes;

import Business.Abstracts.VerificationService;
import Entities.Concretes.User;

public class VerificationManager implements VerificationService {
    @Override
    public void mailVerification(User user) {
        System.out.println("Mail gönderildi.");
    }

    @Override
    public boolean isVerificatedUser(User user) {
        return false;
    }
}
