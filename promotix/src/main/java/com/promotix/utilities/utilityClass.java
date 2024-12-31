package com.promotix.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.promotix.testBase.TestBase;

public class utilityClass extends TestBase {

	public utilityClass() {
		PageFactory.initElements(driver, this);
	}
	
	public void scrollDown() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, 2000)");
	}
	
	
}
