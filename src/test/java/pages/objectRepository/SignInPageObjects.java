package pages.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageFactoryInitializer;

public class SignInPageObjects extends PageFactoryInitializer {


//    public void signIn(String userName){
//
//        enterUserName(userName);
//        enterPassword("secret_sauce");
//    }
//
//    public void enterUserName(String userName){
//        driver.findElement(By.id("user-name")).click();
//        driver.findElement(By.id("user-name")).sendKeys(userName);
//    }
//
//    public void enterPassword(String password){
//        driver.findElement(By.id("password")).click();
//        driver.findElement(By.id("password")).sendKeys(password);
//    }
//
//    public HomePage clickLogin(){
//        driver.findElement(By.id("login-button")).click();
//        return new HomePage( new HomeActController(),
//                new HomeVerifyController());
//    }


    @FindBy(id = "user-name")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;


    public LandingPageObjects signIn(String user, String userPassword) {
        userName.click();
        userName.sendKeys(user);
        password.click();
        password.sendKeys(userPassword);
        loginButton.click();
        return new LandingPageObjects();
    }
}
