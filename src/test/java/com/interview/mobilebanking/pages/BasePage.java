package com.interview.mobilebanking.pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


public class BasePage {
	
	public SoftAssert softAssert;
	public Alert alert;
	public WebDriverWait wait;
	private int explicitWaitSeconds = 10;

	protected WebDriver driver;	

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		softAssert = new SoftAssert();
		wait = new WebDriverWait(driver, explicitWaitSeconds);
	}


}
