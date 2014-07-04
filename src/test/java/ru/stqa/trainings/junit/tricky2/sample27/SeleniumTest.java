package ru.stqa.trainings.junit.tricky2.sample27;

import org.junit.Test;

import static ru.stqa.trainings.junit.tricky2.sample27.IgnoreInBrowser.Browser.*;

public class SeleniumTest extends SeleniumFixture {

  @Test
  public void test1() {
    driver.get("http://seleniumhq.org/");
  }

  @Test
  @IgnoreInBrowser(CHROME)
  public void test2() {
    driver.get("http://selenium2.ru/");
  }

}
