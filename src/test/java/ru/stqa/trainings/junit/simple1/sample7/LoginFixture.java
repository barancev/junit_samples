package ru.stqa.trainings.junit.simple1.sample7;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;

public class LoginFixture extends BrowserFixture {

  @BeforeClass
  public static void login() {
    System.out.println("Login");
    driver.get("http://localhost/php4dvd");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("submit")).click();
  }

  @AfterClass
  public static void logout() {
    System.out.println("Logout");
    driver.findElement(By.xpath("//nav/ul/li[4]/a")).click();
  }

}
