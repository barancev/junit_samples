package ru.stqa.trainings.junit.tricky2.sample25;

import org.junit.Test;

public class SeleniumTest extends SeleniumFixture {

  @Test
  public void test1() {
    driver.get("http://seleniumhq.org/");
  }

  @Test
  @NeedsFreshDriver
  public void test2() {
    driver.get("http://selenium2.ru/");
  }

}
