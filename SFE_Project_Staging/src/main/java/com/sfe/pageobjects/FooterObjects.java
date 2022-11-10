package com.sfe.pageobjects;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.sfe.actiondriver.Action;
import com.sfe.base.BaseClass;
import com.sfe.utility.Log;

public class FooterObjects extends BaseClass{

	Action action = new Action();
	
	public FooterObjects() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//div[contains(text(),\"Site Footer\")]//following-sibling::div")
	private WebElement siteFooter;
	
	@FindBy(linkText = "About SFE")
	private WebElement aboutSFE;
	

	@FindBy(linkText = "Mission & Vision")
	private WebElement missionVision;

	@FindBy(linkText = "SFE Program")
	private WebElement SFEProgram;

	@FindBy(linkText = "Sponsors & Partners")
	private WebElement sponsorsPartners;

	@FindBy(linkText = "Privacy Policy")
	private WebElement privacyPolicy;

	@FindBy(linkText = "Terms Of Use")
	private WebElement termsOfUse;

	@FindBy(xpath="//div[@class=\"col-lg-3 col-md-3 col-sm-12 col-12footer-links\"]/h4[contains(text(),'News')]")
	private WebElement news;

	@FindBy(xpath = "//div[@class=\"col-lg-3 col-md-3 col-sm-12 col-12footer-links\"]/h4[contains(text(),'Courses')]")
	private WebElement courses;

	@FindBy(xpath = "(//div[@class=\"social-links-a\"]/a)[1]")
	private WebElement linkedIn;

	@FindBy(xpath = "(//div[@class=\"social-links-a\"]/a)[2]")
	private WebElement facebookLink;
	  
	public void Footer() throws InterruptedException, MalformedURLException, IOException {
		Log.startTestCase("Footer");
		action.implicitWait(getDriver(), 50);
		action.JSClick(getDriver(), siteFooter);
		action.JSClick(getDriver(), aboutSFE);
		getDriver().navigate().back();
		action.JSClick(getDriver(), siteFooter);
		action.JSClick(getDriver(), missionVision);
		getDriver().navigate().back();
		action.JSClick(getDriver(), siteFooter);
		action.JSClick(getDriver(), SFEProgram);
		getDriver().navigate().back();
		action.JSClick(getDriver(), siteFooter);
		action.JSClick(getDriver(), sponsorsPartners);
		getDriver().navigate().back();
		
		Log.info("privacy policy");
		action.JSClick(getDriver(), siteFooter);
		action.JSClick(getDriver(), privacyPolicy);
		action.switchToNewWindow(getDriver());
		action.scrollDownWebPageTillFooter(getDriver());
		action.scrollUpWebPageTillHeader(getDriver());
		getDriver().close();
		action.switchToOldWindow(getDriver());
		
		Log.info("terms of use");
		action.JSClick(getDriver(), termsOfUse);
		action.switchToNewWindow(getDriver());
		action.scrollDownWebPageTillFooter(getDriver());
		action.scrollUpWebPageTillHeader(getDriver());
		Log.info("close");
		getDriver().close();
		action.switchToOldWindow(getDriver());
		
		Log.info("news");
		action.JSClick(getDriver(), news);
		getDriver().navigate().back();
		
		Log.info("courses");
		action.scrollByVisibilityOfElement(getDriver(), siteFooter);
		action.JSClick(getDriver(), siteFooter);
		action.scrollDownWebPageTillFooter(getDriver());
		action.scrollByVisibilityOfElement(getDriver(), courses);
		action.JSClick(getDriver(), courses);
		getDriver().navigate().back();
		
		Log.info("linkedIn");
		action.JSClick(getDriver(), linkedIn);
		action.switchToNewWindow(getDriver());
//		String actual = getDriver().getTitle();
//		System.out.println(actual);
//		String expected = "SME Financial Empowerment | LinkedIn";
//		Assert.assertEquals(actual, expected);
		getDriver().close();
		action.switchToOldWindow(getDriver());
		
		Log.info("facebook");
		action.JSClick(getDriver(), facebookLink);
		action.switchToNewWindow(getDriver());
//		String actual1 = getDriver().getTitle();
//		System.out.println(actual1);
//		String expected1 = "SME Financial Empowerment - Home | Facebook";
//		System.out.println(expected1);
//		Assert.assertEquals(actual1, expected1);
		getDriver().close();
		action.switchToOldWindow(getDriver());
		action.brokenImages(getDriver());
		Log.endTestCase("Footer");
		
	}
	
}













