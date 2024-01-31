package com.tutorialsninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

public class Header {
    /*
     * Secondary Menu WebElements
     */
    @FindBy(xpath = "//span[text()='Currency']")
    private WebElement currencyLink = null;
    @FindBy(xpath = "//button[@name='EUR']")
    private WebElement currencyEuroLink = null;
    @FindBy(xpath = "//button[@name='GBP']")
    private WebElement currencyPoundLink = null;
    @FindBy(xpath = "//button[@name='USD']")
    private WebElement currencyUSLink = null;
    @FindBy(xpath = "//span[text()='123456789']")
    private WebElement contactNumber = null;
    @FindBy(xpath = "//a[@title='My Account']")
    private WebElement myAccountLink = null;
    @FindBy(linkText = "Register")
    private WebElement registerLink = null;
    @FindBy(linkText = "Login")
    private WebElement loginLink = null;
    @FindBy(xpath = "//span[text()='Wish List (0)']")
    private WebElement wishListLink = null;
    @FindBy(xpath = "//span[text()='Shopping Cart']")
    private WebElement shoppingCartLink = null;
    @FindBy(xpath = "//span[text()='Checkout']")
    private WebElement checkoutLink = null;
    @FindBy(linkText = "Qafox.com")
    private WebElement logoLink = null;
    @FindBy(xpath = "//input[@name='search']")
    private WebElement inputTxtField = null;
    @FindBy(id = "cart-total")
    private WebElement cartTotal = null;

    /*
     * Primary Menu WebElements
     * Desktops Menu WebElements
     */
    @FindBy(linkText = "Desktops")
    private WebElement desktopsLink = null;
    @FindBy(partialLinkText = "PC ")
    private WebElement desktopsPCLink = null;
    @FindBy(partialLinkText = "Mac ")
    private WebElement desktopsMacLink = null;
    @FindBy(linkText = "Show AllDesktops")
    private WebElement showAllDesktopLink = null;

    // Laptops & Notebooks Menu WebElements
    @FindBy(linkText = "Laptops & Notebooks")
    private WebElement laptopsAndNotebooksLink = null;
    @FindBy(partialLinkText = "Macs ")
    private WebElement laptopsAndNotebooksMacsLink = null;
    @FindBy(partialLinkText = "Windows ")
    private WebElement laptopsAndNotebooksWindowsLink = null;
    @FindBy(linkText = "Show AllLaptops & Notebooks")
    private WebElement showAllLaptopsAndNotebooksLink = null;

    // Components Menu WebElements
    @FindBy(linkText = "Components")
    private WebElement componentsMenuLink = null;
    @FindBy(partialLinkText = "Mice and Trackballs (")
    private WebElement miceAndTrackballsSubMenuLink = null;
    @FindBy(partialLinkText = "Monitors (")
    private WebElement monitorsSubMenuLink = null;
    @FindBy(partialLinkText = "Printers (")
    private WebElement printersSubMenuLink = null;
    @FindBy(partialLinkText = "Scanners (")
    private WebElement scannersSubMenuLink = null;
    @FindBy(partialLinkText = "Web Cameras (")
    private WebElement webCamerasSubMenuLink = null;
    @FindBy(linkText = "Show AllComponents")
    private WebElement showAllComponentsLink = null;

    // Tablets Menu WebElement
    @FindBy(linkText = "Tablets")
    private WebElement tabletsMenuLink = null;

    // Software Menu WebElement
    @FindBy(linkText = "Software")
    private WebElement softwareMenuLink = null;

    // Phones & PDAs Menu WebElement
    @FindBy(linkText = "Phones & PDAs")
    private WebElement phonesAndPDAsMenuLink = null;

    // Cameras Menu WebElement
    @FindBy(linkText = "Cameras")
    private WebElement camerasMenuLink = null;

    // MP3 Players Menu WebElement
    @FindBy(linkText = "MP3 Players")
    private WebElement mp3PlayersMenuLink = null;
    @FindBy(linkText = "Show AllMP3 Players")
    private WebElement showAllMP3PlayersLink = null;

    public Header(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public Map<String, String> fetchHomePageUIData(WebDriver driver) {
        Map<String, String> homePageData = new HashMap<>();

        homePageData.put("currencyLink", currencyLink.getText());
        currencyLink.click();
        homePageData.put("currencyEuroLink", currencyEuroLink.getText());
        homePageData.put("currencyPoundLink", currencyPoundLink.getText());
        homePageData.put("currencyUSLink", currencyUSLink.getText());
        homePageData.put("contactNumber", contactNumber.getText());
        homePageData.put("myAccountLink", myAccountLink.getText());
        myAccountLink.click();
        homePageData.put("registerLink", registerLink.getText());
        homePageData.put("loginLink", loginLink.getText());
        homePageData.put("wishListLink", wishListLink.getText());
        homePageData.put("shoppingCartLink", shoppingCartLink.getText());
        homePageData.put("checkoutLink", checkoutLink.getText());
        homePageData.put("logoLink", logoLink.getText());
        homePageData.put("inputTxtField", inputTxtField.getAttribute("placeholder"));
        homePageData.put("cartTotal", cartTotal.getText());

        homePageData.put("desktopsLink", desktopsLink.getText());
        desktopsLink.click();
        homePageData.put("desktopsPCLink", desktopsPCLink.getText());
        homePageData.put("desktopsMacLink", desktopsMacLink.getText());
        homePageData.put("showAllDesktopLink", showAllDesktopLink.getText());

        homePageData.put("laptopsAndNotebooksLink", laptopsAndNotebooksLink.getText());
        laptopsAndNotebooksLink.click();
        homePageData.put("laptopsAndNotebooksMacsLink", laptopsAndNotebooksMacsLink.getText());
        homePageData.put("laptopsAndNotebooksWindowsLink", laptopsAndNotebooksWindowsLink.getText());
        homePageData.put("showAllLaptopsAndNotebooksLink", showAllLaptopsAndNotebooksLink.getText());

        homePageData.put("componentsMenuLink", componentsMenuLink.getText());
        componentsMenuLink.click();
        homePageData.put("miceAndTrackballsSubMenuLink", miceAndTrackballsSubMenuLink.getText());
        homePageData.put("monitorsSubMenuLink", monitorsSubMenuLink.getText());
        homePageData.put("printersSubMenuLink", printersSubMenuLink.getText());
        homePageData.put("scannersSubMenuLink", scannersSubMenuLink.getText());
        homePageData.put("webCamerasSubMenuLink", webCamerasSubMenuLink.getText());
        homePageData.put("showAllComponentsLink", showAllComponentsLink.getText());

        homePageData.put("tabletsMenuLink", tabletsMenuLink.getText());
        homePageData.put("softwareMenuLink", softwareMenuLink.getText());
        homePageData.put("phonesAndPDAsMenuLink", phonesAndPDAsMenuLink.getText());
        homePageData.put("camerasMenuLink", camerasMenuLink.getText());
        homePageData.put("mp3PlayersMenuLink", mp3PlayersMenuLink.getText());
        mp3PlayersMenuLink.click();
        homePageData.put("showAllMP3PlayersLink", showAllMP3PlayersLink.getText());

        return homePageData;
    }

    public void clickOnMyAccount() {
        myAccountLink.click();
    }

    public void clickOnRegistrationOption() {
        clickOnMyAccount();
        registerLink.click();
    }

    public void clickOnLoginOption() {
        clickOnMyAccount();
        loginLink.click();
    }
}
