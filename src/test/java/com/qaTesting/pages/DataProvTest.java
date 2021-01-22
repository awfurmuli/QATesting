package com.qaTesting.pages;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class DataProvTest extends DataProv{
 
	
	@Test(dataProvider = "dp")
  public void f(String actual, String result) {
		
		Assert.assertEquals(DataProviderExercise(actual), result);
  }
	
  @DataProvider(name = "dp")
  public Object[][] datap() {
	  Object[][] xyz = {{ "hi", "ih"},{"hello", "olleh"}, {"hey","yeh"}};
      return xyz;
  }

}

  
