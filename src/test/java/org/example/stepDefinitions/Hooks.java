package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver = null;


    @Before
    public static void openBrowser()
    {
        //1- Bridge
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\IdeaProjects\\demonopcommerce\\src\\main\\resources\\chromedriver.exe");

        //2- Create new object from ChromeDriver
         driver = new ChromeDriver();

        //3- Configurations
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //4- Navigate to the website
         driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @After
    public static void quitBrowser() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.quit();
    }
}
