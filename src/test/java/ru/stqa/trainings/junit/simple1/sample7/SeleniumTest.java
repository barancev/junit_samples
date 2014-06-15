package ru.stqa.trainings.junit.simple1.sample7;

import org.junit.Test;
import org.openqa.selenium.By;

public class SeleniumTest extends LoginFixture {

  @Test
  public void test1() {
    System.out.println(driver.findElements(By.cssSelector("div.movie_box")).size());
  }

}
