package com.qaTesting.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaTesting.pages.GettingStarted;

public class GettingStartedTest extends GettingStarted{

  @Test
  public void checkGettingStartedTest() {
	Assert.assertTrue(checkGettingStarted());
  }
}
