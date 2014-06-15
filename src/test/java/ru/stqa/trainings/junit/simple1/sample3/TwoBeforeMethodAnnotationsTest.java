package ru.stqa.trainings.junit.simple1.sample3;

import org.junit.Before;
import org.junit.Test;

public class TwoBeforeMethodAnnotationsTest {

  @Before
  public void setUp1() {
    System.out.println("setUp1");
  }

  @Before
  public void setUp2() {
    System.out.println("setUp2");
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
