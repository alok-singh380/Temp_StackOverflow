package com.xyz;

import com.google.common.util.concurrent.Uninterruptibles;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test1 {

    @Test
    public void test() {
        System.out.println(">>>>>>>>>>>>> Starting the test");

        //Opening the Chrome brower
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Opening google page and verifying the title
        driver.get("https://www.google.com");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Google");

        //Close the chrome browser
        driver.quit();
        System.out.println(">>>>>>>>>>>>> Ending the test");
    }
}