package ru.stqa.trainings.junit.simple4.sample17;

import org.junit.ClassRule;
import org.junit.rules.ExternalResource;
import org.junit.rules.RuleChain;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClassFixture {

  protected static WebDriver driver;

  public static ExternalResource driverRule = new ExternalResource() {
    @Override
    protected void before() throws Throwable {
      System.out.println("Starting a browser");
      driver = new ChromeDriver();
    };

    @Override
    protected void after() {
      System.out.println("Stopping the browser");
      if (driver != null) {
        driver.quit();
      }
    };
  };
  
  public static ExternalResource loginRule = new ExternalResource() {
    @Override
    protected void before() throws Throwable {
      System.out.println("Login");
      driver.get("http://localhost/php4dvd");
      driver.findElement(By.name("username")).sendKeys("admin");
      driver.findElement(By.name("password")).sendKeys("admin");
      driver.findElement(By.name("submit")).click();
    };

    @Override
    protected void after() {
      System.out.println("Logout");
      driver.findElement(By.xpath("//nav/ul/li[4]/a")).click();
    };
  };
  
  @ClassRule
  public static RuleChain rules = RuleChain
    .outerRule(driverRule)
    .around(loginRule);
  
}
