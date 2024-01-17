package com.tutorialsninja.testscripts.login;

import com.tutorialsninja.core.FrameworkScript;
import com.tutorialsninja.helper.ExcelHelper;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC003LoginWithValidCredentialTest extends FrameworkScript {
    @Test(dataProvider = "getTestData")
    public void login(String userName, String password) throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(3000);

        HomePage home = new HomePage(driver);
        home.clickOnLoginOption();

        Thread.sleep(3000);

        LoginPage login = new LoginPage(driver);
        login.login(userName, password);

        Thread.sleep(5000);

        login.logout();
    }

    @DataProvider(name = "getTestData")
    public Object[][] getTest() throws IOException {
        return ExcelHelper.getTestData("C:\\Users\\satya\\IdeaProjects\\TutorialsNinja\\src\\test\\resources\\TestData.xlsx", "Sheet1");
    }
}
