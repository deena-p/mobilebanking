package com.interview.mobilebanking.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ViewListOfBeneficiaries extends BasePage{
	
	public static final String TransactionType_Btn="fldBeneType";
	public static final String View_Btn="//android.widget.Button[@index='5']";
	public static final String WithInTheBank_RadioBtn="//android.widget.CheckedTextView[@index=1]";
	public static final String OtherBankNEFTOrIMPS_RadioBtn="//android.widget.CheckedTextView[@index=2]";
	public static final String OtherBankRTGS_RadioBtn="//android.widget.CheckedTextView[@index=3]";
	
	//All information from the page
	public static final String AllInfo_Frame="//android.view.View[@index='0']";
	
	//Ben. Type
	public static final String BeneficiaryType_Txt="//android.view.View[@content-desc='Beneficiary Type']"; //index 1
	
	public static final String BeneficiaryAccountNo_Txt="//android.view.View[@content-desc='Beneficiary Account No.']"; //index 4
	public static final String BeneficiaryName_Txt="//android.view.View[@content-desc='Name / Nickname']"; //index 4
	public static final String BeneficiaryEmailID_Txt="//android.view.View[@content-desc='Email ID']"; //index 8
	public static final String BeneficiaryStatus_Txt="//android.view.View[@content-desc='Status']"; //index 10
	
	Select dropdown;
	//select transaction type dropdown - android.widget.Spinner - fldBeneType - ID
	//values - Transfer within the bank, Transfer to other bank NEFT, Transfer to other bank using RTGS
	//view button - android.widget.Button - View - index 5
	
	public ViewListOfBeneficiaries(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id=TransactionType_Btn)
	private WebElement transactionType_Btn;
	
	@FindBy(xpath=WithInTheBank_RadioBtn)
	private WebElement withInTheBank_RadioBtn;
	
	@FindBy(xpath=OtherBankNEFTOrIMPS_RadioBtn)
	private WebElement otherBankNEFTOrIMPS_RadioBtn;
	
	@FindBy(xpath=OtherBankRTGS_RadioBtn)
	private WebElement otherBankRTGS_RadioBtn;
	
	@FindBy(xpath=View_Btn)
	private WebElement view_Btn;
	
	@FindBy(xpath=AllInfo_Frame)
	private WebElement allInfo_Frame;

	/*public void selectTransactionType(String transactionType){
		dropdown = new Select(transactionType_Dropdown);
		
		if (transactionType.equalsIgnoreCase("WithInTheBank")){
			dropdown.selectByIndex(0);
		}else if (transactionType.equalsIgnoreCase("NEFT")){
			dropdown.selectByIndex(1);
		}else{
			dropdown.selectByIndex(2);
		}
	}*/
	
	public void selectTransactionType(String transactionType){
		transactionType_Btn.click();
		
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
			//softAssert.assertEquals(driver.getPageSource().toLowerCase(), beneficiary.toLowerCase());
			if (!driver.getPageSource().toLowerCase().contains(beneficiary.toLowerCase())){
				System.out.println(beneficiary + " account is not available");
			}
		}
	}
	
	public void clickView(){
		view_Btn.click();
	}
	
	
	
}
