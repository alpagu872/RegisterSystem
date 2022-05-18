import Business.Abstracts.UserService;
import Business.Concretes.UserCheckManager;
import Business.Concretes.UserManager;
import Business.Concretes.VerificationManager;
import Business.RandomSignUpLib.RandomSignManager;
import DataAccess.Concretes.MySQLUserDao;
import Entities.Concretes.User;

public class Main
{
    public static void main(String[] args) {

        UserService userService = new UserManager(new UserCheckManager(),new MySQLUserDao(), new VerificationManager(),new RandomSignManager());

        RandomSignManager randomSignManager = new RandomSignManager();
        User hasan1 = new User(1, "HasanAkgun","Hasan","Akgün", "123123","hasanAkgun@gmail.com");

        userService.signUp(hasan1);
        userService.login("hasanAkgun@gmail.com","123123",hasan1);

    }
}
