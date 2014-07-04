package ru.stqa.trainings.junit.tricky1.sample24;

import java.io.File;
import java.io.IOException;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

final class ScreenshotRule extends TestWatcher {

  private WebDriver driver;

  public ScreenshotRule(WebDriver driver) {
    this.driver = driver;
  }

  @Override
  protected void succeeded(Description description) {
    super.starting(description);
  }

  @Override
  protected void failed(Throwable e, Description description) {
    System.out.println("Taking sceenshot");
    File tmp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    try {
      File scr = new File(description.getMethodName() + ".png");
      System.out.println(scr.getAbsolutePath());
      Files.copy(tmp, scr);
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
}