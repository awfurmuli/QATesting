package com.qaTesting.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaTesting.pages.HideSideBar;

public class HideSideBarTest extends HideSideBar{

  @Test
  public void hideSideBarTest() {
    Assert.assertTrue(hideSideBar());
  }
}
