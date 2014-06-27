package ru.stqa.trainings.junit.simple4.sample20;

import org.junit.Test;
import org.openqa.selenium.By;

public class SeleniumTest extends SeleniumFixture {

  @Test
  public void test1() {
    driver.get("http://fiddle.jshell.net/barancev/tqr34/2/show/light/");
    driver.findElement(By.id("link")).click();
  }

}
