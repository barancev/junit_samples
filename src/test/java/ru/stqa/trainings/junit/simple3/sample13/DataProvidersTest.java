package ru.stqa.trainings.junit.simple3.sample13;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

@RunWith(DataProviderRunner.class)
public class DataProvidersTest {
  
  @DataProvider
  public static Object[][] users() {
    return new Object[][] {
      {"admin", "admin"},
      {"guest", "guest"},
    };
  }
  
  @Test
  @UseDataProvider("users")
  public void test1(String user, String password) {
    System.out.println("test1");
  }
  
  @Test
  public void test2() {
    System.out.println("test2");
  }
  
}
