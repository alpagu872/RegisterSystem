import Business.Concretes.UserCheck;
import DataAccess.Concretes.MySQLUserDao;
import Entities.Concretes.User;

public class Main
{
    public static void main(String[] args) {

        User hasan1 = new User(1, "HasanAkgun","Hasan","Akgün", "123123","hasanakgun@gmail.com");

        MySQLUserDao manager = new MySQLUserDao();
        manager.add(hasan1);

        UserCheck check = new UserCheck();
        check.mailCheck(hasan1);

    }
}
