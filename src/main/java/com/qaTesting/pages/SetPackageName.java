package com.qaTesting.pages;




import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qaTesting.base.Base;

public class SetPackageName extends Base{

	public SetPackageName() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@type='search']")
	WebElement packageNameInput;
	
	@FindBy(xpath="//*[@id='menu']/li[1]/a")
	WebElement packageName;
	
	@FindBy(xpath="//*[@version-name='3.12.0.0' and @package-id='NUnit']")
	WebElement packageVersion;
	
	@FindBy(xpath="//*[@package-id='NUnit']")
	WebElement selectedPackageName;
	
	
	public String setPackage() {
		packageNameInput.sendKeys("NUnit",Keys.ENTER);
		
		Actions action = new Actions(driver);
		globalWait(5);
		action.click(packageName).build().perform();
		globalWait(7);
		action.click(packageVersion).build().perform();
		
		return selectedPackageName.getAttribute("innerText");
	}
	
}
