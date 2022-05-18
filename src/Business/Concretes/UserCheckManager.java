package Business.Concretes;

import Business.Abstracts.UserCheckService;
import Entities.Concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserCheckManager implements UserCheckService {

    List<String> mailList = new ArrayList<>();

    @Override
    public boolean passCheck(User user) {
        if (user.getPassword().length() > 2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean userNameCheck(User user) {
        if (user.getFirstName().length() > 2 && user.getLastName().length() > 2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean validMail(User user) {
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$", 2);
        Matcher matcher = pattern.matcher((user.getMail()));
        boolean isValid = matcher.find();

        if (isValid && !this.mailList.contains(user.getMail())){
            return true;
        }else {
            System.out.println("Invalid or already using mail.");
            return false;
        }

        //also needs to be unique mail, check with user.getMail().
    }

    @Override
    public boolean userCheck(User user) {
        if (this.passCheck(user) && this.userNameCheck(user) && this.validMail(user)) {
            return true;
        }else {
            return false;
        }
    }
}
