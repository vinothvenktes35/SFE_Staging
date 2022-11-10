package com.sfe.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.sfe.actiondriver.Action;
import com.sfe.base.BaseClass;
import com.sfe.utility.Log;

public class NewsPageObjects extends BaseClass {

	public NewsPageObjects() {
		PageFactory.initElements(getDriver(), this);
	}

	Action action = new Action();

	@FindBy(xpath = "//div[@class=\"mr-auto navbar-nav\"]/child::a[text()='News']")
	private WebElement News;

	@FindBy(xpath = "//div[@class=\"news-banner-container\"]/button[@class=\"custom-responsive-btn\"]")
	private WebElement watchNowBtn;

	@FindBy(linkText = "Gain the knowledge and tools to grow your business further!")
	private WebElement gainKnowledgeLink;

	@FindBy(linkText = "SME Financial Empowerment Programme")
	private WebElement SMEFinancialEmpowermentLink;
	
	@FindBy(tagName = "a")
	private WebElement allLinks;
	
	

	public void NewsPage() {

		Log.startTestCase("NewsPage");

		action.implicitWait(getDriver(), 30);
		action.JSClick(getDriver(), News);

		action.JSClick(getDriver(), watchNowBtn);
		action.switchToNewWindow(getDriver());
		String actual = getDriver().getTitle();
		System.out.println(actual);
		String expected = "Global Launch of SME Financial Empowerment - Supported by Ant Group and Visa - YouTube";
		Assert.assertEquals(actual, expected);
		getDriver().close();
		action.switchToOldWindow(getDriver());

		action.JSClick(getDriver(), gainKnowledgeLink);
		action.switchToNewWindow(getDriver());
		getDriver().close();
		action.switchToOldWindow(getDriver());

		action.JSClick(getDriver(), SMEFinancialEmpowermentLink);
		action.switchToNewWindow(getDriver());
		getDriver().close();
		action.switchToOldWindow(getDriver());

		Log.endTestCase("NewsPage");

	}

	public void brokenLinks() {
		action.implicitWait(getDriver(), 30);
action.JSClick(getDriver(), News);
	}

	public FooterObjects getNewsPageObjects() {
		return new FooterObjects();
	}

}
