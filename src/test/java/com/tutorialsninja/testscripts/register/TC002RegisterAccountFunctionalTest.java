package com.tutorialsninja.testscripts.register;

import com.tutorialsninja.core.FrameworkScript;
import com.tutorialsninja.helper.ExcelHelper;
import com.tutorialsninja.pages.Header;
import com.tutorialsninja.pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class TC002RegisterAccountFunctionalTest extends FrameworkScript {
    public RegistrationPage getRegPageObj() {
        return new RegistrationPage(driver);
    }
    public void goToRegPage() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(2000);

        Header header = new Header(driver);
        header.clickOnRegistrationOption();

        Thread.sleep(2000);
    }

    @Test(groups = "positive")
    public void verifyNavigation() throws InterruptedException {
        goToRegPage();

        List<String> linksData = getRegPageObj().verifyRegPageLinksNavigation(driver);
        System.out.println(linksData);

        // Verify Navigation Data
        Assert.assertEquals(linksData.get(0), "Account Login");
        Assert.assertEquals(linksData.get(1), "Privacy Policy");
    }
    @Test(priority = 1, dataProvider = "getRegTestData")
    public void register(String firstName, String lastName, String email, String telephoneNo, String password, String confirmPassword, String subscribe, String privacyPolicy) throws InterruptedException {
        if(driver.getCurrentUrl().contains("tutorialsninja.com"))
            driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/register");
        else
            goToRegPage();

        long telNo = Long.parseLong(telephoneNo.replaceAll("\\D", ""));
        boolean sub = Boolean.parseBoolean(subscribe.toLowerCase());
        boolean privacy = Boolean.parseBoolean(privacyPolicy.toLowerCase());

        Map<String, String> data = getRegPageObj().register(driver, firstName, lastName, email, telNo, password, confirmPassword, sub, privacy);

        System.out.println(data);

        Thread.sleep(3000);
    }

    @DataProvider(name = "getRegTestData")
    public Object[][] getRegTestData() throws IOException {
        return ExcelHelper.getTestData("C:\\Users\\satya\\IdeaProjects\\TutorialsNinja\\src\\test\\resources\\RegTestData.xlsx", "Sheet1");
    }
}
