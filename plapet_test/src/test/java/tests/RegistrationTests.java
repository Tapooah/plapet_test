package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{
    @Test
    public void successRegistration(){
        app.getHelperUser().openRegistrationForm();
        app.getHelperUser().selectRegistrationButton();
        app.getHelperUser().fillRegistrationForm("John Doe","doejohn291000@gmail.com","Jdoe12345$", "Jdoe12345$");
//app.getHelperUser().submitRegistration();
    }
}
