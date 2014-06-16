package ru.stqa.trainings.junit.simple3.sample13;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTestBase {
  
  protected static WebDriver driver;

  @BeforeClass
  public static void startBrowser() {
    driver = new FirefoxDriver();
  }
  
  @AfterClass
  public static void stopBrowser() {
    if (driver != null) {
      driver.quit();
    }
  }

}
