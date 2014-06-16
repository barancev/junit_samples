package ru.stqa.trainings.junit.simple3.sample12;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@SuiteClasses({
  CategorizedTest.class
})
@RunWith(Categories.class)
@IncludeCategory(MyCategories.PositiveTests.class)
public class PositiveSuite {

}
