package com.tutorialsninja.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginPage {
    @FindBy(xpath = "//h2[text()='New Customer']")
    private WebElement newCustomerTxt = null;
    @FindBy(xpath = "//strong[text()='Register Account']")
    private WebElement registerAccountTxt = null;
    @FindBy(xpath = "//h2[text()='New Customer']/following-sibling::p[2]")
    private WebElement registerAccountDescTxt = null;
    @FindBy(linkText = "Continue")
    private WebElement continueBtn = null;
    @FindBy(xpath = "//h2[text()='Returning Customer']")
    private WebElement returningCustomerTxt = null;
    @FindBy(xpath = "//strong[text()='I am a returning customer']")
    private WebElement loginFirstParagraphTxt = null;
    @FindBy(xpath = "//label[@for='input-email']")
    private WebElement eMailAddressLabel = null;
    @FindBy(id = "input-email")
    private WebElement emailTxtField = null;
    @FindBy(xpath = "//label[@for='input-password']")
    private WebElement passwordLabel = null;
    @FindBy(id = "input-password")
    private WebElement  passwordTxtField = null;
    @FindBy(linkText = "Forgotten Password")
    private WebElement forgottenPasswordLink = null;
    @FindBy(xpath = "//input[@value='Login']")
    private WebElement loginBtn = null;
    @FindBy(className = "alert-dismissible")
    private WebElement warningMessage = null;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public static LoginPage getLoginPageObj(WebDriver driver) {
        return new LoginPage(driver);
    }

    public Map<String, String> fetchLoginPageUIData() {
        Map<String, String> loginData = new HashMap<>();

        loginData.put("newCustomerTxt", newCustomerTxt.getText());
        loginData.put("registerAccountTxt", registerAccountTxt.getText());
        loginData.put("registerAccountDescTxt", registerAccountDescTxt.getText());
        loginData.put("continueBtn", continueBtn.getText());
        loginData.put("returningCustomerTxt", returningCustomerTxt.getText());
        loginData.put("loginFirstParagraphTxt", loginFirstParagraphTxt.getText());
        loginData.put("eMailAddressLabel", eMailAddressLabel.getText());
        loginData.put("passwordLabel", passwordLabel.getText());
        loginData.put("forgottenPasswordLink", forgottenPasswordLink.getText());
        loginData.put("loginBtn", loginBtn.getAttribute("value"));

        return loginData;
    }

    public Map<String, String> login(WebDriver driver, String userName, String password) {
        Map<String, String> messageData = new HashMap<>();
        if(userName != null && !userName.isEmpty() && !userName.equals(" "))
            emailTxtField.sendKeys(userName);
        if(password != null && !password.isEmpty() && !password.equals(" "))
            passwordTxtField.sendKeys(password);
        loginBtn.click();

        /* Verify that whether user able to register or not */
        if (driver.getTitle().contains("My Account")) {
            System.out.println("Logged in Successfully!");
            messageData.put("Page Title", driver.getTitle());
        } else {
            System.out.println("Something went wrong!");
            try {
                if (warningMessage != null)
                    messageData.put("warningMessage", warningMessage.getText());
            } catch (NoSuchElementException e) {
                System.out.println("No Warning Message!");
            }

        }
        return messageData;
    }

    // Verify the navigation of all links available on Login page
    public List<String> verifyLoginPageLinksNavigation(WebDriver driver) throws InterruptedException {
        List<String> linksData = new ArrayList<>();
        continueBtn.click();
        linksData.add(driver.getTitle());
        driver.navigate().back();
        forgottenPasswordLink.click();
        Thread.sleep(2000);
        linksData.add(driver.getTitle());

        return linksData;
    }
}
