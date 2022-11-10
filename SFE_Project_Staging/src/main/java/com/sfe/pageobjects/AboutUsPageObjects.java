package com.sfe.pageobjects;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sfe.actiondriver.Action;
import com.sfe.base.BaseClass;
import com.sfe.utility.Log;

public class AboutUsPageObjects extends BaseClass {
	
	public AboutUsPageObjects() {
		PageFactory.initElements(getDriver(), this);
	}

	Action action = new Action();

	@FindBy(xpath = "//div[@class=\"mr-auto navbar-nav\"]/child::a[text()='About Us']")
	private WebElement aboutUsBtn;

	@FindBy(xpath = "(//div[contains(text(),'A growing private-public partnership')])[1]")
	private WebElement bannerTxt;

	@FindBy(xpath = "//div[@class=\"section-title\"]/h2[contains(text(),\"About SFE\")]")
	private WebElement aboutSFE;

	@FindBy(xpath = "//div[@class=\"section-title\"]/h2[contains(text(),\"Mission & Vision\")]")
	private WebElement missionVision;

	@FindBy(xpath = "//div[@class=\"section-title\"]/h2[contains(text(),\"SFE Program\")]")
	private WebElement SFEProgram;

	@FindBy(xpath = "//div[@class=\"about-sponsor-sec-title\"]/h2[contains(text(),\"A Growing Public-Private Partnership\")]")
	private WebElement sponsors;

	public void getAboutPage() throws InterruptedException, MalformedURLException, IOException {
		Log.startTestCase("About Us Page ");
		System.out.println(getDriver().getTitle());
		action.JSClick(getDriver(), aboutUsBtn);
		Thread.sleep(3000);
		action.scrollByVisibilityOfElement(getDriver(), bannerTxt);
		Thread.sleep(3000);
		action.scrollByVisibilityOfElement(getDriver(), aboutSFE);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), missionVision);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), SFEProgram);
		Thread.sleep(2000);
		action.scrollByVisibilityOfElement(getDriver(), sponsors);
		action.brokenLinks(getDriver());
		Log.endTestCase("About Us Page");
	}
	
	

	public FooterObjects getAboutPageObjects() {
		return new FooterObjects();
	}
}
