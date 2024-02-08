package com.tutorialsninja.testscripts.register;

import com.tutorialsninja.core.FrameworkScript;
import com.tutorialsninja.pages.Header;
import com.tutorialsninja.pages.RegistrationPage;
import org.testng.annotations.Test;

import java.util.Map;

public class TC003RegisterAccountPositiveTestCasesTest extends FrameworkScript {
    public RegistrationPage getRegPageObj() {
        return new RegistrationPage(driver);
    }
    public void goToRegPage() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(3000);

        Header header = new Header(driver);
        header.clickOnRegistrationOption();

        Thread.sleep(3000);
    }
    @Test(priority = 1)
    public void register() throws InterruptedException {
        goToRegPage();

        Map<String, String> data = getRegPageObj().register(driver, "Test", "Name", "test1896@gmail.com", 8568478956L, "test1234", "test1234", false, true);

        System.out.println(data);

        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void regWithoutAnyData() throws InterruptedException {
        String firstName = null, lastName = null, email = null, password = null, confirmPassword = null;
        long telephoneNo = 0L;
        boolean subscribe = false, privacyPolicy = false;

        if(driver.getCurrentUrl().contains("tutorialsninja.com"))
            driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/register");
        else
            goToRegPage();
        Map<String, String> data = getRegPageObj().register(driver, firstName, lastName, email, telephoneNo, password, confirmPassword, subscribe, privacyPolicy);

        System.out.println(data);

        Thread.sleep(3000);
    }

}
