package ru.stqa.trainings.junit.tricky1.sample22;

import org.junit.ClassRule;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumFixture {

  @ClassRule
  public static WebDriverRule driver = new WebDriverRule(DesiredCapabilities.chrome());

}
