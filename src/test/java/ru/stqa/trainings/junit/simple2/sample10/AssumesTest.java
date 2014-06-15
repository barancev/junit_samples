package ru.stqa.trainings.junit.simple2.sample10;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class AssumesTest {

  @Test
  public void testPreconditionIsTrue() {
    Assume.assumeThat(2 * 2, is(4));
    Assert.assertThat(2 * 2, is(4));
  }

  @Test
  public void testPreconditionIsFalse() {
    Assume.assumeThat(2 * 2, is(5));
    Assert.assertThat(2 * 2, is(5));
  }

}
