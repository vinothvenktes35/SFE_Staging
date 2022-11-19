package com.sfe.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.sfe.actiondriver.Action;
import com.sfe.base.BaseClass;

import com.sfe.utility.Log;

public class ProfilePageObjects extends BaseClass {

	Action action = new Action();

	@FindBy(xpath = "(//input[@id=\"file\"]/following::div)[1]")
	private WebElement profilePictureEdit;

	@FindBy(xpath = "(//div[@class=\"profile-icons-section\"]/span)[1]")
	private WebElement profileEditEyeIcon;

	@FindBy(xpath = "//div[@class=\"profile-icons-section non-mobile\"]/span/span")
	private WebElement profileEditIcon;

	@FindBy(xpath = "//input[@id=\"fname\"]")
	private WebElement profilefirstName;

	@FindBy(xpath = "//input[@id=\"lname\"]")
	private WebElement profileLastName;

	@FindBy(xpath = "(//input[@id=\"fullWidth\"])[2]")
	private WebElement profileCompanyName;

	@FindBy(xpath = "(//input[@id=\"fullWidth\"])[3]")
	private WebElement profileDesignation;

	@FindBy(xpath = "(//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium MuiAutocomplete-popupIndicator css-uge3vf\"])[1]")
	private WebElement ProfileCountryDdn;

	@FindBy(xpath = "//input[@id=\"mui-6\"]")
	private WebElement ProfileCountryDdnTxt;

	@FindBy(xpath = "(//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium MuiAutocomplete-popupIndicator css-uge3vf\"])[2]")
	private WebElement profileIndustryDdn;

	@FindBy(xpath = "//input[@id=\"mui-8\"]")
	private WebElement ProfileIndustryDdnTxt;

	@FindBy(xpath = "//div[@class=\"MuiFormControl-root css-1he5rj2\"]/div")
	private WebElement profileCompanyDdn;

	
	@FindAll({
		@FindBy(xpath="//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiMenu-paper MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper css-177ic5c\"]/ul/li")
	})
	private List<WebElement> profileCompanySizeDdnOptions;
	
	
	@FindBy(xpath = "//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-r8u8y9\"]/li")
	private WebElement profileCompanySizeDdnTxt;

	@FindBy(xpath = "//input[@id=\"fullWidth\" and @name=\"tax_id\"]")
	private WebElement profileTaxID;

	@FindBy(xpath = "//button[@class=\"custom-responsive-btn\"]")
	private WebElement profileSaveBtn;

	public ProfilePageObjects() {
		PageFactory.initElements(getDriver(), this);
	}

	public String getProfilePageURL() {
		String result = getDriver().getCurrentUrl();
		return result;
	}

	public PaymentPageObjects editProfile(String imagePath, String fName, String lName, String companyName, String designation,
			String country, String industry, String companySize, String taxId)
			throws InterruptedException, AWTException {
		
		Log.startTestCase("profile Page");
		Thread.sleep(2000);
		action.click(getDriver(), profilePictureEdit);
//		action.type(profilePictureEdit, imagePath);
		Thread.sleep(2000);
		action.uploadUsingRobotClass(imagePath);
		Thread.sleep(2000);
		Log.info("profile image updated successfully");
		Thread.sleep(5000);
       
		Log.startTestCase("profile Page");
		Thread.sleep(2000);
		action.click(getDriver(), profilePictureEdit);
		Thread.sleep(2000);
		action.uploadUsingRobotClass(imagePath);
		
        Log.info("click on profile edit icon");
		action.moveToElement(getDriver(), profileEditIcon);
		action.JSClick(getDriver(), profileEditIcon);

		Log.info("Enter first name");
		action.JSClick(getDriver(), profilefirstName);
		action.type(profilefirstName, fName);

		Log.info("Enter last name");
		action.JSClick(getDriver(), profileLastName);
		action.type(profileLastName, lName);

		Log.info("Enter company name");
		action.JSClick(getDriver(), profileCompanyName);
		action.type(profileCompanyName, companyName);

		Log.info("Enter designation name");
		action.JSClick(getDriver(), profileDesignation);
		action.clearWebField(profileDesignation);
		action.type(profileDesignation, designation);

		Log.info("country");
		action.JSClick(getDriver(), ProfileCountryDdn);
		Thread.sleep(1000);
		action.clearWebField(ProfileCountryDdnTxt);
		action.type(ProfileCountryDdnTxt, country);
		Thread.sleep(1000);
		action.enter();

		Log.info("industry");
		action.JSClick(getDriver(), profileIndustryDdn);
		Thread.sleep(1000);
		action.clearWebField(ProfileIndustryDdnTxt);
		action.type(ProfileIndustryDdnTxt, industry);
		Thread.sleep(1000);
		action.enter();
		Thread.sleep(3000);

		Log.info("Company Size");
		action.JSClick(getDriver(), profileCompanyDdn);
		action.enter();
		Thread.sleep(2000);
		action.bootStrapDropdown(getDriver(), profileCompanySizeDdnOptions, companySize);
		Thread.sleep(2000);
		
		
		Log.info("Tax Id");
		action.type(profileTaxID, taxId);
		Thread.sleep(2000);
		action.clearWebField(profileTaxID);
		action.type(profileTaxID, taxId);

		Log.info("Click save button");
		action.JSClick(getDriver(), profileSaveBtn);
		Thread.sleep(4000);
		Log.endTestCase("profile Page");
		return new PaymentPageObjects();
		
	}

	public PaymentPageObjects profile() {
		
		return new PaymentPageObjects();
		
	}

}
