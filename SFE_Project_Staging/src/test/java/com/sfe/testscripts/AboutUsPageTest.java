package com.sfe.testscripts;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sfe.base.BaseClass;
import com.sfe.pageobjects.AboutUsPageObjects;
import com.sfe.pageobjects.FooterObjects;
import com.sfe.pageobjects.HomePageObjects;

public class AboutUsPageTest extends BaseClass {

	private AboutUsPageObjects aboutUs;
	private FooterObjects footer;

	@Parameters("browser")
	@BeforeMethod(groups={"Sanity","Smoke", "Regression"})	
	public void setup(String browser) {
		launchApp(browser);
	}

	@AfterMethod(groups= {"Sanity","Smoke","Regression"})
	public void tearDown() {
		getDriver().close();
	}
	
	@Test(groups = {"Sanity", "Smoke", "Regression"})
	public void Homepage() throws InterruptedException, MalformedURLException, IOException {
		aboutUs=new AboutUsPageObjects();
		aboutUs.getAboutPage();
		footer=aboutUs.getAboutPageObjects();
		footer.Footer();
	
	}
	
	
}
