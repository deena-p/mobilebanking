package com.interview.mobilebanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class AccountSummaryPage extends BasePage{

	////android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]
	//android.view.View index 0
	//SAVINGSAccount No.03231610046870Available Balance11,090.61BranchMYLAPORENameDEENATHAYALAN PCurrencyINR
	
	public static final String AccountSummaryInfo="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]";
	
	public AccountSummaryPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath=AccountSummaryInfo)
	private WebElement accountSummaryInfo;
	

	
	
	
	public void verifyAccountSummaryInfo(String accountName, String accountBalance, String accountNo, String accountBranch){

		/*softAssert.assertEquals(driver.getPageSource().toLowerCase(), accountName.toLowerCase());
		softAssert.assertEquals(driver.getPageSource().toLowerCase(), accountBalance.toLowerCase());
		softAssert.assertEquals(driver.getPageSource().toLowerCase(), accountNo.toLowerCase());
		softAssert.assertEquals(driver.getPageSource().toLowerCase(), accountBranch.toLowerCase());*/
		
		if (!driver.getPageSource().toLowerCase().contains(accountName.toLowerCase())){
			System.out.println("Account name is incorrect");
		}
		
		if (!driver.getPageSource().toLowerCase().contains(accountBalance.toLowerCase())){
			System.out.println("Account Balancec is incorrect");
		}
		
		if (!driver.getPageSource().toLowerCase().contains(accountNo.toLowerCase())){
			System.out.println("Account No is incorrect");
		}
		
		if (!driver.getPageSource().toLowerCase().contains(accountBranch.toLowerCase())){
			System.out.println("Bank Branch is incorrect");
		}
		
	}

}
