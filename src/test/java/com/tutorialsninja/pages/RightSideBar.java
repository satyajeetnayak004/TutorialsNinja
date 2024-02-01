package com.tutorialsninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

public class RightSideBar {
    @FindBy(xpath = "(//ul[@class='dropdown-menu dropdown-menu-right']/li)[1]/a")
    private WebElement checkLogin = null;

    @FindBy(linkText = "Login")
    private WebElement loginLink = null;
    @FindBy(linkText = "Register")
    private WebElement registerLink = null;
    @FindBy(linkText = "Forgotten Password")
    private WebElement forgottenPasswordLink = null;
    @FindBy(linkText = "My Account")
    private WebElement myAccountLink = null;

    @FindBy(linkText = "Edit Account")
    private WebElement editAccountLink = null;
    @FindBy(linkText = "Password")
    private WebElement passwordLink = null;

    @FindBy(linkText = "Address Book")
    private WebElement addressBookLink = null;
    @FindBy(linkText = "Wish List")
    private WebElement wishListLink = null;
    @FindBy(linkText = "Order History")
    private WebElement orderHistoryLink = null;
    @FindBy(linkText = "Downloads")
    private WebElement downloadsLink = null;
    @FindBy(linkText = "Recurring payments")
    private WebElement recurringPaymentsLink = null;
    @FindBy(linkText = "Reward Points")
    private WebElement rewardPointsLink = null;
    @FindBy(linkText = "Returns")
    private WebElement returnsLink = null;
    @FindBy(linkText = "Transactions")
    private WebElement transactionsLink = null;
    @FindBy(linkText = "Newsletter")
    private WebElement newsletterLink = null;

    @FindBy(linkText = "Logout")
    private WebElement logoutLink = null;

    public RightSideBar(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public Map<String, String> fetchRightSideBarUIData(WebDriver driver) {
        Map<String, String> sideBarData = new HashMap<>();
        Header header = new Header(driver);
        header.clickOnMyAccount();

        if (checkLogin.getText().equals("Register")) {
            checkLogin.click();
            sideBarData.put("loginLink", loginLink.getText());
            sideBarData.put("registerLink", registerLink.getText());
            sideBarData.put("forgottenPasswordLink", forgottenPasswordLink.getText());
        } else if (checkLogin.getText().equals("My Account")) {
            checkLogin.click();
            sideBarData.put("editAccountLink", editAccountLink.getText());
            sideBarData.put("passwordLink", passwordLink.getText());
            sideBarData.put("logoutLink", logoutLink.getText());
        }
        sideBarData.put("myAccountLink", myAccountLink.getText());
        sideBarData.put("addressBookLink", addressBookLink.getText());
        sideBarData.put("wishListLink", wishListLink.getText());
        sideBarData.put("orderHistoryLink", orderHistoryLink.getText());
        sideBarData.put("downloadsLink", downloadsLink.getText());
        sideBarData.put("recurringPaymentsLink", recurringPaymentsLink.getText());
        sideBarData.put("rewardPointsLink", rewardPointsLink.getText());
        sideBarData.put("returnsLink", returnsLink.getText());
        sideBarData.put("transactionsLink", transactionsLink.getText());
        sideBarData.put("newsletterLink", newsletterLink.getText());

        return sideBarData;
    }
}
