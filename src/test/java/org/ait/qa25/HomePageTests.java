package org.ait.qa25.org.ait.qa25.org_2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {

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
