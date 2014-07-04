package ru.stqa.trainings.junit.tricky3.sample28;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {
  
  public enum Type {
    RESOURCE,
    FILE
  }

  String value();
  Type type();

}
