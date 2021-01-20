package com.qaTesting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qaTesting.base.Base;

public class Save extends Base{
	public Save() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="save-button")
	WebElement saveButton;
	
	@FindBy(xpath="//*[@id=\"login-modal\"]/div/div")
	WebElement loginWindow;
	
	public boolean checkSave() {
		
		saveButton.click();
		
		return explicitWait.until(ExpectedConditions.visibilityOf(loginWindow)).isDisplayed();
		
	}
	
}
