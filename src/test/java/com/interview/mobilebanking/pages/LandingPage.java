package com.interview.mobilebanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import objectrepository.AndroidORContants;

public class LandingPage extends BasePage{
	
	@FindBy(xpath=AndroidORContants.CustomerID_Lnk)
	private WebElement customerID_Link;
	
	public LandingPage(WebDriver driver) {
		super(driver);
	}
	
	public LoginMethodPage clickCustomerIDTab(){
		customerID_Link.click();
		return PageFactory.initElements(driver, LoginMethodPage.class);
	}

}
