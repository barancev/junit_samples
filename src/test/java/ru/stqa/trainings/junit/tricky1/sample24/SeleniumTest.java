package ru.stqa.trainings.junit.tricky1.sample24;

import org.junit.Test;
import org.openqa.selenium.By;

public class SeleniumTest extends SeleniumFixture {

  @Test
  public void test1() {
    driver.get("http://localhost/php4dvd");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("submit")).click();
  }

  @Test
  public void test2() {
    driver.get("http://localhost/php4dvd");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("submit")).click();
  }

}
