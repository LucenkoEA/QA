package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;


public class CheckElement {

    @Test
    public void CheckElementByID() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://passport.yandex.ru/auth/");
        WebElement element = driver.findElement(By.id("passp-field-login"));
        Assert.assertEquals(element.getAttribute("id"), "passp-field-login");
        driver.close();
    }
}
