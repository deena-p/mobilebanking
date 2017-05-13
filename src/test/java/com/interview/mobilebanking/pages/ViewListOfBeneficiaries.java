package com.interview.mobilebanking.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import objectrepository.AndroidORContants;

public class ViewListOfBeneficiaries extends BasePage{

	public ViewListOfBeneficiaries(WebDriver driver) {
		super(driver);
	}

	@FindBy(id=AndroidORContants.TransactionType_Btn)
	private WebElement transactionType_Btn;

	@FindBy(xpath=AndroidORContants.WithInTheBank_RadioBtn)
	private WebElement withInTheBank_RadioBtn;

	@FindBy(xpath=AndroidORContants.OtherBankNEFTOrIMPS_RadioBtn)
	private WebElement otherBankNEFTOrIMPS_RadioBtn;

	@FindBy(xpath=AndroidORContants.OtherBankRTGS_RadioBtn)
	private WebElement otherBankRTGS_RadioBtn;

	@FindBy(xpath=AndroidORContants.View_Btn)
	private WebElement view_Btn;

	@FindBy(xpath=AndroidORContants.AllInfo_Frame)
	private WebElement allInfo_Frame;


	public void selectTransactionType(String transactionType){
		clickTransactionType();

		if (transactionType.equalsIgnoreCase("WithInTheBank")){
			withInTheBank_RadioBtn.click();
			clickView();
		}else if (transactionType.equalsIgnoreCase("RTGS")){
			otherBankRTGS_RadioBtn.click();
			clickView();
		}else{
			otherBankNEFTOrIMPS_RadioBtn.click();
			clickView();
		}
	}

	public void checkAddedBeneficiariesList(List<String> beneficiaries){
		for (String beneficiary:beneficiaries){
			softAssert.assertEquals(driver.getPageSource().toLowerCase().contains(beneficiary.toLowerCase()), true);
		}
	}

	public ViewListOfBeneficiaries clickTransactionType(){
		transactionType_Btn.click();
		return this;
	}

	public ViewListOfBeneficiaries clickView(){
		view_Btn.click();
		return this;
	}



}
