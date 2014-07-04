package ru.stqa.trainings.junit.tricky3.sample28;

import org.junit.Test;
import org.junit.runner.RunWith;

import static ru.stqa.trainings.junit.tricky3.sample28.DataSource.Type.*;

import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

@RunWith(DataProviderRunner.class)
public class FileParameterTests {

  @Test
  @UseDataProvider(value = "dataSourceLoader", location = UniversalDataProviders.class)
  @DataSource(value = "/user.data", type = RESOURCE)
  public void test1(String user, String password) {
    System.out.println(user + ":" + password);
  }

}
