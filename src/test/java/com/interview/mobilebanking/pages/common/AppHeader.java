package com.interview.mobilebanking.pages.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interview.mobilebanking.pages.BasePage;
import com.interview.mobilebanking.pages.LoginMethodPage;

import objectrepository.AndroidORContants;

public class AppHeader extends BasePage{
	
	public AppHeader(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath=AndroidORContants.Logout_Btn)
	private WebElement logout_Btn;

	@FindBy(xpath=AndroidORContants.OK_Btn)
	private WebElement alert_OK_Btn;
	
	public LoginMethodPage logout(){
		if (logout_Btn != null){
			logout_Btn.click();
			if (alert_OK_Btn!=null){
				while(true){
					try{
						alert_OK_Btn.click();
						break;
					}catch(Exception e){
						continue;
					}
				}
			}
		}

		return PageFactory.initElements(driver, LoginMethodPage.class);
	}

}
