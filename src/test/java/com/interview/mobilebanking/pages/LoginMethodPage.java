package com.interview.mobilebanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import objectrepository.AndroidORContants;

public class LoginMethodPage extends BasePage {
	
	public LoginMethodPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id=AndroidORContants.CustomerID_Input)
	private WebElement customerID_Input;
	
	@FindBy(xpath=AndroidORContants.Continue_Btn)
	private WebElement continue_Btn;
	
	public LoginMethodPage enterCustomerID(String customerID){
		customerID_Input.sendKeys(customerID);
		return this;
	}
	
	public LoginPasswordPage clickContinue(){
		continue_Btn.click();
		return PageFactory.initElements(driver, LoginPasswordPage.class);
	}
    
}
