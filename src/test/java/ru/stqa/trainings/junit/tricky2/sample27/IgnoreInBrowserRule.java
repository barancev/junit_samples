package ru.stqa.trainings.junit.tricky2.sample27;

import org.junit.Assume;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import ru.stqa.trainings.junit.tricky2.sample27.IgnoreInBrowser.Browser;

public class IgnoreInBrowserRule implements TestRule {

  private WebDriverRule driverRule;

  public IgnoreInBrowserRule(WebDriverRule driverRule) {
    this.driverRule = driverRule;
  }

  @Override
  public Statement apply(Statement base, Description desc) {
    return new IgnoreInBrowserStatement(base, desc);
  }

  public class IgnoreInBrowserStatement extends Statement {

    private Statement base;
    private Description desc;

    public IgnoreInBrowserStatement(Statement base, Description desc) {
      this.base = base;
      // TODO Auto-generated constructor stub
      this.desc = desc;
    }

    @Override
    public void evaluate() throws Throwable {
      IgnoreInBrowser ignore = desc.getAnnotation(IgnoreInBrowser.class);
      if (ignore != null) {
        String browser = driverRule.getCapabilities().getBrowserName();
        Browser[] ignoredBrowsers = ignore.value();
        for (Browser ignoredBrowser : ignoredBrowsers) {
          Assume.assumeFalse(
              "Ignored in browser " + browser,
              ignoredBrowser.name().toLowerCase().equals(browser));
        }
      }
      base.evaluate();
    }

  }

}
