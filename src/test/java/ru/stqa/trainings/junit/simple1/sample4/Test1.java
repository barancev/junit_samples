package ru.stqa.trainings.junit.simple1.sample4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test1 extends TestBase {

  @Before
  public void setUp() {
    System.out.println("setUp");
  }

  @After
  public void tearDown() {
    System.out.println("tearDown");
  }

  @Test
  public void test1() {
    System.out.println("test1");
  }

  @Test
  public void test2() {
    System.out.println("test2");
  }

}
