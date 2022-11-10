package com.sfe.pageobjects;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.sfe.actiondriver.Action;
import com.sfe.base.BaseClass;
import com.sfe.utility.Log;

public class PaymentPageObjects extends BaseClass {

	Action action = new Action();

	@FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiTab-root MuiTab-textColorInherit selected_course css-wigwbp\"]")
	private WebElement coursesTab;

	@FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiTab-root MuiTab-textColorInherit unselected_course css-wigwbp\"]")
	private WebElement eventsTab;

	@FindBy(xpath = "(//button[@class=\"profile-course-register-btn\"])[1]")
	private WebElement foundationalRegisterBtn;

	@FindBy(xpath = "(//button[@class=\"profile-course-register-btn\"])[2]")
	private WebElement globalRegisterBtn;

	@FindBy(xpath = "//div[@class=\"total-price-sec price-total price-text \"]")
	private WebElement totalCost;

	@FindBy(xpath = "//div[@class=\"MuiOutlinedInput-root MuiInputBase-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-adornedEnd MuiAutocomplete-inputRoot css-segi59\"]")
	private WebElement chooseLanguage;

	@FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium MuiAutocomplete-popupIndicator css-uge3vf\"]")
	private WebElement chooseLanguageTxt;

	@FindBy(xpath = "//input[@id=\"lname\"]")
	private WebElement voucherCodeTxt;

	@FindBy(xpath = "(//button[@class=\"profile-course-register-btn\"])[3]")
	private WebElement voucherApplyBtn;

	@FindBy(xpath = "//button[@class=\"custom-responsive-btn\"]")
	private WebElement payNowBtn;

	@FindBy(xpath = "//button[@type=\"button\"] [@class=\"rtf--mb\"]")
	private WebElement globeFabBtn;

	@FindBy(xpath = "//button[@type=\"button\"] [@text=\"Settings\"]")
	private WebElement changePasswordBtn;

	@FindBy(xpath = "//button[@type=\"button\"] [@text=\"Transactions\"]")
	private WebElement transactionBtn;

	@FindBy(xpath = "//button[@type=\"button\"] [@text=\"Dashboard\"]")
	private WebElement dashboardBtn;

	@FindBy(xpath = "//input[@id=\"outlined-adornment-password\"][@name=\"new_password\"]")
	private WebElement newPasswordTxt;

	@FindBy(xpath = "//input[@id=\"outlined-adornment-password\"][@name=\"confirm_password\"]")
	private WebElement confirmPasswordTxt;

	@FindBy(xpath = "//button[@class=\"custom-responsive-btn\"]")
	private WebElement updatePswdBtn;

	@FindBy(xpath = "//div[text()=\"unregister (testing only)\"]")
	private WebElement unRegisterBtn;

	@FindBy(xpath = "(//div[@class=\"payment-provider\"])[2]")
	private WebElement stripePaymentOption;

	@FindBy(xpath = "//div[@class=\"ProductSummary no-image is-clickable\"]")
	private WebElement stripePaymentTotal;

	@FindBy(xpath = "//input[@id=\"email\"]")
	private WebElement stripeEmail;

	@FindBy(xpath = "//input[@id=\"cardNumber\"]")
	private WebElement stripeCardNo;

	@FindBy(xpath = "//input[@id=\"cardExpiry\"]")
	private WebElement stripeCardExpiry;

	@FindBy(xpath = "//input[@id=\"cardCvc\"]")
	private WebElement stripeCardCvc;

	@FindBy(xpath = "//input[@id=\"billingName\"]")
	private WebElement stripeCardName;

	@FindBy(xpath = "//select[@id=\"billingCountry\"]")
	private WebElement stripeCountryName;

	@FindBy(xpath = "//div[@class=\"SubmitButton-IconContainer\"]")
	private WebElement stripePayBtn;

	@FindBy(xpath = "//span[text()=\"PayPal\"]")
	private WebElement payPalBtn;

	@FindBy(xpath = "//button[text()=\"Pay with Credit or Debit Card\"]")
	private WebElement payWithCreditDebitCard;

	@FindBy(xpath = "//img[@class=\"_1FH0bi5-GMkskZpPcRhm91\"]")
	private WebElement payPalcountryDropdown;

	@FindAll({
			@FindBy(xpath = "//div[@class=\"ppvx_selection-menu__container___1-13-4-beta-0 _2SSR8UIjWtCOfV7DXHW4ra ppvx--v2___1-13-4-beta-0\"]//ul/li") })
	private List<WebElement> payPalcountryDropdownTxt;

	@FindBy(xpath = "//input[@id=\"cardNumber\"]")
	private WebElement payPalCardNo;

	@FindBy(xpath = "//input[@id=\"cardExpiry\"]")
	private WebElement payPalCardExpiry;

	@FindBy(xpath = "//input[@id=\"cardCvv\"]")
	private WebElement payPalCardCvv;

	@FindBy(xpath = "//input[@id=\"firstName\"]")
	private WebElement payPalFirstName;

	@FindBy(xpath = "//input[@id=\"lastName\"]")
	private WebElement payPalLastName;

	@FindBy(xpath = "//input[@id=\"billingLine1\"]")
	private WebElement payPalAddress1;

	@FindBy(xpath = "//input[@id=\"billingLine2\"]")
	private WebElement payPalAddress2;

	@FindBy(xpath = "//input[@id=\"billingPostalCode\"]")
	private WebElement payPalPostCode;

	@FindBy(xpath = "//input[@id=\"billingCity\"]")
	private WebElement payPalCity;

	@FindBy(xpath = "//input[@id=\"billingState\"]")
	private WebElement payPalState;

	@FindBy(xpath = "//input[@id=\"billingPostalCode\"]")
	private WebElement payPalPIN;

	@FindBy(xpath = "//input[@id=\"phone\"]")
	private WebElement payPalMobileNo;

	@FindBy(xpath = "//input[@id=\"email\"]")
	private WebElement payPalEmail;

	@FindBy(xpath = "//input[@id=\"dateOfBirth\"]")
	private WebElement payPalDOB;

	@FindBy(xpath = "//input[@id=\"identityDocumentNumber\"]")
	private WebElement payPalIDNo;

	@FindBy(xpath = "(//label[@class=\"css-ltr-1l75s9n-StyledLabel-labelStyles e1w1a1oi2\"])[2]")
	private WebElement payPalDontWantAccount;

	@FindBy(xpath = "//label[@class=\"css-ltr-1qso0nj-StyledLabel-labelStyles e1w1a1oi2\"]")
	private WebElement payPalAgreeCheckbox;

	@FindBy(xpath = "//button[text()='Create Account and Continue']")
	private WebElement payPalAgreeContinueButton;

	@FindBy(xpath = "//div[text()=\"unregister (testing only)\"]")
	private WebElement unregisterBtn;
	
	public PaymentPageObjects() {
		PageFactory.initElements(getDriver(), this);
	}

	public void payPalPayment(String country, String cardNo, String cardExpiry, String cardCVV, String fName,
			String lName, String address1, String address2, String postcode, String mobileNo, String Email, String DOB,
			String IDNo) throws InterruptedException, AWTException {

		Log.startTestCase("payPalPayment payment");

		if(getDriver().getPageSource().contains("unregister (testing only)")){
			System.out.println("unregister (testing only) Text is present");
			action.JSClick(getDriver(), unregisterBtn);
			}else{
			System.out.println("unregister (testing only) Text is absent");
			}
		
		Thread.sleep(5000);
		Log.info("Click on courses tab");
		action.moveToElement(getDriver(), coursesTab);
		action.JSClick(getDriver(), coursesTab);
		Thread.sleep(4000);
		Log.info("Click on foundational Register Button");
		action.moveToElement(getDriver(), foundationalRegisterBtn);
		action.JSClick(getDriver(), foundationalRegisterBtn);
		Log.info("Click on global Register Button");
		action.JSClick(getDriver(), globalRegisterBtn);
		Log.info("Global and foundational register course cost before PayPal payment");
		System.out.println(totalCost.getText());
		Thread.sleep(2000);
		action.JSClick(getDriver(), chooseLanguage);
		Thread.sleep(2000);
		chooseLanguageTxt.sendKeys(Keys.ARROW_DOWN.ENTER);

		action.enter();

		Thread.sleep(2000);
		action.moveToElement(getDriver(), payPalBtn);
		action.JSClick(getDriver(), payPalBtn);
		action.JSClick(getDriver(), payNowBtn);
		Thread.sleep(8000);

		action.moveToElement(getDriver(), payWithCreditDebitCard);
		action.click(getDriver(), payWithCreditDebitCard);
		Thread.sleep(4000);

		action.moveToElement(getDriver(), payPalcountryDropdown);
		action.click(getDriver(), payPalcountryDropdown);
		Thread.sleep(3000);
		action.bootStrapDropdown(getDriver(), payPalcountryDropdownTxt, country);
		Thread.sleep(3000);
		action.type(payPalCardNo, cardNo);
		action.enter();
		Thread.sleep(3000);
		action.type(payPalCardExpiry, cardExpiry);
		Thread.sleep(1000);
		action.type(payPalCardCvv, cardCVV);
		Thread.sleep(1000);
		action.type(payPalFirstName, fName);
		Thread.sleep(1000);
		action.type(payPalLastName, lName);
		Thread.sleep(1000);
		action.type(payPalAddress1, address1);
		Thread.sleep(1000);
		action.type(payPalAddress2, address2);
		Thread.sleep(1000);
		action.type(payPalPostCode, postcode);
		Thread.sleep(1000);
		action.type(payPalMobileNo, mobileNo);
		Thread.sleep(1000);
		action.type(payPalEmail, Email);
		Thread.sleep(1000);
		action.type(payPalDOB, DOB);
		Thread.sleep(1000);
		action.type(payPalIDNo, IDNo);
		action.click(getDriver(), payPalAgreeCheckbox);
		action.click(getDriver(), payPalAgreeContinueButton);
		Thread.sleep(4000);
		Log.endTestCase("payPalPayment payment");
	}

	public LMSPageObjects applyVoucher(String voucherFoundational, String voucherGlobe, String newPswd,
			String confirmPswd) throws Exception, AWTException {
		Log.startTestCase("voucher payment");

		if(getDriver().getPageSource().contains("unregister (testing only)")){
			System.out.println("unregister (testing only) Text is present");
			action.JSClick(getDriver(), unregisterBtn);
			}else{
			System.out.println("unregister (testing only) Text is absent");
			}
		
		Thread.sleep(5000);
		Log.info("Click on events tab");
//    	action.click(getDriver(), eventsTab);
//    	Thread.sleep(2000);
		Log.info("Click on courses tab");
		action.moveToElement(getDriver(), coursesTab);
		action.JSClick(getDriver(), coursesTab);

		Log.info("Click on foundational Register Button");
		action.moveToElement(getDriver(), foundationalRegisterBtn);
		action.JSClick(getDriver(), foundationalRegisterBtn);
		Thread.sleep(4000);
		Log.info("Click on global Register Button");
		action.moveToElement(getDriver(), globalRegisterBtn);
		action.JSClick(getDriver(), globalRegisterBtn);
		Thread.sleep(4000);
		Log.info("Global and foundational register course cost before applying voucher");
		System.out.println(totalCost.getText());

		action.type(voucherCodeTxt, voucherFoundational);
		action.JSClick(getDriver(), voucherApplyBtn);
		Thread.sleep(4000);
		action.type(voucherCodeTxt, voucherGlobe);
		action.JSClick(getDriver(), voucherApplyBtn);
		Thread.sleep(4000);
		Log.info("Global and foundational register course cost after applying voucher");
		System.out.println(totalCost.getText());

		Thread.sleep(2000);
		action.JSClick(getDriver(), chooseLanguage);
		chooseLanguageTxt.sendKeys(Keys.ARROW_DOWN.ENTER);
		Thread.sleep(4000);

		action.enter();

		Log.info("Click on PayNow Button");
		action.JSClick(getDriver(), payNowBtn);
		Thread.sleep(4000);

		action.click(getDriver(), globeFabBtn);
		Thread.sleep(1000);
		action.click(getDriver(), globeFabBtn);
		Thread.sleep(1000);
		action.click(getDriver(), dashboardBtn);
		Thread.sleep(1000);
		action.click(getDriver(), transactionBtn);
		Thread.sleep(1000);
		action.screenShot(getDriver(), "transaction details");
		action.moveToElement(getDriver(), changePasswordBtn);
		action.JSClick(getDriver(), changePasswordBtn);
		Thread.sleep(3000);
		action.type(newPasswordTxt, newPswd);
		action.type(confirmPasswordTxt, newPswd);
		Thread.sleep(2000);
		action.click(getDriver(), updatePswdBtn);
		Thread.sleep(5000);
		Log.endTestCase("Voucher Payment");
		return new LMSPageObjects();
	}

	public LMSPageObjects stripePayment(String email, String cNo, String cExpiry, String cCvc, String cName,
			String cCountry) throws InterruptedException, AWTException {

		Log.startTestCase("Stripe Payment");
		
		if(getDriver().getPageSource().contains("unregister (testing only)")){
			System.out.println("unregister (testing only) Text is present");
			action.JSClick(getDriver(), unregisterBtn);
			}else{
			System.out.println("unregister (testing only) Text is absent");
			}
		
		Log.info("Click on courses tab");
		action.scrollByVisibilityOfElement(getDriver(), coursesTab);
		Thread.sleep(3000);
		action.moveToElement(getDriver(), coursesTab);
		action.JSClick(getDriver(), coursesTab);

		Log.info("Click on foundational Register Button");
		action.scrollByVisibilityOfElement(getDriver(), foundationalRegisterBtn);
		Thread.sleep(3000);
		action.moveToElement(getDriver(), foundationalRegisterBtn);
		action.JSClick(getDriver(), foundationalRegisterBtn);
		Log.info("Click on global Register Button");
		action.JSClick(getDriver(), globalRegisterBtn);
		Log.info("Global and foundational register course cost before STRIPE payment");
		action.scrollByVisibilityOfElement(getDriver(), totalCost);
		Thread.sleep(3000);
		action.mouseHoverByJavaScript(totalCost);
		Thread.sleep(2000);
		System.out.println(totalCost.getText());
		Thread.sleep(5000);
		action.JSClick(getDriver(), chooseLanguage);
		action.scrollByVisibilityOfElement(getDriver(), chooseLanguageTxt);
		Thread.sleep(3000);
		action.mouseHoverByJavaScript(chooseLanguageTxt);
		chooseLanguageTxt.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(4000);
		action.enter();

		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), stripePaymentOption);
		Thread.sleep(3000);
		action.moveToElement(getDriver(), stripePaymentOption);
		action.JSClick(getDriver(), stripePaymentOption);
		action.JSClick(getDriver(), payNowBtn);
		Thread.sleep(8000);

		action.scrollByVisibilityOfElement(getDriver(), stripePaymentTotal);
		Thread.sleep(3000);
		action.moveToElement(getDriver(), stripePaymentTotal);
		System.out.println(stripePaymentTotal.getText());
		action.type(stripeEmail, email);
		action.type(stripeCardNo, cNo);
		action.type(stripeCardExpiry, cExpiry);
		action.type(stripeCardCvc, cCvc);
		action.type(stripeCardName, cName);
		Thread.sleep(2000);
		action.selectByValue(stripeCountryName, cCountry);
		Thread.sleep(2000);
		action.click(getDriver(), stripePayBtn);
		Thread.sleep(8000);
		Log.endTestCase("Stripe Payment");
		return new LMSPageObjects();

	}
}
