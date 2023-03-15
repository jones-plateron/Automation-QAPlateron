package com.stepdefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BaseClass;
import com.pagemanager.PageManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RMS_Employee_Management_definition extends BaseClass {
	
	PageManager pma = new PageManager();
	public static List<String> Roles;
	public RMS_Employee_Management_definition() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
		
	@Given("Login to the restaurant with {string} and {string}")
	public void loginToTheRestaurantWithAnd(String mobileNum, String otp) throws IOException, Exception {
		WebDriverManager.edgedriver().setup();
		
		rmsDriver =new EdgeDriver();
		rmsDriver.manage().window().maximize();
		rmsDriver.get("https://www.qa.restaurants.plateron.com/auth/login");
		rmsDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(1000);
		pma.getRMS_Employee_Management_POM().getLoginMobileNumElement().sendKeys(mobileNum);
		pma.getRMS_Employee_Management_POM().getLoginContinuebuttonElement().click();
		pma.getRMS_Employee_Management_POM().getLoginOtpElement().sendKeys(otp);
		pma.getRMS_Employee_Management_POM().getLoginVerifyOtpElement().click();
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getOverviewWelcomTextElement().getText().contains("Welcome"), "Verifying Successful Login");
		
	}
	@When("User should redirects to employees section")
	public void userShouldRedirectsToEmployeesSection() {
		pma.getRMS_Employee_Management_POM().getHomeEmployeesSectionElement().click();
	}
	@Then("User should verify the jobs filter dropdown contains the list of available jobs")
	public void userShouldVerifyTheJobsFilterDropdownContainsTheListOfAvailableJobs() throws InterruptedException {
		Roles = new ArrayList<String>();
		List<String> JobsFilter = new ArrayList<String>();
		pma.getRMS_Employee_Management_POM().getJobsSectionElement().click();
		
		List<WebElement> AllRoleElement = pma.getRMS_Employee_Management_POM().getJobsSectionRolesElement();
		for (int i = 0; i < AllRoleElement.size(); i++) {
			Roles.add(AllRoleElement.get(i).getText());
		}
		Roles.add(pma.getRMS_Employee_Management_POM().getActiveRoleElement().getText());
		//Verifying jobs Filter
		pma.getRMS_Employee_Management_POM().getEmployeesSectionElement().click();
		pma.getRMS_Employee_Management_POM().getAllJobsFilterDropdownElement().click();
		
		List<WebElement> jobRolesFilterElements = pma.getRMS_Employee_Management_POM().getJobRolesFilterElements();
		int match=0;
		for (int i = 0; i < jobRolesFilterElements.size(); i++) {
			JobsFilter.add(jobRolesFilterElements.get(i).getText());
		}
		for (int i = 1; i < JobsFilter.size(); i++) {
			String fRole = JobsFilter.get(i);
			for (int j = 0; j < Roles.size(); j++) {
				if(Roles.get(j).contains(fRole)) {
					match++;break;}}}
		Assert.assertTrue(match==Roles.size(),"Verifying Employee page Jobs Filter");
		
	}
	@Then("User should click on Add Employee button and verify the Slide pop-up")
	public void userShouldClickOnAddEmployeeButtonAndVerifyTheSlidePopUp() {
		pma.getRMS_Employee_Management_POM().getAddEmployeeBtnElement().click();
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getAddEmployeePageHeaderElement().getText().equals("Add Employee"), "Verifying the Add Employee Slide Window");
		
		
	}
	@Then("User should click save button and verify the Error Messages in Mandatory Fields {string} and {string}")
	public void userShouldClickSaveButtonAndVerifyTheErrorMessagesInMandatoryFieldsAnd(String dispName, String phoneNum) {
		pma.getRMS_Employee_Management_POM().getAddEmpSaveBtnElement().click();
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getDisplayNameTextBxErrorMsgElement().getText().equals(dispName),"Verifying Display Name Error Message");
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getPhoneNumbertextBxErrorMsgElement().getText().equals(phoneNum),"Verifying Phone Number Error Message");
	
	
	}
	@Then("User should verify the PIN Generation section")
	public void userShouldVerifyThePINGenerationSection() {
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getPinGenerationTextElement().isDisplayed());
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getPinGenerationSubTextElement().getText().equals("This PIN can be used to log in to the terminal applications"),"Verifying Generate PIN section Sub Text");
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getGeneratePinBtnElement().isDisplayed());
	}
	@Then("User should verify the Basic informations section")
	public void userShouldVerifyTheBasicInformationsSection() {
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getBasicInformationsElement().getText().equals("Basic Informations"));
		//PreDefined Inputs
		String specialCharacters="!@#$%^&*()>?<:{}|~";
		String numbers="1234567890";
		String upperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase="abcderfghijlmnopqrstuvwxyz";
		String sequence="AutoMATION!@#$%12345";
		//FirstName text Box Validation
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getFirstNameHdrElement().isDisplayed());
		pma.getRMS_Employee_Management_POM().getFirstNameTextBxElement().sendKeys(specialCharacters);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getFirstNameTextBxElement().getAttribute("value").equals(specialCharacters));
		pma.getRMS_Employee_Management_POM().getFirstNameTextBxElement().clear();
		pma.getRMS_Employee_Management_POM().getFirstNameTextBxElement().sendKeys(numbers);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getFirstNameTextBxElement().getAttribute("value").equals(numbers));
		pma.getRMS_Employee_Management_POM().getFirstNameTextBxElement().clear();
		pma.getRMS_Employee_Management_POM().getFirstNameTextBxElement().sendKeys(upperCase);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getFirstNameTextBxElement().getAttribute("value").equals(upperCase));
		pma.getRMS_Employee_Management_POM().getFirstNameTextBxElement().clear();
		pma.getRMS_Employee_Management_POM().getFirstNameTextBxElement().sendKeys(lowerCase);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getFirstNameTextBxElement().getAttribute("value").equals(lowerCase));
		pma.getRMS_Employee_Management_POM().getFirstNameTextBxElement().clear();
		pma.getRMS_Employee_Management_POM().getFirstNameTextBxElement().sendKeys(sequence);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getFirstNameTextBxElement().getAttribute("value").equals(sequence));
		//LastName text Box Validation
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getLastNameHdrElement().isDisplayed());
		pma.getRMS_Employee_Management_POM().getLastNameTextbxElement().sendKeys(specialCharacters);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getLastNameTextbxElement().getAttribute("value").equals(specialCharacters));
		pma.getRMS_Employee_Management_POM().getLastNameTextbxElement().clear();
		pma.getRMS_Employee_Management_POM().getLastNameTextbxElement().sendKeys(numbers);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getLastNameTextbxElement().getAttribute("value").equals(numbers));
		pma.getRMS_Employee_Management_POM().getLastNameTextbxElement().clear();
		pma.getRMS_Employee_Management_POM().getLastNameTextbxElement().sendKeys(upperCase);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getLastNameTextbxElement().getAttribute("value").equals(upperCase));
		pma.getRMS_Employee_Management_POM().getLastNameTextbxElement().clear();
		pma.getRMS_Employee_Management_POM().getLastNameTextbxElement().sendKeys(lowerCase);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getLastNameTextbxElement().getAttribute("value").equals(lowerCase));
		pma.getRMS_Employee_Management_POM().getLastNameTextbxElement().clear();
		pma.getRMS_Employee_Management_POM().getLastNameTextbxElement().sendKeys(sequence);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getLastNameTextbxElement().getAttribute("value").equals(sequence));
		//DisplayName text Box Validation
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getDisplayNameHdrElement().isDisplayed());
		pma.getRMS_Employee_Management_POM().getDisplayNameTextBxElement().sendKeys(specialCharacters);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getDisplayNameTextBxElement().getAttribute("value").equals(specialCharacters));
		pma.getRMS_Employee_Management_POM().getDisplayNameTextBxElement().clear();
		pma.getRMS_Employee_Management_POM().getDisplayNameTextBxElement().sendKeys(numbers);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getDisplayNameTextBxElement().getAttribute("value").equals(numbers));
		pma.getRMS_Employee_Management_POM().getDisplayNameTextBxElement().clear();
		pma.getRMS_Employee_Management_POM().getDisplayNameTextBxElement().sendKeys(upperCase);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getDisplayNameTextBxElement().getAttribute("value").equals(upperCase));
		pma.getRMS_Employee_Management_POM().getDisplayNameTextBxElement().clear();
		pma.getRMS_Employee_Management_POM().getDisplayNameTextBxElement().sendKeys(lowerCase);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getDisplayNameTextBxElement().getAttribute("value").equals(lowerCase));
		pma.getRMS_Employee_Management_POM().getDisplayNameTextBxElement().clear();
		pma.getRMS_Employee_Management_POM().getDisplayNameTextBxElement().sendKeys(sequence);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getDisplayNameTextBxElement().getAttribute("value").equals(sequence));
		//Phone Number Text Box validation
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getPhoneNumberHdrElement().isDisplayed());
		pma.getRMS_Employee_Management_POM().getPhoneNumbertextBxElement().sendKeys(specialCharacters);
		Assert.assertFalse(pma.getRMS_Employee_Management_POM().getPhoneNumbertextBxElement().getAttribute("value").equals(specialCharacters));//false
		pma.getRMS_Employee_Management_POM().getPhoneNumbertextBxElement().clear();
		pma.getRMS_Employee_Management_POM().getPhoneNumbertextBxElement().sendKeys(numbers);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getPhoneNumbertextBxElement().getAttribute("value").equals(numbers));
		pma.getRMS_Employee_Management_POM().getPhoneNumbertextBxElement().clear();
		pma.getRMS_Employee_Management_POM().getPhoneNumbertextBxElement().sendKeys(upperCase);
		Assert.assertFalse(pma.getRMS_Employee_Management_POM().getPhoneNumbertextBxElement().getAttribute("value").equals(upperCase));//false
		pma.getRMS_Employee_Management_POM().getPhoneNumbertextBxElement().clear();
		pma.getRMS_Employee_Management_POM().getPhoneNumbertextBxElement().sendKeys(lowerCase);
		Assert.assertFalse(pma.getRMS_Employee_Management_POM().getPhoneNumbertextBxElement().getAttribute("value").equals(lowerCase));//false
		pma.getRMS_Employee_Management_POM().getPhoneNumbertextBxElement().clear();
		pma.getRMS_Employee_Management_POM().getPhoneNumbertextBxElement().sendKeys(sequence);
		Assert.assertFalse(pma.getRMS_Employee_Management_POM().getPhoneNumbertextBxElement().getAttribute("value").equals(sequence));//false
		//Email Address Text Box Validation
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getEmailAddressHdrElement().isDisplayed());
		pma.getRMS_Employee_Management_POM().getEmailAddressTextBxElement().sendKeys(specialCharacters);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getEmailAddressTextBxElement().getAttribute("value").equals(specialCharacters));
		//pma.getRMS_Employee_Management_POM().getEmailAddressTextBxElement().click();
		pma.getRMS_Employee_Management_POM().getEmailAddressTextBxElement().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		pma.getRMS_Employee_Management_POM().getEmailAddressTextBxElement().sendKeys(numbers);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getEmailAddressTextBxElement().getAttribute("value").equals(numbers));
		pma.getRMS_Employee_Management_POM().getEmailAddressTextBxElement().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		pma.getRMS_Employee_Management_POM().getEmailAddressTextBxElement().sendKeys(upperCase);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getEmailAddressTextBxElement().getAttribute("value").equals(upperCase));
		pma.getRMS_Employee_Management_POM().getEmailAddressTextBxElement().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		pma.getRMS_Employee_Management_POM().getEmailAddressTextBxElement().sendKeys(lowerCase);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getEmailAddressTextBxElement().getAttribute("value").equals(lowerCase));
		pma.getRMS_Employee_Management_POM().getEmailAddressTextBxElement().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		pma.getRMS_Employee_Management_POM().getEmailAddressTextBxElement().sendKeys(sequence);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getEmailAddressTextBxElement().getAttribute("value").equals(sequence));
		
		
	}
	@Then("User should verify Professional Details section")
	public void userShouldVerifyProfessionalDetailsSection() throws InterruptedException {
		//Employee ID text Box Validation
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getProfessionalDetailsElement().isDisplayed());
		String specialCharacters="!@#$%^&*()";
		String numbers="1234567890";
		String upperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase="abcdefghijklmnopqrstuvwxyz";
		String sequence="Auto^&12MATION!@#$%12345";
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getEmployeeIDHdrElement().isDisplayed());
		pma.getRMS_Employee_Management_POM().getEmployeeIDTextBxElement().sendKeys(specialCharacters);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getEmployeeIDTextBxElement().getAttribute("value").equals("!@#$%^&*()"));
		pma.getRMS_Employee_Management_POM().getEmployeeIDTextBxElement().clear();
		pma.getRMS_Employee_Management_POM().getEmployeeIDTextBxElement().sendKeys(numbers);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getEmployeeIDTextBxElement().getAttribute("value").equals("1234567890"));
		pma.getRMS_Employee_Management_POM().getEmployeeIDTextBxElement().clear();
		pma.getRMS_Employee_Management_POM().getEmployeeIDTextBxElement().sendKeys(upperCase);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getEmployeeIDTextBxElement().getAttribute("value").equals("ABCDEFGHIJ"));
		pma.getRMS_Employee_Management_POM().getEmployeeIDTextBxElement().clear();
		pma.getRMS_Employee_Management_POM().getEmployeeIDTextBxElement().sendKeys(lowerCase);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getEmployeeIDTextBxElement().getAttribute("value").equals("abcdefghij"));
		pma.getRMS_Employee_Management_POM().getEmployeeIDTextBxElement().clear();
		pma.getRMS_Employee_Management_POM().getEmployeeIDTextBxElement().sendKeys(sequence);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getEmployeeIDTextBxElement().getAttribute("value").equals("Auto^&12MA"));
		Thread.sleep(2000);
		//Role DropDown Validation
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getRoleHdrElement().isDisplayed());
		///======================================================================================
		pma.getRMS_Employee_Management_POM().getDropDownRoleElement().click();
		List<WebElement> addEmpPgRoleDropdownElement = pma.getRMS_Employee_Management_POM().getAddEmpRoleDropdownElement();
		for (int i = 0; i < addEmpPgRoleDropdownElement.size(); i++) {
			Thread.sleep(2000);
			System.out.println(addEmpPgRoleDropdownElement.get(i).getText());
		}
		
		
	}
	@Then("User should verify the Cancel and Close button")
	public void userShouldVerifyTheCancelAndCloseButton() {
	}
	@When("User should Create an Employee with Mandatory Fields {string} {string} and {string}")
	public void userShouldCreateAnEmployeeWithMandatoryFieldsAnd(String string, String string2, String string3) {
	}
	@Then("User should verify the Employee added to the Employee list")
	public void userShouldVerifyTheEmployeeAddedToTheEmployeeList() {
	}
	@When("User should Create an Employee without Mandatory Fields {string} {string} {string} and {string}")
	public void userShouldCreateAnEmployeeWithoutMandatoryFieldsAnd(String string, String string2, String string3, String string4) {
	}
	@Then("User should verify the Error Message {string}")
	public void userShouldVerifyTheErrorMessage(String string) {
	}
	@When("User should Create an Employee with All Fields")
	public void userShouldCreateAnEmployeeWithAllFields() {
	}
	@When("User should Create a New Employee with {string} {string} and {string} and store the Employee information")
	public void userShouldCreateANewEmployeeWithAndAndStoreTheEmployeeInformation(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
	}
	@Then("User should verify the Total Employees Count")
	public void userShouldVerifyTheTotalEmployeesCount() {
	}
	@Then("User should verify the Employee list contains Owner profile")
	public void userShouldVerifyTheEmployeeListContainsOwnerProfile() {
	}
	@Then("User should verify Each Employee list contains Job type Mobile Number")
	public void userShouldVerifyEachEmployeeListContainsJobTypeMobileNumber() {
	}
	@Then("User should verify Each Employee list contains PIN and OTP section")
	public void userShouldVerifyEachEmployeeListContainsPINAndOTPSection() {
	}
	@Then("User should verify other than owner Each Employee list contains Mark as Inactive option")
	public void userShouldVerifyOtherThanOwnerEachEmployeeListContainsMarkAsInactiveOption() {
	}
	@Then("User should verify Mark as Inactive popup text and Cancel button when Clicked")
	public void userShouldVerifyMarkAsInactivePopupTextAndCancelButtonWhenClicked() {
	}
	@Then("User should verify Employee Details popup when user Clicks on Each Employee list")
	public void userShouldVerifyEmployeeDetailsPopupWhenUserClicksOnEachEmployeeList() {
	}
	@Then("user should verify the search results in Employee page using Employee name Id or Phone")
	public void userShouldVerifyTheSearchResultsInEmployeePageUsingEmployeeNameIdOrPhone() {
	}
	@Then("user should verify the text message {string} by enter UA text in Search Bar")
	public void userShouldVerifyTheTextMessageByEnterUATextInSearchBar(String string) {
	}
	@Then("Verify Each employee profile contains edit button in Employee details page")
	public void verifyEachEmployeeProfileContainsEditButtonInEmployeeDetailsPage() {
	}
	@Then("Verify user should able to modify the Employee information in RMS")
	public void verifyUserShouldAbleToModifyTheEmployeeInformationInRMS() {
	}
	@Then("Verify user should able to see the mark as Inactive button in Employee details")
	public void verifyUserShouldAbleToSeeTheMarkAsInactiveButtonInEmployeeDetails() {
	}
	@Then("User should verify Mark as Inactive popup text and Cancel button")
	public void userShouldVerifyMarkAsInactivePopupTextAndCancelButton() {
	}
	@Then("user should verify the Employee has bee moved to bottom of rms \\(as Inactive)")
	public void userShouldVerifyTheEmployeeHasBeeMovedToBottomOfRmsAsInactive() {
	}
	@Then("verify user should able to see the Employee Details page Cancel and Save button")
	public void verifyUserShouldAbleToSeeTheEmployeeDetailsPageCancelAndSaveButton() {
	}
	@Then("Verify the Popup gets closed when user clicks save or cancel after modification")
	public void verifyThePopupGetsClosedWhenUserClicksSaveOrCancelAfterModification() {
	}
	
}
