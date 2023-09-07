package org.ait.qa25.org.ait.qa25.org_2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        // click on Log out link - //a[text()='Log out'] - xpath
        if (app.getUser().isElementPresent(By.xpath("//a[text()='Log out']"))) {
    }
}

    @Test
    public void addToCartTest() {
        // click on the product page on the main page - //a[text()='14.1-inch Laptop'] - xpath
        app.getShoppingCart().clickOnTheProductPage();
        // click Add to cart on the product page - #add-to-cart-button-31 - css
        app.getShoppingCart().clickAddToCart();
        // click on Shopping cart link - //a[text()='Shopping cart'] - xpath
        app.getShoppingCart().clickOnShoppingCartLink();
        // Assert added product in a Shopping cart //a[text()='14.1-inch Laptop'] - xpath
        Assert.assertTrue(app.getShoppingCart().isProductInAShoppingCart());
    }
}
