package com.qaTesting.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaTesting.pages.SetPackageName;



public class TestTwoTest extends SetPackageName {

  @Test
  public void setPackageTest() {
    
	 Assert.assertEquals(setPackage(),"NUnit");
  }
}
