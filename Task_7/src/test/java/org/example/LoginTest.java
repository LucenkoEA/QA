package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class LoginTest {

    @Test
    public void CheckElementByID() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://passport.yandex.ru/auth"); //Страница авторизации яндекса
        WebElement email = driver.findElement(By.id("passp-field-login"));
        email.sendKeys("jeyka95");
        Thread.sleep(500);
        driver.findElement(By.id("passp:sign-in")).click();
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("passp-field-passwd"));
        password.sendKeys("51efoses");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='passp:sign-in']")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(), "Яндекс ID");
        driver.close();
    }
}