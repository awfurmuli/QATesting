package com.qaTesting.base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public Base() {
		initialize();
		expilictWait();
	}
	
	public static WebDriver driver;
	public static WebDriverWait explicitWait;
	public static Actions action;
	
	public void initialize() {
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
	}

	public void globalWait(long seconds) {		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	public void expilictWait() {
		explicitWait = new WebDriverWait(driver, 5);
	}
		
	@BeforeTest
	public void opening() {
		driver.manage().window().maximize();
		action = new Actions(driver);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}




}
