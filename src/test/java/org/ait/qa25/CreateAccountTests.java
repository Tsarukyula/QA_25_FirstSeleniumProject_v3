package org.ait.qa25.org.ait.qa25.org_2;

import org.ait.qa25.fw.models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        // precondition: user should be logged out
        // click on Register link - //a[text()='Register'] - xpath
        if (!app.getUser().isRegistrationLinkPresent()) {
            app.getUser().clickOnLogOutButton();
        }
        app.getUser().clickOnRegisterLink();
    }

    @Test
    public void newUserRegistrationPositiveTest() {
        // choose Male/Female - //label[text()='Female'] - xpath
        app.getUser().click(By.xpath("//label[text()='Female']"));
        //driver.findElement(By.xpath("//label[text()='Female']")).sendKeys("Female");
        // enter First name - //input[@id='FirstName'] - xpath
        app.getUser().fillRegistrationForm(new User().setName("Maria")
                .setSurname("Wolf")
                .setEmail("student9@gmail.com")
                .setPassword("Student12345$"));
        // click on registration button - //input[@id='register-button'] - xpath
        app.getUser().clickOnRegistrationButton();
        // assert Sign out button displayed - //a[text()='Log out'] - xpath
        Assert.assertTrue(app.getUser().isLogOutButtonDisplayed());
    }
}
