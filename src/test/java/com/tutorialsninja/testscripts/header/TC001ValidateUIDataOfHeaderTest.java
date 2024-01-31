package com.tutorialsninja.testscripts.header;

import com.tutorialsninja.core.FrameworkScript;
import com.tutorialsninja.pages.Header;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class TC001ValidateUIDataOfHeaderTest extends FrameworkScript {
    @Test
    public void validateHeaderUIData() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");
        Thread.sleep(3000);
        Header header = new Header(driver);
        Thread.sleep(3000);

        Map<String, String> data =  header.fetchHeaderUIData();

        Assert.assertEquals(data.get("currencyLink"), "Currency");
        Assert.assertEquals(data.get("currencyEuroLink"), "€Euro");
        Assert.assertEquals(data.get("currencyPoundLink"), "£Pound Sterling");
        Assert.assertEquals(data.get("currencyUSLink"), "$US Dollar");
        Assert.assertEquals(data.get("contactNumber"), "123456789");
        Assert.assertEquals(data.get("myAccountLink"), "My Account");
        Assert.assertEquals(data.get("registerLink"), "Register");
        Assert.assertEquals(data.get("loginLink"), "Login");
        Assert.assertEquals(data.get("wishListLink"), "Wish List (0)");
        Assert.assertEquals(data.get("shoppingCartLink"), "Shopping Cart");
        Assert.assertEquals(data.get("checkoutLink"), "Checkout");
        Assert.assertEquals(data.get("loginLink"), "Login");
        Assert.assertEquals(data.get("logoLink"), "Qafox.com");
        Assert.assertEquals(data.get("inputTxtField"), "Search");
        Assert.assertEquals(data.get("cartTotal"), "0 item(s) - $0.00");

        Assert.assertEquals(data.get("desktopsLink"), "Desktops");
        Assert.assertEquals(data.get("desktopsPCLink"), "PC (0)");
        Assert.assertEquals(data.get("desktopsMacLink"), "Mac (1)");
        Assert.assertEquals(data.get("showAllDesktopLink"), "Show AllDesktops");

        Assert.assertEquals(data.get("laptopsAndNotebooksLink"), "Laptops & Notebooks");
        Assert.assertEquals(data.get("laptopsAndNotebooksMacsLink"), "Macs (0)");
        Assert.assertEquals(data.get("laptopsAndNotebooksWindowsLink"), "Windows (0)");
        Assert.assertEquals(data.get("showAllLaptopsAndNotebooksLink"), "Show AllLaptops & Notebooks");

        Assert.assertEquals(data.get("componentsMenuLink"), "Components");
        Assert.assertEquals(data.get("miceAndTrackballsSubMenuLink"), "Mice and Trackballs (0)");
        Assert.assertEquals(data.get("monitorsSubMenuLink"), "Monitors (2)");
        Assert.assertEquals(data.get("printersSubMenuLink"), "Printers (0)");
        Assert.assertEquals(data.get("scannersSubMenuLink"), "Scanners (0)");
        Assert.assertEquals(data.get("webCamerasSubMenuLink"), "Web Cameras (0)");
        Assert.assertEquals(data.get("showAllComponentsLink"), "Show AllComponents");

        Assert.assertEquals(data.get("tabletsMenuLink"), "Tablets");
        Assert.assertEquals(data.get("softwareMenuLink"), "Software");
        Assert.assertEquals(data.get("phonesAndPDAsMenuLink"), "Phones & PDAs");
        Assert.assertEquals(data.get("camerasMenuLink"), "Cameras");
        Assert.assertEquals(data.get("mp3PlayersMenuLink"), "MP3 Players");
        Assert.assertEquals(data.get("showAllMP3PlayersLink"), "Show AllMP3 Players");

    }
}
