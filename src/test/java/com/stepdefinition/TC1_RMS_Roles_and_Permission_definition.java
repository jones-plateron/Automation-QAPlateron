package com.stepdefinition;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BaseClass;
import com.pagemanager.PageManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TC1_RMS_Roles_and_Permission_definition extends BaseClass{
PageManager pma = new PageManager();

List<String> jobNameswhileCreating=new ArrayList<String>(); //Assigning this Globally

	public TC1_RMS_Roles_and_Permission_definition() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
	
	@Then("User should verify by default {string},{string} and {string} Roles are available under the Jobs")
	public void userShouldVerifyByDefaultAndRolesAreAvailableUnderTheJobs(String string, String string2, String string3) {
		String avJob1 = pma.getRMS_Roles_and_Permissions_POM().getAvailableJobsManager().getText();
	     System.out.println(avJob1);
	     Assert.assertTrue(avJob1.contains(string));
	     
	     String avJob2 = pma.getRMS_Roles_and_Permissions_POM().getAvailableJobsWaiter().getText();
	     System.out.println(avJob2);
	     Assert.assertTrue(avJob2.contains(string2));
	     
	     String avJob3 = pma.getRMS_Roles_and_Permissions_POM().getAvailableJobsBusser().getText();
	     System.out.println(avJob3);
	     Assert.assertTrue(avJob3.contains(string3));
	}
	
	@Then("User should able to click jobs option and verify the {string} option is selected by default")
	public void userShouldAbleToClickJobsOptionAndVerifyTheOptionIsSelectedByDefault(String ActManagername) throws InterruptedException {
	   pma.getRMS_Roles_and_Permissions_POM().getJobsTab().click();
	   Thread.sleep(2000);
	   String ActName = pma.getRMS_Roles_and_Permissions_POM().getManagerNameHeader().getText();
	   System.out.println(ActName);
	   Assert.assertTrue(ActName.contains(ActManagername));
	   
	}
	
	@Then("User should verify {string} Section is present and {string},{string} and {string} options is present under POS Access Section")
	public void userShouldVerifySectionIsPresentAndAndOptionsIsPresentUnderPOSAccessSection(String string, String string2, String string3, String string4) throws InterruptedException {
	   pma.getRMS_Roles_and_Permissions_POM().getAvailableJobsManager().click();
	   
	   Thread.sleep(200);
	   String actPOSAcess = pma.getRMS_Roles_and_Permissions_POM().getPOSAcessSection().getText();
	   System.out.println(actPOSAcess);
//	   Assert.assertTrue(actPOSAcess.contains(string));
//	   Assert.assertTrue(false);
	   
	   String actRePin = pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinPermissions().getText();
	   System.out.println(actRePin);
	   Assert.assertTrue(actRePin.contains(string2));
	   
	   String actShiftReview = pma.getRMS_Roles_and_Permissions_POM().getShiftReviewPermissions().getText();
	   System.out.println(actShiftReview);
	   Assert.assertTrue(actShiftReview.contains(string3));
	   
	   String actClockInOut = pma.getRMS_Roles_and_Permissions_POM().getClockInOutPermissions().getText();
	   System.out.println(actClockInOut);
	   Assert.assertTrue(actClockInOut.contains(string4));
	   
	   //System.out.println("All Options available");
	}
	
	@Then("User should verify {string} instruction under the Regenerate PIN option")
	public void userShouldVerifyInstructionUnderTheRegeneratePINOption(String string) throws InterruptedException
	{
		Thread.sleep(200);
	  String actReInstruction = pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinInstructions().getText();
	  System.out.println(actReInstruction);
	  Assert.assertTrue(actReInstruction.contains(string));
	}
	
	@Then("User should verify {string} instruction is present under Shift Review option")
	public void userShouldVerifyInstructionIsPresentUnderShiftReviewOption(String string) throws InterruptedException 
	{
		Thread.sleep(200);
		String actShiftReviewInstruction = pma.getRMS_Roles_and_Permissions_POM().getShiftReviewInstruction().getText();
		System.out.println(actShiftReviewInstruction);
	    Assert.assertTrue(actShiftReviewInstruction.contains(string));
	}
	
	@Then("User should verify {string} instruction is present under Clock-In\\/Clock-Out options")
	public void userShouldVerifyInstructionIsPresentUnderClockInClockOutOptions(String string) throws InterruptedException
	{
		Thread.sleep(200);
		String actClockInOutInstruction = pma.getRMS_Roles_and_Permissions_POM().getClockInOutInstruction().getText();
		System.out.println(actClockInOutInstruction);
	    Assert.assertTrue(actClockInOutInstruction.contains(string));
	}
	
	@Then("User should verify {string} section is present and {string},{string},{string} and {string} options is present under Order Management Section")
	public void userShouldVerifySectionIsPresentAndAndOptionsIsPresentUnderOrderManagementSection(String string, String string2, String string3, String string4, String string5) throws InterruptedException 
	{
		Thread.sleep(200);
	    String actOMSection = pma.getRMS_Roles_and_Permissions_POM().getOrderManagementSection().getText();
	    System.out.println(actOMSection);
	    Assert.assertTrue(actOMSection.contains(string)); 
	    
	    String actViewallOrders = pma.getRMS_Roles_and_Permissions_POM().getViewAllOrdersPermissions().getText();
	    System.out.println(actViewallOrders);
	    Assert.assertTrue(actViewallOrders.contains(string2));
	    
	    String actViewmyOrders = pma.getRMS_Roles_and_Permissions_POM().getViewMyOrdersPermissions().getText();
	    System.out.println(actViewmyOrders);
	    Assert.assertTrue(actViewmyOrders.contains(string3));
	    
	    String actRefund = pma.getRMS_Roles_and_Permissions_POM().getRefundPermissions().getText();
	    System.out.println(actRefund);
	    Assert.assertTrue(actRefund.contains(string4));
	    
	    String actDiscount = pma.getRMS_Roles_and_Permissions_POM().getDiscountPermissions().getText();
	    System.out.println(actDiscount);
	    Assert.assertTrue(actDiscount.contains(string5));
	    
	}
	
	@Then("User should verify {string} instruction is present under View All Orders option")
	public void userShouldVerifyInstructionIsPresentUnderViewAllOrdersOption(String string) throws InterruptedException 
	{
		Thread.sleep(200);
		String actViewallorderInstruction = pma.getRMS_Roles_and_Permissions_POM().getViewAllOrdersInstruction().getText();
		System.out.println(actViewallorderInstruction);
	    Assert.assertTrue(actViewallorderInstruction.contains(string));
	}
	@Then("User should verify {string} instruction is present under View My Orders option")
	public void userShouldVerifyInstructionIsPresentUnderViewMyOrdersOption(String string) throws InterruptedException 
	{
		Thread.sleep(200);
		String actViewmyorderInstruction = pma.getRMS_Roles_and_Permissions_POM().getViewMyOrdersInstruction().getText();
		System.out.println(actViewmyorderInstruction);
	    Assert.assertTrue(actViewmyorderInstruction.contains(string));
	}
	@Then("User should verify {string} instruction is present under Refund option")
	public void userShouldVerifyInstructionIsPresentUnderRefundOption(String string) throws InterruptedException 
	{
		Thread.sleep(200);
		String actRefundInstruction = pma.getRMS_Roles_and_Permissions_POM().getRefundInstruction().getText();
		System.out.println(actRefundInstruction);
	    Assert.assertTrue(actRefundInstruction.contains(string));
	}
	@Then("User should verify {string} instruction is present under Discount option")
	public void userShouldVerifyInstructionIsPresentUnderDiscountOption(String string) throws InterruptedException 
	{
		Thread.sleep(200);
		String actDiscountInstruction = pma.getRMS_Roles_and_Permissions_POM().getDiscountInstruction().getText();
		System.out.println(actDiscountInstruction);
	    Assert.assertTrue(actDiscountInstruction.contains(string));
	}
	@Then("User should verify {string} Section is present and verify {string} option present under Other Permissions Section")
	public void userShouldVerifySectionIsPresentAndVerifyOptionPresentUnderOtherPermissionsSection(String string, String string2) throws InterruptedException 
	{
		Thread.sleep(200);
	    String actOtherPermissionSection = pma.getRMS_Roles_and_Permissions_POM().getOtherPermissionsSection().getText();
	    System.out.println(actOtherPermissionSection);
	    Assert.assertTrue(actOtherPermissionSection.contains(string));
	
	   String actSettingsPermission = pma.getRMS_Roles_and_Permissions_POM().getSettingsPermissions().getText();
	   System.out.println(actSettingsPermission);
		Assert.assertTrue(actSettingsPermission.contains(string2));
	}
	@Then("User should verify {string} instruction is present under Settings option")
	public void userShouldVerifyInstructionIsPresentUnderSettingsOption(String string) throws InterruptedException {
		Thread.sleep(1000);
	   String actSettingsInstruction = pma.getRMS_Roles_and_Permissions_POM().getSettingsInstruction().getText();
	   System.out.println(actSettingsInstruction);
	   Assert.assertTrue(actSettingsInstruction.contains(string));
	}
	
	@Then("User should able to Click Restaurant Portal and Verify the Page")
	public void userShouldAbleToClickRestaurantPortalAndVerifyThePage() {
	    pma.getRMS_Roles_and_Permissions_POM().getRestaurantPortal().click();
	    boolean displayed = pma.getRMS_Roles_and_Permissions_POM().getRestaurantPortalSection().isDisplayed();
	    Assert.assertTrue(displayed);
	    
	    boolean displayed2 = pma.getRMS_Roles_and_Permissions_POM().getAllowAccesstotheRestaurantPortalOption().isDisplayed();
	    Assert.assertTrue(displayed2);
	    
	    String text = pma.getRMS_Roles_and_Permissions_POM().getAllowAccesstotheRestaurantPortalInstruction().getText();
	    Assert.assertTrue(text.contains("Enabling this permission would provide access"));
	  }
	
	@Then("User should verify the all option is selected as default for manager")
	public void userShouldVerifyTheAllOptionIsSelectedAsDefaultForManager() throws InterruptedException {
		
		pma.getRMS_Roles_and_Permissions_POM().getAvailableJobsManager().click();
		System.out.println("Manager is Selected");
		Thread.sleep(200);
		pma.getRMS_Roles_and_Permissions_POM().getPOSTerminal().click();
		String regeneratePinCheckBox = pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinCheckBox().getAttribute("value");
		boolean regenerateStatus = Boolean.parseBoolean(regeneratePinCheckBox);
		Assert.assertTrue(regenerateStatus);
		
		String ShifReviewCheckBox = pma.getRMS_Roles_and_Permissions_POM().getShiftReviewCheckBox().getAttribute("value");
		boolean ShifReviewStatus = Boolean.parseBoolean(ShifReviewCheckBox);
		Assert.assertTrue(ShifReviewStatus);
		
		String ClockInOutCheckBox = pma.getRMS_Roles_and_Permissions_POM().getClockInOutCheckBox().getAttribute("value");
		boolean ClockInOutStatus = Boolean.parseBoolean(ClockInOutCheckBox);
		Assert.assertTrue(ClockInOutStatus);
		
		String ViewAllOrderCheckBox = pma.getRMS_Roles_and_Permissions_POM().getViewAllOrderCheckBox().getAttribute("value");
		boolean ViewAllOrderStatus = Boolean.parseBoolean(ViewAllOrderCheckBox);
		Assert.assertTrue(ViewAllOrderStatus);
		
		String ViewMyOrderCheckBox = pma.getRMS_Roles_and_Permissions_POM().getViewMyOrderChechBox().getAttribute("value");
		boolean ViewMyOrderStatus = Boolean.parseBoolean(ViewMyOrderCheckBox);
		Assert.assertTrue(ViewMyOrderStatus);
		
		String RefundCheckBox = pma.getRMS_Roles_and_Permissions_POM().getRefundCheckBox().getAttribute("value");
		boolean RefundStatus = Boolean.parseBoolean(RefundCheckBox);
		Assert.assertTrue(RefundStatus);
		
		String DiscountCheckBox = pma.getRMS_Roles_and_Permissions_POM().getDiscountCheckBox().getAttribute("value");
		boolean DiscountStatus = Boolean.parseBoolean(DiscountCheckBox);
		Assert.assertTrue(DiscountStatus);
		
		String SettingsCheckBox = pma.getRMS_Roles_and_Permissions_POM().getSettingsCheckBox().getAttribute("value");
		boolean SettingsStatus = Boolean.parseBoolean(SettingsCheckBox);
		Assert.assertTrue(SettingsStatus);
	
		pma.getRMS_Roles_and_Permissions_POM().getRestaurantPortal().click();
		String ResPortalCheckBox = pma.getRMS_Roles_and_Permissions_POM().getAllowAccesstotheRestaurantPortalCheckBox().getAttribute("value");
		boolean ResPortalStatus = Boolean.parseBoolean(ResPortalCheckBox);
		System.out.println(ResPortalStatus);
		//Assert.assertTrue(ResPortalStatus);
	}
	

@Then("User should able to click Add Jobs Button and verify the Add Jobs popup opens")
public void userShouldAbleToClickAddJobsButtonAndVerifyTheAddJobsPopupOpens() throws InterruptedException {
	
	Thread.sleep(1000);
	pma.getRMS_Roles_and_Permissions_POM().getAddJobsButton().click();
	String addJobPopupHeadingCheck = pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupHeading().getText();
	Assert.assertTrue(addJobPopupHeadingCheck.contains("Add Job"));   
}

@Then("User should able to enter the {string} and verify {string} indication appears")
public void userShouldAbleToEnterTheAndVerifyIndicationAppears(String string, String string2) throws InterruptedException {
	
	Thread.sleep(1000);
	//pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupTextBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupTextBox().sendKeys(string);
	
	String specialCharacterIndication = pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupSpecialcharacterErrorIndication().getText();
    Assert.assertTrue(specialCharacterIndication.contains(string2));
}
@When("User should able to clear the entered name and verify {string} indication appears")
public void userShouldAbleToClearTheEnteredNameAndVerifyIndicationAppears(String string) throws InterruptedException {
	
	//pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupHeading().click();
	
	Thread.sleep(1000);
    pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupTextBox().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
    
    Thread.sleep(1000);
    String ValidJobIndication = pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupEnterValidJobErrorIndication().getText();
    Assert.assertTrue(ValidJobIndication.contains(string));
    System.out.println("Validation Done");
    
    pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupHeading().click();
    
}
@Then("User should able to see and Click cancel Button and verify the Popup get closed")
public void userShouldAbleToSeeAndClickCancelButtonAndVerifyThePopupGetClosed() throws InterruptedException {
	
	//Add Job Pop-up Closing by Cancel Button
	Thread.sleep(1000);
	
	pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupCancelButton().isDisplayed();
	System.out.println("Cancel Button is Displayed");
	pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupCancelButton().click();
   
}
@Then("User should able to see and Click X icon and verify the Popup get Closed")
public void userShouldAbleToSeeAndClickXIconAndVerifyThePopupGetClosed() throws InterruptedException {
	
	//Add Job Pop-up Closing by X-icon
	Thread.sleep(1000);
    pma.getRMS_Roles_and_Permissions_POM().getAddJobsButton().click();
    pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupTextBox().sendKeys("Manager");
    Thread.sleep(1000);
    String NameAlreadyExist = pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupNameAlreadyExistsIndication().getText();
    Assert.assertTrue(NameAlreadyExist.contains("Name already exists!!"));
    System.out.println("Name Already Exists Validation Done"); 
    Thread.sleep(1000);
    pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupXicon().isDisplayed();
    System.out.println("X Button is Displayed");
    pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupXicon().click();
}

@Then("User should add the New job {string} and Click save Button")
public void userShouldAddTheNewJobAndClickSaveButton(String string) throws InterruptedException, IOException {
	//Creating Roles
	Actions action = new Actions(rmsDriver);
	for (int i = 0; i < 12; i++) {
		pma.getRMS_Roles_and_Permissions_POM().getAddJobsButton().click();
		String jobName = getDataFromExcel("Jobs Configuration", (i+1), 0);
		pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupTextBox().sendKeys(jobName);
		pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupSaveButton().click();
		
		//RegeneratePin
		String PermissionRegenerate = getDataFromExcel("Jobs Configuration", (i+1), 1);
		if (PermissionRegenerate.equals("Yes")) {
			if (pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinCheckBox().getAttribute("value").equals("false")) {
				pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinCheckBox1().click();
			}
			
		} else if (PermissionRegenerate.equals("No")) {
			if (pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinCheckBox().getAttribute("value").equals("true")) {
				pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinCheckBox1().click();
			}
			
		}
		
		//Shift Review
		String PermissionShiftReview = getDataFromExcel("Jobs Configuration", (i+1), 2);
		if (PermissionShiftReview.equals("Yes")) {
			if (pma.getRMS_Roles_and_Permissions_POM().getShiftReviewCheckBox().getAttribute("value").equals("false")) {
				pma.getRMS_Roles_and_Permissions_POM().getShiftReviewCheckBox1().click();
			}
			
		} else if (PermissionShiftReview.equals("No")) {
			if (pma.getRMS_Roles_and_Permissions_POM().getShiftReviewCheckBox().getAttribute("value").equals("true")) {
				pma.getRMS_Roles_and_Permissions_POM().getShiftReviewCheckBox1().click();
			}
			
		}
		
		//ClockInOut
		String PermissionClockInOut = getDataFromExcel("Jobs Configuration", (i+1), 3);
		if (PermissionClockInOut.equals("Yes")) {
			if (pma.getRMS_Roles_and_Permissions_POM().getClockInOutCheckBox().getAttribute("value").equals("false")) {
				pma.getRMS_Roles_and_Permissions_POM().getClockInOutCheckBox1().click();
			}
			
		} else if (PermissionClockInOut.equals("No")) {
			if (pma.getRMS_Roles_and_Permissions_POM().getClockInOutCheckBox().getAttribute("value").equals("true")) {
				pma.getRMS_Roles_and_Permissions_POM().getClockInOutCheckBox1().click();
			}
			
		}
		
		//ViewAllOrder
		Thread.sleep(200);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		String PermissionViewAllOrder = getDataFromExcel("Jobs Configuration", (i+1), 4);
		if (PermissionViewAllOrder.equals("Yes")) {
			if (pma.getRMS_Roles_and_Permissions_POM().getViewAllOrderCheckBox().getAttribute("value").equals("false")) {
				Thread.sleep(200);
				pma.getRMS_Roles_and_Permissions_POM().getViewAllOrderCheckBox1().click();
			}
			
		} else if (PermissionViewAllOrder.equals("No")) {
			if (pma.getRMS_Roles_and_Permissions_POM().getViewAllOrderCheckBox().getAttribute("value").equals("true")) {
				pma.getRMS_Roles_and_Permissions_POM().getViewAllOrderCheckBox1().click();
			}
			
		}
		
		//ViewMyOrder
		Thread.sleep(200);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		String PermissionViewMyOrder = getDataFromExcel("Jobs Configuration", (i+1), 5);
		if (PermissionViewMyOrder.equals("Yes")) {
			if (pma.getRMS_Roles_and_Permissions_POM().getViewMyOrderChechBox().getAttribute("value").equals("false")) {
				pma.getRMS_Roles_and_Permissions_POM().getViewMyOrderChechBox1().click();
			}
			
		} else if (PermissionViewMyOrder.equals("No")) {
			if (pma.getRMS_Roles_and_Permissions_POM().getViewMyOrderChechBox().getAttribute("value").equals("true")) {
				pma.getRMS_Roles_and_Permissions_POM().getViewMyOrderChechBox1().click();
			}
			
		}
		//Refund
		Thread.sleep(200);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		String PermissionRefund = getDataFromExcel("Jobs Configuration", (i+1), 6);
		if (PermissionRefund.equals("Yes")) {
			if (pma.getRMS_Roles_and_Permissions_POM().getRefundCheckBox().getAttribute("value").equals("false")) {
				pma.getRMS_Roles_and_Permissions_POM().getRefundCheckBox1().click();
			}
			
		} else if (PermissionRefund.equals("No")) {
			if (pma.getRMS_Roles_and_Permissions_POM().getRefundCheckBox().getAttribute("value").equals("true")) {
				pma.getRMS_Roles_and_Permissions_POM().getRefundCheckBox1().click();
			}
			
		}
		//Discount
		Thread.sleep(200);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		String PermissionDiscount = getDataFromExcel("Jobs Configuration", (i+1), 7);
		if (PermissionDiscount.equals("Yes")) {
			if (pma.getRMS_Roles_and_Permissions_POM().getDiscountCheckBox().getAttribute("value").equals("false")) {
				pma.getRMS_Roles_and_Permissions_POM().getDiscountCheckBox1().click();
			}
			
		} else if (PermissionDiscount.equals("No")) {
			if (pma.getRMS_Roles_and_Permissions_POM().getDiscountCheckBox().getAttribute("value").equals("true")) {
				pma.getRMS_Roles_and_Permissions_POM().getDiscountCheckBox1().click();
			}
			
		}
		//Settings
		Thread.sleep(200);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		String PermissionRSettings = getDataFromExcel("Jobs Configuration", (i+1), 8);
		if (PermissionRSettings.equals("Yes")) {
			if (pma.getRMS_Roles_and_Permissions_POM().getSettingsCheckBox().getAttribute("value").equals("false")) {
				pma.getRMS_Roles_and_Permissions_POM().getSettingsCheckBox1().click();
			}
			
		} else if (PermissionRSettings.equals("No")) {
			if (pma.getRMS_Roles_and_Permissions_POM().getSettingsCheckBox().getAttribute("value").equals("true")) {
				pma.getRMS_Roles_and_Permissions_POM().getSettingsCheckBox1().click();
			}
			
		}
		Thread.sleep(300);
		action.sendKeys(Keys.PAGE_UP).build().perform();
		
		Thread.sleep(300);
		pma.getRMS_Roles_and_Permissions_POM().getRestaurantPortal().click();
		String AllowAccessRestaurantPortal  = getDataFromExcel("Jobs Configuration", (i+1), 9);
		if (AllowAccessRestaurantPortal.equals("Yes")) {
			if (pma.getRMS_Roles_and_Permissions_POM().getAllowAccesstotheRestaurantPortalCheckBox().getAttribute("value").equals("false")) {
				pma.getRMS_Roles_and_Permissions_POM().getAllowAccesstotheRestaurantPortalCheckBox1().click();
			}
			
		}else if (AllowAccessRestaurantPortal.equals("No")) {
			if (pma.getRMS_Roles_and_Permissions_POM().getAllowAccesstotheRestaurantPortalCheckBox().getAttribute("value").equals("true")) {
				pma.getRMS_Roles_and_Permissions_POM().getAllowAccesstotheRestaurantPortalCheckBox1().click();
			}
		}
		pma.getRMS_Roles_and_Permissions_POM().getPOSTerminal().click();
		pma.getRMS_Roles_and_Permissions_POM().getRolesandPermissionSaveButton().click();
	}
	
//		List<String> jobNames = dataTable.asList();{
//	for (int i = 1; i < jobNames.size(); i++) {
//		pma.getRMS_Roles_and_Permissions_POM().getAddJobsButton().click();
//		System.out.println(jobNames.get(i));
//		Thread.sleep(200);
//		pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupTextBox().sendKeys(jobNames.get(i));
//		jobNameswhileCreating.add(jobNames.get(i));
//		try {
//			if (pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupNameAlreadyExistsIndication().isDisplayed()) {
//				 pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupTextBox().sendKeys("s");
//			}	
//		} catch (Exception e) {
//		}
//		  
//		 pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupSaveButton().click();
//	}
//	jobNameswhileCreating.add("Manager");
//	jobNameswhileCreating.add("Waiter");
//	jobNameswhileCreating.add("Busser");
	
	Thread.sleep(1000);
	pma.getRMS_Employee_Management_POM().getEmployeesSectionElement().click();
	pma.getRMS_Employee_Management_POM().getAddEmployeeBtnElement().click();
	pma.getRMS_Employee_Management_POM().getDisplayNameTextBxElement().sendKeys("Reassign Delete");
	
	Random rand = new Random();  //Creating Random Number
    long randomNum = rand.nextInt(900000000) + 1000000000;//Created
    String PhNo = Long.toString(randomNum); //Converting Long to String
    pma.getRMS_Employee_Management_POM().getPhoneNumbertextBxElement().sendKeys(PhNo);
    pma.getRMS_Employee_Management_POM().getDropDownRoleWOErrorElement().click();
    
    List<WebElement> elements = pma.getRMS_Employee_Management_POM().getAddEmpRoleDropdownElement();
    for (int i = 0; i < elements.size(); i++) {
    if(elements.get(i).getText().contains("Baker")){//Role name should be modified
        pma.getRMS_Employee_Management_POM().getAddEmpRoleDropdownElement().get(i).click();
        pma.getRMS_Employee_Management_POM().getAddEmpSaveBtnElement().click();
        break;
    }}
	pma.getRMS_Roles_and_Permissions_POM().getJobsTab().click();	
	}
	

@Then("User should verify the New Jobs is added in the available job list")
public void userShouldVerifyTheNewJobsIsAddedInTheAvailableJobList() {
	
	List<WebElement> AllRoleElement = pma.getRMS_Roles_and_Permissions_POM().getRolesElement();int k=0;
    for (int i = 0; i < AllRoleElement.size(); i++) {
        String text = AllRoleElement.get(i).getText();
        System.out.println(text); 
       
        for (int j = 0; j < jobNameswhileCreating.size(); j++) {
        	if(text.contains(jobNameswhileCreating.get(j))) {
        		k++;
        		break;
        	}
		}
    }
}
 	
@Then("User should able to see the edit icon and click edit icon to edit the Role Name {string}")
public void userShouldAbleToSeeTheEditIconAndClickEditIconToEditTheRoleName(String EditName) throws InterruptedException {
	Actions action = new Actions(rmsDriver);
    pma.getRMS_Roles_and_Permissions_POM().get3rdJobName().click();
    pma.getRMS_Roles_and_Permissions_POM().getAvailableJobEditIcon().isDisplayed();
    pma.getRMS_Roles_and_Permissions_POM().getAvailableJobEditIcon().click();
    System.out.println("Icon Clicked");
    Thread.sleep(2000);
    
    action.keyDown(Keys.CONTROL).sendKeys("a");
    action.sendKeys(Keys.BACK_SPACE).build().perform();
    action.keyUp(Keys.CONTROL);
    Thread.sleep(2000);
    action.sendKeys(EditName).build().perform();
    Thread.sleep(2000); 
    pma.getRMS_Roles_and_Permissions_POM().getRolesandPermissionSaveButton().click();
}
@Then("User should verify the role name is Changed")
public void userShouldVerifyTheRoleNameIsChanged() throws InterruptedException {
    String text = pma.getRMS_Roles_and_Permissions_POM().get3rdJobName().getText();
    System.out.println(text);
    Thread.sleep(300);
    Assert.assertEquals(text, "Edited Job");
}

@Then("User should able to select the Job and edit the permission")
public void userShouldAbleToSelectTheJobAndEditThePermission() throws InterruptedException {
	//Editing the 5th Job Role and Giving all permission Thread.sleep(1000);
	Actions action = new Actions(rmsDriver);
	pma.getRMS_Roles_and_Permissions_POM().get5thJobName().click();Thread.sleep(1000);
	pma.getRMS_Roles_and_Permissions_POM().getShiftReviewCheckBox1().click();
	pma.getRMS_Roles_and_Permissions_POM().getShiftReviewCheckBox1().click();
	action.sendKeys(Keys.ARROW_DOWN).build().perform();
	action.sendKeys(Keys.ARROW_DOWN).build().perform();
	action.sendKeys(Keys.ARROW_DOWN).build().perform();
	action.sendKeys(Keys.ARROW_DOWN).build().perform();
	Thread.sleep(200);
	pma.getRMS_Roles_and_Permissions_POM().getViewAllOrderCheckBox1().click();
	Thread.sleep(1000);
	action.sendKeys(Keys.ARROW_DOWN).build().perform();
	action.sendKeys(Keys.ARROW_DOWN).build().perform();
	Thread.sleep(200);
	action.sendKeys(Keys.ARROW_DOWN).build().perform();
	Thread.sleep(1000);
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
	pma.getRMS_Roles_and_Permissions_POM().getRefundCheckBox1().click();
	Thread.sleep(1000);
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
	pma.getRMS_Roles_and_Permissions_POM().getDiscountCheckBox1().click();
	Thread.sleep(1000);
//	Thread.sleep(6000);
	pma.getRMS_Roles_and_Permissions_POM().getRolesandPermissionSaveButton().click();
	 
}
//Delete Job without assigning 
@Then("User should able to delete the Role by clicking delete Button")
public void userShouldAbleToDeleteTheRoleByClickingDeleteButton() {
	
	pma.getRMS_Roles_and_Permissions_POM().get2ndJobName().click();
	pma.getRMS_Roles_and_Permissions_POM().getRolesandPermissionDeleteButton().click();  
}
@Then("User should verify the delete popup opens and Verify {string}")
public void userShouldVerifyTheDeletePopupOpensAndVerify(String string) {
String deleteDialog = pma.getRMS_Roles_and_Permissions_POM().getDeleteJobPopupDialog().getText();
   Assert.assertTrue(deleteDialog.contains(string));
}
@Then("User should verify the popup get closed when User clicks X icon or Cancel Button")
public void userShouldVerifyThePopupGetClosedWhenUserClicksXIconOrCancelButton() {
	pma.getRMS_Roles_and_Permissions_POM().getDeleteJobPopupCancelButton().click();
	System.out.println("Delete Popup Closed");
    
}
@Then("User should verify the job gets deleted when User clicks delete Button")
public void userShouldVerifyTheJobGetsDeletedWhenUserClicksDeleteButton() {
    pma.getRMS_Roles_and_Permissions_POM().get2ndJobName().click();
    pma.getRMS_Roles_and_Permissions_POM().getRolesandPermissionDeleteButton().click();
    pma.getRMS_Roles_and_Permissions_POM().getDeleteJobPopupSaveButton().click();
    System.out.println("The Job is Deleted Sucessfully");
}
//Delete Job With Assigning

@Then("Verify the Re-assign popup opens and Verify {string} instruction")
public void verifyTheReAssignPopupOpensAndVerifyInstruction(String string) throws InterruptedException {
	
	List<WebElement> AllRoleElement = pma.getRMS_Roles_and_Permissions_POM().getRolesElement();
    for (int i = 0; i < AllRoleElement.size(); i++) {
        String text = AllRoleElement.get(i).getText();
        if (text.contains("Baker")) {
            Thread.sleep(500);
            try {
                AllRoleElement.get(i).click();
            } catch (ElementNotInteractableException e) {
                Actions act = new Actions(rmsDriver);
                act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN);
                AllRoleElement.get(i).click();
            }
        	
    pma.getRMS_Roles_and_Permissions_POM().getRolesandPermissionDeleteButton().click();
	pma.getRMS_Roles_and_Permissions_POM().getDeleteJobPopupSaveButton().click();
	Thread.sleep(200);
	String deleteReassign = pma.getRMS_Roles_and_Permissions_POM().getDeleteJobReassignDialog().getText();
	Assert.assertTrue(deleteReassign.contains(string));
}
}

}
@Then("User should able to Re-assign the employee to other role")
public void userShouldAbleToReAssignTheEmployeeToOtherRole() throws InterruptedException {
	// pma.getRMS_Roles_and_Permissions_POM().getDeleteJobReassignNextArrow().click();
	 //pma.getRMS_Roles_and_Permissions_POM().getDeleteJobReassignPreviousArrow().click();
	Thread.sleep(200);
	 pma.getRMS_Roles_and_Permissions_POM().getDeleteJobReassigntoWaiter().click();   
}

@Then("Verify User should able to Close by clicking either X icon or Cancel Button")
public void verifyUserShouldAbleToCloseByClickingEitherXIconOrCancelButton() {
    pma.getRMS_Roles_and_Permissions_POM().getDeleteJobReassignCancelButton().click();
    System.out.println("Re-assign Popup Closed");
}
@Then("Verify User should able to delete the Role by clicking Proceed Button")
public void verifyUserShouldAbleToDeleteTheRoleByClickingProceedButton() throws InterruptedException {Thread.sleep(1000);
List<WebElement> AllRoleElement = pma.getRMS_Roles_and_Permissions_POM().getRolesElement();
for (int i = 0; i < AllRoleElement.size(); i++) {
    String text = AllRoleElement.get(i).getText();
    if (text.contains("Baker")) {
        Thread.sleep(200);
        try {
            AllRoleElement.get(i).click();
        } catch (ElementNotInteractableException e) {
            Actions act = new Actions(rmsDriver);
            act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN);
            AllRoleElement.get(i).click();
        }
 
pma.getRMS_Roles_and_Permissions_POM().getRolesandPermissionDeleteButton().click();
pma.getRMS_Roles_and_Permissions_POM().getDeleteJobPopupSaveButton().click();
Thread.sleep(200);
pma.getRMS_Roles_and_Permissions_POM().getDeleteJobReassigntoWaiter().click();Thread.sleep(200);
pma.getRMS_Roles_and_Permissions_POM().getDeleteJobReassignProceedButton().click();

    }
}
Thread.sleep(200);
rmsDriver.navigate().refresh();
}  
@Then("User should able to Delete all the Jobs")
public void userShouldAbleToDeleteAllTheJobs() throws InterruptedException, IOException {
	
	List<WebElement> AllRoleElement = pma.getRMS_Roles_and_Permissions_POM().getRolesElement();
	
	String AllowAccessRestaurantPortal  = getDataFromExcel("Jobs Configuration", 13, 1);
	if (AllowAccessRestaurantPortal.equals("Yes")) {
    for (int i = 0; i < AllRoleElement.size(); i++) {
    	Thread.sleep(400);
    	
    	if (AllRoleElement.get(i).getText().contains("Manager")) {
			continue;
		}else if (AllRoleElement.get(i).getText().contains("Waiter")) {
			continue;
		}else if (AllRoleElement.get(i).getText().contains("Busser")) {
			continue;
		}else {
			AllRoleElement.get(i).click();
	        pma.getRMS_Roles_and_Permissions_POM().getRolesandPermissionDeleteButton().click();Thread.sleep(100);
	        pma.getRMS_Roles_and_Permissions_POM().getDeleteJobPopupSaveButton().click();Thread.sleep(100);
	        AllRoleElement = pma.getRMS_Roles_and_Permissions_POM().getRolesElement();
	        i--;
		}  
}
	}
}
}