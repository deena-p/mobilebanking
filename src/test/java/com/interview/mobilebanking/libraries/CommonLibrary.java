package com.interview.mobilebanking.libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.interview.mobilebanking.pages.AccountHomePage;
import com.interview.mobilebanking.pages.BasePage;
import com.interview.mobilebanking.pages.LandingPage;
import com.interview.mobilebanking.pages.LoginCustomerIDPage;
import com.interview.mobilebanking.pages.LoginPasswordPage;

import io.appium.java_client.AppiumDriver;

public class CommonLibrary {
	private static LandingPage landingPage = null;
	private static LoginCustomerIDPage loginCustomerIDPage = null;
	private static LoginPasswordPage loginPasswordPage = null;
	private static AccountHomePage accountHomePage = null;
	
	public static BasePage loginToApp(WebDriver driver, String userName, String password){
		try {
			landingPage = PageFactory.initElements(driver, LandingPage.class);
			loginCustomerIDPage = landingPage.clickCustomerIDTab();
			loginCustomerIDPage.enterCustomerID(userName);
			loginPasswordPage = loginCustomerIDPage.clickContinue();
			loginPasswordPage.enterPassword(password);
			loginPasswordPage.confirmSecureAccess();
			
			accountHomePage = loginPasswordPage.successfulLogin();
			if (accountHomePage != null){
				return accountHomePage;
			}
			
			loginPasswordPage = loginPasswordPage.failLogin();
			if (loginPasswordPage != null){
				return loginPasswordPage;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	


	public static void scrollUpAppScreen(AppiumDriver<?> driver) {
		try {
			driver.swipe((int) (getScreenWidth(driver)*0.30), (int) (getScreenHeight(driver)*0.70), (int) (getScreenWidth(driver)*0.30), (int)(getScreenHeight(driver)*0.25), 500);
		}
		catch (Exception e) {
			try{
				driver.swipe(getScreenWidth(driver)/2, getScreenHeight(driver)/2+150, getScreenWidth(driver)/2, getScreenHeight(driver)/2-150, 500);
			}catch(Exception f){
				f.printStackTrace();
			}
		}
	}

	public static void scrollDownAppScreen(AppiumDriver<?> driver) {
		try {
			driver.swipe((int) (getScreenWidth(driver)*0.10), (int) (getScreenHeight(driver)*0.25), (int) (getScreenWidth(driver)*0.10), (int)(getScreenHeight(driver)*0.75), 10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static int getScreenWidth(AppiumDriver<?> driver) {
		return driver.manage().window().getSize().getWidth();
	}

	public static int getScreenHeight(AppiumDriver<?> driver) {
		return driver.manage().window().getSize().getHeight();
	}

}
