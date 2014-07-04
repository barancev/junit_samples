package ru.stqa.trainings.junit.tricky1.sample24;

import org.junit.Rule;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumFixture {

  public WebDriverRule driver = new WebDriverRule(DesiredCapabilities.chrome());
  
  @Rule
  public TestRule rule = RuleChain
    .outerRule(driver)
    .around(new ScreenshotRule(driver));
  
}
