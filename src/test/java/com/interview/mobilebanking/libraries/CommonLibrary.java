package com.interview.mobilebanking.libraries;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class CommonLibrary {

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
	
	public boolean isAlertPresent(WebElement element){
		//Alert
		return false;
	}

}
