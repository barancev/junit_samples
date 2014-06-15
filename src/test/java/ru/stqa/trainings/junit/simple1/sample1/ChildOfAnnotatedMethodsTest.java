package ru.stqa.trainings.junit.simple1.sample1;

import org.junit.Test;

public class ChildOfAnnotatedMethodsTest extends AnnotatedMethodsTest {

  @Test
  public void childTest() {
    System.out.println("childTest");
  }

}
