package com.interview.mobilebanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BasePage{

	public static final String CustomerID_Lnk = "//android.view.View[@bounds='[360,226][698,298]']";
	
	@FindBy(xpath=CustomerID_Lnk)
	private WebElement customerID_Link;
	
	public LandingPage(WebDriver driver) {
		super(driver);
	}
	
	public LoginCustomerIDPage clickCustomerIDTab(){
		customerID_Link.click();
		return PageFactory.initElements(driver, LoginCustomerIDPage.class);
	}

}
