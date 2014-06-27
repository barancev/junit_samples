package ru.stqa.trainings.junit.simple4.sample17;

import org.junit.Test;
import org.openqa.selenium.By;

public class SeleniumTest extends SeleniumClassFixture {

  @Test
  public void test1() {
    System.out.println(driver.findElements(By.cssSelector("div.movie_box")).size());
  }

}
