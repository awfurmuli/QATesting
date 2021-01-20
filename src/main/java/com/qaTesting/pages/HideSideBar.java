package com.qaTesting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qaTesting.base.Base;

public class HideSideBar extends Base {
	
	public HideSideBar() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"CodeForm\"]/div[2]/div[2]/div[1]/button[1]")
	WebElement hideIcon;
	
	@FindBy(xpath="//*[@id=\"CodeForm\"]/div[2]/div[1]/span")
	WebElement showIcon;
	
	public boolean hideSideBar() {
		
		hideIcon.click();
		globalWait(5);
		return showIcon.isDisplayed();

	}
	
}
