package org.ait.qa25;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getCategories().isCategoriesPresent()) {
            app.getCategories().clickOnCategoriesLink();
        }
    }

    @Test
    public void isCategoriesPresentTest() {
        // //strong[text()='Categories'] - xpath
        app.driver.findElement(By.xpath("//strong[text()='Categories']"));
//        System.out.println("Categories is " + isCategoriesPresent());
//        System.out.println("Categories is " + isElementPresent(By
//                .xpath("//strong[text()='Categories']")));

        Assert.assertTrue(app.getCategories().isCategoriesPresent());
    }
}
