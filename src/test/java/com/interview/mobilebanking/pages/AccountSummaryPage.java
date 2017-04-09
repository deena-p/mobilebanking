package com.interview.mobilebanking.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	
	
	
	public List<String> getAccountSummaryInfo(){
		//String accountinfo = driver.findElement(By.tagName("content-desc")).getText();
		String accountinfo1 = driver.findElement(By.tagName("name")).getText();
		System.out.println(driver.getPageSource());;
		//System.out.println(accountinfo);
		return null;
	}

}
