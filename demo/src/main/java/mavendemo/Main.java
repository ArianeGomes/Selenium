package mavendemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        // To run on Chrome Browser
        WebDriver driver = new ChromeDriver();
        // To run on Firefox Browser
        //WebDriver driver = new FirefoxDriver();
        // To run on Edge Browser
        //WebDriver driver = new EdgeDriver();

        driver.get("https://rahulshettyacademy.com/");

        System.out.println("Title of page is => " + driver.getTitle());
        System.out.println("URL => " + driver.getCurrentUrl());

        // Closes only the window that was opened in the current session
        //driver.close();
        
        // Closes all associated windows
        driver.quit();
    }
}