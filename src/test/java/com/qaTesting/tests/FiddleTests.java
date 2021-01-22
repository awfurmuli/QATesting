package com.qaTesting.tests;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qaTesting.pages.Fiddle;

public class FiddleTests extends Fiddle{
	
	@BeforeMethod
	public void homePage() {
		driver.navigate().to("https://dotnetfiddle.net/");
	}
	
  @Test
  public void clickRunTest() {
    Assert.assertEquals("Hello&nbsp;World", clickRun());
  }
  
  @Test
  public void setPackageTest() {
	 Assert.assertEquals(setPackage(),"NUnit");
  }
  
  @Test
  public void shareButtonTest() {
    Assert.assertTrue(shareButton());
  }

  @Test
  public void hideSideBarTest() {
    Assert.assertTrue(hideSideBar());
  }

  @Test
  public void checkSaveTest() {
	  Assert.assertTrue(checkSave());
  }

  @Test
  public void checkGettingStartedTest() {
	Assert.assertTrue(checkGettingStarted());
  }

}
