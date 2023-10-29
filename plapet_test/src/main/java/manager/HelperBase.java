package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    ////////////////////////////////////// ˅ service methods ˅ //////////////////////////////////////
    public void type(By locator, String text) {
        //find + click + clear + sendKey
        if (text != null) {
            WebElement elem = wd.findElement(locator);
            elem.click();
            elem.clear();
            elem.sendKeys(text);
        }
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }


    ////////////////////////////////////// ˄ service methods ˄ //////////////////////////////////////
}
