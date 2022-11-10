package com.sfe.testscripts;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sfe.actiondriver.Action;
import com.sfe.base.BaseClass;
import com.sfe.dataproviders.DataProviders;
import com.sfe.pageobjects.PaymentPageObjects;
import com.sfe.pageobjects.ProfilePageObjects;
import com.sfe.pageobjects.SignInPageObjects;

public class PaymentPageTest extends BaseClass {

	private SignInPageObjects signInPage;
	private ProfilePageObjects profilePage;
	private PaymentPageObjects paymentPage;
	
@Parameters("browser")
@BeforeMethod(groups={"Sanity","Smoke", "Regression"})	
public void setup(String browser) {
	launchApp(browser);
}

@AfterMethod(groups= {"Sanity","Smoke","Regression"})
public void tearDown() {
	getDriver().close();
}


@Test( groups = {"Smoke", "Sanity", "Regression"}, dataProvider = "PaymentPage", dataProviderClass = DataProviders.class)
public void voucherPayment(String uname, String pswd,String fName, String lName,
	String companyName, String designation, String country,
	String industry, String companySize, String taxId, 
	String voucherFoundational, String voucherGlobe,String newPswd, String confirmPswd )throws Exception, AWTException {
	signInPage=new SignInPageObjects();
	profilePage=signInPage.getEmailSignIn(uname, pswd);
//	paymentPage=profilePage.editProfile(fName, lName, companyName, designation, country, industry, companySize, taxId);
	paymentPage=profilePage.profile();
	paymentPage.applyVoucher(voucherFoundational, voucherGlobe, newPswd, confirmPswd);
}

@Test(  groups = {"Smoke", "Sanity", "Regression"}, dataProvider = "StripePayment", dataProviderClass = DataProviders.class)
public void stripePayment(String uname, String pswd,String email, String cNo, String cExpiry, String cCvc,
		String cName, String cCountry )throws Exception, AWTException {
	signInPage=new SignInPageObjects();
	profilePage=signInPage.getEmailSignIn(uname, pswd);
	Thread.sleep(8000);
	paymentPage=profilePage.profile();
//	paymentPage=profilePage.editProfile(fName, lName, companyName, designation, country, industry, companySize, taxId);
	paymentPage.stripePayment(email, cNo, cExpiry, cCvc, cName, cCountry);
	
}

@Test(priority = -2, groups = {"Smoke", "Sanity", "Regression"}, dataProvider = "PayPalPayment", dataProviderClass = DataProviders.class)
public void payPalPayment(String uname, String pswd,String country, String cardNo, String cardExpiry, String cardCVV, String fName,
		 String lName, String address1, String address2, String postcode,
		 String mobileNo, String Email, String DOB, String IDNo) throws InterruptedException, AWTException {
	signInPage=new SignInPageObjects();
	profilePage=signInPage.getEmailSignIn(uname, pswd);
	Thread.sleep(8000);
	paymentPage=profilePage.profile();
	paymentPage.payPalPayment(country,cardNo, cardExpiry, cardCVV, fName, lName, address1,
			address2, postcode, mobileNo, Email, DOB, IDNo);

}}


	

