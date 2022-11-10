package com.sfe.testscripts;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sfe.base.BaseClass;
import com.sfe.dataproviders.DataProviders;
import com.sfe.pageobjects.ProfilePageObjects;
import com.sfe.pageobjects.SignInPageObjects;
import com.sfe.utility.Log;

public class SignInPageTest extends BaseClass {

	private SignInPageObjects signInPage;
	private ProfilePageObjects profilePage;

	@Parameters("browser")
	@BeforeMethod(groups = {"Sanity", "Smoke", "Regression"})
	public void setup(String browser) {
		launchApp(browser);
	}

	@AfterMethod(groups = {"Sanity", "Smoke", "Regression"})
	public void tearDown() {
		getDriver().quit();
	}

	@Test( groups = {"Sanity", "Smoke", "Regression"},dataProvider = "Email", dataProviderClass = DataProviders.class)
	public void emailSignIn(String uname, String pswd) throws InterruptedException {
		Log.startTestCase("To validate the emial sign in");
		signInPage = new SignInPageObjects();
		profilePage = signInPage.getEmailSignIn(uname, pswd);
		Thread.sleep(3000);
		String actURL = profilePage.getProfilePageURL();
		System.out.println(actURL);
		String expURL = "https://stagingsfe.proxtera.app/dashboard";
		Assert.assertEquals(actURL, expURL);
		Log.info("verified profile page URL-Assertion Passed");
		Log.endTestCase("validated email sign in sucessfully");

	}

	@Test(priority = -1,groups = {"Sanity", "Smoke", "Regression"},dataProvider = "Google", dataProviderClass = DataProviders.class)
	public void googleSignIn(String username, String password) throws InterruptedException {
		Log.startTestCase("To validate the Google sign in");
		signInPage = new SignInPageObjects();
		profilePage = signInPage.getGoogleSignIn(username, password);
		String actURL = profilePage.getProfilePageURL();
		System.out.println(actURL);
		String expURL = "https://stagingsfe.proxtera.app/dashboard";
		Assert.assertEquals(actURL, expURL);
		Log.info("verified profile page URL-Assertion Passed");
		Log.endTestCase("validated Google sign in sucessfully");

	}

	@Test(groups = {"Sanity", "Smoke", "Regression"},dataProvider = "Facebook", dataProviderClass = DataProviders.class)
	public void facebookSignIn(String uname, String pswd) throws InterruptedException {
		Log.startTestCase("To validate the Facebook sign in");
		signInPage = new SignInPageObjects();
		profilePage = signInPage.getFacebookSignIn(uname, pswd);
		Thread.sleep(6000);
		String actURL = profilePage.getProfilePageURL();
		System.out.println(actURL);
		String expURL = "https://stagingsfe.proxtera.app/dashboard";
		Assert.assertEquals(actURL, expURL);
		Log.info("verified profile page URL-Assertion Passed");
		Log.endTestCase("validated Facebook sign in sucessfully");
	}

	@Test(groups = {"Sanity", "Smoke", "Regression"},dataProvider = "WhatsApp", dataProviderClass = DataProviders.class)
	public void whatsAppSignIn(String wAppNo) throws InterruptedException {
		Log.startTestCase("To validate the WhatsApp sign in");
		signInPage = new SignInPageObjects();
		signInPage.getWhatsAppSign(wAppNo);
		Log.endTestCase("validated WhatsApp sign in sucessfully");
	}

	@Test( groups = {"Sanity", "Smoke", "Regression"},dataProvider = "MobileNo", dataProviderClass = DataProviders.class)
	public void mobileSignIn(String mobNo) throws InterruptedException {
		Log.startTestCase("To validate the Mobile sign in");
		signInPage = new SignInPageObjects();
		signInPage.getMobileSignIn(mobNo);
		Log.endTestCase("validated Mobile sign in sucessfully");
	}

	@Test(groups = {"Sanity", "Smoke", "Regression"},dataProvider = "ForgotPassword", dataProviderClass = DataProviders.class)
	public void forgotPassword(String email) throws InterruptedException {
		Log.startTestCase("To validate the forgot Password");
		signInPage = new SignInPageObjects();
		signInPage.getForgotPassword(email);
		Log.endTestCase("validated forgot Password sucessfully");
	}
	
        @Test(groups = {"Sanity", "Smoke", "Regression"})
	public void notRegisteredSignUp() throws InterruptedException {
		Log.startTestCase("To validate the signUp popup");
		signInPage = new SignInPageObjects();
		boolean result = signInPage.getNotRegisteredSingUp();
		Assert.assertTrue(result);
		Log.endTestCase("Validated sing Up popup successfully");
	}

}
