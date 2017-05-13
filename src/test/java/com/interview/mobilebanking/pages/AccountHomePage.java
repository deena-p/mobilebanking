package com.interview.mobilebanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import objectrepository.AndroidORContants;

public class AccountHomePage extends BasePage{
		
	public AccountHomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath=AndroidORContants.AccountSummary_Lnk)
	private WebElement accountSummary_Lnk;
	
	public AccountSummaryPage clickAccountSummaryLink(){
		accountSummary_Lnk.click();
		return PageFactory.initElements(driver, AccountSummaryPage.class);
	}
	
	

}
