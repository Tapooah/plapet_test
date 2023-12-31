package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {
    WebDriver wd;

    HelperUser helperUser;

    public void init() {
        wd = new ChromeDriver();
        wd.navigate().to("https://propetscom.herokuapp.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        helperUser = new HelperUser(wd);
    }

    public void stop() {
//        wd.quit();
    }


    public HelperUser getHelperUser() {
        return helperUser;
    }

}
