package ru.stqa.trainings.junit.tricky4.sample30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.dhemery.runtimesuite.ClassFinder;

public class SuiteLoader implements ClassFinder {

  private String resource;

  public SuiteLoader(String resource) {
    this.resource = resource;
  }

  @Override
  public Collection<Class<?>> find() {
    List<Class<?>> classes = new ArrayList<Class<?>>();
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(
          SuiteLoader.class.getResourceAsStream(resource)));
      
      String line = in.readLine();
      while (line != null) {
        try {
          classes.add(SuiteLoader.class.getClassLoader().loadClass(line));
        } catch (ClassNotFoundException e) {
          e.printStackTrace();
        }
        line = in.readLine();
      }
      
      in.close();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    
    return classes;
  }

}
