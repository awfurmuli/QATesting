package com.qaTesting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qaTesting.base.Base;

public class Run extends Base{

	public Run() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="run-button")
	WebElement runButton;
	
	@FindBy(xpath="//*[@id='output']")
	WebElement console;
	
	public String clickRun() {
		runButton.click();
		return console.getAttribute("innerHTML");
	}
}
