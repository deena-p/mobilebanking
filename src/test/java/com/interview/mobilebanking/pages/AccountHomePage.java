package com.interview.mobilebanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountHomePage extends BasePage{

	public static final String AccountSummary_Lnk="//android.view.View[@content-desc='Account Summary']";
	//android.view.View - Account Summary - index 5 - bounds [0,192][720,772] - android.view.View - index 0
	
	
	
	//Accounts = rrasm01I = id
		
	public AccountHomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath=AccountSummary_Lnk)
	private WebElement accountSummary_Lnk;
	
	public AccountSummaryPage clickAccountSummaryLink(){
		accountSummary_Lnk.click();
		return PageFactory.initElements(driver, AccountSummaryPage.class);
	}
	
	

}
