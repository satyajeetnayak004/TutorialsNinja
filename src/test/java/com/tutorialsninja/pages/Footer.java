package com.tutorialsninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

public class Footer {
    /*
     * Information Related WebElements
     */
    @FindBy(xpath = "//h5[text()='Information']")
    private WebElement informationHeaderTxt = null;
    @FindBy(linkText = "About Us")
    private WebElement aboutUsLink = null;
    @FindBy(linkText = "Delivery Information")
    private WebElement deliveryInfoLink = null;
    @FindBy(linkText = "Privacy Policy")
    private WebElement privacyPolicyLink = null;
    @FindBy(linkText = "Terms & Conditions")
    private WebElement termsAndConditionsLink = null;

    /*
     * Customer Service Related WebElements
     */
    @FindBy(xpath = "//h5[text()='Customer Service']")
    private WebElement customerServiceHeaderTxt = null;
    @FindBy(linkText = "Contact Us")
    private WebElement contactUsLink = null;
    @FindBy(linkText = "Returns")
    private WebElement returnsLink = null;
    @FindBy(linkText = "Site Map")
    private WebElement siteMapLink = null;

    /*
     * Information Related WebElements
     */
    @FindBy(xpath = "//h5[text()='Extras']")
    private WebElement extrasHeaderTxt = null;
    @FindBy(linkText = "Brands")
    private WebElement brandsLink = null;
    @FindBy(linkText = "Gift Certificates")
    private WebElement giftCertificatesLink = null;
    @FindBy(linkText = "Affiliate")
    private WebElement affiliateLink = null;
    @FindBy(linkText = "Specials")
    private WebElement specialsLink = null;

    /*
     * Information Related WebElements
     */
    @FindBy(xpath = "//h5[text()='My Account']")
    private WebElement myAccountHeaderTxt = null;
    @FindBy(linkText = "My Account")
    private WebElement myAccountLink = null;
    @FindBy(linkText = "Order History")
    private WebElement orderHistoryLink = null;
    @FindBy(linkText = "Wish List")
    private WebElement wishListLink = null;
    @FindBy(linkText = "Newsletter")
    private WebElement newsLetterLink = null;

    @FindBy(xpath = "//footer/div/p")
    private WebElement footerCreditTxt = null;

    public Footer(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public Map<String, String> fetchFooterUIData() {
        Map<String, String> footerData = new HashMap<>();

        footerData.put("informationHeaderTxt", informationHeaderTxt.getText());
        footerData.put("aboutUsLink", aboutUsLink.getText());
        footerData.put("deliveryInfoLink", deliveryInfoLink.getText());
        footerData.put("privacyPolicyLink", privacyPolicyLink.getText());
        footerData.put("termsAndConditionsLink", termsAndConditionsLink.getText());

        footerData.put("customerServiceHeaderTxt", customerServiceHeaderTxt.getText());
        footerData.put("contactUsLink", contactUsLink.getText());
        footerData.put("returnsLink", returnsLink.getText());
        footerData.put("siteMapLink", siteMapLink.getText());

        footerData.put("extrasHeaderTxt", extrasHeaderTxt.getText());
        footerData.put("brandsLink", brandsLink.getText());
        footerData.put("giftCertificatesLink", giftCertificatesLink.getText());
        footerData.put("affiliateLink", affiliateLink.getText());
        footerData.put("specialsLink", specialsLink.getText());

        footerData.put("myAccountHeaderTxt", myAccountHeaderTxt.getText());
        footerData.put("myAccountLink", myAccountLink.getText());
        footerData.put("orderHistoryLink", orderHistoryLink.getText());
        footerData.put("wishListLink", wishListLink.getText());
        footerData.put("newsLetterLink", newsLetterLink.getText());

        footerData.put("footerCreditTxt", footerCreditTxt.getText());

        return footerData;
    }
}
