package com.tutorialsninja.testscripts.register;

import com.tutorialsninja.core.FrameworkScript;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Map;

public class TC001ValidateUIDataOfRegistrationPageTest extends FrameworkScript {
    @Test
    public void verifyUIData() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(3000);

        HomePage home = new HomePage(driver);
        home.clickOnRegistrationOption();

        RegistrationPage reg = new RegistrationPage(driver);
        Map<String, String> data =  reg.fetchUIData();

        SoftAssert as = new SoftAssert();

        as.assertEquals(data.get("headingTxt"), "Register Account");
        as.assertEquals(data.get("pageDescTxt"), "If you already have an account with us, please login at the login page.");
        as.assertEquals(data.get("personalDetailsSubHeadingTxt"), "Your Personal Details");
        as.assertEquals(data.get("firstNameLabel"), "First Name");
        as.assertEquals(data.get("lastNameLabel"), "Last Name");
        as.assertEquals(data.get("emailLabel"), "E-Mail");
        as.assertEquals(data.get("telephoneLabel"), "Telephone");
        as.assertEquals(data.get("yourPasswordSubHeadingTxt"), "Your Password");
        as.assertEquals(data.get("passwordLabel"), "Password");
        as.assertEquals(data.get("confirmPasswordLabel"), "Password");
        as.assertEquals(data.get("newsletterSubHeadingTxt"), "Newsletter");
        as.assertEquals(data.get("subscribeLabel"), "Subscribe");
        as.assertEquals(data.get("yesOptionRadio"), "Yes");
        as.assertEquals(data.get("noOptionRadio"), "No");
        as.assertEquals(data.get("privacyPolicyTxt"), "I have read and agree to the Privacy Policy");
        as.assertEquals(data.get("continueBtn"), "Continue");

    }
}
