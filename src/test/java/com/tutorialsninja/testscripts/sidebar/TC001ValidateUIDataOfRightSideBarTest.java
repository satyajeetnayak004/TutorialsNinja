package com.tutorialsninja.testscripts.sidebar;

import com.tutorialsninja.core.FrameworkScript;
import com.tutorialsninja.pages.RightSideBar;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class TC001ValidateUIDataOfRightSideBarTest extends FrameworkScript {
    @Test
    public void validateFooterUIData() throws InterruptedException { 
        driver.get("https://tutorialsninja.com/demo/");
        Thread.sleep(3000);
        RightSideBar rightSideBar = new RightSideBar(driver);
        Thread.sleep(3000);
        Map<String, String> data =  rightSideBar.fetchRightSideBarUIData(driver);

        if(data.get("loginLink") != null) {
            Assert.assertEquals(data.get("loginLink"), "Login");
            Assert.assertEquals(data.get("registerLink"), "Register");
            Assert.assertEquals(data.get("forgottenPasswordLink"), "Forgotten Password");
        } else {
            Assert.assertEquals(data.get("editAccountLink"), "Edit Account");
            Assert.assertEquals(data.get("passwordLink"), "Password");
            Assert.assertEquals(data.get("logoutLink"), "Logout");
        }
        Assert.assertEquals(data.get("myAccountLink"), "My Account");
        Assert.assertEquals(data.get("addressBookLink"), "Address Book");
        Assert.assertEquals(data.get("wishListLink"), "Wish List");
        Assert.assertEquals(data.get("orderHistoryLink"), "Order History");
        Assert.assertEquals(data.get("downloadsLink"), "Downloads");
        Assert.assertEquals(data.get("recurringPaymentsLink"), "Recurring payments");
        Assert.assertEquals(data.get("rewardPointsLink"), "Reward Points");
        Assert.assertEquals(data.get("returnsLink"), "Returns");
        Assert.assertEquals(data.get("transactionsLink"), "Transactions");
        Assert.assertEquals(data.get("newsletterLink"), "Newsletter");
    }
}
