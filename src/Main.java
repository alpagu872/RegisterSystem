import Business.Abstracts.UserService;
import Business.Concretes.UserCheckManager;
import Business.Concretes.UserManager;
import Business.Concretes.VerificationManager;
import DataAccess.Concretes.MySQLUserDao;
import Entities.Concretes.User;

public class Main
{
    public static void main(String[] args) {

        UserService userService = new UserManager(new UserCheckManager(),new MySQLUserDao(), new VerificationManager());

        User hasan1 = new User(1, "HasanAkgun","Hasan","Akgün", "123123","hasanAkgun@gmail.com");

        userService.signUp(hasan1);

    }
}
