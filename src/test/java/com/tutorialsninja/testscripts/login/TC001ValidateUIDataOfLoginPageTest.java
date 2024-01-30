package com.tutorialsninja.testscripts.login;

import com.tutorialsninja.core.FrameworkScript;
import com.tutorialsninja.pages.Header;
import com.tutorialsninja.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class TC001ValidateUIDataOfLoginPageTest extends FrameworkScript {
    @Test
    public void validateLoginPageUIData() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(3000);

        Header header = new Header(driver);
        header.clickOnLoginOption();

        LoginPage login = new LoginPage(driver);
        Map<String, String> data =  login.fetchLoginPageUIData();

        System.out.println(data);

        Assert.assertEquals(data.get("newCustomerTxt"), "New Customer");
        Assert.assertEquals(data.get("registerAccountTxt"), "Register Account");
        Assert.assertEquals(data.get("registerAccountDescTxt"), "By creating an account you will be able to shop faster, be up to date on an order's status, and keep track of the orders you have previously made.");
        Assert.assertEquals(data.get("continueBtn"), "Continue");
        Assert.assertEquals(data.get("returningCustomerTxt"), "Returning Customer");
        Assert.assertEquals(data.get("loginFirstParagraphTxt"), "I am a returning customer");
        Assert.assertEquals(data.get("eMailAddressLabel"), "E-Mail Address");
        Assert.assertEquals(data.get("passwordLabel"), "Password");
        Assert.assertEquals(data.get("forgottenPasswordLink"), "Forgotten Password");
        Assert.assertEquals(data.get("loginBtn"), "Login");

    }
}
