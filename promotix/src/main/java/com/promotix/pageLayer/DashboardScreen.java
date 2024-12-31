package com.promotix.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.promotix.testBase.TestBase;

public class DashboardScreen extends TestBase{

	
	public DashboardScreen() {
		PageFactory.initElements(driver, this);
	}
	
	//------ OBJECT Repo -------
	
	@FindBy(xpath = "//a[contains(text(),'Dashboard')]")
	private WebElement verifyLogin ;
	
	@FindBy(css = "div[class='my-events-upload-image my-events-select-box position-relative align-items-center justify-content-center cursor-pointer add-new-event ng-star-inserted']")
	private WebElement  AddNewEvent_btn ;
	
	//className = "my-events-upload-image my-events-select-box position-relative align-items-center justify-content-center cursor-pointer add-new-event ng-star-inserted"
	//i[contains(@class , 'fa fa-plus custom-color-orange mr-2')]
	//img[contains(@alt,'Add new event icon')]
	//span[contains(text(),' Add event ')]
	//button[contains(@type , 'button')] [1]
	
	//----------Action Methods---------
	
	public String verifyLogin() {
		String txt = verifyLogin.getText();
		return txt ;
	}
	
	public void clickOnAddNewEventBtn() {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/app-root[1]/div[1]/app-my-events[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")));
		//element.click();
		AddNewEvent_btn.click();
		//AddNewEvent_btn.click();
	}
	
	
	
	
	
	
}
