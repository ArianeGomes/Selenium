package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
//import org.testng.Assert;

public class GoogleTest {
    
    @Test
    public void googleTitleTest(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/");

        //driver.getTitle();

        //Assert.assertEquals(driver.getTitle(), "Google");

        System.out.println("Title of page is => "+ driver.getTitle());

        //driver.quit();
    }

}
