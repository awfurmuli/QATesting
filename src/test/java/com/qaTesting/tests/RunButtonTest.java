package com.qaTesting.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.qaTesting.pages.Run;

public class RunButtonTest extends Run{

  @Test
  public void clickRunTest() {
    Assert.assertEquals("Hello&nbsp;World", clickRun());
  }
  
  
}
