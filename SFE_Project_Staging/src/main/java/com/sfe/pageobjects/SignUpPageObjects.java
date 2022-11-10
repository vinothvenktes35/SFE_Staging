package com.sfe.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sfe.actiondriver.Action;
import com.sfe.base.BaseClass;


public class SignUpPageObjects extends BaseClass {
	Action action = new Action();

	@FindBy(xpath = "//a[contains(@role,'button')][normalize-space()='Sign Up']")
	private WebElement signUpBtn;

	@FindBy(xpath = "//div[text()=\"Continue with Facebook\"]")
	private WebElement continueWithFacebook;

	@FindBy(xpath = "//input[@id=\"email\"]")
	private WebElement facebookUsername;

	@FindBy(xpath = "//input[@id=\"pass\"]")
	private WebElement facebookPassword;

	@FindBy(xpath = "//button[@id='loginbutton']")
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
	
	@FindBy(xpath="//div[text()=\"Sign - In\"]")
	private WebElement signInAssertion;

	public SignUpPageObjects() {
		PageFactory.initElements(getDriver(), this);
	}

	public ProfilePageObjects getFacebookSignUp(String uname, String pswd) throws InterruptedException {
		action.click(getDriver(), signUpBtn);
		action.moveToElement(getDriver(), continueWithFacebook);
		action.JSClick(getDriver(), continueWithFacebook);
		action.type(facebookUsername, uname);
		action.type(facebookPassword, pswd);
		action.click(getDriver(), facebookLogin);
		Thread.sleep(12000);
		return new ProfilePageObjects();
	}

	public ProfilePageObjects getGoogleSingUp(String uname, String pswd) throws InterruptedException {
		action.click(getDriver(), signUpBtn);
		Thread.sleep(2000);
		action.moveToElement(getDriver(), continueWithGoogle);
		action.JSClick(getDriver(), continueWithGoogle);
		action.type(googleUsername, uname);
		action.click(getDriver(), googleNextBtn);
		action.type(googlePassword, pswd);
		action.moveToElement(getDriver(), googleNextBtn);
		action.JSClick(getDriver(), googleNextBtn);
		Thread.sleep(12000);
		return new ProfilePageObjects();
	}

	public void getWhatsAppSignUp(String WNom, String firstName, String lastName) throws InterruptedException {
		action.click(getDriver(), signUpBtn);
		action.moveToElement(getDriver(), continueWithWhatsApp);
		action.JSClick(getDriver(), continueWithWhatsApp);
		action.type(whatsAppNo, WNom);
		action.type(whatsAppFirstName, firstName);
		action.type(whatsAppLastName, lastName);
		action.click(getDriver(), whatsAppSignUp);
		Thread.sleep(5000);
		action.screenShot(getDriver());
	}

	public void getMobileSignUp(String mNo, String firstName, String lastName) throws InterruptedException {
		action.click(getDriver(), signUpBtn);
		Thread.sleep(2000);
		action.moveToElement(getDriver(), continueWithMobile);
		action.JSClick(getDriver(), continueWithMobile);
		action.type(mobileNo, mNo);
		action.type(mobileFirstName, firstName);
		action.type(mobileLastName, lastName);
		action.click(getDriver(), mobileSubmitBtn);
		Thread.sleep(5000);
		action.screenShot(getDriver());
	}

	
	public void getEmailSignUp(String uname, String pswd, String fName, String lName) throws InterruptedException {
		action.click(getDriver(), signUpBtn);
		action.moveToElement(getDriver(), signUpViaEmail);
		action.JSClick(getDriver(), signUpViaEmail);
		action.type(emailUsername, uname);
		action.type(emailPassword, pswd);
		action.click(getDriver(), emailPasswordShowHideIcon);
		action.type(emailFirstName, fName);
		action.type(emailLastName, lName);
		action.moveToElement(getDriver(), emailSignUpBtn);
		action.JSClick(getDriver(), emailSignUpBtn);
		Thread.sleep(5000);
		action.screenShot(getDriver());
	}

	public boolean getAlreadyAMemberSignin() {
		action.click(getDriver(), signUpBtn);
		action.moveToElement(getDriver(), alreadyAMemberSignIn);
		action.click(getDriver(), alreadyAMemberSignIn);
		return action.isDisplayed(getDriver(), signInAssertion);	
	}
}
