package com.promotix.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.promotix.testBase.TestBase;

public class LoginPage extends TestBase{

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//------ OBJECT Repo -------
	@FindBy(xpath="//input[@id='email']")
	private WebElement email_txtbox ;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password_txtbox ;
	
	@FindBy(xpath="//span[contains(text(),'Login')]")
	private WebElement login_btn ;
	
	//----------Action Methods---------
	
	public void enterEmail(String emailid) {
		email_txtbox.sendKeys(emailid);
	}
	
	public void enterPassword(String password) {
		password_txtbox.sendKeys(password);
	}
	public void clickOnLoginBtn() {
		login_btn.click();
	}
	
	
}
