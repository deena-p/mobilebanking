package com.interview.mobilebanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPasswordPage extends BasePage{

	public static final String Password_Input="upass";
	public static final String ConfirmSecureAccess="chkLogin";
	public static final String Login_Btn="//android.widget.Button[@content-desc='Login']";
	
	public LoginPasswordPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id=Password_Input)
	private WebElement password_Input;
	
	@FindBy(id=ConfirmSecureAccess)
	private WebElement confirmSecureAccess;
	
	@FindBy(xpath=Login_Btn)
	private WebElement login_Btn;
	
	
	public void enterPassword (String password){
		password_Input.sendKeys(password);
	}
	
	public void confirmSecureAccess(){
		confirmSecureAccess.click();
	}
	
	public AccountHomePage login(){
		login_Btn.click();
		return PageFactory.initElements(driver, AccountHomePage.class);
	}

}
