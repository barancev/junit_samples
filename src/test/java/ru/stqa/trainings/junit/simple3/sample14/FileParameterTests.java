package ru.stqa.trainings.junit.simple3.sample14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

@RunWith(DataProviderRunner.class)
public class FileParameterTests {

  @Test
  @UseDataProvider("users")
  public void test1(String user, String password) {
    System.out.println(user + ":" + password);
  }

  @DataProvider
  public static Object[][] users() throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(
        FileParameterTests.class.getResourceAsStream("/user.data")));
    
    List<Object[]> userData = new ArrayList<Object[]>();
    String line = in.readLine();
    while (line != null) {
      userData.add(line.split(";"));
      line = in.readLine();
    }
    
    in.close();
    
    return (Object[][]) userData.toArray(new Object[][]{});
  }

}
