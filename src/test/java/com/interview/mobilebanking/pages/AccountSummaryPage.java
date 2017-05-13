package com.interview.mobilebanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import objectrepository.AndroidORContants;

public class AccountSummaryPage extends BasePage{


	public AccountSummaryPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath=AndroidORContants.AccountSummaryInfo)
	private WebElement accountSummaryInfo;


	public void verifyAccountSummaryInfo(String accountName, String accountBalance, String accountNo, String accountBranch){

		softAssert.assertEquals(driver.getPageSource().toLowerCase().contains(accountName.toLowerCase()), true);
		softAssert.assertEquals(driver.getPageSource().toLowerCase().contains(accountBalance.toLowerCase()), true);
		softAssert.assertEquals(driver.getPageSource().toLowerCase().contains(accountNo.toLowerCase()), true);
		softAssert.assertEquals(driver.getPageSource().toLowerCase().contains(accountBranch.toLowerCase()), true);


	}

}
