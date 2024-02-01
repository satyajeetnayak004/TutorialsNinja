package com.tutorialsninja.testscripts.footer;

import com.tutorialsninja.core.FrameworkScript;
import com.tutorialsninja.pages.Footer;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class TC001ValidateUIDataOfFooterTest extends FrameworkScript {
    @Test
    public void validateFooterUIData() throws InterruptedException { 
        driver.get("https://tutorialsninja.com/demo/");
        Thread.sleep(3000);
        Footer footer = new Footer(driver);
        Thread.sleep(3000);
        Map<String, String> data =  footer.fetchFooterUIData();

        Assert.assertEquals(data.get("informationHeaderTxt"), "Information");
        Assert.assertEquals(data.get("aboutUsLink"), "About Us");
        Assert.assertEquals(data.get("deliveryInfoLink"), "Delivery Information");
        Assert.assertEquals(data.get("privacyPolicyLink"), "Privacy Policy");
        Assert.assertEquals(data.get("termsAndConditionsLink"), "Terms & Conditions");

        Assert.assertEquals(data.get("customerServiceHeaderTxt"), "Customer Service");
        Assert.assertEquals(data.get("contactUsLink"), "Contact Us");
        Assert.assertEquals(data.get("returnsLink"), "Returns");
        Assert.assertEquals(data.get("siteMapLink"), "Site Map");

        Assert.assertEquals(data.get("extrasHeaderTxt"), "Extras");
        Assert.assertEquals(data.get("brandsLink"), "Brands");
        Assert.assertEquals(data.get("giftCertificatesLink"), "Gift Certificates");
        Assert.assertEquals(data.get("affiliateLink"), "Affiliate");
        Assert.assertEquals(data.get("specialsLink"), "Specials");

        Assert.assertEquals(data.get("myAccountHeaderTxt"), "My Account");
        Assert.assertEquals(data.get("myAccountLink"), "My Account");
        Assert.assertEquals(data.get("orderHistoryLink"), "Order History");
        Assert.assertEquals(data.get("wishListLink"), "Wish List");
        Assert.assertEquals(data.get("newsLetterLink"), "Newsletter");

        Assert.assertEquals(data.get("footerCreditTxt"), "Powered By OpenCart" + "\nQafox.com © 2024");
    }
}
