package org.ait.qa25.fw.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;

    UserHelper user;
    ShoppingCartHelper shoppingCart;
    CategoriesHelper categories;

    public void init() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        user = new UserHelper(driver);
        shoppingCart = new ShoppingCartHelper(driver);
        categories = new CategoriesHelper(driver);
    }

    public UserHelper getUser() {
        return user;
    }

    public ShoppingCartHelper getShoppingCart() {
        return shoppingCart;
    }

    public CategoriesHelper getCategories() {
        return categories;
    }

    public void stop() {
        driver.quit();
    }
}
