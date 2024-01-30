package com.tutorialsninja.testscripts.login;

import com.tutorialsninja.core.FrameworkScript;
import com.tutorialsninja.pages.Header;
import com.tutorialsninja.pages.LoginPage;
import org.testng.annotations.Test;

public class TC002LoginWithInvalidCredentialTest extends FrameworkScript {
    @Test
    public void login() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(3000);

        Header header = new Header(driver);
        header.clickOnLoginOption();

        Thread.sleep(3000);

        LoginPage login = new LoginPage(driver);
        // Login into the application with invalid credentials
        login.login("gggggg@gmail.com", "test1234589");

        Thread.sleep(5000);
    }
}
