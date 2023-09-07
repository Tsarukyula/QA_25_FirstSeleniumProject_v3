package org.ait.qa25.fw.framework;

import org.ait.qa25.fw.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase {
    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegisterLink() {
        click(By.xpath("//a[text()='Register']"));
    }

    public void clickOnLogOutButton() {
        click(By.xpath("//a[text()='Log out']"));
    }

    public boolean isRegistrationLinkPresent() {
        return isElementPresent(By.xpath("//a[text()='Register']"));
    }

    public void clickOnRegistrationButton() {
        click(By.xpath("//input[@id='register-button']"));
    }

    public void fillRegistrationForm(User user) {
        type(By.xpath("//input[@id='FirstName']"), user.getName());
        // enter Last name - //input[@id='LastName'] - xpath
        type(By.xpath("//input[@id='LastName']"), user.getSurname());
        // enter email - //input[@id='Email'] - xpath
        type(By.xpath("//input[@id='Email']"), user.getEmail());
        // enter password - //input[@id='Password'] - xpath
        type(By.xpath("//input[@id='Password']"), user.getPassword());
        // enter confirmed password - //input[@id='ConfirmPassword'] - xpath
        type(By.xpath("//input[@id='ConfirmPassword']"), user.getPassword());
    }

    public void clickOnLogInButton() {
        click(By.cssSelector("[value='Log in']"));
    }

    public void clickOnLogInLink() {
        click(By.xpath("//a[text()='Log in']"));
    }

    public void fillLogInForm(String email, String password) {
        click(By.cssSelector(".email"));
        driver.findElement(By.cssSelector(".email")).clear();
        driver.findElement(By.cssSelector(".email")).sendKeys(email);
        // enter password - .password - css
        click(By.cssSelector(".password"));
        driver.findElement(By.cssSelector(".password")).clear();
        driver.findElement(By.cssSelector(".password")).sendKeys(password);
    }

    public boolean isLogOutButtonDisplayed() {
        return isElementPresent2(By.xpath("//a[text()='Log out']"));
    }
}
