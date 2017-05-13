package com.interview.mobilebanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginCustomerIDPage extends BasePage {

	public static final String Continue_Btn="//android.widget.Button[@content-desc='Continue']";
	public static final String CustomerID_Input="fldLoginUserId";
	
	public LoginCustomerIDPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id=CustomerID_Input)
	private WebElement customerID_Input;
	
	@FindBy(xpath=Continue_Btn)
	private WebElement continue_Btn;
	
	public void enterCustomerID(String customerID){
		customerID_Input.sendKeys(customerID);
	}
	
	public LoginPasswordPage clickContinue(){
		continue_Btn.click();
		return PageFactory.initElements(driver, LoginPasswordPage.class);
	}
    
}
