package org.ait.qa25.fw.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartHelper extends HelperBase {
    public ShoppingCartHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isProductInAShoppingCart() {
        return isElementPresent(By.xpath("//a[text()='14.1-inch Laptop']"));
    }

    public void clickOnShoppingCartLink() {
        click(By.xpath("//a[text()='Shopping cart']"));
    }

    public void clickAddToCart() {
        click(By.cssSelector("#add-to-cart-button-31"));
    }

    public void clickOnTheProductPage() {
        click(By.xpath("//a[text()='14.1-inch Laptop']"));
    }
}
