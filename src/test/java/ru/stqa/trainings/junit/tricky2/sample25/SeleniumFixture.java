package ru.stqa.trainings.junit.tricky2.sample25;

import org.junit.ClassRule;
import org.junit.Rule;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumFixture {

  @ClassRule
  public static WebDriverRule driver = new WebDriverRule(DesiredCapabilities.chrome());
  
  @Rule
  public FreshDriverRule freshDriverRule = new FreshDriverRule(driver);

}
