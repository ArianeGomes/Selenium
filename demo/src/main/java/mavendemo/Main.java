package mavendemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/");

        System.out.println("Title of page is => " + driver.getTitle());
        System.out.println("URL => " + driver.getCurrentUrl());

        // Closes only the window that was opened in the current session
        //driver.close();
        
        // Closes all associated windows
        driver.quit();
    }
}