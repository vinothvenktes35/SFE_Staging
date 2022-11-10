package com.sfe.testscripts;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sfe.base.BaseClass;
import com.sfe.dataproviders.DataProviders;
import com.sfe.pageobjects.LMSPageObjects;
import com.sfe.pageobjects.PaymentPageObjects;
import com.sfe.pageobjects.ProfilePageObjects;
import com.sfe.pageobjects.SignInPageObjects;

public class LMSPageTest extends BaseClass{

	private SignInPageObjects signInPage;
	private ProfilePageObjects profilePage;
	private PaymentPageObjects paymentPage;
	private LMSPageObjects LMSPage;
	
@Parameters("browser")
@BeforeMethod(groups={"Sanity","Smoke", "Regression"})	
public void setup(String browser) {
	launchApp(browser);
}

@AfterMethod(groups= {"Sanity","Smoke","Regression"})
public void tearDown() {
	getDriver().close();
}


@Test(groups = {"Smoke", "Sanity", "Regression"}, dataProvider = "StripePayment", dataProviderClass = DataProviders.class)
public void stripePayment(String uname, String pswd,String email, String cNo, String cExpiry, String cCvc,
		String cName, String cCountry )throws Exception, AWTException {
	signInPage=new SignInPageObjects();
	profilePage=signInPage.getEmailSignIn(uname, pswd);
	Thread.sleep(8000);
	paymentPage=profilePage.profile();
	LMSPage=paymentPage.stripePayment(email, cNo, cExpiry, cCvc, cName, cCountry);
	LMSPage.LMS();
	
	
}



}
