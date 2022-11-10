package com.sfe.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sfe.actiondriver.Action;
import com.sfe.base.BaseClass;
import com.sfe.utility.Log;

public class LMSPageObjects extends BaseClass {

	Action action = new Action();

	public LMSPageObjects() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//button[@type=\"button\"] [@text=\"Dashboard\"]")
	private WebElement dashboardBtn;

	@FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiTab-root MuiTab-textColorInherit selected_course css-wigwbp\"]")
	private WebElement coursesTab;

	@FindBy(xpath = "//div[@class=\"profile-course-title-card \"]")
	private WebElement foundationalCourseTab;

	@FindBy(xpath = "//div[@class=\"profile-course-title-card\"]")
	private WebElement globalCourseTab;

	@FindBy(xpath = "//div[contains(text(),\"Go to Course\")]")
	private WebElement foundationalGoToCourse;

	@FindBy(xpath = "//div[contains(text(),\"Key financial concepts for expanding businesses\")]")
	private WebElement globalGoToCourseTopic1;

	@FindBy(xpath = "//div[contains(text(),\"New online and offline business models for SME success\")]")
	private WebElement globalGoToCourseTopic2;

	@FindBy(xpath = "//div[contains(text(),\"Expand your SME’s capacity with Tech and Digital Payments adoption\")]")
	private WebElement globalGoToCourseTopic3;

	@FindBy(xpath = "//div[contains(text(),\"Multiply business growth via platform participation\")]")
	private WebElement globalGoToCourseTopic4;

	@FindBy(xpath = "//div[contains(text(),\"Transform your business digitally through new business principles\")]")
	private WebElement globalGoToCourseTopic5;
	
	@FindBy(xpath = "//div[contains(text(),\"Understanding essential financial services options for businesses\")]")
	private WebElement globalGoToCourseTopic6;

	@FindBy(xpath = "//div[contains(text(),\"New approaches to digital finance and banking for SMEs\")]")
	private WebElement globalGoToCourseTopic7;

	@FindBy(xpath = "//a[@href=\"https://www.devsfe.proxtera.app/dashboard\"]")
	private WebElement greenBackToDashboard;

	@FindBy(xpath = "//span[contains(text(),\"Back to Dashboard\")]")
	private WebElement greenBackToDashboardTopic3;

	@FindBy(xpath = "//span[@class=\"d-none d-md-inline\"]")
	private WebElement LMSDropdown;

	@FindBy(linkText = "Dashboard")
	private WebElement LMSDropdownDshboard;

	@FindBy(linkText = "Sign Out")
	private WebElement LMSDropdownSignOut;


	public void LMS() throws InterruptedException {

		Thread.sleep(5000);

			action.JSClick(getDriver(), dashboardBtn);
			Thread.sleep(3000);
			action.JSClick(getDriver(), coursesTab);
			Thread.sleep(3000);
			action.scrollByVisibilityOfElement(getDriver(), foundationalCourseTab);
			action.JSClick(getDriver(), foundationalCourseTab);
			Thread.sleep(8000);
			action.moveToElement(getDriver(), foundationalGoToCourse);
			action.JSClick(getDriver(), foundationalGoToCourse);
			Thread.sleep(12000);
			action.moveToElement(getDriver(), greenBackToDashboard);
			action.JSClick(getDriver(), greenBackToDashboard);
			Thread.sleep(8000);
			action.JSClick(getDriver(), dashboardBtn);
			action.JSClick(getDriver(), coursesTab);
			action.JSClick(getDriver(), globalCourseTab);
			Thread.sleep(6000);
			action.scrollByVisibilityOfElement(getDriver(), globalGoToCourseTopic1);
			Thread.sleep(3000);
			action.moveToElement(getDriver(), globalGoToCourseTopic1);
			action.JSClick(getDriver(), globalGoToCourseTopic1);
			Thread.sleep(12000);
			action.moveToElement(getDriver(), greenBackToDashboard);
			action.JSClick(getDriver(), greenBackToDashboard);
			Thread.sleep(8000);

			Log.info("Global Course Topic 2");
			action.JSClick(getDriver(), dashboardBtn);
			action.JSClick(getDriver(), coursesTab);
			action.JSClick(getDriver(), globalCourseTab);
			Thread.sleep(6000);
			action.scrollByVisibilityOfElement(getDriver(), globalGoToCourseTopic2);
			Thread.sleep(3000);
			action.moveToElement(getDriver(), globalGoToCourseTopic2);
			action.JSClick(getDriver(), globalGoToCourseTopic2);
			Thread.sleep(12000);
			action.moveToElement(getDriver(), greenBackToDashboard);
			action.JSClick(getDriver(), greenBackToDashboard);
			Thread.sleep(8000);

			Log.info("Global Course Topic 3");
			action.JSClick(getDriver(), dashboardBtn);
			action.JSClick(getDriver(), coursesTab);
			action.JSClick(getDriver(), globalCourseTab);
			Thread.sleep(6000);
			action.scrollByVisibilityOfElement(getDriver(), globalGoToCourseTopic3);
			Thread.sleep(3000);
			action.moveToElement(getDriver(), globalGoToCourseTopic3);
			action.JSClick(getDriver(), globalGoToCourseTopic3);
			Thread.sleep(12000);
			action.moveToElement(getDriver(), greenBackToDashboardTopic3);
			action.JSClick(getDriver(), greenBackToDashboardTopic3);
			Thread.sleep(8000);

			Log.info("Global Course Topic 4");
			action.JSClick(getDriver(), dashboardBtn);
			action.JSClick(getDriver(), coursesTab);
			action.JSClick(getDriver(), globalCourseTab);
			Thread.sleep(6000);
			action.scrollByVisibilityOfElement(getDriver(), globalGoToCourseTopic4);
			Thread.sleep(3000);
			action.moveToElement(getDriver(), globalGoToCourseTopic4);
			action.JSClick(getDriver(), globalGoToCourseTopic4);
			Thread.sleep(12000);
			action.moveToElement(getDriver(), greenBackToDashboard);
			action.JSClick(getDriver(), greenBackToDashboard);
			Thread.sleep(8000);

			Log.info("Global Course Topic 5");
			action.JSClick(getDriver(), dashboardBtn);
			action.JSClick(getDriver(), coursesTab);
			action.JSClick(getDriver(), globalCourseTab);
			Thread.sleep(6000);
			action.scrollByVisibilityOfElement(getDriver(), globalGoToCourseTopic5);
			Thread.sleep(3000);
			action.moveToElement(getDriver(), globalGoToCourseTopic5);
			action.JSClick(getDriver(), globalGoToCourseTopic5);
			Thread.sleep(12000);
			action.moveToElement(getDriver(), greenBackToDashboard);
			action.JSClick(getDriver(), greenBackToDashboard);
			Thread.sleep(8000);

			Log.info("Global Course Topic 6");
			action.JSClick(getDriver(), dashboardBtn);
			action.JSClick(getDriver(), coursesTab);
			action.JSClick(getDriver(), globalCourseTab);
			Thread.sleep(6000);
			action.scrollByVisibilityOfElement(getDriver(), globalGoToCourseTopic6);
			Thread.sleep(3000);
			action.moveToElement(getDriver(), globalGoToCourseTopic6);
			action.JSClick(getDriver(), globalGoToCourseTopic6);
			Thread.sleep(12000);
			action.moveToElement(getDriver(), greenBackToDashboard);
			action.JSClick(getDriver(), greenBackToDashboard);
			Thread.sleep(8000);

			Log.info("Global Course Topic 7");
			action.JSClick(getDriver(), dashboardBtn);
			action.JSClick(getDriver(), coursesTab);
			action.JSClick(getDriver(), globalCourseTab);
			Thread.sleep(6000);
			action.scrollByVisibilityOfElement(getDriver(), globalGoToCourseTopic7);
			Thread.sleep(3000);
			action.moveToElement(getDriver(), globalGoToCourseTopic7);
			action.JSClick(getDriver(), globalGoToCourseTopic7);
			Thread.sleep(12000);
			action.moveToElement(getDriver(), greenBackToDashboard);
			action.JSClick(getDriver(), greenBackToDashboard);
			Thread.sleep(8000);
		
	}
}
