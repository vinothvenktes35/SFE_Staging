package com.sfe.pageobjects;

import static org.testng.Assert.assertEquals;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.sfe.actiondriver.Action;
import com.sfe.base.BaseClass;
import com.sfe.utility.Log;

public class HomePageObjects extends BaseClass {
	
	

	Action action = new Action();

	public HomePageObjects() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//button[contains(@class,\"landing-page-banner-btn\")]")
	private WebElement joinUsBtn	;

	@FindBy(linkText = "Learn about FFL Certificate")
	private WebElement FFLCertificateLink;

	@FindBy(linkText = "Learn about GFL Certificate")
	private WebElement GFLCertificateLink;

	@FindBy(xpath = "//div[@class=\"col-12\"]/button")
	private WebElement quizRegisterBtn;

	@FindBy(xpath = "(//div[@class=\"mobile_btn_compatiple\"]/a)[1]")
	private WebElement FFLCertificateBtn;

	@FindBy(xpath = "(//div[@class=\"mobile_btn_compatiple\"]/a)[2]")
	private WebElement GFLCertificateBtn;

	@FindBy(linkText = "Watch the recording!")
	private WebElement greenWatchRecordingLink;

	@FindBy(xpath = "(//div[text()=\"Visit our Facebook page\"])[1]")
	private WebElement newsFacebookPageLink;

	@FindBy(xpath = "(//div[text()=\"Visit our LinkedIn page\"])[1]")
	private WebElement newsLinkedInPageLink;

	@FindBy(xpath = "(//div[text()=\"Watch the recording\"])[1]")
	private WebElement newsWatchRecording;

	@FindBy(xpath = "//button[text()=\"See All\"]")
	private WebElement seeAllBtn;

	@FindBy(xpath = "//button[@class=\"custom-responsive-btn join-the-conversation-btn\"]/span")
	private WebElement joinFacebookConversationBtn;

	@FindBy(xpath = "//div[contains(text(),\"Site Footer\")]//following-sibling::div")
	private WebElement siteFooter;

	public void Homepage() throws InterruptedException {
	
		Log.startTestCase("Home Page");
		action.JSClick(getDriver(), FFLCertificateLink);
		getDriver().navigate().back();
		action.JSClick(getDriver(), GFLCertificateLink);
		getDriver().navigate().back();
		action.JSClick(getDriver(), FFLCertificateBtn);
		getDriver().navigate().back();
		action.JSClick(getDriver(), GFLCertificateBtn);
		getDriver().navigate().back();
			
		action.JSClick(getDriver(), greenWatchRecordingLink);
		Thread.sleep(3000);
		action.switchToNewWindow(getDriver());
		String actual = action.getTitle(getDriver());
		System.out.println(actual);
		String expected = "Global Launch of SME Financial Empowerment - Supported by Ant Group and Visa - YouTube";
		Assert.assertEquals(actual, expected);
		getDriver().close();
		action.switchToOldWindow(getDriver());
		
		action.JSClick(getDriver(), newsFacebookPageLink);
		Thread.sleep(3000);
		action.switchToNewWindow(getDriver());
		String actual1 = action.getTitle(getDriver());
		System.out.println(actual1);
		String expected1 = "SME Financial Empowerment - Home | Facebook";
		Assert.assertEquals(actual1, expected1);
		getDriver().close();
		action.switchToOldWindow(getDriver());

		action.JSClick(getDriver(), newsLinkedInPageLink);
		Thread.sleep(3000);
		action.switchToNewWindow(getDriver());
//		String actual2 = action.getTitle(getDriver());
//		System.out.println(actual2);
//		String expected2= "Sign In | LinkedIn";
//		Assert.assertEquals(actual2, expected2);
		getDriver().close();
		action.switchToOldWindow(getDriver());

		action.JSClick(getDriver(), newsWatchRecording);
		Thread.sleep(3000);
		action.switchToNewWindow(getDriver());
		String actual3 = action.getTitle(getDriver());
		System.out.println(actual3);
		String expected3 = "Global Launch of SME Financial Empowerment - Supported by Ant Group and Visa - YouTube";
		Assert.assertEquals(actual3, expected3);
		getDriver().close();
		action.switchToOldWindow(getDriver());

		action.JSClick(getDriver(), seeAllBtn);
		getDriver().navigate().back();
	
		action.JSClick(getDriver(), joinFacebookConversationBtn);
		Thread.sleep(3000);
		action.switchToNewWindow(getDriver());
		String actual4 = action.getTitle(getDriver());
		System.out.println(actual4);
		String expected4 = "SME Financial Empowerment - Home | Facebook";
	    Assert.assertEquals(actual4, expected4);
		getDriver().close();
		action.switchToOldWindow(getDriver());
		Log.endTestCase("Home Page");
		Thread.sleep(3000);
	}
	
	
	public FooterObjects getHomePageFooter() {
		return new FooterObjects();
	}

	public LoginPageObjects getHomePageLogin() {
		action.implicitWait(getDriver(), 30);
		action.JSClick(getDriver(), joinUsBtn);
		return new LoginPageObjects();
	}
	
	
}
