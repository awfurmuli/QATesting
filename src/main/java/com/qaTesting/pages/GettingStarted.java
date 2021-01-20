package com.qaTesting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qaTesting.base.Base;

public class GettingStarted extends Base{

	public GettingStarted() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText="Getting")
	WebElement gettingStartedButton;
	@FindBy(partialLinkText="Back")
	WebElement backToEditorButton;
	
	public boolean checkGettingStarted() {
		gettingStartedButton.click();
		globalWait(5);
		return backToEditorButton.isDisplayed();
		
	}
	
}
