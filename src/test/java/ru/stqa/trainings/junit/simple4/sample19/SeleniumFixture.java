package ru.stqa.trainings.junit.simple4.sample19;

import java.io.File;
import java.io.IOException;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.ExternalResource;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SeleniumFixture {

  protected static WebDriver driver;

  @ClassRule
  public static ExternalResource driverRule = new ExternalResource() {
    @Override
    protected void before() throws Throwable {
      System.out.println("Starting a browser");
      driver = new ChromeDriver();
    };

    @Override
    protected void after() {
      System.out.println("Stopping the browser");
      if (driver != null) {
        driver.quit();
      }
    };
  };
  
  @Rule
  public TestWatcher screenshotRule = new TestWatcher() {
    @Override
    protected void succeeded(Description description) {
      super.starting(description);
    }

    @Override
    protected void failed(Throwable e, Description description) {
      System.out.println("Taking sceenshot");
      File tmp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      try {
        Files.copy(tmp, new File(description.getMethodName() + ".png"));
      } catch (IOException e1) {
        e1.printStackTrace();
      }
    }

    @Override
    protected void starting(Description description) {
      super.starting(description);
    }

    @Override
    protected void finished(Description description) {
      super.finished(description);
    }
  };
  
}
