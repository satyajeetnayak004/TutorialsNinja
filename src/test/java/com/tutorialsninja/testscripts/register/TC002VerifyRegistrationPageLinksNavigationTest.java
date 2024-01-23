package com.tutorialsninja.testscripts.register;

import com.tutorialsninja.core.FrameworkScript;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TC002VerifyRegistrationPageLinksNavigationTest extends FrameworkScript {
    @Test
    public void verifyNavigation() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(3000);

        HomePage home = new HomePage(driver);
        home.clickOnRegistrationOption();

        Thread.sleep(3000);

        RegistrationPage regPage = new RegistrationPage(driver);
        List<String> linksData = regPage.verifyRegPageLinksNavigation(driver);
        System.out.println(linksData);

        // Verify Navigation Data
        Assert.assertEquals(linksData.get(0), "Account Login");
        Assert.assertEquals(linksData.get(1), "Privacy Policy");
    }
}
