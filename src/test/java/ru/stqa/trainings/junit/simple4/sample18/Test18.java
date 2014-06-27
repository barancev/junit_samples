package ru.stqa.trainings.junit.simple4.sample18;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class Test18 {

  @Rule
  public TemporaryFolder tmpdir = new TemporaryFolder();
  
  @Test
  public void testSomething() {
    System.out.println(tmpdir.getRoot());
  }

}
