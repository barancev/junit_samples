package ru.stqa.trainings.junit.tricky2.sample25;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class FreshDriverRule extends TestWatcher {

  private WebDriverRule driverRule;

  public FreshDriverRule(WebDriverRule driverRule) {
    this.driverRule = driverRule;
  }

  @Override
  protected void starting(Description description) {
    if (description.getAnnotation(NeedsFreshDriver.class) != null) {
      System.out.println("Restarting a browser");
      driverRule.startFreshDriver();
    }
  }

}
