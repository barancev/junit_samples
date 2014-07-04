package ru.stqa.trainings.junit.tricky1.sample23;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumFixture {

  @ClassRule
  public static WebDriverRule driver = new WebDriverRule(DesiredCapabilities.chrome());
  
  @Rule
  public TestWatcher screenshotRule = new ScreenshotRule(driver);
  
}
