package ru.stqa.trainings.junit.tricky1.sample22;

import java.util.List;
import java.util.Set;

import org.junit.rules.ExternalResource;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ru.stqa.selenium.factory.WebDriverFactory;

public class WebDriverRule extends ExternalResource implements WebDriver {
  
  private Capabilities capabilities;

  public WebDriverRule(Capabilities capabilities) {
    this.capabilities = capabilities;
  }
  
  private WebDriver driver;
  
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

  @Override
  public void close() {
    driver.close();
  }

  @Override
  public WebElement findElement(By arg0) {
    return driver.findElement(arg0);
  }

  @Override
  public List<WebElement> findElements(By arg0) {
    return driver.findElements(arg0);
  }

  @Override
  public void get(String arg0) {
    driver.get(arg0);
  }

  @Override
  public String getCurrentUrl() {
    return driver.getCurrentUrl();
  }

  @Override
  public String getPageSource() {
    return driver.getPageSource();
  }

  @Override
  public String getTitle() {
    return driver.getTitle();
  }

  @Override
  public String getWindowHandle() {
    return driver.getWindowHandle();
  }

  @Override
  public Set<String> getWindowHandles() {
    return driver.getWindowHandles();
  }

  @Override
  public Options manage() {
    return driver.manage();
  }

  @Override
  public Navigation navigate() {
    return driver.navigate();
  }

  @Override
  public void quit() {
    driver.quit();
  }

  @Override
  public TargetLocator switchTo() {
    return driver.switchTo();
  }
}