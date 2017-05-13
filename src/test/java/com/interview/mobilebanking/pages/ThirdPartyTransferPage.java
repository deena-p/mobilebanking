package com.interview.mobilebanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import objectrepository.AndroidORContants;

public class ThirdPartyTransferPage extends BasePage {
	
	@FindBy(xpath=AndroidORContants.ViewListOfBeneficiaries_Btn)
	private WebElement viewListOfBeneficiaries_Btn;
	
	public ThirdPartyTransferPage(WebDriver driver) {
		super(driver);
	}
	
	public ViewListOfBeneficiaries clickViewListOfBeneficiaries_Btn(){
		
		viewListOfBeneficiaries_Btn.click();
		return PageFactory.initElements(driver, ViewListOfBeneficiaries.class);
	}
	

}
