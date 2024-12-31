package com.promotix.testLayer;

import org.testng.annotations.Test;

import com.promotix.pageLayer.DashboardScreen;
import com.promotix.pageLayer.LoginPage;
import com.promotix.pageLayer.createEventFlow;
import com.promotix.testBase.TestBase;
import com.promotix.utilities.utilityClass;

public class createNewEventTest extends TestBase{

	@Test
	public void verifyNewEvent () throws InterruptedException {
		
		DashboardScreen homeScreen = new DashboardScreen();
		createEventFlow whatScreen = new createEventFlow();
		createEventFlow whereScreen = new createEventFlow();
		createEventFlow whenScreen = new createEventFlow();
		createEventFlow howMuchScreen = new createEventFlow();
		createEventFlow startSellingScreen = new createEventFlow();
		utilityClass scroll_Down =  new utilityClass();
		LoginPage login = new LoginPage();
		login.enterEmail("kartik.mude+03@ksolves.com");
		login.enterPassword("Test@123");
		Thread.sleep(2000);
		login.clickOnLoginBtn();
		Thread.sleep(15000);
		homeScreen.clickOnAddNewEventBtn();
		Thread.sleep(3000);
		//driver. navigate(). refresh();
		//Thread.sleep(1000);
		
		//--------WHAT SCREEN --------
		whatScreen.eventTitle_txtBox("TEST EVENT 1");
		//whatScreen.clickOnEventType();
		whatScreen.clickOnSaveAndContinue_btn();
		Thread.sleep(3000);
	 
		//--------WHERE SCREEN --------
		whereScreen.clickOnSaveAndContinue_btn();
		Thread.sleep(3000);
		
		//--------WHEN SCREEN --------
		whenScreen.clickOnCalender_box();
		Thread.sleep(2000);
		whenScreen.clickOnDateFromCalender_box();
		whenScreen.clickOnSaveAndContinue_btn();
		Thread.sleep(500);
		
		
		//--------HOW MUCH SCREEN --------
		howMuchScreen.ticket_Title_Txtbox("In - Person Ticket Type");
		howMuchScreen.qty_Input_box("50");
		howMuchScreen.price_Input_box("25.25");
		howMuchScreen.clickOnHowMuchScrn_SaveAndContinue_btn();
		Thread.sleep(1000);
		
		
		//--------START SELLING SCREEN --------

		scroll_Down.scrollDown();
		Thread.sleep(3000);
		startSellingScreen.clickOnStripeConnect_btn();
		Thread.sleep(4000);
		startSellingScreen.clickOnStripeSkipForm_btn();
		Thread.sleep(5000);
		
		startSellingScreen.clickOnPublishEvent_btn();
		//Thread.sleep(5000);
	}
}
