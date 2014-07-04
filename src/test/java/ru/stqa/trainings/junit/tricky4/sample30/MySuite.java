package ru.stqa.trainings.junit.tricky4.sample30;

import org.junit.runner.RunWith;

import com.dhemery.runtimesuite.ClassFinder;
import com.dhemery.runtimesuite.Finder;
import com.dhemery.runtimesuite.RuntimeSuite;

@RunWith(RuntimeSuite.class)
public class MySuite {

  @Finder public ClassFinder finder = new SuiteLoader("/suite.txt");

}
