package com.qaTesting.pages;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qaTesting.base.Base;

public class Fiddle extends Base{

	public Fiddle() {
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
	
	@FindBy (id="Share")
	WebElement shareButton;
	
	@FindBy(xpath="//*[@id='share-dialog']/a[1]")
	WebElement clipBoardButton;
	
	//Actions action = new Actions(driver);

	public boolean shareButton() {
		shareButton.click();
		globalWait(5);
		action.click(clipBoardButton).build().perform();
		Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
		String b= "";
		try {
			b = (String) c.getData(DataFlavor.stringFlavor);
		} catch (UnsupportedFlavorException e) {
		} catch (IOException e) {
			e.printStackTrace();
		}
		return b.startsWith("https://dotnetfiddle.net/");
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

	@FindBy(id="save-button")
	WebElement saveButton;
	@FindBy(xpath="//*[@id=\"login-modal\"]/div/div")
	WebElement loginWindow;
	
	public boolean checkSave() {
		saveButton.click();
		return explicitWait.until(ExpectedConditions.visibilityOf(loginWindow)).isDisplayed();
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
