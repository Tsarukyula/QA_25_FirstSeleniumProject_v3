package org.ait.qa25;

import org.ait.qa25.fw.framework.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestBase {

    protected static ApplicationManager app =
            new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeSuite
    public void setUp() {
        app.init();
    }

    @AfterSuite
    public void tearDown() {
        app.stop();
    }

    @BeforeMethod
    public void startTest() {
        logger.info("Start test");
    }

    @AfterMethod
    public void stopTest() {
        logger.info("Stop test");
    }

    public static class FindElementTests {

        WebDriver driver;

        @BeforeMethod
        public void setUp(){
            driver = new ChromeDriver();
            // driver = new FirefoxDriver();

            driver.get("https://ilcarro.web.app");

            // maximize browser window
            driver.manage().window().maximize();

            // set implicit timeout
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }


        @Test
        public void findElementTest () {
            // find element by tag name
            WebElement element = driver.findElement(By.tagName("h1"));
            System.out.println(element.getText());

            // find list of elements
            List<WebElement> elements = driver.findElements(By.tagName("a"));
            System.out.println(elements.size());

            // find element by id
            driver.findElement(By.id("city"));

            // find element by class name
            driver.findElement(By.className("input-label"));

            // find element by name
            driver.findElement(By.name("viewport"));

            // find element by link text
            driver.findElement(By.linkText("Let the car work"));

            // find element by partial link text
            driver.findElement(By.partialLinkText("work"));

        }

        @Test
        public void findElementByCssTest() {
            // css = tag
            // driver.findElement(By.tagName("h1"));
            driver.findElement(By.cssSelector("h1"));

            // id -> #
            // driver.findElement(By.id("city"));
            driver.findElement(By.cssSelector("#city"));

            // class name -> css(.)
            // driver.findElement(By.className("input-label"));
            driver.findElement(By.cssSelector(".input-label"));

            // attr+parameter -> css([attr = 'par'])
            //driver.findElement(By.name("viewport"));
            driver.findElement(By.cssSelector("[name = 'viewport']"));

            // css contains (*)
            driver.findElement(By.cssSelector("[class*='pristine']"));

            // css - start(^)
            driver.findElement(By.cssSelector("[class^='ng']"));

            // css - end on($)
            driver.findElement(By.cssSelector("[class$='input']"));

        }

        @Test
        public void findElementByXPathTest() {
            //  //*[@attr='par']
            // tag ->
            // driver.findElement(By.tagName("h1"));
            driver.findElement(By.xpath("//h1"));

            // id -> xpath
            // driver.findElement(By.id("city"));
            driver.findElement(By.xpath("//input[@id='city']"));

            // class name -> xpath
            // driver.findElement(By.className("input-label"));
            driver.findElement(By.xpath("//label[@class='input-label']"));

            // text -> xpath   //*[contains(.,'text')]
            driver.findElement(By.xpath("//h2[contains(.,'Type your data and hit Yalla!')]"));

            // start -> //*[start-with(@attr,'text')]

        }

        @AfterMethod()
        public void tearDown() {
            driver.quit();
        }

    }
}
