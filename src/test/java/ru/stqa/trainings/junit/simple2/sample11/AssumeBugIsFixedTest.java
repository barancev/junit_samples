package ru.stqa.trainings.junit.simple2.sample11;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

public class AssumeBugIsFixedTest extends TestBase {

  @Test
  public void testSomething() {
    Assume.assumeFalse(bugIsOpen(1));
    Assert.assertThat(2 * 2, is(5));
  }
  
}
