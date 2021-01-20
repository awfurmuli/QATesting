package com.qaTesting.base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public Base() {
		initialize();
		expilictWait();
	}
	
	public static WebDriver driver;
	public static WebDriverWait explicitWait;
	
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
	public void maximize() {
		driver.manage().window().maximize();
		driver.navigate().to("https://dotnetfiddle.net/");
	}
	
	//@AfterTest
	public void closeBrowser() {
		driver.quit();
	}




}
