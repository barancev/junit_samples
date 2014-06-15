package ru.stqa.trainings.junit.simple1.sample7;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFixture {

  protected static WebDriver driver;

  @BeforeClass
  public static void setUp() {
    System.out.println("Starting a browser");
    driver = new ChromeDriver();
  }

  @AfterClass
  public static void tearDown() {
    System.out.println("Stopping the browser");
    if (driver != null) {
      driver.quit();
    }
  }

}
