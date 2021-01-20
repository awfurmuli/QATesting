package com.qaTesting.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaTesting.pages.Save;

public class SaveTest extends Save{

  @Test
  public void checkSaveTest() {
	  Assert.assertTrue(checkSave());
  }
}
