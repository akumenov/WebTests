import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ForgetPassword {

    @Test
    public void ForgetPassword() {
        System.setProperty("webdriver.chrome.driver", "E:/Coding/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().window().maximize();

            driver.get("https://www.boberbob.com");

            WebElement link = driver.findElement(By.id("comp-iqth25u32label"));
            link.click();


            Assert.assertEquals(driver.getCurrentUrl(), "https://www.boberbob.com/beans");
        } finally {
            driver.quit();
        }



    }
}
