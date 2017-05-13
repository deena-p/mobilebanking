package com.interview.mobilebanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import objectrepository.AndroidORContants;

public class LoginPasswordPage extends BasePage{


	public LoginPasswordPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id=AndroidORContants.Password_Input)
	private WebElement password_Input;

	@FindBy(id=AndroidORContants.ConfirmSecureAccess)
	private WebElement confirmSecureAccess;

	@FindBy(xpath=AndroidORContants.Login_Btn)
	private WebElement login_Btn;

	@FindBy(id=AndroidORContants.Alert_Title)
	private WebElement alertTitle;

	@FindBy(id=AndroidORContants.AlertOK_Button)
	private WebElement alertOK_Button;

	@FindBy(id=AndroidORContants.Alert_Message)
	private WebElement alert_Message;

	public LoginPasswordPage enterPassword (String password){
		password_Input.sendKeys(password);
		return this;
	}

	public LoginPasswordPage confirmSecureAccess(){
		confirmSecureAccess.click();
		return this;
	}

	private void clickLoginButton(){
		login_Btn.click();
	}

	private void clickAlertOKButton(){
		try {
			if (alertOK_Button != null){
				alertOK_Button.click();;
			}
		} catch (Exception e) {
			//
		}
	}

	public AccountHomePage successfulLogin(){
		try {
			clickLoginButton();
			clickAlertOKButton();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public LoginPasswordPage failLogin(){
		try {
			clickLoginButton();
			clickAlertOKButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

}
