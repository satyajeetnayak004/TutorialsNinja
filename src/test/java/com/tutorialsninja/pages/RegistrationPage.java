package com.tutorialsninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.HashMap;
import java.util.Map;

public class RegistrationPage {
    @FindBy(xpath = "//h1[text()='Register Account']") 
    private WebElement headingTxt = null;
    @FindBy(xpath = "//div[@id='content']//p")
    private WebElement pageDescTxt = null;
    @FindBy(linkText = "login page")
    private WebElement loginPageLink = null;
    @FindBy(xpath = "//legend[text()='Your Personal Details']")
    private WebElement personalDetailsSubHeadingTxt = null;
    @FindBy(xpath = "//label[@for='input-firstname']")
    private WebElement firstNameLabel = null;
    @FindBy(id = "input-firstname")
    private WebElement firstNameTxtField = null;
    @FindBy(xpath = "//label[@for='input-lastname']")
    private WebElement lastNameLabel = null;
    @FindBy(id = "input-lastname")
    private WebElement lastNameTxtField = null;
    @FindBy(xpath = "//label[@for='input-email']")
    private WebElement emailLabel = null;
    @FindBy(id = "input-email")
    private WebElement emailTxtField = null;
    @FindBy(xpath = "//label[@for='input-telephone']")
    private WebElement telephoneLabel = null;
    @FindBy(id = "input-telephone")
    private WebElement telephoneTxtField = null;
    @FindBy(xpath = "//legend[text()='Your Password']")
    private WebElement yourPasswordSubHeadingTxt = null;
    @FindBy(xpath = "//label[@for='input-password']")
    private WebElement passwordLabel = null;
    @FindBy(id = "input-password")
    private WebElement passwordTxtField = null;
    @FindBy(xpath = "//label[@for='input-confirm']")
    private WebElement confirmPasswordLabel = null;
    @FindBy(id = "input-confirm")
    private WebElement confirmPasswordTxtField = null;

    @FindBy(xpath = "//legend[text()='Newsletter']")
    private WebElement newsletterSubHeadingTxt = null;
    @FindBy(xpath = "//label[text()='Subscribe']")
    private WebElement subscribeLabel = null;
    @FindBy(xpath = "(//label[@class='radio-inline'])[1]")
    private WebElement yesOptionRadio = null;
    @FindBy(xpath = "(//label[@class='radio-inline'])[2]")
    private WebElement noOptionRadio = null;

    @FindBy(xpath = "//div[@class='pull-right']")
    private WebElement privacyPolicyTxt = null; // Check this again
    @FindBy(linkText = "Privacy Policy")
    private WebElement privacyPolicyLink = null;
    @FindBy(xpath = "//input[@name='agree']")
    private WebElement privacyPolicyCheckbox = null;
    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueBtn = null;

    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public Map<String, String> fetchRegPageUIData() {
        Map<String, String> regPageData = new HashMap<>();

        regPageData.put("headingTxt", headingTxt.getText());
        regPageData.put("pageDescTxt", pageDescTxt.getText());
        regPageData.put("personalDetailsSubHeadingTxt", personalDetailsSubHeadingTxt.getText());
        regPageData.put("firstNameLabel", firstNameLabel.getText());
        regPageData.put("lastNameLabel", lastNameLabel.getText());
        regPageData.put("emailLabel", emailLabel.getText());
        regPageData.put("telephoneLabel", telephoneLabel.getText());
        regPageData.put("yourPasswordSubHeadingTxt", yourPasswordSubHeadingTxt.getText());
        regPageData.put("passwordLabel", passwordLabel.getText());
        regPageData.put("confirmPasswordLabel", confirmPasswordLabel.getText());
        regPageData.put("newsletterSubHeadingTxt", newsletterSubHeadingTxt.getText());
        regPageData.put("subscribeLabel", subscribeLabel.getText());
        regPageData.put("yesOptionRadio", yesOptionRadio.getText());
        regPageData.put("noOptionRadio", noOptionRadio.getText());
        regPageData.put("privacyPolicyTxt", privacyPolicyTxt.getText());
        regPageData.put("continueBtn", continueBtn.getAttribute("value"));

        return regPageData;
    }

    // Register with user given data
    public void register(String firstName, String lastName, String email, long telephoneNo, String password, String confirmPassword, boolean subscribe, boolean privacyPolicy) throws InterruptedException {
        firstNameTxtField.sendKeys(firstName);
        lastNameTxtField.sendKeys(lastName);
        emailTxtField.sendKeys(email);
        telephoneTxtField.sendKeys(String.valueOf(telephoneNo));
        passwordTxtField.sendKeys(password);
        confirmPasswordTxtField.sendKeys(confirmPassword);
        if (subscribe)
            yesOptionRadio.click();
        else
            noOptionRadio.click();
        if (privacyPolicy)
            privacyPolicyCheckbox.click();
        Thread.sleep(3000);
        continueBtn.click();
    }

}
