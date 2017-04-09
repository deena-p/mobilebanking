package com.interview.mobilebanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdPartyTransferPage extends BasePage {

	public static final String ViewListOfBeneficiaries_Btn = "//android.view.View[@index='18']";
	//view List of Beneficiaries - android.view.View - View List of Beneficiaries - index 18
	
	@FindBy(xpath=ViewListOfBeneficiaries_Btn)
	private WebElement viewListOfBeneficiaries_Btn;
	
	public ThirdPartyTransferPage(WebDriver driver) {
		super(driver);
	}
	
	public ViewListOfBeneficiaries clickViewListOfBeneficiaries_Btn(){
		
		viewListOfBeneficiaries_Btn.click();
		return PageFactory.initElements(driver, ViewListOfBeneficiaries.class);
	}
	

}
