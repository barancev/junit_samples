package ru.stqa.trainings.junit.simple2.sample9;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class AssertionsTest {

  @Test
  public void testAssertKeyword() {
    assert 2 * 2 == 5;
  }

  @Test
  public void testAssert() {
    Assert.assertEquals(5, 2 * 2);
  }

  @Test
  public void testAssertHamcreast() {
    Assert.assertThat(2 * 2, is(5));
  }

  @Test
  public void testSoftAssert() {
	  SoftAssertions s = new SoftAssertions();
    s.assertThat(2 * 2).isEqualTo(3);
    s.assertThat(2 * 2).isEqualTo(5);
    s.assertAll();
  }
}
