package com.tutorialsninja.testscripts.login;

import com.tutorialsninja.core.FrameworkScript;
import com.tutorialsninja.helper.ExcelHelper;
import com.tutorialsninja.pages.Header;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class TC002LoginFunctionalTest extends FrameworkScript {
    public LoginPage getLoginPageObj() {
        return new LoginPage(driver);
    }
    public void goToLoginPage() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(1000);

        Header header = new Header(driver);
        header.clickOnLoginOption();

        Thread.sleep(1000);
    }
    @Test
    public void verifyNavigation() throws InterruptedException {
        goToLoginPage();

        List<String> linksData = getLoginPageObj().verifyLoginPageLinksNavigation(driver);
        System.out.println(linksData);

        // Verify Navigation Data
        Assert.assertEquals(linksData.get(0), "Register Account");
        Assert.assertEquals(linksData.get(1), "Forgot Your Password?");
    }
    @Test(priority = 1, dataProvider = "getTestData")
    public void login(String userName, String password) throws InterruptedException {
        if(driver.getCurrentUrl().contains("tutorialsninja.com"))
            driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
        else
            goToLoginPage();

        getLoginPageObj().login(userName, password);

        Thread.sleep(2000);

        if(driver.getCurrentUrl().contains("route=account/account"))
            getLoginPageObj().logout();
        else
            System.out.println("Something went wrong, please check username and password!");
    }

    @Test(priority = 2)
    public void loginWithoutUsernameAndPassword() throws InterruptedException {
        if(driver.getCurrentUrl().contains("tutorialsninja.com"))
            driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
        else
            goToLoginPage();

        getLoginPageObj().login("", "");

        Thread.sleep(2000);

        if(driver.getCurrentUrl().contains("route=account/account"))
            getLoginPageObj().logout();
        else
            System.out.println("Something went wrong, please check username and password!");
    }

    @DataProvider(name = "getTestData")
    public Object[][] getTest() throws IOException {
        return ExcelHelper.getTestData("C:\\Users\\satya\\IdeaProjects\\TutorialsNinja\\src\\test\\resources\\LoginTestData.xlsx", "Sheet1");
    }
}
