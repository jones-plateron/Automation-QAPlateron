package com.feature.page.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

public class RMS_Employee_Management_POM extends BaseClass{
	
	PageManager pma = new PageManager();
	
	public RMS_Employee_Management_POM() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
	
	public WebElement getLoginMobileNumElement() {
		return rmsDriver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/form/div[2]/div/input"));
	}
	public WebElement getLoginContinuebuttonElement() {
		return rmsDriver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/form/div[3]/a"));
	}
	public WebElement getLoginOtpElement() {
		return rmsDriver.findElement(By.xpath("//div[@class='auth-container']//div[1]//div[1]//input[1]"));
	}
	public WebElement getLoginVerifyOtpElement() {
		return rmsDriver.findElement(By.xpath("//button[contains(@type,'submit')]"));
	}
	public WebElement getOverviewWelcomTextElement() {
		return rmsDriver.findElement(By.xpath("//*[@id=\"root\"]/div/main/section/div/div[1]/p"));
	}
	public WebElement getHomeEmployeesSectionElement() {
		return rmsDriver.findElement(By.xpath("//ul//li[6]//a[1]"));
	}
	public WebElement getAllJobsFilterDropdownElement() {
		return rmsDriver.findElement(By.xpath("//span[@class='cursor-pointer font-bold w-150p text-left text-ellipsis ']"));
	}//no-Need
	public List<WebElement> getJobRolesFilterElements() {////*[@id=\"root\"]/div/main/section[2]/section[1]/div/div/div[2]/div
		return rmsDriver.findElements(By.xpath("//li[@class='dropdown-item text-ellipsis']"));
	}
	public WebElement getIndividualJobRoleElement() {
		return rmsDriver.findElement(By.xpath("//li[@class='dropdown-item text-ellipsis']"));
	}
	public WebElement getJobsSectionElement() {
		return rmsDriver.findElement(By.xpath("//a[normalize-space()='Jobs']"));
	}
	public WebElement getActiveRoleElement() {
		return rmsDriver.findElement(By.xpath("//li[@class='list-item cursor-pointer active']"));
	}
	public List<WebElement> getJobsSectionRolesElement() {
		return rmsDriver.findElements(By.xpath("//li[@class='list-item cursor-pointer ']"));
	}
	public WebElement getEmployeesSectionElement() {
		return rmsDriver.findElement(By.xpath("//a[normalize-space()='Employees']"));
	}
	public WebElement getAddEmployeeBtnElement() {
		return rmsDriver.findElement(By.xpath("//button[contains(@class,'btn btn-outline-primary btn-small d-flex align-items-center')]"));
	}
	public WebElement getAddEmployeePageHeaderElement() {
		return rmsDriver.findElement(By.xpath("//h4[@class='modal-title text-ellipsis ']"));
	}
	public WebElement getGeneratePinBtnElement() {
		return rmsDriver.findElement(By.xpath("//button[@class='btn btn-neutral-dark btn-small d-flex align-items-center ']"));
	}
	public WebElement getPinGenerationTextElement() {
		return rmsDriver.findElement(By.xpath("//span[@class='page-subheader__small-title']"));
	}
	public WebElement getPinGenerationSubTextElement() {
		return rmsDriver.findElement(By.xpath("//span[@class='text-help-secondary']"));
	}
	public WebElement getBasicInformationsElement() {
		return rmsDriver.findElement(By.xpath("//h3[normalize-space()='Basic Informations']"));
	}
	public WebElement getFirstNameHdrElement() {
		return rmsDriver.findElement(By.xpath("//label[normalize-space()='First Name']"));
	}
	public WebElement getFirstNameTextBxElement() {
		return rmsDriver.findElement(By.xpath("//input[contains(@name,'firstName')]"));
	}
	public WebElement getLastNameHdrElement() {
		return rmsDriver.findElement(By.xpath("//label[normalize-space()='Last Name']"));
	}
	public WebElement getLastNameTextbxElement() {
		return rmsDriver.findElement(By.xpath("//input[@name='lastName']"));
	}
	public WebElement getDisplayNameHdrElement() {
		return rmsDriver.findElement(By.xpath("//label[normalize-space()='Display Name']"));
	}
	public WebElement getDisplayNameTextBxElement() {
		return rmsDriver.findElement(By.xpath("//input[contains(@name,'displayName')]"));
	}
	public WebElement getDisplayNameTextBxErrorMsgElement() {
		return rmsDriver.findElement(By.xpath("//span[normalize-space()='Please enter valid display name']"));
	}
	public WebElement getPhoneNumberHdrElement() {
		return rmsDriver.findElement(By.xpath("//label[normalize-space()='Phone Number']"));
	}
	public WebElement getPhoneNumbertextBxElement() {
		return rmsDriver.findElement(By.xpath("//input[contains(@name,'phone')]"));
	}
	public WebElement getPhoneNumbertextBxErrorMsgElement() {
		return rmsDriver.findElement(By.xpath("//span[normalize-space()='Please enter valid phone number']"));
	}
	public WebElement getEmailAddressHdrElement() {
		return rmsDriver.findElement(By.xpath("//label[normalize-space()='Email Address']"));
	}
	public WebElement getEmailAddressTextBxElement() {
		return rmsDriver.findElement(By.xpath("//div/input[@name='email']"));
	}
	public WebElement getEmailAddressTextBxErrorMsgElement() {
		return rmsDriver.findElement(By.xpath("//span[contains(text(),'Please enter valid email')]"));
	}
	//getBasicInformationsElement
	public WebElement getProfessionalDetailsElement() {
		return rmsDriver.findElement(By.xpath("//h3[normalize-space()='Professional Details']"));
	}
	public WebElement getEmployeeIDHdrElement() {
		return rmsDriver.findElement(By.xpath("//label[normalize-space()='Employee ID']"));
	}
	public WebElement getEmployeeIDTextBxElement() {
		return rmsDriver.findElement(By.xpath("//input[@name='employeeId']"));
	}
	public WebElement getLastUsedEmpIDElement() {
		return rmsDriver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[4]/div[2]/div/div[1]/div/div/p/span"));
	}
	public WebElement getRoleHdrElement() {
		return rmsDriver.findElement(By.xpath("//label[normalize-space()='Role']"));
	}
	public WebElement getDropDownRoleElement() {
		return rmsDriver.findElement(By.xpath("//div[@class='   dropdown']//button[@class='dropdown-toggle align-item-center d-flex dropdown-toggle custom-select minimal w-100 br-8 dropdown-error-border  align-item-center d-flex dropdown-toggle custom-select minimal w-100 br-8 dropdown-error-border -primary']"));
	}
	public WebElement getDropDownRoleWOErrorElement() {
		return rmsDriver.findElement(By.xpath("//div[@class='   dropdown']//button[@class='dropdown-toggle align-item-center d-flex dropdown-toggle custom-select minimal w-100 br-8   align-item-center d-flex dropdown-toggle custom-select minimal w-100 br-8  -primary']"));
	}
	
	
	
	
	
	
	public List<WebElement> getAddEmpRoleDropdownElement() {
		return rmsDriver.findElements(By.xpath("//li[@class='dropdown-item  d-flex justify-content-between']"));
	}
	public WebElement getAddEmpCancelBtnElement() {
		return rmsDriver.findElement(By.xpath("//button[contains(@class,'btn btn-outline-default btn-small d-flex align-items-center mr-1')]"));
	}
	public WebElement getAddEmpSaveBtnElement() {
		return rmsDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-small d-flex align-items-center ']"));
	}
	public WebElement getAddEmpCloseElement() {
		return rmsDriver.findElement(By.xpath("//i[@class='icon-close icon-5x']"));
	}
	public WebElement getSaveChangesPopHdrElement() {
		return rmsDriver.findElement(By.xpath("//h4[normalize-space()='Save Changes']"));
	}
	public WebElement getSaveChangesPopSubTxtElement() {
		return rmsDriver.findElement(By.xpath("//p[@class='pb-2']"));
	}
	public WebElement getSaveChangesPopCancelBtnElement() {
		return rmsDriver.findElement(By.xpath("//button[contains(@class,'btn btn-outline-default btn-small mr-1')]"));
	}
	public WebElement getSaveChangesPopSaveBtnElement() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Yes, Proceed']"));
	}
	public WebElement getSaveChangespopCloseElement() {
		return rmsDriver.findElement(By.xpath("//div[contains(@class,'modal-content modal-content modal-md')]//i[contains(@class,'icon-close icon-5x')]"));
	}
	public WebElement getTotalEmpElement() {
		return rmsDriver.findElement(By.xpath("//h3[@class=' page-header__page-title text-base']"));
	}
	public WebElement getPosAcessClmElement() {
		return rmsDriver.findElement(By.xpath("//span[normalize-space()='POS Access']"));
	}
	public WebElement getRmsAcessClmElement() {
		return rmsDriver.findElement(By.xpath("//span[normalize-space()='RMS Access']"));
	}
	public List<WebElement> getIndvEmployeeListElement() {
		return rmsDriver.findElements(By.xpath("//tr[@class='box box-sm d-flex h-auto p-1 w-100 mb-3 cursor-pointer ']"));
	}
	public WebElement getMyProfileElement() {
		return rmsDriver.findElement(By.xpath("//span[@class='user-profile user-active-label']"));
	}
	public WebElement getEmpNameInsideListElement() {
		return rmsDriver.findElement(By.xpath("//p[@class=\"font-bold text-ellipsis w-100 text-left text-ellipsis\"]"));
	}
	public WebElement getEmpIDInsideListElement() {
		return rmsDriver.findElement(By.xpath("//p[@class='muted text-left']"));
	}
	public WebElement getJobTypeInsideListElement() {
		return rmsDriver.findElement(By.xpath("//span[@class='muted font-bold-light']"));
	}
	public WebElement getEmailInsideListIfElement() {
		return rmsDriver.findElement(By.xpath("//p[@class=\"color-black-light text-ellipsis w-100 text-left text-ellipsis opacity-8\"]"));
	}
	public WebElement getPhoneInsideListElement() {
		return rmsDriver.findElement(By.xpath("//p[@class=\"color-black-light text-left w-100 opacity-8\"]"));
	}
	public List<WebElement> getPINInsideListElements() {
		return rmsDriver.findElements(By.xpath("//p[@class=\"font-semibold ml-5\"]"));
	}
	public WebElement getOTPInsideListElement() {
		return rmsDriver.findElement(By.xpath("//p[@class=\"font-semibold ml-5 \"]"));
	}
	public WebElement getMoreInsideListElement() {
		return rmsDriver.findElement(By.xpath("//button//i[contains(@class,'icon-icon-ellipsis-v icon-3x mr-1')]"));
	}//span[@class='user-profile user-//p[@class="font-bold text-ellipsis w-100 text-left text-ellipsis"]active-label']
	public WebElement getMarkasInactiveInsideListElement(int i) {
		return rmsDriver.findElement(By.xpath("(//p[contains(text(),'Mark as Inactive')])["+i+"]"));
	}
	public WebElement getEditBtnEmpDetailsElement() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Edit']"));
	}
	public WebElement getEmpPINEmpDetailsElement() {
		return rmsDriver.findElement(By.xpath("//button[@class='btn btn-neutral-dark btn-small d-flex align-items-center cursor-na']"));
	}
	public WebElement getEditRoleEmpDetailsElement() {
		return rmsDriver.findElement(By.xpath("//div[contains(@class,'col-4 col-md-4 col-sm-4 pb-2 pl-0')]//span[contains(@class,'font-bold')][normalize-space()='Manager']"));
	}
	public WebElement getPhoneEmpDetailsElement() {
		return rmsDriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/span[2]"));
	}
	public WebElement getDisplayNameEmpDetailsElement() {
		return rmsDriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[3]/span[2]"));
	}
	public WebElement getMarkAsInactiveEmpDetailsElement() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Mark as Inactive']"));
	}
	public WebElement getMarkasInActivpopHdrElement() {
		return rmsDriver.findElement(By.xpath("//h4[normalize-space()='Mark as Inactive']"));
	}
	public WebElement getMarkasInActivepopTextElement() {
		return rmsDriver.findElement(By.xpath("//p[@class='empty-state__help-text--large w-break']"));
	}
	public WebElement getMarkasInActivepopCancelBtnElement() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
	}
	public WebElement getMarkasInActivepopSaveElement() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Mark Inactive']"));
	}
	public WebElement getMarkasInActivepopCloseElement() {
		return rmsDriver.findElement(By.xpath("//div[@class='modal-content modal-content modal-md']//i[@class='icon-close icon-5x']"));
	}
	public WebElement getSearchBarElement() {
		return rmsDriver.findElement(By.xpath("//input[@placeholder='Employee name or Id or Phone']"));
	}
	public WebElement getResultsElements() {
		return rmsDriver.findElement(By.xpath("//tr[@class=\"box box-sm d-flex h-auto p-1 w-100 mb-3 cursor-pointer \"]"));
	}
	public List<WebElement> getInActiveEmployeeElement() {
		return rmsDriver.findElements(By.xpath("//tr[@class='box box-sm d-flex h-auto p-1 w-100 mb-3 disabled cursor-na bg-grey-medium ']"));
	}
		
	
	public WebElement getEmployeeRoleInEMPDETpageElement() {
		return rmsDriver.findElement(By.xpath("//p[@class=\"muted\"]"));
	}
	public List<WebElement> getEmpListJobElements() {
		return rmsDriver.findElements(By.xpath("//span[@class='muted font-bold-light']"));
	}
	public WebElement getNoResultsTextElement() {
		return rmsDriver.findElement(By.xpath("//body/div[@id='root']/div[contains(@class,'nav-collapsed')]/main[contains(@class,'main-wrapper')]/section[contains(@class,'page-content')]/section[contains(@class,'page-content__page-top--small')]/div[contains(@class,'empty-state')]/caption[2]"));
	}
	
	
	
	
	
	
	public WebElement getElement() {
		return rmsDriver.findElement(By.xpath(""));
	}
}
