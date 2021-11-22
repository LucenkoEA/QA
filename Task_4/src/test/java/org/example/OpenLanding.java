package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class OpenLanding {

    @Test
    public void CheckElementByID() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ru.wikipedia.org/wiki/JSON"); //JSON - Википедия
        String title = driver.getTitle();
        Assert.assertEquals(title, driver.getTitle());
        System.out.println("Title of the page is : " + title);
        driver.close();
    }
}
