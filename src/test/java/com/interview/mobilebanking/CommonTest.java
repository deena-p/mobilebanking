package com.interview.mobilebanking;

import java.util.Arrays;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.interview.mobilebanking.pages.AccountHomePage;
import com.interview.mobilebanking.pages.AccountSummaryPage;
import com.interview.mobilebanking.pages.BasePage;
import com.interview.mobilebanking.pages.LoginPasswordPage;
import com.interview.mobilebanking.pages.ThirdPartyTransferPage;
import com.interview.mobilebanking.pages.ViewListOfBeneficiaries;

public class CommonTest extends DriverSetup{
	
	private String customerID = "";
	private String password = "";
	private BasePage basePage = null;
	private AccountSummaryPage accountSummaryPage = null;
	private AccountHomePage accountHomePage = null;
	private static LoginPasswordPage loginPasswordPage = null;
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
    		basePage.logout();
		} catch (Exception e) {
			System.out.println("Logout already done");
		}
    }
    
    @AfterClass
    public void closeDriver() throws Exception {
    	driver.quit();
    }

    @Test(enabled=true)
    public void login_Test() {
    	try {
    		if (loginToApp(driver,customerID,password) == accountHomePage){
    			softAssert.assertSame(loginToApp(driver,customerID,password), accountHomePage);
        		accountHomePage.logout();	
    		}else{
       			softAssert.assertSame(loginToApp(driver,customerID,password), loginPasswordPage);
    		}
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
    
    @Test(enabled=false)
    public void accountSummary_Test(){
    	try {
    		accountHomePage = (AccountHomePage) loginToApp(driver,customerID,password);
        	accountSummaryPage = accountHomePage.clickAccountSummaryLink();
        	accountSummaryPage.verifyAccountSummaryInfo(accountName, accountBalance, accountNo, branch);
        	accountSummaryPage.logout();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    @Test(enabled=false)
    public void listOfAddedBenefiaries_Test(){
    	try {
    		accountHomePage = (AccountHomePage) loginToApp(driver,customerID,password);
    		thirdPartyTransferPage = accountHomePage.clickFundsTransfer();
    		scrollUpAppScreen(driver);
    		scrollUpAppScreen(driver);
    		viewListOfBeneficiaries = thirdPartyTransferPage.clickViewListOfBeneficiaries_Btn();
    		viewListOfBeneficiaries.selectTransactionType("WithInTheBank");
    		viewListOfBeneficiaries.checkAddedBeneficiariesList(Arrays.asList(befeficiaries));
    		viewListOfBeneficiaries.logout();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    
    
    
    

}
