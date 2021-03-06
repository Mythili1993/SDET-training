package CRM_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class Activity2 {
	WebDriver driver;
	WebDriverWait wait;
  @Test
  public void crm() {
	  WebElement suitecrmurl = driver.findElement(By.xpath("//a[text()='SuiteCRM']"));
	  System.out.println("image URL is:" +suitecrmurl.getAttribute("href"));
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\MythiliSiddhappan\\Desktop\\geckodriver-v0.28.0-win64\\geckodriver.exe");
      driver = new FirefoxDriver();
      wait = new WebDriverWait(driver,10);
	  driver.get("http://alchemy.hguy.co/crm");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}