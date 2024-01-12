package com.tutorialsninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(xpath = "//a[@title='My Account']")
    private WebElement myAccountLink = null;

    @FindBy(linkText = "Register")
    private WebElement registerLink = null;

    @FindBy(linkText = "Login")
    private WebElement loginLink = null;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnRegistrationOption() {
        myAccountLink.click();
        registerLink.click();
    }

    public void clickOnLoginOption() {
        myAccountLink.click();
        loginLink.click();
    }
}