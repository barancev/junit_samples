package ru.stqa.trainings.junit.simple4.sample20;

import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.ExternalResource;
import org.junit.rules.Verifier;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.*;

public class SeleniumFixture {

  protected static WebDriver driver;

  @ClassRule
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

  @Rule
  public Verifier errorVerifier = new Verifier() {
    @Override
    protected void verify() throws Throwable {
      String jsErrors = driver.findElement(By.id("__jsErrors")).getAttribute("textContent");
      ((JavascriptExecutor) driver).executeScript("__resetJsErrors()");

      Assert.assertThat(jsErrors, is(""));
    }
  };

}
