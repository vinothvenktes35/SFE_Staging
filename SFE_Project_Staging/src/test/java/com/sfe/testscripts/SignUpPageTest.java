package com.sfe.testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sfe.base.BaseClass;
import com.sfe.dataproviders.DataProviders;
import com.sfe.pageobjects.ProfilePageObjects;
import com.sfe.pageobjects.SignUpPageObjects;
import com.sfe.utility.Log;

public class SignUpPageTest extends BaseClass{
	
	SignUpPageObjects SignUpPage;
	ProfilePageObjects profilePage;
	
	@Parameters("browser")
	@BeforeMethod(groups = {"Sanity", "Smoke", "Regression"})
	public void setup(String browser) {
		launchApp(browser);
	}
	
	@AfterMethod(groups = {"Sanity", "Smoke", "Regression"})
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test(priority = -1,groups = {"Sanity", "Smoke", "Regression"}, dataProvider = "Google", dataProviderClass = DataProviders.class)
	public void googleSingUp(String uname,String pswd) throws InterruptedException {
	Log.startTestCase("verify Google SignUp");	
	SignUpPage=new SignUpPageObjects();
	profilePage = SignUpPage.getGoogleSingUp(uname, pswd);
	String actURL=profilePage.getProfilePageURL();
	System.out.println(actURL);
	String expURL="https://stagingsfe.proxtera.app/dashboard/edit-profile";
	Assert.assertEquals(actURL, expURL);
	Log.endTestCase("verified Google SignUp Successfully");
	}
	
	@Test(groups = {"Sanity", "Smoke", "Regression"},dataProvider = "Facebook", dataProviderClass = DataProviders.class)
	public void facebookSingUp(String uname,String pswd) throws InterruptedException {
		Log.startTestCase("verify Facebook SignUp");	
		SignUpPage=new SignUpPageObjects();
		profilePage = SignUpPage.getFacebookSignUp(uname, pswd);
		String actURL=profilePage.getProfilePageURL();
		System.out.println(actURL);
		String expURL="https://stagingsfe.proxtera.app/dashboard";
		Assert.assertEquals(actURL, expURL);
		Log.endTestCase("verified Facebook SignUp Successfully");
		}
	
	@Test( groups = {"Sanity", "Smoke", "Regression"},dataProvider = "SignUpEmail", dataProviderClass = DataProviders.class)
	public void emailSingUp(String uname,String pswd, String fName, String lName) throws InterruptedException {
		Log.startTestCase("verify email SignUp");
		SignUpPage=new SignUpPageObjects();
		SignUpPage.getEmailSignUp(uname, pswd, fName, lName);
		Log.endTestCase("verified email SignUp Successfully");
		}
	
	@Test(priority = -1, groups = {"Sanity", "Smoke", "Regression"}, dataProvider = "SignUpNo", dataProviderClass = DataProviders.class)
	public void whatsAppSignUp(String wNo, String fName, String lName) throws InterruptedException {
		Log.startTestCase("verify WhatsApp SignUp");
		SignUpPage=new SignUpPageObjects();
		SignUpPage.getWhatsAppSignUp(wNo, fName, lName);
		Log.endTestCase("verified WhatsApp SignUp Successfully");
	}
	
	@Test(groups = {"Sanity", "Smoke", "Regression"},dataProvider = "SignUpNo", dataProviderClass = DataProviders.class)
	public void mobileSignUp(String wNo, String fName, String lName) throws InterruptedException {
		Log.startTestCase("verify mobile SignUp");
		SignUpPage=new SignUpPageObjects();
		SignUpPage.getMobileSignUp(wNo, fName, lName);
		Log.endTestCase("verified mobile SignUp Successfully");
	} 
	
	@Test(groups = {"Sanity", "Smoke", "Regression"})
	public void AlreadyAMemberSignin() {
		Log.startTestCase("To validate SignIn popup");
		SignUpPage = new SignUpPageObjects();
		boolean result=SignUpPage.getAlreadyAMemberSignin();
		Assert.assertTrue(result);
		Log.endTestCase("validatated SignIn popup successfully");
	}
	
}
