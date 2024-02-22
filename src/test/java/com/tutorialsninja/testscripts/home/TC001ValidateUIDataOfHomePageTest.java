 package com.tutorialsninja.testscripts.home;

 import com.tutorialsninja.core.FrameworkScript;
 import com.tutorialsninja.pages.HomePage;
 import org.testng.Assert;
 import org.testng.annotations.Test;

 import java.util.Map;

public class TC001ValidateUIDataOfHomePageTest extends FrameworkScript {
    @Test
    public void validateHomePageUIData() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(3000);

        Map<String, String> data =  HomePage.getHomePageObj(driver).fetchHomePageUIData();

        System.out.println(data);

        Assert.assertEquals(data.get("heroSectionSliderImg1"), "https://tutorialsninja.com/demo/image/cache/catalog/demo/banners/iPhone6-1140x380.jpg");
        Assert.assertEquals(data.get("heroSectionSliderImg2"), "https://tutorialsninja.com/demo/image/cache/catalog/demo/banners/MacBookAir-1140x380.jpg");
    }
}
