package ru.stqa.trainings.junit.simple3.sample13;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParametersTwoMethodsTest {
  
  @Parameters(name = "user:{0}, password:{1}")
  public static Collection<Object[]> users() {
    return Arrays.asList(new Object[][] {
      {"admin", "admin"},
      {"guest", "guest"},
    });
  }
  
  @Parameter(0)
  public String user;
  @Parameter(1)
  public String password;
  
  @Test
  public void test1() {
    System.out.println("test1");
  }
  
  @Test
  public void test2() {
    System.out.println("test2");
  }
  
}
