package com.sfe.testscripts;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sfe.base.BaseClass;
import com.sfe.dataproviders.DataProviders;
import com.sfe.pageobjects.FooterObjects;
import com.sfe.pageobjects.HomePageObjects;
import com.sfe.pageobjects.LoginPageObjects;

public class HomePageTest extends BaseClass{
	
	private HomePageObjects homePage;
	private FooterObjects footerPage;
	private LoginPageObjects loginPage;

	@Parameters("browser")
	@BeforeMethod(groups={"Sanity","Smoke", "Regression"})	
	public void setup(String browser) {
		launchApp(browser);
	}

	@AfterMethod(groups= {"Sanity","Smoke","Regression"})
	public void tearDown() {
		getDriver().close();
	}
	
	
	@Test(groups = {"Smoke", "Sanity", "Regression"})
	public void Homepage() throws InterruptedException, MalformedURLException, IOException {
		homePage = new HomePageObjects();
		homePage.Homepage();
		footerPage=homePage.getHomePageFooter();
		footerPage.Footer();
	}
	
	
	@Test(priority = -2,  groups = {"Sanity", "Smoke", "Regression"},dataProvider = "loginpage", dataProviderClass = DataProviders.class)
	public void joinUs(String fUname, String fPswd, String gUname, String gPswd
			,String wNum, String wFirstName, String wLastName,
			String mNum, String mFirstName, String mLastName,
			String eUname, String ePswd, String eFirstName, String eLastName) throws InterruptedException {
		
		loginPage=new LoginPageObjects();
		loginPage.joinUslogin(fUname, fPswd, gUname, gPswd, wNum, wFirstName, wLastName, mNum, mFirstName, mLastName, eUname, ePswd, eFirstName, eLastName);
	}
	
	
	@Test(priority = -1,  groups = {"Sanity", "Smoke", "Regression"}, dataProvider = "loginpage", dataProviderClass = DataProviders.class)
	public void quizRegister(String fUname, String fPswd, String gUname, String gPswd
			,String wNum, String wFirstName, String wLastName,
			String mNum, String mFirstName, String mLastName,
			String eUname, String ePswd, String eFirstName, String eLastName) throws InterruptedException {
		loginPage=new LoginPageObjects();
		loginPage.quizRegisterlognin(fUname, fPswd, gUname, gPswd, wNum, wFirstName, wLastName, mNum, mFirstName, mLastName, eUname, ePswd, eFirstName, eLastName);		
	}
	
	
}
