package ru.stqa.trainings.junit.tricky2.sample27;

import java.util.List;
import java.util.Set;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import ru.stqa.selenium.factory.WebDriverFactory;

public class WebDriverRule extends TestWatcher implements WebDriver, TakesScreenshot {
  
  private Capabilities capabilities;

  public WebDriverRule(Capabilities capabilities) {
    this.capabilities = capabilities;
  }
  
  private WebDriver driver;
  
  @Override
  protected void starting(Description description) {
    System.out.println("Getting a browser");
    driver = WebDriverFactory.getDriver(capabilities);
  }

  public Capabilities getCapabilities() {
    if (driver instanceof RemoteWebDriver) {
      return ((RemoteWebDriver) driver).getCapabilities();
    } else {
      return capabilities;
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

  @Override
  public <X> X getScreenshotAs(OutputType<X> arg0) throws WebDriverException {
    return ((TakesScreenshot) driver).getScreenshotAs(arg0);
  }

}