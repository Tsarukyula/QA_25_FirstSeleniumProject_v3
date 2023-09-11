package org.ait.qa25.fw.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoriesHelper extends HelperBase {
    public CategoriesHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isCategoriesPresent() {
        return driver.findElements(By.xpath("//strong[text()='Categories']")).size()>0;
    }

    public void clickOnCategoriesLink() {
        click(By.xpath("//strong[text()='Categories']"));
    }
}
