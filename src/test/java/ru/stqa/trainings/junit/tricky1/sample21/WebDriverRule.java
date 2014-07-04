package ru.stqa.trainings.junit.tricky1.sample21;

import org.junit.rules.ExternalResource;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import ru.stqa.selenium.factory.WebDriverFactory;

public class WebDriverRule extends ExternalResource {
  
  private Capabilities capabilities;

  public WebDriverRule(Capabilities capabilities) {
    this.capabilities = capabilities;
  }
  
  private WebDriver driver;
  
  public WebDriver getDriver() {
    return driver;
  }

  @Override
  protected void before() throws Throwable {
    System.out.println("Starting a browser");
    driver = WebDriverFactory.getDriver(capabilities);
  }

  @Override
  protected void after() {
    System.out.println("Stopping the browser");
    if (driver != null) {
      WebDriverFactory.dismissDriver(driver);
    }
  }
}