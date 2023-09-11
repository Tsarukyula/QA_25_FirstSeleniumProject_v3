package org.ait.qa25.org.ait.qa25.org_2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends  TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        // click on Log out link - //a[text()='Log out'] - xpath
        if (app.getUser().isElementPresent(By.xpath("//a[text()='Log out']"))) {
            app.getUser().clickOnLogOutButton();
        }
        app.getUser().clickOnLogInLink();
    }

    @Test
    public void loginTest() {
        // click on login link - //a[text()='Log in'] - xpath
        app.getUser().clickOnLogInLink();
        // enter email - .email - css
        app.getUser().fillLogInForm("student9@gmail.com", "Student12345$");
        // click on log in button - [value='Log in'] - css
        app.getUser().clickOnLogInButton();
        // assert Log out button displayed - //a[text()='Log out'] - xpath
        Assert.assertTrue(app.getUser().isLogOutButtonDisplayed());
    }
}
