package org.ait.qa25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FindElementTests2 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void findElementByCssTest() {
        driver.findElement(By.cssSelector("span"));
        driver.findElement(By.cssSelector(".search-box"));
        driver.findElement(By.cssSelector("#newsletter-result-block"));
        driver.findElement(By.cssSelector("[class*='newsletter']"));
        driver.findElement(By.cssSelector("[class*='field']"));
        driver.findElement(By.cssSelector("[class^='ui']"));
        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector("[class$='enu']"));
        driver.findElement(By.cssSelector(".listbox"));
        driver.findElement(By.cssSelector(".header-menu"));
    }

    @Test
    public void findElementByXPathTest() {
        driver.findElement(By.xpath("//span"));
        driver.findElement(By.xpath("//*[@class='search-box']"));
        driver.findElement(By.xpath("//*[@id='newsletter-result-block']"));
        driver.findElement(By.xpath("//*[contains(@class, 'newsletter')]"));
        driver.findElement(By.xpath("//*[contains(@class, 'field')]"));
        driver.findElement(By.xpath("//*[starts-with(@class, 'ui')]"));
        driver.findElement(By.xpath("//*[@id='bar-notification']"));
        driver.findElement(By.xpath("//*[ends-with(@class, 'enu')]"));
        driver.findElement(By.xpath("//label[@class='listbox']"));
        driver.findElement(By.xpath("//label[@class='header-menu']"));


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
