package com.sfe.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sfe.base.BaseClass;
import com.sfe.pageobjects.FooterObjects;
import com.sfe.pageobjects.NewsPageObjects;

public class NewsPageTest extends BaseClass{

private NewsPageObjects newsPage;
private FooterObjects footer;

	@Parameters("browser")
	@BeforeMethod(groups = {"Sanity", "Smoke", "Regression"})
	public void setup(String browser) {
		launchApp(browser);
	}

	@AfterMethod(groups = {"Sanity", "Smoke", "Regression"})
	public void tearDown() {
		getDriver().quit();
	}

//	@Test( groups = {"Sanity", "Smoke", "Regression"})
//	public void NewsPage() throws InterruptedException {
//		newsPage = new NewsPageObjects();
//		newsPage.NewsPage();
//		footer = newsPage.getNewsPageObjects();
//		footer.Footer();
//	}
	
	@Test( groups = {"Sanity", "Smoke", "Regression"})
	public void brokenLinks() {
		newsPage = new NewsPageObjects();
		newsPage.brokenLinks();
	}
	
}
