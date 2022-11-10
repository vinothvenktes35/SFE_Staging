package com.sfe.testscripts;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sfe.base.BaseClass;
import com.sfe.dataproviders.DataProviders;
import com.sfe.pageobjects.PaymentPageObjects;
import com.sfe.pageobjects.ProfilePageObjects;
import com.sfe.pageobjects.SignInPageObjects;
import com.sfe.utility.Log;

public class ProfilePageTest extends BaseClass {
	
	private SignInPageObjects signInPage;
	private ProfilePageObjects profilePage;
	private PaymentPageObjects paymentPage;
	
	
	@Parameters("browser")
	@BeforeMethod(groups = {"Sanity", "Smoke", "Regression"})
	public void setup(String browser) {
		launchApp(browser);
	}
	
	@AfterMethod(groups = {"Sanity", "Smoke", "Regression"})
	public void tearDown() {
		getDriver().quit();
	}

	@Test(groups = {"Sanity", "Smoke", "Regression"},dataProvider = "ProfilePage", dataProviderClass = DataProviders.class)
	public void editProfilePage(String imagePath, String uname, String pswd,String fName, String lName,
			String companyName, String designation, String country,
			String industry, String companySize, String taxId) throws InterruptedException, AWTException {
		Log.startTestCase("To validate profile page");
		signInPage=new SignInPageObjects();
		profilePage=signInPage.getEmailSignIn(uname, pswd);
		paymentPage=profilePage.editProfile(imagePath, fName, lName, companyName, designation, country, industry, companySize, taxId);
		Log.endTestCase("Validated profile page successfully");
	}
}
























