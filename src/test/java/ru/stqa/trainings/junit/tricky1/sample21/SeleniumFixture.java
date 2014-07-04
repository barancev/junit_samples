package ru.stqa.trainings.junit.tricky1.sample21;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumFixture {

  protected static WebDriver driver;

  @ClassRule
  public static WebDriverRule driverRule = new WebDriverRule(
      DesiredCapabilities.chrome());

  @Rule
  public ExternalResource extractDriverRule = new ExternalResource() {
    @Override
    protected void before() throws Throwable {
      driver = driverRule.getDriver();
    }
  };
  
}
