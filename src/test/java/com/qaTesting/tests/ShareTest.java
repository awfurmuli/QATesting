package com.qaTesting.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaTesting.pages.Share;

public class ShareTest extends Share {

  @Test
  public void shareButtonTest() {
    Assert.assertTrue(shareButton());
  }
}
