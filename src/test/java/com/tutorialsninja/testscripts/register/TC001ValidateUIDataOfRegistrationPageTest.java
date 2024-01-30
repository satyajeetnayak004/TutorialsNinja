package com.tutorialsninja.testscripts.register;

import com.tutorialsninja.core.FrameworkScript;
import com.tutorialsninja.pages.Header;
import com.tutorialsninja.pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class TC001ValidateUIDataOfRegistrationPageTest extends FrameworkScript {
    @Test
    public void validateRegPageUIData() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(3000);

        Header header = new Header(driver);
        header.clickOnRegistrationOption();

        RegistrationPage reg = new RegistrationPage(driver);
        Map<String, String> data =  reg.fetchRegPageUIData();

        Assert.assertEquals(data.get("headingTxt"), "Register Account");
        Assert.assertEquals(data.get("pageDescTxt"), "If you already have an account with us, please login at the login page.");
        Assert.assertEquals(data.get("personalDetailsSubHeadingTxt"), "Your Personal Details");
        Assert.assertEquals(data.get("firstNameLabel"), "First Name");
        Assert.assertEquals(data.get("lastNameLabel"), "Last Name");
        Assert.assertEquals(data.get("emailLabel"), "E-Mail");
        Assert.assertEquals(data.get("telephoneLabel"), "Telephone");
        Assert.assertEquals(data.get("yourPasswordSubHeadingTxt"), "Your Password");
        Assert.assertEquals(data.get("passwordLabel"), "Password");
        Assert.assertEquals(data.get("confirmPasswordLabel"), "Password Confirm");
        Assert.assertEquals(data.get("newsletterSubHeadingTxt"), "Newsletter");
        Assert.assertEquals(data.get("subscribeLabel"), "Subscribe");
        Assert.assertEquals(data.get("yesOptionRadio"), "Yes");
        Assert.assertEquals(data.get("noOptionRadio"), "No");
        Assert.assertEquals(data.get("privacyPolicyTxt"), "I have read and agree to the Privacy Policy  ");
        Assert.assertEquals(data.get("continueBtn"), "Continue");

    }
}
