package com.qaTesting.pages;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qaTesting.base.Base;

public class Share extends Base{
	
	public Share() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="Share")
	WebElement shareButton;
	
	@FindBy(xpath="//*[@id='share-dialog']/a[1]")
	WebElement clipBoardButton;
	
	public boolean shareButton() {
		shareButton.click();
		globalWait(5);
		Actions action = new Actions(driver);
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
		
	

}
