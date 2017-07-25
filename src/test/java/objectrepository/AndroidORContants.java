package objectrepository;

public class AndroidORContants {
	
	//Base page - Common elements
	public static final String Logout_Btn="//android.view.View[@bounds='[618,0][720,92]']";
	public static final String MyMenu_Btn="mymenuI";
	public static final String FundsTrasfer_Btn="rrftr01I";
	public static final	String OK_Btn="//android.widget.Button[@text='OK']";
	
	//Landing Page
	public static final String CustomerID_Lnk = "//android.view.View[@bounds='[360,226][698,298]']";
	
	//Login customer id page
	public static final String Continue_Btn="//android.widget.Button[@content-desc='Continue']";
	public static final String CustomerID_Input="fldLoginUserId";
	
	//Login Password page
	public static final String Password_Input="upass";
	public static final String ConfirmSecureAccess="chkLogin";
	public static final String Login_Btn="//android.widget.Button[@content-desc='Login']";
	public static final String Alert_Title="android:id/alertTitle";
	public static final String Alert_Message="android:id/message";
	public static final String AlertOK_Button="android:id/button1";
	
	//Account home page
	public static final String AccountSummary_Lnk="//android.view.View[@content-desc='Account Summary']";
	
	//Account summary page
	public static final String AccountSummaryInfo="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]";

	//Third Party transfer page
	public static final String ViewListOfBeneficiaries_Btn = "//android.view.View[@index='18']";
	
	//View list of beneficiaries page
	public static final String TransactionType_Btn="fldBeneType";
	public static final String View_Btn="//android.widget.Button[@index='5']";
	public static final String WithInTheBank_RadioBtn="//android.widget.CheckedTextView[@index=1]";
	public static final String OtherBankNEFTOrIMPS_RadioBtn="//android.widget.CheckedTextView[@index=2]";
	public static final String OtherBankRTGS_RadioBtn="//android.widget.CheckedTextView[@index=3]";
	public static final String AllInfo_Frame="//android.view.View[@index='0']";
	
}
