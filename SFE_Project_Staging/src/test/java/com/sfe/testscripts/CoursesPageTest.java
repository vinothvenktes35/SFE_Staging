package com.sfe.testscripts;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sfe.base.BaseClass;
import com.sfe.dataproviders.DataProviders;
import com.sfe.pageobjects.CoursesPageObjects;
import com.sfe.pageobjects.FooterObjects;
import com.sfe.pageobjects.LoginPageObjects;

public class CoursesPageTest extends BaseClass {

	private LoginPageObjects loginPage;
	private CoursesPageObjects coursesPage;
	private FooterObjects footerPage;

	@Parameters("browser")
	@BeforeMethod(groups = { "Sanity", "Smoke", "Regression" })
	public void setup(String browser) {
		launchApp(browser);
	}

	@AfterMethod(groups = { "Sanity", "Smoke", "Regression" })
	public void tearDown() {
		getDriver().quit();
	}

	@Test(priority = 3,   groups = { "Sanity", "Smoke", "Regression" })
	public void newsPage() throws InterruptedException, MalformedURLException, IOException {
		coursesPage = new CoursesPageObjects();
		coursesPage.coursesPage();
		footerPage = coursesPage.getCoursesPageObjects();
		footerPage.Footer();
	}

	
	
	@Test(priority = 1, groups = { "Sanity", "Smoke",
			"Regression" }, dataProvider = "loginpage", dataProviderClass = DataProviders.class)
	public void foundationalRegisterTop(String fUname, String fPswd, String gUname, String gPswd, String wNum,
			String wFirstName, String wLastName, String mNum, String mFirstName, String mLastName, String eUname,
			String ePswd, String eFirstName, String eLastName) throws InterruptedException {

		loginPage = new LoginPageObjects();
		loginPage.foundationalRegisterTop(fUname, fPswd, gUname, gPswd, wNum, wFirstName, wLastName, mNum, mFirstName,
				mLastName, eUname, ePswd, eFirstName, eLastName);
	}

	
	
	@Test(priority = 2, groups = { "Sanity", "Smoke",
			"Regression" }, dataProvider = "loginpage", dataProviderClass = DataProviders.class)
	public void foundationalRegisterMiddle(String fUname, String fPswd, String gUname, String gPswd, String wNum,
			String wFirstName, String wLastName, String mNum, String mFirstName, String mLastName, String eUname,
			String ePswd, String eFirstName, String eLastName) throws InterruptedException {

		loginPage = new LoginPageObjects();
		loginPage.foundationalRegisterMiddle(fUname, fPswd, gUname, gPswd, wNum, wFirstName, wLastName, mNum,
				mFirstName, mLastName, eUname, ePswd, eFirstName, eLastName);
	}

	
	
	@Test(  groups = { "Sanity", "Smoke",
			"Regression" }, dataProvider = "loginpage", dataProviderClass = DataProviders.class)
	public void globalRegisterTop(String fUname, String fPswd, String gUname, String gPswd, String wNum,
			String wFirstName, String wLastName, String mNum, String mFirstName, String mLastName, String eUname,
			String ePswd, String eFirstName, String eLastName) throws InterruptedException {

		loginPage = new LoginPageObjects();
		loginPage.globalRegisterTop(fUname, fPswd, gUname, gPswd, wNum, wFirstName, wLastName, mNum, mFirstName,
				mLastName, eUname, ePswd, eFirstName, eLastName);
	}

	
	
	@Test(priority = 4, groups = { "Sanity", "Smoke",
			"Regression" }, dataProvider = "loginpage", dataProviderClass = DataProviders.class)
	public void globalRegisterMiddle(String fUname, String fPswd, String gUname, String gPswd, String wNum,
			String wFirstName, String wLastName, String mNum, String mFirstName, String mLastName, String eUname,
			String ePswd, String eFirstName, String eLastName) throws InterruptedException {

		loginPage = new LoginPageObjects();
		loginPage.globalRegisterMiddle(fUname, fPswd, gUname, gPswd, wNum, wFirstName, wLastName, mNum, mFirstName,
				mLastName, eUname, ePswd, eFirstName, eLastName);
	}

}
