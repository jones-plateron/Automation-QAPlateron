package com.stepdefinition;

import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RMS_Employee_Management_definition extends BaseClass {
	
	PageManager pma = new PageManager();
	
	public RMS_Employee_Management_definition() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
		
	@Given("Login to the restaurant with {string} and {string}")
	public void loginToTheRestaurantWithAnd(String string, String string2) {
	}
	@When("User should redirects to employees section")
	public void userShouldRedirectsToEmployeesSection() {
	}
	@Then("User should verify the jobs dropdown contains the list of available jobs")
	public void userShouldVerifyTheJobsDropdownContainsTheListOfAvailableJobs() {
	}
	@Then("User should click on Add Employee button and verify the Slide pop-up")
	public void userShouldClickOnAddEmployeeButtonAndVerifyTheSlidePopUp() {
	}
	@Then("User should click save button and verify the Error Messages in Mandatory Fields {string} and {string}")
	public void userShouldClickSaveButtonAndVerifyTheErrorMessagesInMandatoryFieldsAnd(String string, String string2) {
	}
	@Then("User should verify the PIN Generation section")
	public void userShouldVerifyThePINGenerationSection() {
	}
	@Then("User should verify the Basic informations section")
	public void userShouldVerifyTheBasicInformationsSection() {
	}
	@Then("User should verify Professional Details section")
	public void userShouldVerifyProfessionalDetailsSection() {
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
