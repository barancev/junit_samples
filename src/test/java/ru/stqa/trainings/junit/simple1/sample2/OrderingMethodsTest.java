package ru.stqa.trainings.junit.simple1.sample2;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderingMethodsTest {

  @Test
  public void testA() {
    System.out.println("testA");
  }

  @Test
  public void testAAA() {
    System.out.println("testAAA");
  }

  @Test
  public void testAA() {
    System.out.println("testAA");
  }

  @Test
  public void testXXX() {
    System.out.println("testXXX");
  }

  @Test
  public void testB() {
    System.out.println("testB");
  }

}
