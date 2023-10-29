package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperUser extends HelperBase{

    public HelperUser(WebDriver wd) {
        super(wd);
    }


    ////////////////////////////////////// ˅ service methods ˅ //////////////////////////////////////

    public void openRegistrationForm(){
        wd.findElement(By.cssSelector("button[type='button']")).click();
    }

    public void selectRegistrationButton(){
        wd.findElement(By.xpath("//div[@class='sc-lizKOf cojPBH']")).click();
    }

    public void fillRegistrationForm(String name, String email, String password, String confirmPassword){
//find + click + clear + sendKey
        type(By.cssSelector("#mui-1"),name);
        type(By.cssSelector("#mui-2"),email);
        type(By.cssSelector("#mui-3"),password);
        type(By.cssSelector("#mui-4"),confirmPassword);
    }

    public void submitRegistration(){
//        wd.findElement(By.cssSelector("button[text()='Submit']")).click();
    }

    ////////////////////////////////////// ˄ service methods ˄ //////////////////////////////////////
}
