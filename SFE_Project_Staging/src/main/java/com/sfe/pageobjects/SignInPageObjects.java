package com.sfe.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sfe.actiondriver.Action;
import com.sfe.base.BaseClass;
import com.sfe.utility.Log;

public class SignInPageObjects extends BaseClass {
	
	public SignInPageObjects() {
		PageFactory.initElements(getDriver(), this);
	}

	Action action = new Action();

	@FindBy(xpath = "//div[@class=\"mr-auto navbar-nav\"]/child::a[text()='About Us']")
	private WebElement aboutUsBtn;

	@FindBy(xpath = "//div[@class=\"mr-auto navbar-nav\"]/child::a[text()='Courses']")
	private WebElement coursesBtn;

	@FindBy(xpath = "//div[@class=\"mr-auto navbar-nav\"]/child::a[text()='News']")
	private WebElement News;

	@FindBy(xpath = "//div[@class=\"mr-auto navbar-nav\"]/child::a[text()='Sign In']")
	private WebElement signInBtn;

	@FindBy(xpath = "//div[@class=\"mr-auto navbar-nav\"]/child::a[text()='Join Now']")
	private WebElement joinNow;
	
	@FindBy(xpath = "//div[@class=\"desk-logo-bar cursor-pointer nav-bar-logo m-0\"]")
	private WebElement logoSFE;

//		@FindBy(xpath = "//div[@class=\"mr-auto navbar-nav\"]/child::a[text()='Join Now']")
//		private WebElement languages;

//		Dynamic xpath: 

	// div[@class='items-center MuiBox-root
	// css-1guk29']/child::div[text()='English']

	//
//			public  void indexPageBtn (String btnName) {
//					WebElement buttonss = getDriver().findElement(By.xpath("//div[@class='items-center MuiBox-root css-1guk29']/child::div[text()='"+btnName+"']"));
//					action.click(getDriver(), buttonss);
//				}

	@FindBy(xpath = "//button[@class=\"poup-full-length-btn facebook-btn social-btn\"]")
	private WebElement continueWithFacebook;

	@FindBy(xpath = "//input[@id=\"email\"]")
	private WebElement facebookUsername;

	@FindBy(xpath = "//input[@id=\"pass\"]")
	private WebElement facebookPassword;

	@FindBy(xpath = "//button[@id=\"loginbutton\"]")
	private WebElement facebookLogin;

	@FindBy(xpath = "//div[text()=\"Continue with Google\"]")
	private WebElement continueWithGoogle;

	@FindBy(xpath = "//input[@id=\"identifierId\"]")
	private WebElement googleUsername;

	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement googlePassword;

	@FindBy(xpath = "//span[text()=\"Next\"]")
	private WebElement googleNextBtn;

	@FindBy(xpath = "//button[@class=\"poup-full-length-btn sign-btn\"]")
	private WebElement signInViaEmail;

	@FindBy(xpath = "(//input[@id=\"signInFormUsername\"])[2]")
	private WebElement emailUserName;

	@FindBy(xpath = "(//input[@id=\"signInFormPassword\"])[2]")
	private WebElement emailPassword;

	@FindBy(xpath = "(//input[@name=\"signInSubmitButton\"])[2]")
	private WebElement emailSignInBtn;

	@FindBy(xpath = "//button[@class=\"poup-full-length-btn whatsapp-btn social-btn\"]")
	private WebElement continueWithWhatsApp;

	@FindBy(xpath = "//input[@class=\"form-control \"]")
	private WebElement whatsAppNo;

	@FindBy(xpath = "//button[@class=\"poup-full-length-btn sign-btn sign-in-btn\"]")
	private WebElement whatsAppSignInBtn;

	@FindBy(xpath = "//div[text()=\"Continue with Mobile Number\"]")
	private WebElement continueWithMobileNo;

	@FindBy(xpath = "//input[@class=\"form-control \"]")
	private WebElement mobileNo;

	@FindBy(xpath = "//button[@class=\"poup-full-length-btn sign-btn sign-in-btn auth-btn-submit\"]")
	private WebElement mobileSubmitBtn;

	@FindBy(xpath="//a[text()=\"Forgot Password?\"]")
	private WebElement forgotPassword;
	
	@FindBy(xpath="//input[@name=\"email\"]")
	private WebElement resetEmailId;
	
	@FindBy(xpath="//button[text()=\"Submit\"]")
	private WebElement resetEmailSubmitBtn;
	
	@FindBy(xpath="//span[text()=\"Sign Up\"]")
	private WebElement notRegisteredYetSignUp;
	
	@FindBy(xpath="//div[text()=\"Sign - Up\"]")
	private WebElement notRegisteredSignUp;
	

	public boolean validateLogo() {
		return action.isDisplayed(getDriver(), logoSFE);
	}

	public String getSFETitle() {
		String titleSFE = action.getTitle(getDriver());
		return titleSFE;
	}

	public String getSfeUrl() {
		String currenUrl = action.getCurrentURL(getDriver());
		return currenUrl;
	}

	public ProfilePageObjects getEmailSignIn(String uname, String pswd) throws InterruptedException {
		
		Log.startTestCase("Email");
		Log.info("click on SignIn button");
		action.JSClick(getDriver(), signInBtn);
		Thread.sleep(6000);
		Log.info("Click on SignInViaEmail Button");
		action.moveToElement(getDriver(), signInViaEmail);
		action.JSClick(getDriver(), signInViaEmail);
		Log.info("Enter the email username");
		action.type(emailUserName, uname);
		Log.info("Enter the email password");
		action.type(emailPassword, pswd);
		Log.info("click on SignIn");
		action.click(getDriver(), emailSignInBtn);
		Thread.sleep(6000);
		Log.endTestCase("Email");
		return new ProfilePageObjects();
	}

	public ProfilePageObjects getGoogleSignIn(String uname, String pwd) throws InterruptedException {
		Log.startTestCase("Google");
		Log.info("click on SignIn button");
		Thread.sleep(3000);
		action.click(getDriver(), signInBtn);
		Log.info("Click on SignInViaGoogele Button");
		Thread.sleep(2000);
		action.moveToElement(getDriver(), continueWithGoogle);
		action.JSClick(getDriver(), continueWithGoogle);
		Log.info("Enter googleUsernameOrPhoneNumber");
		Thread.sleep(2000);
		action.type(googleUsername, uname);
		Log.info("click on googleNext button");
		action.click(getDriver(), googleNextBtn);
		Thread.sleep(2000);
		Log.info("Enter googlePassword ");
		action.type(googlePassword, pwd);
		Log.info("click on googleNext button");
		Thread.sleep(2000);
		action.JSClick(getDriver(), googleNextBtn);
		Thread.sleep(8000);
		Log.endTestCase("Google");
		return new ProfilePageObjects();
	}

	public ProfilePageObjects getFacebookSignIn(String username, String password) throws InterruptedException {
		Log.startTestCase("Facebook");
		Log.info("click on SignIn button");
		action.click(getDriver(), signInBtn);
		Thread.sleep(3000);
		action.moveToElement(getDriver(), continueWithFacebook);
		Log.info("Click on SignInViaFacebook Button");
		action.click(getDriver(), continueWithFacebook);
		Log.info("Enter the facebookUsernameOrPhoneNumber");
		action.type(facebookUsername, username);
		Log.info("Enter the facebookPassword");
		action.type(facebookPassword, password);
		Log.info("Click on facebookLogin Button");
		action.click(getDriver(), facebookLogin);
		Log.info("Facebook");
		Thread.sleep(8000);
		Log.endTestCase("Facebook");
		return new ProfilePageObjects();
	}

	public void getWhatsAppSign(String wAppNo) throws InterruptedException {
		Log.startTestCase("WhatsApp");
		Log.info("Click on WhatsApp SingIn Button");
		action.click(getDriver(), signInBtn);
		Thread.sleep(3000);
		action.moveToElement(getDriver(), continueWithWhatsApp);
		action.JSClick(getDriver(), continueWithWhatsApp);
		action.type(whatsAppNo, wAppNo);
		Thread.sleep(2000);
		action.JSClick(getDriver(), whatsAppSignInBtn);
		Thread.sleep(3000);
		Log.endTestCase("WhatsApp");
	}

	
	public void getMobileSignIn(String mobNo) throws InterruptedException {
		Log.startTestCase("Mobile");
		Log.info("Click on Mobile SingIn Button");
		action.click(getDriver(), signInBtn);
		Thread.sleep(3000);
		action.moveToElement(getDriver(), continueWithMobileNo);
		action.JSClick(getDriver(), continueWithMobileNo);
		action.type(mobileNo, mobNo);
		Thread.sleep(2000);
		action.moveToElement(getDriver(), mobileSubmitBtn);
		action.JSClick(getDriver(), mobileSubmitBtn);
		Log.endTestCase("Mobile");
		Thread.sleep(4000);
	}
	
	public void getForgotPassword(String email) throws InterruptedException {
		Log.startTestCase("Forgot Password");
		action.click(getDriver(), signInBtn);
		Thread.sleep(3000);
		action.moveToElement(getDriver(), forgotPassword);
		action.click(getDriver(), forgotPassword);
		action.type(resetEmailId, email);
		action.click(getDriver(), resetEmailSubmitBtn);
		Thread.sleep(4000);
		Log.endTestCase("Forgot Password");
	}		
	
	public boolean getNotRegisteredSingUp() throws InterruptedException {
		Log.startTestCase("signup popup");
		action.click(getDriver(), signInBtn);
		Thread.sleep(3000);
		action.moveToElement(getDriver(), notRegisteredYetSignUp);
		action.JSClick(getDriver(), notRegisteredYetSignUp);
		Log.endTestCase("signup popup");
		return action.isDisplayed(getDriver(), notRegisteredSignUp);
		
	
	}
}
