package com.stepdefinition;

import static org.testng.Assert.assertThrows;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
	public void userShouldRedirectsToEmployeesSection() throws InterruptedException {
		pma.getRMS_Employee_Management_POM().getHomeEmployeesSectionElement().click();Thread.sleep(1000);
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
	public void userShouldClickOnAddEmployeeButtonAndVerifyTheSlidePopUp() throws InterruptedException {
		pma.getRMS_Employee_Management_POM().getAddEmployeeBtnElement().click();
		Thread.sleep(500);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getAddEmployeePageHeaderElement().getText().equals("Add Employee"), "Verifying the Add Employee Slide Window");
		
		
	}
	@Then("User should click save button and verify the Error Messages in Mandatory Fields {string} and {string}")
	public void userShouldClickSaveButtonAndVerifyTheErrorMessagesInMandatoryFieldsAnd(String dispName, String phoneNum) throws InterruptedException {
		pma.getRMS_Employee_Management_POM().getAddEmpSaveBtnElement().click();
		Thread.sleep(500);
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
		pma.getRMS_Employee_Management_POM().getDropDownRoleElement().click();		
		List<WebElement> addEmpPgRoleDropdownElement = pma.getRMS_Employee_Management_POM().getAddEmpRoleDropdownElement();
		int match=0;
		for (int i = 1; i < addEmpPgRoleDropdownElement.size(); i++) {
			String addEmployeeDropRole = addEmpPgRoleDropdownElement.get(i).getText();
			for (int j = 0; j < Roles.size() ; j++) {
				if(Roles.get(j).contains(addEmployeeDropRole)) {
				match++;break;
				}}}
		Assert.assertTrue(match==Roles.size(), "Verifying Add Employee page Role Dropdown");
	}
	@Then("User should verify the Cancel and Close button")
	public void userShouldVerifyTheCancelAndCloseButton() {
		pma.getRMS_Employee_Management_POM().getAddEmpCancelBtnElement().click();
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getSaveChangesPopHdrElement().getText().equals("Save Changes"),"Verifying Save Changes Pop-up");
		pma.getRMS_Employee_Management_POM().getSaveChangesPopSubTxtElement().getText().equals("Would you like to leave the page without saving the edited items?");
		pma.getRMS_Employee_Management_POM().getSaveChangesPopCancelBtnElement().click();
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getAddEmployeePageHeaderElement().getText().equals("Add Employee"), "Verifying the Add Employee Slide Window");
		pma.getRMS_Employee_Management_POM().getAddEmpCancelBtnElement().click();
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getSaveChangesPopHdrElement().getText().equals("Save Changes"),"Verifying Save Changes Pop-up");
		pma.getRMS_Employee_Management_POM().getSaveChangespopCloseElement().click();
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getAddEmployeePageHeaderElement().getText().equals("Add Employee"), "Verifying the Add Employee Slide Window");
		pma.getRMS_Employee_Management_POM().getAddEmpCancelBtnElement().click();
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getSaveChangesPopHdrElement().getText().equals("Save Changes"),"Verifying Save Changes Pop-up");
		pma.getRMS_Employee_Management_POM().getSaveChangesPopSaveBtnElement().click();
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getAddEmployeeBtnElement().isDisplayed());
		rmsDriver.quit();
	}
	@When("User should Create an Employee with Mandatory Fields {string} {string} and {string}")
	public void userShouldCreateAnEmployeeWithMandatoryFieldsAnd(String dispName, String phone, String role) {
		//pma.getRMS_Employee_Management_POM().getAddEmpCancelBtnElement().click();
		//Remove the above line and change New Emp Details in Feature File
		pma.getRMS_Employee_Management_POM().getDisplayNameTextBxElement().sendKeys(dispName);
		pma.getRMS_Employee_Management_POM().getPhoneNumbertextBxElement().sendKeys(phone);
		pma.getRMS_Employee_Management_POM().getDropDownRoleWOErrorElement().click();
		
		List<WebElement> addEmpRoleDropdownElements = pma.getRMS_Employee_Management_POM().getAddEmpRoleDropdownElement();
		
		for (int i = 1; i < addEmpRoleDropdownElements.size(); i++) {
			if(addEmpRoleDropdownElements.get(i).getText().equalsIgnoreCase(role))
			{
				addEmpRoleDropdownElements.get(i).click();
			}
		}
		pma.getRMS_Employee_Management_POM().getAddEmpSaveBtnElement().click();
		
		
		List<WebElement> indvEmployeeListElement = pma.getRMS_Employee_Management_POM().getIndvEmployeeListElement();
		boolean check=false;
		for (int i = 0; i < indvEmployeeListElement.size(); i++) {
			if(indvEmployeeListElement.get(i).getText().contains(dispName)&&indvEmployeeListElement.get(i).getText().contains(role)) {	
				check=true;
				break;}		
			}
		Assert.assertTrue(check);
	}
	@Then("User should verify the Employee added to the Employee list")
	public void userShouldVerifyTheEmployeeAddedToTheEmployeeList() {
	}
	
	@When("User should Create an Employee without Mandatory Fields {string} {string} {string} and {string}")
	public void userShouldCreateAnEmployeeWithoutMandatoryFieldsAnd(String firstName, String lastName, String email, String empID) {
		pma.getRMS_Employee_Management_POM().getAddEmployeeBtnElement().click();
		pma.getRMS_Employee_Management_POM().getFirstNameTextBxElement().sendKeys(firstName);
		pma.getRMS_Employee_Management_POM().getLastNameTextbxElement().sendKeys(lastName);
		pma.getRMS_Employee_Management_POM().getEmailAddressTextBxElement().sendKeys(email);
		pma.getRMS_Employee_Management_POM().getEmployeeIDTextBxElement().sendKeys(empID);
		pma.getRMS_Employee_Management_POM().getAddEmpSaveBtnElement().click();
	}
	@Then("User should verify the Error Message {string}")
	public void userShouldVerifyTheErrorMessage(String errMsg) throws InterruptedException {
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getPhoneNumbertextBxErrorMsgElement().getText().equals(errMsg), "Verifying phone Error Message");
		
		pma.getRMS_Employee_Management_POM().getEmailAddressTextBxElement().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		pma.getRMS_Employee_Management_POM().getEmailAddressTextBxElement().sendKeys("TestAuto");
		pma.getRMS_Employee_Management_POM().getEmailAddressTextBxElement().click();
		pma.getRMS_Employee_Management_POM().getAddEmpSaveBtnElement().click();
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getEmailAddressTextBxErrorMsgElement().getText().contains("Please enter valid email"), "Verifying Email Error Message");
		
		pma.getRMS_Employee_Management_POM().getFirstNameTextBxElement().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		pma.getRMS_Employee_Management_POM().getLastNameTextbxElement().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		pma.getRMS_Employee_Management_POM().getAddEmpSaveBtnElement().click();
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getDisplayNameTextBxErrorMsgElement().getText().contains("Please enter valid display name"), "Verifying Display Name Error Message");
	}
	
	@When("User should Create a New Employee and store the Employee information")
	public void UserShouldCreateANewEmployeeAndStoreTheEmployeeInformation(io.cucumber.datatable.DataTable dataTable) {
	
		
		List<Map<String,String>> asMaps = dataTable.asMaps();
		
		for (int i = 0; i < asMaps.size(); i++) {
//			System.out.println(asMaps.get(i).get("DispName"));
//			System.out.println(asMaps.get(i).get("phoneNo"));
//			System.out.println(asMaps.get(i).get("Role"));
			try {
				pma.getRMS_Employee_Management_POM().getAddEmployeeBtnElement().click();	
			} catch (Exception e) {}
			pma.getRMS_Employee_Management_POM().getDisplayNameTextBxElement().sendKeys(asMaps.get(i).get("DispName"));
			pma.getRMS_Employee_Management_POM().getPhoneNumbertextBxElement().sendKeys(asMaps.get(i).get("phoneNo"));
			
			pma.getRMS_Employee_Management_POM().getDropDownRoleWOErrorElement().click();
			List<WebElement> elements = pma.getRMS_Employee_Management_POM().getAddEmpRoleDropdownElement();
			for (int j = 0; j < elements.size(); j++) {
				if(elements.get(j).getText().contains(asMaps.get(i).get("Role"))){
					pma.getRMS_Employee_Management_POM().getAddEmpRoleDropdownElement().get(j).click();
					break;
				}	
			}
			pma.getRMS_Employee_Management_POM().getAddEmpSaveBtnElement().click();
		}
	}
	@Then("User should verify the Total Employees Count")
	public void userShouldVerifyTheTotalEmployeesCount() {
		//getTotalEmpElement-getInActiveEmployeeElement
		List<WebElement> indvEmployeeListElement = pma.getRMS_Employee_Management_POM().getIndvEmployeeListElement();
		List<WebElement> inActiveEmployeeElement = pma.getRMS_Employee_Management_POM().getInActiveEmployeeElement();
		int ActtotalEmp = indvEmployeeListElement.size()+inActiveEmployeeElement.size();
		String string = Integer.toString(ActtotalEmp);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getTotalEmpElement().getText().contains(string),"Verifying total Employees Count");
	}
	@Then("User should verify the Employee list contains Owner profile")
	public void userShouldVerifyTheEmployeeListContainsOwnerProfile() throws InterruptedException {
		List<WebElement> indvEmployeeListElement = pma.getRMS_Employee_Management_POM().getIndvEmployeeListElement();
		for (int i = 0; i < indvEmployeeListElement.size(); i++) {
			try {
				indvEmployeeListElement.get(i).findElement(By.xpath("//span[@class='user-profile user-active-label']")).click();
				System.out.println(pma.getRMS_Employee_Management_POM().getEmployeeRoleInEMPDETpageElement().getText());
				Thread.sleep(1000);
				Assert.assertTrue(pma.getRMS_Employee_Management_POM().getEmployeeRoleInEMPDETpageElement().getText().contains("Owner"));
				break;
			} catch (Exception e) {			}
		}
		pma.getRMS_Employee_Management_POM().getAddEmpCloseElement().click();
	}
	@Then("User should verify Each Employee list contains Job type Mobile Number")
	public void userShouldVerifyEachEmployeeListContainsJobTypeMobileNumber() {
		List<WebElement> indvEmployeeListElement = pma.getRMS_Employee_Management_POM().getIndvEmployeeListElement();
		List<WebElement> inActiveEmployeeElement = pma.getRMS_Employee_Management_POM().getInActiveEmployeeElement();
		int ActtotalEmp = indvEmployeeListElement.size()+inActiveEmployeeElement.size();
		
		List<WebElement> empListJobElements = pma.getRMS_Employee_Management_POM().getEmpListJobElements();
		Assert.assertTrue(ActtotalEmp==empListJobElements.size(), "Verifying Job roles");
	}
	@Then("User should verify Each Employee list contains PIN and OTP section")
	public void userShouldVerifyEachEmployeeListContainsPINAndOTPSection() {
		List<WebElement> indvEmployeeListElement = pma.getRMS_Employee_Management_POM().getIndvEmployeeListElement();
		List<WebElement> inActiveEmployeeElement = pma.getRMS_Employee_Management_POM().getInActiveEmployeeElement();
		int ActtotalEmp = indvEmployeeListElement.size()+inActiveEmployeeElement.size();
		
		List<WebElement> pinInsideListElements = pma.getRMS_Employee_Management_POM().getPINInsideListElements();
		Assert.assertTrue(ActtotalEmp==pinInsideListElements.size(), "Verifying Job roles");
	}
	@Then("User should verify other than owner Each Employee list contains Mark as Inactive option")
	public void userShouldVerifyOtherThanOwnerEachEmployeeListContainsMarkAsInactiveOption() {
			List<WebElement> moreIconElements = rmsDriver.findElements(By.xpath("//button//i[contains(@class,'icon-icon-ellipsis-v icon-3x mr-1')]"));
			List<WebElement> inActiveEmployeeElement = pma.getRMS_Employee_Management_POM().getInActiveEmployeeElement();
			int j=1;
		
			for (int i = 0; i < (moreIconElements.size()-inActiveEmployeeElement.size()); i++) {
				moreIconElements.get(i).click();
				Assert.assertTrue(pma.getRMS_Employee_Management_POM().getMarkasInactiveInsideListElement(j).isDisplayed());
				j++;
			}
	}
	@Then("User should verify Mark as Inactive popup text and Cancel button when Clicked")
	public void userShouldVerifyMarkAsInactivePopupTextAndCancelButtonWhenClicked() throws InterruptedException {
		rmsDriver.navigate().refresh();
		List<WebElement> moreIconElements = rmsDriver.findElements(By.xpath("//button//i[contains(@class,'icon-icon-ellipsis-v icon-3x mr-1')]"));
		List<WebElement> inActiveEmployeeElement = pma.getRMS_Employee_Management_POM().getInActiveEmployeeElement();
		int j=1;
			for (int i = 0; i < (moreIconElements.size()-inActiveEmployeeElement.size()); i++) {
				moreIconElements.get(i).click();
				Assert.assertTrue(pma.getRMS_Employee_Management_POM().getMarkasInactiveInsideListElement(j).isDisplayed());
				
				pma.getRMS_Employee_Management_POM().getMarkasInactiveInsideListElement(j).click();
				Assert.assertTrue(pma.getRMS_Employee_Management_POM().getMarkasInActivpopHdrElement().isDisplayed());
				Assert.assertTrue(pma.getRMS_Employee_Management_POM().getMarkasInActivepopCancelBtnElement().isDisplayed());
				Assert.assertTrue(pma.getRMS_Employee_Management_POM().getMarkasInActivepopSaveElement().isDisplayed());
				Assert.assertTrue(pma.getRMS_Employee_Management_POM().getMarkasInActivepopTextElement().getText().contains("Would you like to mark")&&pma.getRMS_Employee_Management_POM().getMarkasInActivepopTextElement().getText().contains("inactive ?"));
				pma.getRMS_Employee_Management_POM().getMarkasInActivepopCloseElement().click();
				j++;
			}
			Thread.sleep(3000);
	}
	@Then("User should verify Employee Details popup when user Clicks on Each Employee list")
	public void userShouldVerifyEmployeeDetailsPopupWhenUserClicksOnEachEmployeeList() throws InterruptedException {
		List<WebElement> indvEmployeeListElement = pma.getRMS_Employee_Management_POM().getIndvEmployeeListElement();
		System.out.println(indvEmployeeListElement.size());
		for (int i = 0; i < indvEmployeeListElement.size(); i++) {
			indvEmployeeListElement.get(i).click();
			Thread.sleep(100);
			Assert.assertTrue(pma.getRMS_Employee_Management_POM().getAddEmployeePageHeaderElement().getText().contains("Employee Details"));
			pma.getRMS_Employee_Management_POM().getAddEmpCloseElement().click();
		}
	}
	@Then("user should verify the search results in Employee page using Employee name Id or Phone")
	public void userShouldVerifyTheSearchResultsInEmployeePageUsingEmployeeNameIdOrPhone() {
		pma.getRMS_Employee_Management_POM().getSearchBarElement().sendKeys("jones");
		List<WebElement> indvEmployeeListElement = pma.getRMS_Employee_Management_POM().getIndvEmployeeListElement();
		List<WebElement> inActiveEmployeeElement = pma.getRMS_Employee_Management_POM().getInActiveEmployeeElement();
		int ActtotalEmp = indvEmployeeListElement.size()+inActiveEmployeeElement.size();
		String string = Integer.toString(ActtotalEmp);
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getTotalEmpElement().getText().contains(string),"Verifying total Employees Count");
		
		
		
		
		
		
		
	}
	@Then("user should verify the text message {string} by enter UA text in Search Bar")
	public void userShouldVerifyTheTextMessageByEnterUATextInSearchBar(String string) {
		pma.getRMS_Employee_Management_POM().getAddEmpCloseElement().click();
		//Remove above line 
		pma.getRMS_Employee_Management_POM().getSearchBarElement().sendKeys("ygd6767");
		Assert.assertTrue(pma.getRMS_Employee_Management_POM().getNoResultsTextElement().getText().equals(string));
		pma.getRMS_Employee_Management_POM().getSearchBarElement().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	}
	@Then("Verify Each employee profile contains edit button in Employee details page")
	public void verifyEachEmployeeProfileContainsEditButtonInEmployeeDetailsPage() throws InterruptedException {
		List<WebElement> indvEmployeeListElement = pma.getRMS_Employee_Management_POM().getIndvEmployeeListElement();
		System.out.println(indvEmployeeListElement.size());int j=1;
		for (int i = 0; i < indvEmployeeListElement.size(); i++,j++) {
			String empListDispName = pma.getRMS_Employee_Management_POM().getEmpNameInsideListElement(j).getText();
			System.out.println(empListDispName);
			String empListEmpID = pma.getRMS_Employee_Management_POM().getEmpIDInsideListElement(j).getText();
			System.out.println(empListEmpID);
			String empListRole = pma.getRMS_Employee_Management_POM().getJobTypeInsideListElement(j).getText();
			System.out.println(empListRole);
			String empListEmail = pma.getRMS_Employee_Management_POM().getEmailInsideListIfElement(j).getText();
			System.out.println(empListEmail);
			String empListMobile = pma.getRMS_Employee_Management_POM().getPhoneInsideListElement(j).getText();
			System.out.println(empListMobile);
			Thread.sleep(100);
			indvEmployeeListElement.get(i).click();Thread.sleep(300);
			String SlideDispName1 = pma.getRMS_Employee_Management_POM().getSlideEmpNameElement().getText();Thread.sleep(300);
			//String SlidePIN = pma.getRMS_Employee_Management_POM().getSlidePINElement().getText();
			String SlideDispName2 = pma.getRMS_Employee_Management_POM().getSlideDisplayNameElement().getText();Thread.sleep(100);
			String SlidePhone = pma.getRMS_Employee_Management_POM().getSlidePhoneElement().getText();Thread.sleep(100);
			String SlideEmail = pma.getRMS_Employee_Management_POM().getSlideEmailElement().getText();Thread.sleep(100);
			String SlideRole = pma.getRMS_Employee_Management_POM().getSlideRoleElement().getText();Thread.sleep(100);
			
			
			System.out.println(SlideDispName1);
			//System.out.println(SlidePIN);
			System.out.println(SlideDispName2);
			System.out.println(SlidePhone);
			System.out.println(SlideEmail);
			System.out.println(SlideRole);
			//verify
			
			//getSlideEmpNameElement
			
			
			
			
			Thread.sleep(100);
			//indvEmployeeListElement.get(i).click();
			Thread.sleep(300);
			Assert.assertTrue(pma.getRMS_Employee_Management_POM().getEditBtnEmpDetailsElement().isDisplayed());
			Thread.sleep(300);
			pma.getRMS_Employee_Management_POM().getAddEmpCloseElement().click();Thread.sleep(300);
			break;
		}//need to add individual validation
		
		
		
		
	}
	@Then("Verify user should able to modify the Employee information in RMS")
	public void verifyUserShouldAbleToModifyTheEmployeeInformationInRMS() throws InterruptedException {//inprogress
		List<WebElement> indvEmployeeListElement = pma.getRMS_Employee_Management_POM().getIndvEmployeeListElement();
		System.out.println(indvEmployeeListElement.size());
		for (int i = 0; i < indvEmployeeListElement.size(); i++) {
			Thread.sleep(100);
			indvEmployeeListElement.get(i).click();
			Thread.sleep(300);
			Assert.assertTrue(pma.getRMS_Employee_Management_POM().getAddEmployeePageHeaderElement().getText().contains("Employee Details"));
			Thread.sleep(1000);
			//Modify WAAAAAAAAIT
			//pma.getRMS_Employee_Management_POM().getEditBtnEmpDetailsElement().click();
			
			
			
			
			Thread.sleep(300);
			pma.getRMS_Employee_Management_POM().getAddEmpCloseElement().click();Thread.sleep(300);
		}
		
	}
	@Then("Verify user should able to see the mark as Inactive button in Employee details")
	public void verifyUserShouldAbleToSeeTheMarkAsInactiveButtonInEmployeeDetails() {
		//Covered in Above Method
	}
	@Then("User should verify Mark as Inactive popup text and Cancel button")
	public void userShouldVerifyMarkAsInactivePopupTextAndCancelButton() throws InterruptedException {
		//Covered in Above Method
		List<WebElement> indvEmployeeListElement = pma.getRMS_Employee_Management_POM().getIndvEmployeeListElement();
		System.out.println(indvEmployeeListElement.size());
		for (int i = 0; i < indvEmployeeListElement.size(); i++) {
			indvEmployeeListElement.get(i).click();
			Thread.sleep(100);
			Assert.assertTrue(pma.getRMS_Employee_Management_POM().getAddEmployeePageHeaderElement().getText().contains("Employee Details"));
			Thread.sleep(1000);
			Assert.assertTrue(pma.getRMS_Employee_Management_POM().getEditBtnEmpDetailsElement().isDisplayed());
			Thread.sleep(300);
			if(pma.getRMS_Employee_Management_POM().getEmpRoleInsideEmpDeBefEditElement().getText().equals("Owner")) {//getEmpRoleInsideEmpDeBefEditElement
				pma.getRMS_Employee_Management_POM().getAddEmpCloseElement().click();
			}else {
			
			pma.getRMS_Employee_Management_POM().getMarkAsInactiveEmpDetailsElement().click();
			Assert.assertTrue(pma.getRMS_Employee_Management_POM().getMarkasInActivpopHdrElement().isDisplayed());
			Assert.assertTrue(pma.getRMS_Employee_Management_POM().getMarkasInActivepopTextElement().getText().contains("Would you like to mark "));
			Assert.assertTrue(pma.getRMS_Employee_Management_POM().getMarkasInActivepopTextElement().getText().contains(" inactive ?"));
			Thread.sleep(300);
			Assert.assertTrue(pma.getRMS_Employee_Management_POM().getMarkasInActivepopSaveElement().isDisplayed());
			Thread.sleep(300);
			Assert.assertTrue(pma.getRMS_Employee_Management_POM().getMarkasInActivepopCancelBtnElement().isDisplayed());
			Thread.sleep(300);
			pma.getRMS_Employee_Management_POM().getMarkasInActivepopCloseElement().click();
			Thread.sleep(300);
			pma.getRMS_Employee_Management_POM().getAddEmpCloseElement().click();
			}
		}
	}
	@Then("user should verify the Employee has bee moved to bottom of rms \\(as Inactive)")
	public void userShouldVerifyTheEmployeeHasBeeMovedToBottomOfRmsAsInactive() throws InterruptedException {
		List<WebElement> indvEmployeeListElement = pma.getRMS_Employee_Management_POM().getIndvEmployeeListElement();
		System.out.println(indvEmployeeListElement.size());
		for (int i = 0; i < 5; i++) {
			Thread.sleep(100);
			indvEmployeeListElement.get(i).click();
			Thread.sleep(100);
			Assert.assertTrue(pma.getRMS_Employee_Management_POM().getAddEmployeePageHeaderElement().getText().contains("Employee Details"));
			Thread.sleep(1000);
			Assert.assertTrue(pma.getRMS_Employee_Management_POM().getEditBtnEmpDetailsElement().isDisplayed());
			Thread.sleep(100);
			
			if(pma.getRMS_Employee_Management_POM().getEmpRoleInsideEmpDeBefEditElement().getText().equals("Owner")) {//getEmpRoleInsideEmpDeBefEditElement
				pma.getRMS_Employee_Management_POM().getAddEmpCloseElement().click();
			}else {
			pma.getRMS_Employee_Management_POM().getMarkAsInactiveEmpDetailsElement().click();
			Assert.assertTrue(pma.getRMS_Employee_Management_POM().getMarkasInActivpopHdrElement().isDisplayed());
			Assert.assertTrue(pma.getRMS_Employee_Management_POM().getMarkasInActivepopTextElement().getText().contains("Would you like to mark "));
			String substring = pma.getRMS_Employee_Management_POM().getMarkasInActivepopTextElement().getText().substring(22);
			String[] split = substring.split(" inactive ?");
			Assert.assertTrue(pma.getRMS_Employee_Management_POM().getMarkasInActivepopTextElement().getText().contains(" inactive ?"));
			Thread.sleep(100);
			pma.getRMS_Employee_Management_POM().getMarkasInActivepopSaveElement().click();
			Thread.sleep(100);
			//System.out.println(split[0]);
			String name="";
			for (int k = 2; k < split[0].length()-1; k++) {
				name=name+split[0].charAt(k);
			}
			//System.out.println(name);
			boolean flag=false;
			List<WebElement> inActiveEmployeeElement = pma.getRMS_Employee_Management_POM().getInActiveEmployeeElement();
			for (int j = 0; j < inActiveEmployeeElement.size(); j++) {//validation of Inactive Employee list
				Thread.sleep(100);
				if(inActiveEmployeeElement.get(j).getText().contains(name)) {
					flag=true;
				}
			}
			Assert.assertTrue(flag);
			break;
			}
		}
		
	}
	@Then("verify user should able to see the Employee Details page Cancel and Save button")
	public void verifyUserShouldAbleToSeeTheEmployeeDetailsPageCancelAndSaveButton() {
	
	}
	@Then("Verify the Popup gets closed when user clicks save or cancel after modification")
	public void verifyThePopupGetsClosedWhenUserClicksSaveOrCancelAfterModification() {
	}
	
}


