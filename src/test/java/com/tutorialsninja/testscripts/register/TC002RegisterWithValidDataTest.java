package com.tutorialsninja.testscripts.register;

import com.tutorialsninja.core.FrameworkScript;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.RegistrationPage;
import org.testng.annotations.Test;

public class TC002RegisterWithValidDataTest extends FrameworkScript {
    @Test
    public void register() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(3000);

        HomePage home = new HomePage(driver);
        home.clickOnRegistrationOption();

        Thread.sleep(3000);

        RegistrationPage regPage = new RegistrationPage(driver);
        regPage.register("Test", "Name", "test1896@gmail.com",
                8568478956L, "test1234", "test1234",
                false, true);

        Thread.sleep(3000);
    }

}
