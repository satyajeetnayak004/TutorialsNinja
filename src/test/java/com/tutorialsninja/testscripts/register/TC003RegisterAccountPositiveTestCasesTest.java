package com.tutorialsninja.testscripts.register;

import com.tutorialsninja.core.FrameworkScript;
import com.tutorialsninja.pages.Header;
import com.tutorialsninja.pages.RegistrationPage;
import org.testng.annotations.Test;

public class TC003RegisterAccountPositiveTestCasesTest extends FrameworkScript {
    @Test
    public void register() throws InterruptedException {
        String firstName = null, lastName = null, email = null, password = null, confirmPassword = null;
        long telephoneNo = 0L;
        boolean subscribe = false, privacyPolicy = false;
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(3000);

        Header header = new Header(driver);
        header.clickOnRegistrationOption();

        Thread.sleep(3000);

        RegistrationPage regPage = new RegistrationPage(driver);
//      regPage.register("Test", "Name", "test1896@gmail.com", 8568478956L, "test1234", "test1234", false, true);

        regPage.register(driver, firstName, lastName, email, telephoneNo, password, confirmPassword, subscribe, privacyPolicy);

        Thread.sleep(3000);
    }

}
