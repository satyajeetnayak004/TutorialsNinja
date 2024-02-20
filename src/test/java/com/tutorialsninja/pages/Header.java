package com.tutorialsninja.pages;

import org.openqa.selenium.NoSuchElementException;
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
    @FindBy(linkText = "Logout")
    private WebElement logoutLink = null;
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

    public Map<String, String> fetchHeaderUIData() {
        Map<String, String> headerData = new HashMap<>();

        headerData.put("currencyLink", currencyLink.getText());
        currencyLink.click();
        headerData.put("currencyEuroLink", currencyEuroLink.getText());
        headerData.put("currencyPoundLink", currencyPoundLink.getText());
        headerData.put("currencyUSLink", currencyUSLink.getText());
        headerData.put("contactNumber", contactNumber.getText());
        headerData.put("myAccountLink", myAccountLink.getText());
        myAccountLink.click();
        headerData.put("registerLink", registerLink.getText());
        headerData.put("loginLink", loginLink.getText());
        headerData.put("wishListLink", wishListLink.getText());
        headerData.put("shoppingCartLink", shoppingCartLink.getText());
        headerData.put("checkoutLink", checkoutLink.getText());
        headerData.put("logoLink", logoLink.getText());
        headerData.put("inputTxtField", inputTxtField.getAttribute("placeholder"));
        headerData.put("cartTotal", cartTotal.getText());

        headerData.put("desktopsLink", desktopsLink.getText());
        desktopsLink.click();
        headerData.put("desktopsPCLink", desktopsPCLink.getText());
        headerData.put("desktopsMacLink", desktopsMacLink.getText());
        headerData.put("showAllDesktopLink", showAllDesktopLink.getText());

        headerData.put("laptopsAndNotebooksLink", laptopsAndNotebooksLink.getText());
        laptopsAndNotebooksLink.click();
        headerData.put("laptopsAndNotebooksMacsLink", laptopsAndNotebooksMacsLink.getText());
        headerData.put("laptopsAndNotebooksWindowsLink", laptopsAndNotebooksWindowsLink.getText());
        headerData.put("showAllLaptopsAndNotebooksLink", showAllLaptopsAndNotebooksLink.getText());

        headerData.put("componentsMenuLink", componentsMenuLink.getText());
        componentsMenuLink.click();
        headerData.put("miceAndTrackballsSubMenuLink", miceAndTrackballsSubMenuLink.getText());
        headerData.put("monitorsSubMenuLink", monitorsSubMenuLink.getText());
        headerData.put("printersSubMenuLink", printersSubMenuLink.getText());
        headerData.put("scannersSubMenuLink", scannersSubMenuLink.getText());
        headerData.put("webCamerasSubMenuLink", webCamerasSubMenuLink.getText());
        headerData.put("showAllComponentsLink", showAllComponentsLink.getText());

        headerData.put("tabletsMenuLink", tabletsMenuLink.getText());
        headerData.put("softwareMenuLink", softwareMenuLink.getText());
        headerData.put("phonesAndPDAsMenuLink", phonesAndPDAsMenuLink.getText());
        headerData.put("camerasMenuLink", camerasMenuLink.getText());
        headerData.put("mp3PlayersMenuLink", mp3PlayersMenuLink.getText());
        mp3PlayersMenuLink.click();
        headerData.put("showAllMP3PlayersLink", showAllMP3PlayersLink.getText());

        return headerData;
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

    public void clickOnLogoutOption() {
        clickOnMyAccount();
        try {
            logoutLink.click();
        } catch (NoSuchElementException e) {
            System.out.println("Please check username and password");
        }
    }
}
