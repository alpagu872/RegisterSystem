package Business.Concretes;

import Business.Abstracts.VerificationService;
import Entities.Concretes.User;

public class VerificationManager implements VerificationService {

    @Override
    public void sendMailVerification(User user) {
        System.out.println("Verification mail has been sent to: " + user.getMail() );
    }

    @Override
    public boolean verifyMail(User user) {
        System.out.println("Mail is verificated.");
        return true;
    }
}
