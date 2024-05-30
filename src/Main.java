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
        User userTest = new User(1, "Alpagu87","Alp","Deneyen", "123123","alp@info.com");

        userService.signUp(userTest);
        userService.login("alp@info.com","123123",userTest);

    }
}
