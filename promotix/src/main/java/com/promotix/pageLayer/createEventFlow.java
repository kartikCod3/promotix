package com.promotix.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.promotix.testBase.TestBase;

public class createEventFlow extends TestBase{

	public createEventFlow() {
		PageFactory.initElements(driver, this);
	}
	
	//---------------------------------- OBJECT Repo ------------------------------------------
	
	//--------WHAT SCREEN --------
	@FindBy(xpath = "//input[contains(@placeholder,'Name your awesome event...')]")
	private WebElement eventTitle_txtBox ;
	
	//	@FindBy(xpath = "")
	//	private WebElement  eventType_select ;
	
	@FindBy(xpath = "//span[contains(text(),' Save & continue ')]")
	private WebElement  SaveAndContinue_btn ;
	//--------WHEN SCREEN --------
	@FindBy(xpath = "//input[contains(@placeholder,'Choose a date')]")
	private WebElement calender_Box ;

	@FindBy(xpath = "//div[contains(text(),'22')]")
	private WebElement select_Date_From_Calender ;
	
	
	//--------HOW MUCH SCREEN --------
	@FindBy(xpath = "//input[contains(@placeholder,'Name your ticket type...')]")
	private WebElement ticket_Title_Txtbox ;
	//css = "input[class='custom-input ng-pristine ng-invalid ng-touched']"
	//input[contains(@placeholder,'Name your ticket type...')]
	//body/app-root[1]/div[1]/app-create-event-setup[1]/div[1]/div[1]/app-create-event-tickets[1]/div[1]/main[1]/section[2]/app-tickets[1]/form[1]/main[1]/div[1]/section[2]/div[2]/div[1]/div[1]/div[2]/input[3]
	
	@FindBy(xpath = "//input[contains(@formcontrolname,'quantity')]")
	private WebElement qty_Input_box ;
	
	
	
	@FindBy(xpath = "//input[contains(@formcontrolname,'price')]")
	private WebElement price_Input_box ;
	
	
	@FindBy(xpath = "//button[contains(@data-cy,\"create-tickets_save\")]")
	private WebElement HowMuchScrn_SaveAndContinue_btn  ;
	
	//--------START SELLING SCREEN --------
	
	@FindBy(xpath = "//button[contains(@ng-reflect-ng-class,'stripe-btn')])")
	private WebElement StripeConnect_btn ;
	
	@FindBy(xpath = "//button[contains(@id,'skip-account-app')]")
	private WebElement StripeSkipForm_btn ;
	
	@FindBy(xpath = "//span[contains(text() , 'Publish event')]")
	private WebElement PublishEvent_btn ;
	//span[contains(text() , 'Publish event')]
	
	//----------------------------------Action Methods------------------------------------------
	
	
	public void eventTitle_txtBox(String eventName) {
		eventTitle_txtBox.sendKeys(eventName);
	}
	
//	public void clickOnEventType()
//	{
//		eventType_select.click();
//	}
	
	public void clickOnSaveAndContinue_btn()
	{
		SaveAndContinue_btn.click();
	}
	
	public void clickOnCalender_box()
	{
		calender_Box.click();
	}
	
	public void clickOnDateFromCalender_box()
	{
		select_Date_From_Calender.click();
	}
	
	public void ticket_Title_Txtbox(String ticketTitleName) {
		ticket_Title_Txtbox.sendKeys(ticketTitleName);
	}

	public void qty_Input_box(String qtyInput) {
		qty_Input_box.sendKeys(qtyInput);
	}
	
	public void price_Input_box(String priceInput) {
		price_Input_box.sendKeys(priceInput);
	}
	
	public void clickOnHowMuchScrn_SaveAndContinue_btn()
	{
		HowMuchScrn_SaveAndContinue_btn.click();
	}
	
	public void clickOnStripeConnect_btn()
	{
		StripeConnect_btn.click();
	}
	
	public void clickOnStripeSkipForm_btn()
	{
		StripeSkipForm_btn.click();
	}
	
	
	public void clickOnPublishEvent_btn()
	{
		PublishEvent_btn.click();
	}
}
