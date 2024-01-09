package com.tutorialsninja.testscripts;

import com.tutorialsninja.core.FrameworkScript;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LoginPage;
import org.testng.annotations.Test;

public class TC001LoginWithValidCredentialTest extends FrameworkScript {
    @Test
    public void login() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(3000);

        HomePage home = new HomePage(driver);
        home.clickOnLoginOption();

        Thread.sleep(3000);

        LoginPage login = new LoginPage(driver);
        login.login("teamc@gmail.com", "test1234");

        Thread.sleep(5000);
    }
}
