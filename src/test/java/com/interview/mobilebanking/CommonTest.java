package com.interview.mobilebanking;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.interview.mobilebanking.pages.AccountHomePage;
import com.interview.mobilebanking.pages.AccountSummaryPage;
import com.interview.mobilebanking.pages.BasePage;
import com.interview.mobilebanking.pages.ThirdPartyTransferPage;
import com.interview.mobilebanking.pages.ViewListOfBeneficiaries;

public class CommonTest extends DriverSetup{
	
	private String customerID = "21820290";
	private String password = "milkyearth(8$";
	private BasePage basePage = null;
	private AccountSummaryPage accountSummaryPage = null;
	private AccountHomePage accountHomePage = null;
	private ThirdPartyTransferPage thirdPartyTransferPage = null;
	private ViewListOfBeneficiaries viewListOfBeneficiaries = null;
	
	
    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
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

    @Test(enabled=false)
    public void login_Test() {
    	try {
    		accountHomePage = loginToApp(driver,customerID,password);
    		accountHomePage.logout();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
    
    @Test
    public void accountSummary_Test(){
    	try {
    		accountHomePage = loginToApp(driver,customerID,password);
        	accountSummaryPage = accountHomePage.clickAccountSummaryLink();
        	accountSummaryPage.getAccountSummaryInfo();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    @Test(enabled=false)
    public void listOfAddedBenefiaries_Test(){
    	try {
    		accountHomePage = loginToApp(driver,customerID,password);
    		thirdPartyTransferPage = accountHomePage.clickFundsTransfer();
    		scrollUpAppScreen(driver);
    		scrollUpAppScreen(driver);
    		viewListOfBeneficiaries = thirdPartyTransferPage.clickViewListOfBeneficiaries_Btn();
    		viewListOfBeneficiaries.selectTransactionType("WithInTheBank");
    		viewListOfBeneficiaries.getBeneficiariesDetails();
    		viewListOfBeneficiaries.logout();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    
    
    
    

}
