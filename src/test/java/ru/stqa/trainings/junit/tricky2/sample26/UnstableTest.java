package ru.stqa.trainings.junit.tricky2.sample26;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

public class UnstableTest {
  
  @Rule
  public TestRule runTwiceRule = new RunTwiceRule();
  
  private static int attempt = 1;
  
  @Test
  public void randomlyFailingTest() {
    if (attempt == 2) {
      attempt = 1;

    } else {
      Assert.fail("Failed on " + (attempt++) + " attempt");
    }
  }

}
