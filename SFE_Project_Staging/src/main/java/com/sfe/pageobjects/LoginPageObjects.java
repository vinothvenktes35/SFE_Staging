package com.sfe.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sfe.actiondriver.Action;
import com.sfe.base.BaseClass;
import com.sfe.utility.Log;

public class LoginPageObjects extends BaseClass {

	public LoginPageObjects() {
		PageFactory.initElements(getDriver(), this);
	}

	Action action = new Action();
	@FindBy(xpath = "//div[@class=\"mr-auto navbar-nav\"]/child::a[text()=\"Sign Up\"]")
	private WebElement signUpBtn;

	@FindBy(xpath = "//div[text()=\"Continue with Facebook\"]")
	private WebElement continueWithFacebook;

	@FindBy(xpath = "//input[@id=\"email\"]")
	private WebElement facebookUsername;

	@FindBy(xpath = "//input[@id=\"pass\"]")
	private WebElement facebookPassword;

	@FindBy(xpath = "//button[text()=\"Log In\"]")
	private WebElement facebookLogin;

	@FindBy(xpath = "//div[text()=\"Continue with Google\"]")
	private WebElement continueWithGoogle;

	@FindBy(xpath = "//input[@name=\"identifier\"]")
	private WebElement googleUsername;

	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement googlePassword;

	@FindBy(xpath = "//span[text()=\"Next\"]")
	private WebElement googleNextBtn;

	@FindBy(xpath = "//div[text()=\"Continue with WhatsApp\"]")
	private WebElement continueWithWhatsApp;

	@FindBy(xpath = "//input[@class=\"form-control \"]")
	private WebElement whatsAppNo;

	@FindBy(xpath = "//input[@name=\"first_name\"]")
	private WebElement whatsAppFirstName;

	@FindBy(xpath = "//input[@name=\"last_name\"]")
	private WebElement whatsAppLastName;

	@FindBy(xpath = "//button[text()=\"Sign - Up\"]")
	private WebElement whatsAppSignUp;

	@FindBy(xpath = "(//button[@class=\"poup-full-length-btn google-btn social-btn\"])[2]")
	private WebElement continueWithMobile;

	@FindBy(xpath = "//input[@class=\"form-control \"]")
	private WebElement mobileNo;

	@FindBy(xpath = "//input[@name=\"first_name\"]")
	private WebElement mobileFirstName;

	@FindBy(xpath = "//input[@name=\"last_name\"]")
	private WebElement mobileLastName;

	@FindBy(xpath = "//button[text()=\"Submit\"]")
	private WebElement mobileSubmitBtn;

	@FindBy(xpath = "//button[@class=\"poup-full-length-btn sign-btn\"]")
	private WebElement signUpViaEmail;

	@FindBy(xpath = "//input[@name=\"email\"]")
	private WebElement emailUsername;

	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement emailPassword;

	@FindBy(xpath = "//img[@src=\"assets/icons/visibility_off_black_24dp.svg\"]")
	private WebElement emailPasswordShowHideIcon;

	@FindBy(xpath = "//input[@name=\"first_name\"]")
	private WebElement emailFirstName;

	@FindBy(xpath = "//input[@name=\"last_name\"]")
	private WebElement emailLastName;

	@FindBy(xpath = "(//div[@class=\"MuiFormGroup-root mb-4 css-1h7anqn\"]/child::label/span/input)[1]")
	private WebElement termsOfUseCheckBox;

	@FindBy(xpath = "(//input[@class=\"PrivateSwitchBase-input css-1m9pwf3\"])[2]")
	private WebElement privacyPolicyCheckBox;

	@FindBy(xpath = "//button[@type=\"submit\" and @class=\"poup-full-length-btn sign-btn mb-3 auth-btn-submit\"]")
	private WebElement emailSignUpBtn;

	@FindBy(xpath = "//span[text()=\"Sign In\"]")
	private WebElement alreadyAMemberSignIn;

	@FindBy(xpath = "//div[text()=\"Sign - In\"]")
	private WebElement signInAssertion;

	@FindBy(xpath = "//a[@id=\"basic-nav-dropdown\"]/div")
	private WebElement logoutImg;

	@FindBy(xpath = "//a[@class=\"dropdown-item\"]")
	private WebElement logout;

	@FindBy(xpath = "//div[@class=\"modal-close-section\"]/img")
	private WebElement popupDeleteBtn;

//=======================================================================================

	@FindBy(xpath = "//div[@class=\"mr-auto navbar-nav\"]/child::a[text()='Sign In']")
	private WebElement signInBtn;

	@FindBy(xpath = "//button[@class=\"poup-full-length-btn sign-btn\"]")
	private WebElement signInViaEmail;

	@FindBy(xpath = "(//input[@id=\"signInFormUsername\"])[2]")
	private WebElement emailUserNameSI;

	@FindBy(xpath = "(//input[@id=\"signInFormPassword\"])[2]")
	private WebElement emailPasswordSI;

	@FindBy(xpath = "(//input[@name=\"signInSubmitButton\"])[2]")
	private WebElement emailSignInBtnSI;

	@FindBy(xpath = "//button[@class=\"poup-full-length-btn sign-btn sign-in-btn\"]")
	private WebElement whatsAppSignInBtn;

	@FindBy(xpath = "//a[text()=\"Forgot Password?\"]")
	private WebElement forgotPassword;

	@FindBy(xpath = "//input[@name=\"email\"]")
	private WebElement resetEmailId;

	@FindBy(xpath = "//button[text()=\"Submit\"]")
	private WebElement resetEmailSubmitBtn;

	@FindBy(xpath = "//span[text()=\"Sign Up\"]")
	private WebElement notRegisteredYetSignUp;

	@FindBy(xpath = "//div[text()=\"Sign - Up\"]")
	private WebElement notRegisteredSignUp;

	@FindBy(xpath = "//button[contains(text(),\"Register\")]")
	private WebElement quizRegisterBtn;

	@FindBy(xpath = "//div[@class=\"mr-auto navbar-nav\"]/child::a[text()='Courses']")
	private WebElement coursesBtn;

	@FindBy(xpath = "(//button[contains(text(),\"Register\")])[1]")
	private WebElement foundationalRegisterBtnTop;

	@FindBy(xpath = "(//button[contains(text(),\"Register\")])[3]")
	private WebElement foundationalRegisterBtnMiddle;

	@FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary global-tab css-1q2h7u5\"]")
	private WebElement globalBtn;

	@FindBy(xpath = "(//button[@class=\"custom-responsive-btn course-banner-btn-foundational\"])[1]")
	private WebElement globalRegisterBtnTop;

	@FindBy(xpath = "//button[@class=\"custom-responsive-btn courses-register-btn\"]")
	private WebElement globalRegisterBtnMiddle;

	@FindBy(xpath = "//button[contains(@class,\"landing-page-banner-btn\")]")
	private WebElement joinUsBtn;

	public void login(String fUname, String fPswd, String gUname, String gPswd, String wNum, String wFirstName,
			String wLastName, String mNum, String mFirstName, String mLastName, String eUname, String ePswd,
			String eFirstName, String eLastName) throws InterruptedException {

		Log.startTestCase("login using signup and signin button found at the header ");
		Log.startTestCase("Facebook Signup");
		action.JSClick(getDriver(), signUpBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), continueWithFacebook);
		Thread.sleep(4000);
		action.type(facebookUsername, fUname);
		action.type(facebookPassword, fPswd);
		action.JSClick(getDriver(), facebookLogin);
		Thread.sleep(12000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Log.endTestCase("Facebook Signup");
		Thread.sleep(4000);

		Log.startTestCase("Google Signup");
		action.JSClick(getDriver(), signUpBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), continueWithGoogle);
		Thread.sleep(4000);
		action.type(googleUsername, gUname);
		action.click(getDriver(), googleNextBtn);
		Thread.sleep(2000);
		action.type(googlePassword, gPswd);
		action.JSClick(getDriver(), googleNextBtn);
		Thread.sleep(14000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Google Signup");

		Log.startTestCase("WhatsApp Signup");
		action.JSClick(getDriver(), signUpBtn);
		Thread.sleep(2000);
		action.moveToElement(getDriver(), continueWithWhatsApp);
		action.JSClick(getDriver(), continueWithWhatsApp);
		action.type(whatsAppNo, wNum);
		action.type(whatsAppFirstName, wFirstName);
		action.type(whatsAppLastName, wLastName);
		action.JSClick(getDriver(), whatsAppSignUp);
		Thread.sleep(12000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("WhatsApp Signup");

		Log.startTestCase("Mobile Signup");
		action.click(getDriver(), signUpBtn);
		Thread.sleep(2000);
		action.moveToElement(getDriver(), continueWithMobile);
		action.JSClick(getDriver(), continueWithMobile);
		Thread.sleep(2000);
		action.type(mobileNo, mNum);
		action.type(mobileFirstName, mFirstName);
		action.type(mobileLastName, mLastName);
		action.click(getDriver(), mobileSubmitBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("Mobile Signup");

		Log.startTestCase("Email Signup");
		action.click(getDriver(), signUpBtn);
		action.moveToElement(getDriver(), signUpViaEmail);
		action.JSClick(getDriver(), signUpViaEmail);
		Thread.sleep(2000);
		action.type(emailUsername, eUname);
		action.type(emailPassword, ePswd);
		action.type(emailFirstName, eFirstName);
		action.type(emailLastName, eLastName);
		action.JSClick(getDriver(), emailSignUpBtn);
		Thread.sleep(4000);
		getDriver().navigate().refresh();
		Thread.sleep(10000);

		Log.startTestCase("Already Registered");
		action.JSClick(getDriver(), signUpBtn);
		Thread.sleep(2000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		action.moveToElement(getDriver(), popupDeleteBtn);
		action.JSClick(getDriver(), popupDeleteBtn);
		Thread.sleep(4000);
		Log.endTestCase("Already Registered");
		Log.endTestCase("Signup");

//////======================================================================================================    

		Log.startTestCase("SignIn");
		Log.startTestCase("Facebook SignIn");
		action.JSClick(getDriver(), signInBtn);
		action.moveToElement(getDriver(), continueWithFacebook);
		action.JSClick(getDriver(), continueWithFacebook);
		Thread.sleep(10000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Facebook SignIn");

		Log.startTestCase("Google SignIn");
		action.JSClick(getDriver(), signInBtn);
		Thread.sleep(2000);
		action.moveToElement(getDriver(), continueWithGoogle);
		action.JSClick(getDriver(), continueWithGoogle);
		Thread.sleep(10000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Google SignIn");

		Log.startTestCase("WhatsApp SignIn");
		action.JSClick(getDriver(), signInBtn);
		Thread.sleep(2000);
		action.moveToElement(getDriver(), continueWithWhatsApp);
		action.JSClick(getDriver(), continueWithWhatsApp);
		action.type(whatsAppNo, wNum);
		action.JSClick(getDriver(), whatsAppSignInBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("WhatsApp SignIn");

		Log.startTestCase("Mobile SignIn");
		action.click(getDriver(), signInBtn);
		Thread.sleep(2000);
		action.moveToElement(getDriver(), continueWithMobile);
		action.JSClick(getDriver(), continueWithMobile);
		Thread.sleep(2000);
		action.type(mobileNo, mNum);
		action.click(getDriver(), mobileSubmitBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(8000);
		Log.endTestCase("Mobile SignIn");

		Log.startTestCase("Email SignIn");
		action.moveToElement(getDriver(), signInBtn);
		action.click(getDriver(), signInBtn);
		action.moveToElement(getDriver(), signInViaEmail);
		action.JSClick(getDriver(), signUpViaEmail);
		Thread.sleep(2000);
		action.type(emailUserNameSI, eUname);
		action.type(emailPasswordSI, ePswd);
		action.JSClick(getDriver(), emailSignInBtnSI);
		Thread.sleep(10000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Log.endTestCase("Email SignIn");
		Thread.sleep(4000);

		Log.startTestCase("Forgot Password");
		action.moveToElement(getDriver(), signInBtn);
		Thread.sleep(3000);
		action.click(getDriver(), signInBtn);
		Thread.sleep(3000);
		action.moveToElement(getDriver(), forgotPassword);
		action.JSClick(getDriver(), forgotPassword);
		action.type(resetEmailId, eUname);
		action.JSClick(getDriver(), resetEmailSubmitBtn);
		Log.endTestCase("Forgot Password");
		Thread.sleep(5000);

		Log.startTestCase("signup popup");
		getDriver().navigate().refresh();
		Thread.sleep(3000);
		action.moveToElement(getDriver(), signInBtn);
		Thread.sleep(3000);
		action.click(getDriver(), signInBtn);
		Thread.sleep(3000);
		action.moveToElement(getDriver(), notRegisteredYetSignUp);
		action.JSClick(getDriver(), notRegisteredYetSignUp);
		Thread.sleep(4000);
		action.click(getDriver(), popupDeleteBtn);
		Log.endTestCase("signup popup");
		Thread.sleep(4000);
		Log.endTestCase("login using signup and signin button found at the header ");
	}

	public void joinUslogin(String fUname, String fPswd, String gUname, String gPswd, String wNum, String wFirstName,
			String wLastName, String mNum, String mFirstName, String mLastName, String eUname, String ePswd,
			String eFirstName, String eLastName) throws InterruptedException {

		Log.startTestCase("Login using joinUs button ");
		Log.startTestCase("Facebook Signup");
		action.scrollByVisibilityOfElement(getDriver(), joinUsBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), joinUsBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), continueWithFacebook);
		Thread.sleep(4000);
		action.type(facebookUsername, fUname);
		action.type(facebookPassword, fPswd);
		action.JSClick(getDriver(), facebookLogin);
		Thread.sleep(10000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Log.endTestCase("Facebook Signup");
		Thread.sleep(4000);

		Log.startTestCase("Google Signup");
		action.scrollByVisibilityOfElement(getDriver(), joinUsBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), joinUsBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), continueWithGoogle);
		Thread.sleep(4000);
		action.type(googleUsername, gUname);
		action.click(getDriver(), googleNextBtn);
		Thread.sleep(2000);
		action.type(googlePassword, gPswd);
		action.JSClick(getDriver(), googleNextBtn);
		Thread.sleep(10000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Google Signup");

		Log.startTestCase("WhatsApp Signup");
		action.scrollByVisibilityOfElement(getDriver(), joinUsBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), joinUsBtn);
		Thread.sleep(2000);
		action.moveToElement(getDriver(), continueWithWhatsApp);
		action.JSClick(getDriver(), continueWithWhatsApp);
		action.type(whatsAppNo, wNum);
		action.type(whatsAppFirstName, wFirstName);
		action.type(whatsAppLastName, wLastName);
		action.JSClick(getDriver(), whatsAppSignUp);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("WhatsApp Signup");

		Log.startTestCase("Mobile Signup");
		action.scrollByVisibilityOfElement(getDriver(), joinUsBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), joinUsBtn);
		Thread.sleep(2000);
		action.moveToElement(getDriver(), continueWithMobile);
		action.JSClick(getDriver(), continueWithMobile);
		Thread.sleep(2000);
		action.type(mobileNo, mNum);
		action.type(mobileFirstName, mFirstName);
		action.type(mobileLastName, mLastName);
		action.click(getDriver(), mobileSubmitBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("Mobile Signup");

		Log.startTestCase("Email Signup");
		action.scrollByVisibilityOfElement(getDriver(), joinUsBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), joinUsBtn);
		action.moveToElement(getDriver(), signUpViaEmail);
		action.JSClick(getDriver(), signUpViaEmail);
		Thread.sleep(2000);
		action.type(emailUsername, eUname);
		action.type(emailPassword, ePswd);
		action.type(emailFirstName, eFirstName);
		action.type(emailLastName, eLastName);
		action.JSClick(getDriver(), emailSignUpBtn);
		Thread.sleep(4000);
		getDriver().navigate().refresh();
		Thread.sleep(10000);

		Log.startTestCase("Already Registered");
		action.scrollByVisibilityOfElement(getDriver(), joinUsBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), joinUsBtn);
		Thread.sleep(2000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		action.fluentWait(getDriver(), popupDeleteBtn, 30);
		action.moveToElement(getDriver(), popupDeleteBtn);
		action.JSClick(getDriver(), popupDeleteBtn);
		Thread.sleep(4000);
		Log.endTestCase("Already Registered");
		Log.endTestCase("Signup");

//================================================================================================		

		Log.startTestCase("SignIn");
		Log.startTestCase("Facebook SignIn");
		action.scrollByVisibilityOfElement(getDriver(), joinUsBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), joinUsBtn);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		action.moveToElement(getDriver(), continueWithFacebook);
		action.JSClick(getDriver(), continueWithFacebook);
		Thread.sleep(10000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Facebook SignIn");

		Log.startTestCase("Google SignIn");
		action.scrollByVisibilityOfElement(getDriver(), joinUsBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), joinUsBtn);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		action.moveToElement(getDriver(), continueWithGoogle);
		action.JSClick(getDriver(), continueWithGoogle);
		Thread.sleep(10000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Google SignIn");

		Log.startTestCase("WhatsApp SignIn");
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), joinUsBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), joinUsBtn);
		Thread.sleep(2000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.moveToElement(getDriver(), continueWithWhatsApp);
		action.JSClick(getDriver(), continueWithWhatsApp);
		action.type(whatsAppNo, wNum);
		action.JSClick(getDriver(), whatsAppSignInBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("WhatsApp SignIn");

		Log.startTestCase("Mobile SignIn");
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), joinUsBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), joinUsBtn);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.moveToElement(getDriver(), continueWithMobile);
		action.JSClick(getDriver(), continueWithMobile);
		Thread.sleep(2000);
		action.type(mobileNo, mNum);
		action.click(getDriver(), mobileSubmitBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("Mobile SignIn");

		Log.startTestCase("Email SignIn");
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), joinUsBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), joinUsBtn);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.moveToElement(getDriver(), signInViaEmail);
		action.JSClick(getDriver(), signUpViaEmail);
		Thread.sleep(2000);
		action.type(emailUserNameSI, eUname);
		action.type(emailPasswordSI, ePswd);
		action.JSClick(getDriver(), emailSignInBtnSI);
		Thread.sleep(10000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Log.endTestCase("Email SignIn");
		Thread.sleep(8000);

		Log.startTestCase("Forgot Password");
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), joinUsBtn);
		Thread.sleep(3000);
		action.JSClick(getDriver(), joinUsBtn);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.moveToElement(getDriver(), forgotPassword);
		action.click(getDriver(), forgotPassword);
		action.type(resetEmailId, eUname);
		action.click(getDriver(), resetEmailSubmitBtn);
		Log.endTestCase("Forgot Password");
		Thread.sleep(5000);

		Log.startTestCase("signup popup");
		getDriver().navigate().refresh();
		Thread.sleep(3000);
		action.scrollByVisibilityOfElement(getDriver(), joinUsBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), joinUsBtn);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.moveToElement(getDriver(), notRegisteredYetSignUp);
		action.JSClick(getDriver(), notRegisteredYetSignUp);
		Thread.sleep(4000);
		action.click(getDriver(), popupDeleteBtn);
		Log.endTestCase("signup popup");
		Thread.sleep(4000);
		Log.endTestCase("SignIn");
		Log.endTestCase("Login using joinUsBtn button ");

	}

	public void quizRegisterlognin(String fUname, String fPswd, String gUname, String gPswd, String wNum,
			String wFirstName, String wLastName, String mNum, String mFirstName, String mLastName, String eUname,
			String ePswd, String eFirstName, String eLastName) throws InterruptedException {

		Log.startTestCase("Login using quiz Register button ");
		Log.startTestCase("Facebook Signup");
		action.scrollByVisibilityOfElement(getDriver(), quizRegisterBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), quizRegisterBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), continueWithFacebook);
		Thread.sleep(4000);
		action.type(facebookUsername, fUname);
		action.type(facebookPassword, fPswd);
		action.JSClick(getDriver(), facebookLogin);
		Thread.sleep(10000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Log.endTestCase("Facebook Signup");
		Thread.sleep(4000);

		Log.startTestCase("Google Signup");
		action.scrollByVisibilityOfElement(getDriver(), quizRegisterBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), quizRegisterBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), continueWithGoogle);
		Thread.sleep(4000);
		action.type(googleUsername, gUname);
		action.click(getDriver(), googleNextBtn);
		Thread.sleep(2000);
		action.type(googlePassword, gPswd);
		action.JSClick(getDriver(), googleNextBtn);
		Thread.sleep(10000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Google Signup");

		Log.startTestCase("WhatsApp Signup");
		action.scrollByVisibilityOfElement(getDriver(), quizRegisterBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), quizRegisterBtn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), continueWithWhatsApp);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithWhatsApp);
		action.JSClick(getDriver(), continueWithWhatsApp);
		action.type(whatsAppNo, wNum);
		action.type(whatsAppFirstName, wFirstName);
		action.type(whatsAppLastName, wLastName);
		action.JSClick(getDriver(), whatsAppSignUp);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("WhatsApp Signup");

		Log.startTestCase("Mobile Signup");
		action.scrollByVisibilityOfElement(getDriver(), quizRegisterBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), quizRegisterBtn);
		Thread.sleep(2000);
		action.moveToElement(getDriver(), continueWithMobile);
		action.JSClick(getDriver(), continueWithMobile);
		Thread.sleep(2000);
		action.type(mobileNo, mNum);
		action.type(mobileFirstName, mFirstName);
		action.type(mobileLastName, mLastName);
		action.click(getDriver(), mobileSubmitBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("Mobile Signup");

		Log.startTestCase("Email Signup");
		action.scrollByVisibilityOfElement(getDriver(), quizRegisterBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), quizRegisterBtn);
		action.scrollByVisibilityOfElement(getDriver(), signUpViaEmail);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), signUpViaEmail);
		action.JSClick(getDriver(), signUpViaEmail);
		Thread.sleep(2000);
		action.type(emailUsername, eUname);
		action.type(emailPassword, ePswd);
		action.type(emailFirstName, eFirstName);
		action.type(emailLastName, eLastName);
		action.JSClick(getDriver(), emailSignUpBtn);
		Thread.sleep(4000);
		getDriver().navigate().refresh();
		Thread.sleep(10000);

		Log.startTestCase("Already Registered");
		action.scrollByVisibilityOfElement(getDriver(), quizRegisterBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), quizRegisterBtn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		action.fluentWait(getDriver(), popupDeleteBtn, 30);
		action.scrollByVisibilityOfElement(getDriver(), popupDeleteBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), popupDeleteBtn);
		action.JSClick(getDriver(), popupDeleteBtn);
		Thread.sleep(4000);
		Log.endTestCase("Already Registered");
		Log.endTestCase("Signup");

//================================================================================================		

		Log.startTestCase("SignIn");
		Log.startTestCase("Facebook SignIn");
		action.scrollByVisibilityOfElement(getDriver(), quizRegisterBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), quizRegisterBtn);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		action.scrollByVisibilityOfElement(getDriver(), continueWithFacebook);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithFacebook);
		action.JSClick(getDriver(), continueWithFacebook);
		Thread.sleep(10000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Facebook SignIn");

		Log.startTestCase("Google SignIn");
		action.scrollByVisibilityOfElement(getDriver(), quizRegisterBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), quizRegisterBtn);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		action.scrollByVisibilityOfElement(getDriver(), continueWithGoogle);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithGoogle);
		action.JSClick(getDriver(), continueWithGoogle);
		Thread.sleep(12000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(2000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Google SignIn");

		Log.startTestCase("WhatsApp SignIn");
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), quizRegisterBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), quizRegisterBtn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), continueWithWhatsApp);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithWhatsApp);
		action.JSClick(getDriver(), continueWithWhatsApp);
		action.type(whatsAppNo, wNum);
		action.JSClick(getDriver(), whatsAppSignInBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("WhatsApp SignIn");

		Log.startTestCase("Mobile SignIn");
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), quizRegisterBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), quizRegisterBtn);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), continueWithMobile);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithMobile);
		action.JSClick(getDriver(), continueWithMobile);
		Thread.sleep(2000);
		action.type(mobileNo, mNum);
		action.click(getDriver(), mobileSubmitBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("Mobile SignIn");

		Log.startTestCase("Email SignIn");
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), quizRegisterBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), quizRegisterBtn);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), signInViaEmail);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), signInViaEmail);
		action.JSClick(getDriver(), signUpViaEmail);
		Thread.sleep(2000);
		action.type(emailUserNameSI, eUname);
		action.type(emailPasswordSI, ePswd);
		action.JSClick(getDriver(), emailSignInBtnSI);
		Thread.sleep(10000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Log.endTestCase("Email SignIn");
		Thread.sleep(8000);

		Log.startTestCase("Forgot Password");
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), quizRegisterBtn);
		Thread.sleep(3000);
		action.JSClick(getDriver(), quizRegisterBtn);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), forgotPassword);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), forgotPassword);
		action.click(getDriver(), forgotPassword);
		action.type(resetEmailId, eUname);
		action.click(getDriver(), resetEmailSubmitBtn);
		Log.endTestCase("Forgot Password");
		Thread.sleep(5000);

		Log.startTestCase("signup popup");
		getDriver().navigate().refresh();
		Thread.sleep(3000);
		action.scrollByVisibilityOfElement(getDriver(), quizRegisterBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), quizRegisterBtn);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), notRegisteredYetSignUp);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), notRegisteredYetSignUp);
		action.JSClick(getDriver(), notRegisteredYetSignUp);
		Thread.sleep(4000);
		action.click(getDriver(), popupDeleteBtn);
		Log.endTestCase("signup popup");
		Thread.sleep(4000);
		Log.endTestCase("SignIn");
		Log.endTestCase("Login using quiz Register button ");

	}

	public void foundationalRegisterTop(String fUname, String fPswd, String gUname, String gPswd, String wNum,
			String wFirstName, String wLastName, String mNum, String mFirstName, String mLastName, String eUname,
			String ePswd, String eFirstName, String eLastName) throws InterruptedException {

		Log.startTestCase("Login using Foundational Register button found at the banner");
		Log.info("Facebook signup");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.JSClick(getDriver(), foundationalRegisterBtnTop);
		Thread.sleep(2000);
		action.JSClick(getDriver(), continueWithFacebook);
		Thread.sleep(4000);
		action.type(facebookUsername, fUname);
		action.type(facebookPassword, fPswd);
		action.JSClick(getDriver(), facebookLogin);
		Thread.sleep(10000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Log.endTestCase("Facebook Signup");
		Thread.sleep(4000);

		Log.startTestCase("Google Signup");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.JSClick(getDriver(), foundationalRegisterBtnTop);
		Thread.sleep(2000);
		action.JSClick(getDriver(), continueWithGoogle);
		Thread.sleep(4000);
		action.type(googleUsername, gUname);
		action.click(getDriver(), googleNextBtn);
		Thread.sleep(2000);
		action.type(googlePassword, gPswd);
		action.JSClick(getDriver(), googleNextBtn);
		Thread.sleep(10000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Google Signup");

		Log.startTestCase("WhatsApp Signup");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.JSClick(getDriver(), foundationalRegisterBtnTop);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), continueWithWhatsApp);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithWhatsApp);
		action.JSClick(getDriver(), continueWithWhatsApp);
		action.type(whatsAppNo, wNum);
		action.type(whatsAppFirstName, wFirstName);
		action.type(whatsAppLastName, wLastName);
		action.JSClick(getDriver(), whatsAppSignUp);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("WhatsApp Signup");

		Log.startTestCase("Mobile Signup");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.JSClick(getDriver(), foundationalRegisterBtnTop);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), continueWithMobile);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithMobile);
		action.JSClick(getDriver(), continueWithMobile);
		Thread.sleep(2000);
		action.type(mobileNo, mNum);
		action.type(mobileFirstName, mFirstName);
		action.type(mobileLastName, mLastName);
		action.click(getDriver(), mobileSubmitBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("Mobile Signup");

		Log.startTestCase("Email Signup");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.JSClick(getDriver(), foundationalRegisterBtnTop);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), signUpViaEmail);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), signUpViaEmail);
		action.JSClick(getDriver(), signUpViaEmail);
		Thread.sleep(2000);
		action.type(emailUsername, eUname);
		action.type(emailPassword, ePswd);
		action.type(emailFirstName, eFirstName);
		action.type(emailLastName, eLastName);
		action.JSClick(getDriver(), emailSignUpBtn);
		Thread.sleep(4000);
		getDriver().navigate().refresh();
		Thread.sleep(10000);

		Log.startTestCase("Already Registered");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.JSClick(getDriver(), foundationalRegisterBtnTop);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		action.scrollByVisibilityOfElement(getDriver(), popupDeleteBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), popupDeleteBtn);
		action.JSClick(getDriver(), popupDeleteBtn);
		Thread.sleep(4000);
		Log.endTestCase("Already Registered");
		Log.endTestCase("Signup");

////======================================================================================================    

		Log.startTestCase("SignIn");
		Log.startTestCase("Facebook SignIn");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtnTop);
		Thread.sleep(2000);
		action.JSClick(getDriver(), foundationalRegisterBtnTop);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		action.scrollByVisibilityOfElement(getDriver(), continueWithFacebook);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithFacebook);
		action.JSClick(getDriver(), continueWithFacebook);
		Thread.sleep(10000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Facebook SignIn");

		Log.startTestCase("Google SignIn");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtnTop);
		Thread.sleep(2000);
		action.JSClick(getDriver(), foundationalRegisterBtnTop);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		action.scrollByVisibilityOfElement(getDriver(), continueWithGoogle);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithGoogle);
		action.JSClick(getDriver(), continueWithGoogle);
		Thread.sleep(10000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Google SignIn");

		Log.startTestCase("WhatsApp SignIn");
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtnTop);
		Thread.sleep(2000);
		action.JSClick(getDriver(), foundationalRegisterBtnTop);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), continueWithWhatsApp);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithWhatsApp);
		action.JSClick(getDriver(), continueWithWhatsApp);
		action.type(whatsAppNo, wNum);
		action.JSClick(getDriver(), whatsAppSignInBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("WhatsApp SignIn");

		Log.startTestCase("Mobile SignIn");
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtnTop);
		Thread.sleep(2000);
		action.JSClick(getDriver(), foundationalRegisterBtnTop);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), continueWithMobile);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithMobile);
		action.JSClick(getDriver(), continueWithMobile);
		Thread.sleep(2000);
		action.type(mobileNo, mNum);
		action.click(getDriver(), mobileSubmitBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("Mobile SignIn");

		Log.startTestCase("Email SignIn");
		getDriver().navigate().refresh();
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtnTop);
		Thread.sleep(2000);
		action.JSClick(getDriver(), foundationalRegisterBtnTop);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), signInViaEmail);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), signInViaEmail);
		action.JSClick(getDriver(), signUpViaEmail);
		Thread.sleep(2000);
		action.type(emailUserNameSI, eUname);
		action.type(emailPasswordSI, ePswd);
		action.JSClick(getDriver(), emailSignInBtnSI);
		Thread.sleep(10000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Email SignIn");
		Thread.sleep(8000);

		Log.startTestCase("Forgot Password");
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtnTop);
		Thread.sleep(2000);
		action.JSClick(getDriver(), foundationalRegisterBtnTop);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), forgotPassword);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), forgotPassword);
		action.click(getDriver(), forgotPassword);
		action.type(resetEmailId, eUname);
		action.click(getDriver(), resetEmailSubmitBtn);
		Log.endTestCase("Forgot Password");
		Thread.sleep(5000);

		Log.startTestCase("signup popup");
		getDriver().navigate().refresh();
		Thread.sleep(3000);
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtnTop);
		Thread.sleep(2000);
		action.JSClick(getDriver(), foundationalRegisterBtnTop);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), notRegisteredYetSignUp);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), notRegisteredYetSignUp);
		action.JSClick(getDriver(), notRegisteredYetSignUp);
		Thread.sleep(4000);
		action.click(getDriver(), popupDeleteBtn);
		Log.endTestCase("signup popup");
		Thread.sleep(4000);
		Log.endTestCase("SignIn");
		Log.endTestCase("Login using Foundational Register button found at the banner");
	}

	public void foundationalRegisterMiddle(String fUname, String fPswd, String gUname, String gPswd, String wNum,
			String wFirstName, String wLastName, String mNum, String mFirstName, String mLastName, String eUname,
			String ePswd, String eFirstName, String eLastName) throws InterruptedException {

		Log.startTestCase("Login using Foundational Register button found at the Middle of the page");
		Log.info("Facebook signup");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.JSClick(getDriver(), continueWithFacebook);
		Thread.sleep(4000);
		action.type(facebookUsername, fUname);
		action.type(facebookPassword, fPswd);
		action.JSClick(getDriver(), facebookLogin);
		Thread.sleep(12000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Log.endTestCase("Facebook Signup");
		Thread.sleep(4000);

		Log.startTestCase("Google Signup");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.JSClick(getDriver(), continueWithGoogle);
		Thread.sleep(4000);
		action.type(googleUsername, gUname);
		action.click(getDriver(), googleNextBtn);
		Thread.sleep(2000);
		action.type(googlePassword, gPswd);
		action.JSClick(getDriver(), googleNextBtn);
		Thread.sleep(10000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Google Signup");

		Log.startTestCase("WhatsApp Signup");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), continueWithWhatsApp);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithWhatsApp);
		action.JSClick(getDriver(), continueWithWhatsApp);
		action.type(whatsAppNo, wNum);
		action.type(whatsAppFirstName, wFirstName);
		action.type(whatsAppLastName, wLastName);
		action.JSClick(getDriver(), whatsAppSignUp);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("WhatsApp Signup");

		Log.startTestCase("Mobile Signup");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), continueWithMobile);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithMobile);
		action.JSClick(getDriver(), continueWithMobile);
		Thread.sleep(2000);
		action.type(mobileNo, mNum);
		action.type(mobileFirstName, mFirstName);
		action.type(mobileLastName, mLastName);
		action.click(getDriver(), mobileSubmitBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("Mobile Signup");

		Log.startTestCase("Email Signup");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), signUpViaEmail);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), signUpViaEmail);
		action.JSClick(getDriver(), signUpViaEmail);
		Thread.sleep(2000);
		action.type(emailUsername, eUname);
		action.type(emailPassword, ePswd);
		action.type(emailFirstName, eFirstName);
		action.type(emailLastName, eLastName);
		action.JSClick(getDriver(), emailSignUpBtn);
		Thread.sleep(4000);
		getDriver().navigate().refresh();
		Thread.sleep(10000);

		Log.startTestCase("Already Registered");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		action.scrollByVisibilityOfElement(getDriver(), popupDeleteBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), popupDeleteBtn);
		action.JSClick(getDriver(), popupDeleteBtn);
		Thread.sleep(4000);
		Log.endTestCase("Already Registered");
		Log.endTestCase("Signup");

////======================================================================================================    

		Log.startTestCase("SignIn");
		Log.startTestCase("Facebook SignIn");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		action.scrollByVisibilityOfElement(getDriver(), continueWithFacebook);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithFacebook);
		action.JSClick(getDriver(), continueWithFacebook);
		Thread.sleep(10000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Facebook SignIn");

		Log.startTestCase("Google SignIn");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		action.scrollByVisibilityOfElement(getDriver(), continueWithGoogle);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithGoogle);
		action.JSClick(getDriver(), continueWithGoogle);
		Thread.sleep(10000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Google SignIn");

		Log.startTestCase("WhatsApp SignIn");
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), continueWithWhatsApp);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithWhatsApp);
		action.JSClick(getDriver(), continueWithWhatsApp);
		action.type(whatsAppNo, wNum);
		action.JSClick(getDriver(), whatsAppSignInBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("WhatsApp SignIn");

		Log.startTestCase("Mobile SignIn");
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), continueWithWhatsApp);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithMobile);
		action.JSClick(getDriver(), continueWithMobile);
		Thread.sleep(2000);
		action.type(mobileNo, mNum);
		action.click(getDriver(), mobileSubmitBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Log.endTestCase("Mobile SignIn");

		Log.startTestCase("Email SignIn");
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), signInViaEmail);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), signInViaEmail);
		action.JSClick(getDriver(), signInViaEmail);
		Thread.sleep(2000);
		action.type(emailUserNameSI, eUname);
		action.type(emailPasswordSI, ePswd);
		action.JSClick(getDriver(), emailSignInBtnSI);
		Thread.sleep(10000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Email SignIn");
		Thread.sleep(8000);

		Log.startTestCase("Forgot Password");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), forgotPassword);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), forgotPassword);
		action.click(getDriver(), forgotPassword);
		action.type(resetEmailId, eUname);
		action.click(getDriver(), resetEmailSubmitBtn);
		Log.endTestCase("Forgot Password");
		Thread.sleep(5000);

		Log.startTestCase("signup popup");
		getDriver().navigate().refresh();
		Thread.sleep(3000);
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), foundationalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.JSClick(getDriver(), foundationalRegisterBtnTop);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), notRegisteredYetSignUp);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), notRegisteredYetSignUp);
		action.JSClick(getDriver(), notRegisteredYetSignUp);
		Thread.sleep(4000);
		action.click(getDriver(), popupDeleteBtn);
		Log.endTestCase("signup popup");
		Thread.sleep(4000);
		Log.endTestCase("SignIn");
		Log.endTestCase("Login using Foundational Register button found at the Middle of the page");
	}

	public void globalRegisterTop(String fUname, String fPswd, String gUname, String gPswd, String wNum,
			String wFirstName, String wLastName, String mNum, String mFirstName, String mLastName, String eUname,
			String ePswd, String eFirstName, String eLastName) throws InterruptedException {

		Log.startTestCase("Login using Global Register button found at the Banner");
		Log.info("Facebook signup");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalRegisterBtnTop);
		Thread.sleep(2000);
		action.JSClick(getDriver(), continueWithFacebook);
		Thread.sleep(4000);
		action.type(facebookUsername, fUname);
		action.type(facebookPassword, fPswd);
		action.JSClick(getDriver(), facebookLogin);
		Thread.sleep(12000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Log.endTestCase("Facebook Signup");
		Thread.sleep(4000);

		Log.startTestCase("Google Signup");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalRegisterBtnTop);
		Thread.sleep(2000);
		action.JSClick(getDriver(), continueWithGoogle);
		Thread.sleep(4000);
		action.type(googleUsername, gUname);
		action.click(getDriver(), googleNextBtn);
		Thread.sleep(2000);
		action.type(googlePassword, gPswd);
		action.JSClick(getDriver(), googleNextBtn);
		Thread.sleep(10000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Google Signup");

		Log.startTestCase("WhatsApp Signup");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalRegisterBtnTop);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), continueWithWhatsApp);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithWhatsApp);
		action.JSClick(getDriver(), continueWithWhatsApp);
		action.type(whatsAppNo, wNum);
		action.type(whatsAppFirstName, wFirstName);
		action.type(whatsAppLastName, wLastName);
		action.JSClick(getDriver(), whatsAppSignUp);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("WhatsApp Signup");

		Log.startTestCase("Mobile Signup");
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalRegisterBtnTop);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), continueWithMobile);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithMobile);
		action.JSClick(getDriver(), continueWithMobile);
		Thread.sleep(2000);
		action.type(mobileNo, mNum);
		action.type(mobileFirstName, mFirstName);
		action.type(mobileLastName, mLastName);
		action.click(getDriver(), mobileSubmitBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("Mobile Signup");

		Log.startTestCase("Email Signup");
		action.JSClick(getDriver(), globalRegisterBtnTop);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), signUpViaEmail);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), signUpViaEmail);
		action.JSClick(getDriver(), signUpViaEmail);
		Thread.sleep(2000);
		action.type(emailUsername, eUname);
		action.type(emailPassword, ePswd);
		action.type(emailFirstName, eFirstName);
		action.type(emailLastName, eLastName);
		action.JSClick(getDriver(), emailSignUpBtn);
		Log.endTestCase("Email Signup");
		Thread.sleep(10000);
		action.click(getDriver(), popupDeleteBtn);

		Log.startTestCase("Already Registered");
		Thread.sleep(3000);
		action.scrollByVisibilityOfElement(getDriver(), globalRegisterBtnTop);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), globalRegisterBtnTop);
		action.JSClick(getDriver(), globalRegisterBtnTop);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		action.scrollByVisibilityOfElement(getDriver(), popupDeleteBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), popupDeleteBtn);
		action.JSClick(getDriver(), popupDeleteBtn);
		Thread.sleep(4000);
		Log.endTestCase("Already Registered");
		Log.endTestCase("Signup");
//	    
//////=========================Sign In=============================================================================    

		Log.startTestCase("SignIn");
		Log.startTestCase("Facebook SignIn");
		action.scrollByVisibilityOfElement(getDriver(), globalRegisterBtnTop);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), globalRegisterBtnTop);
		action.JSClick(getDriver(), globalRegisterBtnTop);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		action.scrollByVisibilityOfElement(getDriver(), continueWithFacebook);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithFacebook);
		action.JSClick(getDriver(), continueWithFacebook);
		Thread.sleep(12000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Facebook SignIn");

		Log.startTestCase("Google SignIn");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalRegisterBtnTop);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		action.scrollByVisibilityOfElement(getDriver(), continueWithGoogle);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithGoogle);
		action.JSClick(getDriver(), continueWithGoogle);
		Thread.sleep(10000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Google SignIn");

		Log.startTestCase("WhatsApp SignIn");
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalRegisterBtnTop);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), continueWithWhatsApp);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithWhatsApp);
		action.JSClick(getDriver(), continueWithWhatsApp);
		action.type(whatsAppNo, wNum);
		action.JSClick(getDriver(), whatsAppSignInBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("WhatsApp SignIn");

		Log.startTestCase("Mobile SignIn");
		action.JSClick(getDriver(), globalRegisterBtnTop);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), continueWithMobile);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithMobile);
		action.JSClick(getDriver(), continueWithMobile);
		Thread.sleep(2000);
		action.type(mobileNo, mNum);
		action.click(getDriver(), mobileSubmitBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("Mobile SignIn");

		Log.startTestCase("Email SignIn");
		action.JSClick(getDriver(), globalRegisterBtnTop);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(4000);
		action.scrollByVisibilityOfElement(getDriver(), signInViaEmail);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), signInViaEmail);
		action.JSClick(getDriver(), signInViaEmail);
		Thread.sleep(2000);
		action.type(emailUserNameSI, eUname);
		action.type(emailPasswordSI, ePswd);
		action.JSClick(getDriver(), emailSignInBtnSI);
		Thread.sleep(10000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(8000);
		Log.endTestCase("Google SignIn");

		Log.startTestCase("Forgot Password");
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		Thread.sleep(4000);
		action.scrollByVisibilityOfElement(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalRegisterBtnTop);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), forgotPassword);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), forgotPassword);
		action.click(getDriver(), forgotPassword);
		action.type(resetEmailId, eUname);
		action.click(getDriver(), resetEmailSubmitBtn);
		Log.endTestCase("Forgot Password");
		Thread.sleep(5000);

		Log.startTestCase("signup popup");
		getDriver().navigate().refresh();
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalRegisterBtnTop);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), notRegisteredYetSignUp);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), notRegisteredYetSignUp);
		action.JSClick(getDriver(), notRegisteredYetSignUp);
		Thread.sleep(4000);
		action.click(getDriver(), popupDeleteBtn);
		Log.endTestCase("signup popup");
		Thread.sleep(4000);
		Log.endTestCase("SignIn");
		Log.endTestCase("Login using Global Register button found at the Banner");
	}

	public void globalRegisterMiddle(String fUname, String fPswd, String gUname, String gPswd, String wNum,
			String wFirstName, String wLastName, String mNum, String mFirstName, String mLastName, String eUname,
			String ePswd, String eFirstName, String eLastName) throws InterruptedException {

		Log.startTestCase("Login using Global Register button found at the middle of the page");
		Log.info("Facebook signup");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.scrollByVisibilityOfElement(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.JSClick(getDriver(), continueWithFacebook);
		Thread.sleep(4000);
		action.type(facebookUsername, fUname);
		action.type(facebookPassword, fPswd);
		action.JSClick(getDriver(), facebookLogin);
		Thread.sleep(12000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Log.endTestCase("Facebook Signup");
		Thread.sleep(4000);

		Log.startTestCase("Google Signup");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.scrollByVisibilityOfElement(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.JSClick(getDriver(), continueWithGoogle);
		Thread.sleep(4000);
		action.type(googleUsername, gUname);
		action.click(getDriver(), googleNextBtn);
		Thread.sleep(2000);
		action.type(googlePassword, gPswd);
		action.JSClick(getDriver(), googleNextBtn);
		Thread.sleep(10000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Google Signup");

		Log.startTestCase("WhatsApp Signup");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.scrollByVisibilityOfElement(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), continueWithWhatsApp);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithWhatsApp);
		action.JSClick(getDriver(), continueWithWhatsApp);
		action.type(whatsAppNo, wNum);
		action.type(whatsAppFirstName, wFirstName);
		action.type(whatsAppLastName, wLastName);
		action.JSClick(getDriver(), whatsAppSignUp);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("WhatsApp Signup");

		Log.startTestCase("Mobile Signup");
		Thread.sleep(3000);
		action.scrollByVisibilityOfElement(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), continueWithMobile);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithMobile);
		action.JSClick(getDriver(), continueWithMobile);
		Thread.sleep(2000);
		action.type(mobileNo, mNum);
		action.type(mobileFirstName, mFirstName);
		action.type(mobileLastName, mLastName);
		action.click(getDriver(), mobileSubmitBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("Mobile Signup");

		Log.startTestCase("Email Signup");
		action.scrollByVisibilityOfElement(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), signUpViaEmail);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), signUpViaEmail);
		action.JSClick(getDriver(), signUpViaEmail);
		Thread.sleep(2000);
		action.type(emailUsername, eUname);
		action.type(emailPassword, ePswd);
		action.type(emailFirstName, eFirstName);
		action.type(emailLastName, eLastName);
		action.JSClick(getDriver(), emailSignUpBtn);
		Log.endTestCase("Email Signup");
		Thread.sleep(10000);
		action.click(getDriver(), popupDeleteBtn);

		Log.startTestCase("Already Registered");
		Thread.sleep(3000);
		action.scrollByVisibilityOfElement(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.scrollByVisibilityOfElement(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), globalRegisterBtnMiddle);
		action.JSClick(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		action.scrollByVisibilityOfElement(getDriver(), popupDeleteBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), popupDeleteBtn);
		action.JSClick(getDriver(), popupDeleteBtn);
		Thread.sleep(4000);
		Log.endTestCase("Already Registered");
		Log.endTestCase("Signup");
//	    
//////=========================Sign In=============================================================================    

		Log.startTestCase("SignIn");
		Log.startTestCase("Facebook SignIn");
		action.scrollByVisibilityOfElement(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		action.scrollByVisibilityOfElement(getDriver(), continueWithFacebook);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithFacebook);
		action.JSClick(getDriver(), continueWithFacebook);
		Thread.sleep(10000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Facebook SignIn");

		Log.startTestCase("Google SignIn");
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.scrollByVisibilityOfElement(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		action.scrollByVisibilityOfElement(getDriver(), continueWithGoogle);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithGoogle);
		action.JSClick(getDriver(), continueWithGoogle);
		Thread.sleep(10000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(4000);
		Log.endTestCase("Google SignIn");

		Log.startTestCase("WhatsApp SignIn");
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.scrollByVisibilityOfElement(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), continueWithWhatsApp);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithWhatsApp);
		action.JSClick(getDriver(), continueWithWhatsApp);
		action.type(whatsAppNo, wNum);
		action.JSClick(getDriver(), whatsAppSignInBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("WhatsApp SignIn");

		Log.startTestCase("Mobile SignIn");
		action.scrollByVisibilityOfElement(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), continueWithMobile);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), continueWithMobile);
		action.JSClick(getDriver(), continueWithMobile);
		Thread.sleep(2000);
		action.type(mobileNo, mNum);
		action.click(getDriver(), mobileSubmitBtn);
		Thread.sleep(10000);
		getDriver().navigate().back();
		Thread.sleep(4000);
		Log.endTestCase("Mobile SignIn");

		Log.startTestCase("Email SignIn");
		action.scrollByVisibilityOfElement(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(4000);
		action.scrollByVisibilityOfElement(getDriver(), signInViaEmail);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), signInViaEmail);
		action.JSClick(getDriver(), signInViaEmail);
		Thread.sleep(2000);
		action.type(emailUserNameSI, eUname);
		action.type(emailPasswordSI, ePswd);
		action.JSClick(getDriver(), emailSignInBtnSI);
		Thread.sleep(10000);
		action.scrollByVisibilityOfElement(getDriver(), logoutImg);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), logoutImg);
		action.click(getDriver(), logoutImg);
		action.click(getDriver(), logout);
		Thread.sleep(8000);
		Log.endTestCase("Google SignIn");

		Log.startTestCase("Forgot Password");
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), coursesBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), coursesBtn);
		action.click(getDriver(), coursesBtn);
		Thread.sleep(4000);
		action.scrollByVisibilityOfElement(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalBtn);
		Thread.sleep(3000);
		action.scrollByVisibilityOfElement(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), forgotPassword);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), forgotPassword);
		action.click(getDriver(), forgotPassword);
		action.type(resetEmailId, eUname);
		action.click(getDriver(), resetEmailSubmitBtn);
		Log.endTestCase("Forgot Password");
		Thread.sleep(5000);

		Log.startTestCase("signup popup");
		getDriver().navigate().refresh();
		Thread.sleep(3000);
		action.scrollByVisibilityOfElement(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(3000);
		action.JSClick(getDriver(), globalRegisterBtnMiddle);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.JSClick(getDriver(), alreadyAMemberSignIn);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), notRegisteredYetSignUp);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), notRegisteredYetSignUp);
		action.JSClick(getDriver(), notRegisteredYetSignUp);
		Thread.sleep(4000);
		action.click(getDriver(), popupDeleteBtn);
		Log.endTestCase("signup popup");
		Thread.sleep(4000);
		Log.endTestCase("SignIn");
		Log.endTestCase("Login using Global Register button found at the middle of the page");
	}
}
