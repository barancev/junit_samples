package ru.stqa.trainings.junit.simple1.sample8;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ru.stqa.trainings.junit.simple1.sample4.Test1;

@RunWith(Suite.class)
@SuiteClasses({
  Test1.class,
  Test2.class
})
public class MySuite {

  @BeforeClass
  public static void suiteSetUp() {
    System.out.println("suiteSetUp");
  }
  
  @AfterClass
  public static void suiteTearDown() {
    System.out.println("suiteTearDown");
  }

}
