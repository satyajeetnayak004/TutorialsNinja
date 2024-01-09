package com.tutorialsninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id = "input-email")
    private WebElement emailTxt = null;
    @FindBy(id = "input-password")
    private WebElement passwordTxt = null;
    @FindBy(xpath = "//input[@value='Login']")
    private WebElement loginBtn = null;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void login(String userName, String password) {
        emailTxt.sendKeys(userName);
        passwordTxt.sendKeys(password);
        loginBtn.click();
    }
}
