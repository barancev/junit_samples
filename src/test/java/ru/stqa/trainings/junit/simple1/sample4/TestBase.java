package ru.stqa.trainings.junit.simple1.sample4;

import org.junit.After;
import org.junit.Before;

public class TestBase {

  @Before
  public void baseSetUp() {
    System.out.println("baseSetUp");
  }

  @After
  public void baseTearDown() {
    System.out.println("baseTearDown");
  }

}
