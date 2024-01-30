package com.tutorialsninja.testscripts.home;

import com.tutorialsninja.core.FrameworkScript;
import com.tutorialsninja.pages.Header;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class TC001ValidateUIDataOfHomePageTest extends FrameworkScript {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[text()='Currency']")).click();

        System.out.println(driver.findElement(By.xpath("(//span[normalize-space()='Currency'])[1]")).getText());
        System.out.println(driver.findElement(By.xpath("//button[@name='EUR']")).getText());
        System.out.println(driver.findElement(By.xpath("//button[@name='GBP']")).getText());
        System.out.println(driver.findElement(By.xpath("//button[@name='USD']")).getText());
        System.out.println(driver.findElement(By.xpath("//a[@title='My Account']")).getText());
        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        System.out.println(driver.findElement(By.linkText("Register")).getText());
        System.out.println(driver.findElement(By.linkText("Login")).getText());

        Thread.sleep(30000);
        driver.close();

    }
    @Test
    public void validateHomePageUIData() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(3000);

        Header header = new Header(driver);

        Thread.sleep(3000);

        Map<String, String> data =  header.fetchHomePageUIData();

        Assert.assertEquals(data.get("currencyLink"), "Currency");
        Assert.assertEquals(data.get("currencyEuroLink"), "€Euro");
        Assert.assertEquals(data.get("currencyPoundLink"), "£Pound Sterling");
        Assert.assertEquals(data.get("currencyUSLink"), "$US Dollar");
        Assert.assertEquals(data.get("myAccountLink"), "My Account");
        Assert.assertEquals(data.get("registerLink"), "Register");
        Assert.assertEquals(data.get("loginLink"), "Login");

    }
}
