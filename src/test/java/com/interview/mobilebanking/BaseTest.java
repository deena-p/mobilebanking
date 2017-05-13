package com.interview.mobilebanking;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.interview.mobilebanking.libraries.CommonLibrary;
import com.interview.mobilebanking.pages.LandingPage;
import com.interview.mobilebanking.pages.common.AppFooter;
import com.interview.mobilebanking.pages.common.AppHeader;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseTest extends CommonLibrary{
	protected AndroidDriver<AndroidElement> driver;
    protected WebDriverWait wait;
    private int implicitWaitSeconds = 30;
    private int explicitWaitSeconds = 30;
    protected SoftAssert softAssert = null;
    protected LandingPage landingPage = null;
    protected AppHeader appHeader = null;
    protected AppFooter appFooter = null;

    protected void setupEnvironment() throws MalformedURLException {
        
    	DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "5.0");
        capabilities.setCapability("deviceName", "Samsung");
        capabilities.setCapability("app", "/Users/deenathayalan_p/MobileBankingPOC/com.snapwork.hdfc_2017-02-22.apk");
        capabilities.setCapability("appPackage", "com.snapwork.hdfc");
        capabilities.setCapability("appActivity", "com.snapwork.hdfc.HDFCBank");
        
        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        
        driver.manage().timeouts().implicitlyWait(implicitWaitSeconds, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, explicitWaitSeconds);
        softAssert = new SoftAssert();
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        appHeader = PageFactory.initElements(driver, AppHeader.class);
        appFooter = PageFactory.initElements(driver, AppFooter.class);
    }
}
