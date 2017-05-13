package com.interview.mobilebanking.pages.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interview.mobilebanking.pages.AccountHomePage;
import com.interview.mobilebanking.pages.BasePage;
import com.interview.mobilebanking.pages.ThirdPartyTransferPage;

import objectrepository.AndroidORContants;

public class AppFooter extends BasePage{

	public AppFooter(WebDriver driver) {
		super(driver);
	}

	@FindBy(id=AndroidORContants.MyMenu_Btn)
	private WebElement myMenu_Btn;

	@FindBy(id=AndroidORContants.FundsTrasfer_Btn)
	private WebElement fundsTrasfer_Btn;
	
	
	public AccountHomePage clickMyMenu(){
		myMenu_Btn.click();
		return PageFactory.initElements(driver, AccountHomePage.class);
	}

	public ThirdPartyTransferPage clickFundsTransfer(){
		fundsTrasfer_Btn.click();
		return PageFactory.initElements(driver, ThirdPartyTransferPage.class);
	}
	
}
