package com.sfe.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sfe.actiondriver.Action;
import com.sfe.base.BaseClass;
import com.sfe.utility.Log;

public class CoursesPageObjects extends BaseClass{

	public CoursesPageObjects() {
		PageFactory.initElements(getDriver(), this);
	}
	
	Action action = new Action();


	@FindBy(xpath = "//div[@class=\"mr-auto navbar-nav\"]/child::a[text()='Courses']")
	private WebElement coursesBtn;
	
	@FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected foundational-tab css-1q2h7u5\"]")
	private WebElement foundationalBtn;
	
	@FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary global-tab css-1q2h7u5\"]")
	private WebElement globalBtn;
	
	@FindBy(xpath = "(//button[@class=\"custom-responsive-btn\"])[1]")
	private WebElement details1;
	
	@FindBy(xpath = "(//button[@class=\"custom-responsive-btn\"])[2]")
	private WebElement details2;
	
	@FindBy(xpath = "(//button[@class=\"custom-responsive-btn\"])[3]")
	private WebElement details3;
	
	@FindBy(xpath = "(//button[@class=\"custom-responsive-btn\"])[4]")
	private WebElement details4;
	
	@FindBy(xpath = "(//button[@class=\"custom-responsive-btn\"])[5]")
	private WebElement details5;

	@FindBy(xpath = "(//button[@class=\"custom-responsive-btn\"])[6]")
	private WebElement details6;

	@FindBy(xpath = "(//button[@class=\"custom-responsive-btn\"])[7]")
	private WebElement details7;
	
	@FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk\"]//span")
	private WebElement deleteBtn;
	
	public void coursesPage() throws InterruptedException {
		Log.startTestCase("Courses Page");
		
		action.implicitWait(getDriver(), 30);
		action.JSClick(getDriver(), coursesBtn);
		action.scrollByVisibilityOfElement(getDriver(), foundationalBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), foundationalBtn);
		action.JSClick(getDriver(), foundationalBtn);
		Thread.sleep(1000);
		
		action.scrollByVisibilityOfElement(getDriver(), globalBtn);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), globalBtn);
		action.JSClick(getDriver(), globalBtn);
		
		action.scrollByVisibilityOfElement(getDriver(), details1);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), details1);
		action.JSClick(getDriver(), details1);
		Thread.sleep(1000);
		action.scrollByVisibilityOfElement(getDriver(), deleteBtn);
		Thread.sleep(3000);
		action.moveToElement(getDriver(), deleteBtn);
		action.JSClick(getDriver(), deleteBtn);
		
		action.scrollByVisibilityOfElement(getDriver(), details2);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), details2);
		action.JSClick(getDriver(), details2);
		Thread.sleep(1000);
		action.scrollByVisibilityOfElement(getDriver(), deleteBtn);
		Thread.sleep(3000);
		action.moveToElement(getDriver(), deleteBtn);
		action.JSClick(getDriver(), deleteBtn);
		
		action.scrollByVisibilityOfElement(getDriver(), details3);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), details3);
		action.JSClick(getDriver(), details3);
		Thread.sleep(1000);
		action.scrollByVisibilityOfElement(getDriver(), deleteBtn);
		Thread.sleep(3000);
		action.moveToElement(getDriver(), deleteBtn);
		action.JSClick(getDriver(), deleteBtn);
		
		action.scrollByVisibilityOfElement(getDriver(), details4);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), details4);
		action.JSClick(getDriver(), details4);
		Thread.sleep(1000);
		action.scrollByVisibilityOfElement(getDriver(), deleteBtn);
		Thread.sleep(3000);
		action.moveToElement(getDriver(), deleteBtn);
		action.JSClick(getDriver(), deleteBtn);
		
		action.scrollByVisibilityOfElement(getDriver(), details5);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), details5);
		action.JSClick(getDriver(), details5);
		Thread.sleep(1000);
		action.scrollByVisibilityOfElement(getDriver(), deleteBtn);
		Thread.sleep(3000);
		action.moveToElement(getDriver(), deleteBtn);
		action.JSClick(getDriver(), deleteBtn);
		
		action.scrollByVisibilityOfElement(getDriver(), details6);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), details6);
		action.JSClick(getDriver(), details6);
		Thread.sleep(1000);
		action.scrollByVisibilityOfElement(getDriver(), deleteBtn);
		Thread.sleep(3000);
		action.moveToElement(getDriver(), deleteBtn);
		action.JSClick(getDriver(), deleteBtn);
		
		action.scrollByVisibilityOfElement(getDriver(), details7);
		Thread.sleep(1000);
		action.moveToElement(getDriver(), details7);
		action.JSClick(getDriver(), details7);
		Thread.sleep(1000);
		action.scrollByVisibilityOfElement(getDriver(), deleteBtn);
		Thread.sleep(3000);
		action.moveToElement(getDriver(), deleteBtn);
		action.JSClick(getDriver(), deleteBtn);
		Log.endTestCase("Courses Page");
	}
	
	public FooterObjects getCoursesPageObjects() {
		return new FooterObjects();
	}
	
}
