package com.interview.mobilebanking.pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


public class BasePage {

	public static final String Logout_Btn="//android.view.View[@index='1']";
	public static final String MyMenu_Btn="mymenuI";
	public static final String FundsTrasfer_Btn="rrftr01I";
	public SoftAssert softAssert;
	public Alert alert;
	public WebDriverWait wait;
	private int explicitWaitSeconds = 30;
	
	protected WebDriver driver;	
	
	@FindBy(xpath=Logout_Btn)
	private WebElement logout_Btn;
	
	@FindBy(id=MyMenu_Btn)
	private WebElement myMenu_Btn;
	
	@FindBy(id=FundsTrasfer_Btn)
	private WebElement fundsTrasfer_Btn;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        softAssert = new SoftAssert();
        wait = new WebDriverWait(driver, explicitWaitSeconds);
    }
    
    
    public void logout(){
		logout_Btn.click();
	}
	
	public AccountHomePage clickMyMenu(){
		myMenu_Btn.click();
		return PageFactory.initElements(driver, AccountHomePage.class);
	}
	
	public ThirdPartyTransferPage clickFundsTransfer(){
		fundsTrasfer_Btn.click();
		return PageFactory.initElements(driver, ThirdPartyTransferPage.class);
	}

    
}
