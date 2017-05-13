package com.interview.mobilebanking;

import java.util.Arrays;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.interview.mobilebanking.pages.AccountHomePage;
import com.interview.mobilebanking.pages.AccountSummaryPage;
import com.interview.mobilebanking.pages.LoginMethodPage;
import com.interview.mobilebanking.pages.LoginPasswordPage;
import com.interview.mobilebanking.pages.ThirdPartyTransferPage;
import com.interview.mobilebanking.pages.ViewListOfBeneficiaries;
import com.interview.mobilebanking.pages.common.AppFooter;
import com.interview.mobilebanking.pages.common.AppHeader;

public class CommonTest extends BaseTest{

	private String customerID = "21820290";
	private String password = "sdfsdfsdfsd";
	private AccountSummaryPage accountSummaryPage = null;
	private AccountHomePage accountHomePage = null;
	
	private LoginMethodPage loginMethodPage = null;
	private LoginPasswordPage loginPasswordPage = null;
	private ThirdPartyTransferPage thirdPartyTransferPage = null;
	private ViewListOfBeneficiaries viewListOfBeneficiaries = null;
	private String accountNo = "03231610046870";
	private String accountName = "DEENATHAYALAN P";
	private String accountBalance = "11,090.62";
	private String branch = "MYLAPORE";
	private String befeficiaries[] = {"Ajitha","Edwin","vindi"};


	@BeforeClass
	public void setUp() throws Exception {
		setupEnvironment();
	}

	@AfterMethod
	public void logout() {
		try {
			appHeader.logout();
		} catch (Exception e) {
			System.out.println("Logout already done");
		}
	}

	@AfterClass
	public void closeDriver() throws Exception {
		driver.quit();
	}

	@Test(enabled=true)
	public void validLogin_Test() {
		try {
			loginMethodPage = landingPage.clickCustomerIDTab();
			loginPasswordPage = loginMethodPage.enterCustomerID(customerID)
					.clickContinue();
			loginPasswordPage.enterPassword(password)
			.confirmSecureAccess()
			.successfulLogin();
			appHeader.logout();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(enabled=false)
	public void invalidLogin_Test() {
		try {
			loginMethodPage = landingPage.clickCustomerIDTab();
			loginPasswordPage = loginMethodPage.enterCustomerID(customerID)
					.clickContinue();
			loginPasswordPage.enterPassword(password)
			.confirmSecureAccess()
			.failLogin();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(enabled=false)
	public void accountSummary_Test(){
		try {
			loginMethodPage = landingPage.clickCustomerIDTab();
			loginPasswordPage = loginMethodPage.enterCustomerID(customerID)
					.clickContinue();
			accountHomePage = loginPasswordPage.enterPassword(password)
					.confirmSecureAccess()
					.successfulLogin();
			accountSummaryPage = accountHomePage.clickAccountSummaryLink();
			accountSummaryPage.verifyAccountSummaryInfo(accountName, accountBalance, accountNo, branch);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(enabled=false)
	public void listOfAddedBenefiaries_Test(){
		try {
			loginMethodPage = landingPage.clickCustomerIDTab();
			loginPasswordPage = loginMethodPage.enterCustomerID(customerID)
					.clickContinue();
			accountHomePage = loginPasswordPage.enterPassword(password)
					.confirmSecureAccess()
					.successfulLogin();
			thirdPartyTransferPage = appFooter.clickFundsTransfer();
			scrollUpAppScreen(driver);
			scrollUpAppScreen(driver);
			viewListOfBeneficiaries = thirdPartyTransferPage.clickViewListOfBeneficiaries_Btn();
			viewListOfBeneficiaries.selectTransactionType("WithInTheBank");
			viewListOfBeneficiaries.checkAddedBeneficiariesList(Arrays.asList(befeficiaries));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
