package ru.stqa.trainings.junit.tricky2.sample27;

import org.junit.ClassRule;
import org.junit.Rule;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumFixture {

  @ClassRule
  public static WebDriverRule driver = new WebDriverRule(DesiredCapabilities.chrome());
  
  @Rule
  public IgnoreInBrowserRule ignoreInBrowserRule = new IgnoreInBrowserRule(driver);

}
