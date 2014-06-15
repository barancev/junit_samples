package ru.stqa.trainings.junit.simple1.sample3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MethodFixturesTest {
  
  private Object x = new Object();

  @Before
  public void setUp() {
    System.out.println("setUp " + x);
  }

  @Test
  public void test1() {
    System.out.println("test1 " + x);
  }

  @Test
  public void test2() {
    System.out.println("test2 " + x);
  }

  @After
  public void tearDown() {
    System.out.println("tearDown " + x);
  }

}
