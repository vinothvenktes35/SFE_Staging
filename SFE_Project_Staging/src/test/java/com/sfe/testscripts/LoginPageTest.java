package com.sfe.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sfe.base.BaseClass;
import com.sfe.dataproviders.DataProviders;
import com.sfe.pageobjects.LoginPageObjects;
import com.sfe.pageobjects.ProfilePageObjects;
import com.sfe.pageobjects.SignUpPageObjects;

public class LoginPageTest extends BaseClass{
private LoginPageObjects LoginPage;

@Parameters("browser")
@BeforeMethod(groups = {"Sanity", "Smoke", "Regression"})
public void setup(String browser) {
	launchApp(browser);
}

@AfterMethod(groups = {"Sanity", "Smoke", "Regression"})
public void tearDown() {
	getDriver().quit();
}

@Test(groups = {"Sanity", "Smoke", "Regression"}, dataProvider = "loginpage", dataProviderClass = DataProviders.class)
	public void lognin(String fUname, String fPswd, String gUname, String gPswd
			,String wNum, String wFirstName, String wLastName,
			String mNum, String mFirstName, String mLastName,
			String eUname, String ePswd, String eFirstName, String eLastName) throws InterruptedException {
	
		LoginPage = new LoginPageObjects();
		LoginPage.login(fUname, fPswd, gUname, gPswd, wNum, wFirstName, wLastName, mNum, mFirstName, mLastName, eUname, ePswd, eFirstName, eLastName);
}


@Test(priority = -1,  groups = {"Sanity", "Smoke", "Regression"}, dataProvider = "loginpage", dataProviderClass = DataProviders.class)
public void quizRegisterlognin(String fUname, String fPswd, String gUname, String gPswd
		,String wNum, String wFirstName, String wLastName,
		String mNum, String mFirstName, String mLastName,
		String eUname, String ePswd, String eFirstName, String eLastName) throws InterruptedException {

	LoginPage = new LoginPageObjects();
	LoginPage.quizRegisterlognin(fUname, fPswd, gUname, gPswd, wNum, wFirstName, wLastName, mNum, mFirstName, mLastName, eUname, ePswd, eFirstName, eLastName);
}


@Test(priority = -6,   groups = {"Sanity", "Smoke", "Regression"}, dataProvider = "loginpage", dataProviderClass = DataProviders.class)
public void foundationalRegisterTop(String fUname, String fPswd, String gUname, String gPswd
		,String wNum, String wFirstName, String wLastName,
		String mNum, String mFirstName, String mLastName,
		String eUname, String ePswd, String eFirstName, String eLastName) throws InterruptedException {

	LoginPage = new LoginPageObjects();
	LoginPage.foundationalRegisterTop(fUname, fPswd, gUname, gPswd, wNum, wFirstName, wLastName, mNum, mFirstName, mLastName, eUname, ePswd, eFirstName, eLastName);

}

@Test(  groups = {"Sanity", "Smoke", "Regression"}, dataProvider = "loginpage", dataProviderClass = DataProviders.class)
public void foundationalRegisterMiddle(String fUname, String fPswd, String gUname, String gPswd
		,String wNum, String wFirstName, String wLastName,
		String mNum, String mFirstName, String mLastName,
		String eUname, String ePswd, String eFirstName, String eLastName) throws InterruptedException {

	LoginPage = new LoginPageObjects();
	LoginPage.foundationalRegisterMiddle(fUname, fPswd, gUname, gPswd, wNum, wFirstName, wLastName, mNum, mFirstName, mLastName, eUname, ePswd, eFirstName, eLastName);
}


@Test(groups = {"Sanity", "Smoke", "Regression"}, dataProvider = "loginpage", dataProviderClass = DataProviders.class)
public void globalRegisterTop(String fUname, String fPswd, String gUname, String gPswd
		,String wNum, String wFirstName, String wLastName,
		String mNum, String mFirstName, String mLastName,
		String eUname, String ePswd, String eFirstName, String eLastName) throws InterruptedException {

	LoginPage = new LoginPageObjects();
	LoginPage.globalRegisterTop(fUname, fPswd, gUname, gPswd, wNum, wFirstName, wLastName, mNum, mFirstName, mLastName, eUname, ePswd, eFirstName, eLastName);
}


@Test(groups = {"Sanity", "Smoke", "Regression"}, dataProvider = "loginpage", dataProviderClass = DataProviders.class)
public void globalRegisterMiddle(String fUname, String fPswd, String gUname, String gPswd
		,String wNum, String wFirstName, String wLastName,
		String mNum, String mFirstName, String mLastName,
		String eUname, String ePswd, String eFirstName, String eLastName) throws InterruptedException {

	LoginPage = new LoginPageObjects();
	LoginPage.globalRegisterMiddle(fUname, fPswd, gUname, gPswd, wNum, wFirstName, wLastName, mNum, mFirstName, mLastName, eUname, ePswd, eFirstName, eLastName);
}


}


