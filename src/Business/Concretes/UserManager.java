package Business.Concretes;

import Business.Abstracts.UserCheckService;
import Business.Abstracts.UserService;
import Business.Abstracts.VerificationService;
import Business.RandomSignUpLib.RandomSignManager;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

public class UserManager implements UserService {

    //Injection area
    private VerificationService verificationService;
    private UserCheckService userCheckService;
    private UserDao userDao;
    private RandomSignManager randomSignManager;

    //UserManager Constructor
    public UserManager(UserCheckService userCheckService, UserDao userDao, VerificationService verificationService, RandomSignManager randomSignManager) {
        this.userCheckService = userCheckService;
        this.userDao = userDao;
        this.verificationService = verificationService;
        this.randomSignManager = randomSignManager;
    }

    @Override
    public void login(String mail, String pass, User user) {
        //login check process...

        if (mail == user.getMail() && pass == user.getPassword()){
            System.out.println("Login successful.");
        }else {
            System.out.println("Login Failed.");
            System.out.println("Wrong input.");
        }

    }

    @Override
    public void signUp(User user) {
        //user values check,
        //user verification check area --> sending and verifying Mail
        //dao adding

        if (this.userCheckService.userCheck(user)){
            this.verificationService.sendMailVerification(user);
            //user verification mail sending proccess
            this.verificationService.verifyMail(user);
            //user mail verification check proccess
            this.userDao.add(user);
            System.out.println("Sign Up Success.");
            //user adding proccess
        }else{
            System.out.println("Sign Up Failed.");
        }
    }
}
