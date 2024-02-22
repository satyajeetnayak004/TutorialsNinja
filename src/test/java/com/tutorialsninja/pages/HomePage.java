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

public class HomePage {
    @FindBy(xpath = "(//img[@alt='iPhone 6'])[2]")
    private WebElement heroSectionSliderImg1 = null;
    @FindBy(xpath = "(//img[@alt='MacBookAir'])[2]")
    private WebElement heroSectionSliderImg2 = null;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public static HomePage getHomePageObj(WebDriver driver) {
        return new HomePage(driver);
    }

    public Map<String, String> fetchHomePageUIData() {
        Map<String, String> loginData = new HashMap<>();

        loginData.put("heroSectionSliderImg1", heroSectionSliderImg1.getAttribute("src"));
        loginData.put("heroSectionSliderImg2", heroSectionSliderImg2.getAttribute("src"));

        return loginData;
    }

    // Verify the navigation of all links available on Login page
    public List<String> verifyHomePageLinksNavigation(WebDriver driver) throws InterruptedException {
        List<String> linksData = new ArrayList<>();

        return linksData;
    }
}
