import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class MainTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:/Coding/chromedriver.exe");

        driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
    }

    @AfterMethod
    public void setDown() {
        driver.quit();
    }

    @Test
    void testSelenium() {

        driver.get("https://www.theperfectloaf.com/");

        WebElement login = driver.findElement(By.xpath("//span[@class = 'tpl-membership__button-text']"));
        login.click();

            driver.switchTo().frame("memberful-iframe-for-overlay");
            WebElement input = driver.findElement(By.id("session_email"));
//            WebElement login2 = driver.findElement(By.xpath("//div[@data-display-if-target = '#session_mode']/input[@name = 'commit']"));
            input.sendKeys("kumenov@gmail.com\n");
//            login2.click();

            WebElement error = driver.findElement(By.xpath("//div[@class = 'error_explanation']"));
            String explanation = "Couldn’t find an account with that email address.";

            Assert.assertEquals(error.getText(), explanation);

            driver.switchTo().defaultContent();


//            WebElement username = driver.findElement(By.xpath("/users/password/new"));
//            WebElement password = driver.findElement(By.id("user_password"));
//            WebElement login = driver.findElement(By.name("commit"));
//
//            username.sendKeys("abc@gmail.com");
//            password.sendKeys("your_password");
//
//            login.click();
//
//            String expectedUrl = "https://live.browserstack.com/dashboard";
//            String actualUrl = driver.getCurrentUrl();
//
//            Assert.assertEquals(actualUrl, expectedUrl);

        }
//        finally {
//            driver.quit();
//        }



}


