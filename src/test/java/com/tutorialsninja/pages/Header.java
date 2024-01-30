package com.tutorialsninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

public class Header {
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

    public Header(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public Map<String, String> fetchHomePageUIData() {
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
