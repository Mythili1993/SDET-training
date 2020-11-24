package session9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity9_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        
        
        //Check the title of the page
          String title = driver.getTitle();
          //Print the title of the page
          System.out.println("Page title is: " + title);

        //Find username and password fields
        WebElement userName = driver.findElement(By.xpath("//input[starts-with(@class, 'username')]"));
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, 'password')]"));
        //Type credentials
        userName.sendKeys("admin");
        password.sendKeys("password");
        //Click Log in
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
        
        //Print login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);
        
        //Close browser
        driver.close();

    }
}