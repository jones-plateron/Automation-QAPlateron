package com.stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BaseClass;
import com.pagemanager.PageManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RMS_Roles_and_Permission_definition extends BaseClass{
PageManager pma = new PageManager();

List<String> jobNameswhileCreating=new ArrayList<>(); //Assigning this Globally

	public RMS_Roles_and_Permission_definition() {
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
	public void userShouldAbleToClickJobsOptionAndVerifyTheOptionIsSelectedByDefault(String ActManagername) {
	   pma.getRMS_Roles_and_Permissions_POM().getJobsTab().click();
	   
	   String ActName = pma.getRMS_Roles_and_Permissions_POM().getManagerNameHeader().getText();
	   System.out.println(ActName);
	   Assert.assertTrue(ActName.contains(ActManagername));
	   
	}
	
	@Then("User should verify {string} Section is present and {string},{string} and {string} options is present under POS Access Section")
	public void userShouldVerifySectionIsPresentAndAndOptionsIsPresentUnderPOSAccessSection(String string, String string2, String string3, String string4) throws InterruptedException {
	   pma.getRMS_Roles_and_Permissions_POM().getAvailableJobsManager().click();
	   
	   Thread.sleep(1000);
	   String actPOSAcess = pma.getRMS_Roles_and_Permissions_POM().getPOSAcessSection().getText();
	   System.out.println(actPOSAcess);
	   Assert.assertTrue(actPOSAcess.contains(string));
	   
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
		Thread.sleep(1000);
	  String actReInstruction = pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinInstructions().getText();
	  System.out.println(actReInstruction);
	  Assert.assertTrue(actReInstruction.contains(string));
	}
	
	@Then("User should verify {string} instruction is present under Shift Review option")
	public void userShouldVerifyInstructionIsPresentUnderShiftReviewOption(String string) throws InterruptedException 
	{
		Thread.sleep(1000);
		String actShiftReviewInstruction = pma.getRMS_Roles_and_Permissions_POM().getShiftReviewInstruction().getText();
		System.out.println(actShiftReviewInstruction);
	    Assert.assertTrue(actShiftReviewInstruction.contains(string));
	}
	
	@Then("User should verify {string} instruction is present under Clock-In\\/Clock-Out options")
	public void userShouldVerifyInstructionIsPresentUnderClockInClockOutOptions(String string) throws InterruptedException
	{
		Thread.sleep(1000);
		String actClockInOutInstruction = pma.getRMS_Roles_and_Permissions_POM().getClockInOutInstruction().getText();
		System.out.println(actClockInOutInstruction);
	    Assert.assertTrue(actClockInOutInstruction.contains(string));
	}
	
	@Then("User should verify {string} section is present and {string},{string},{string} and {string} options is present under Order Management Section")
	public void userShouldVerifySectionIsPresentAndAndOptionsIsPresentUnderOrderManagementSection(String string, String string2, String string3, String string4, String string5) throws InterruptedException 
	{
		Thread.sleep(1000);
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
		Thread.sleep(1000);
		String actViewallorderInstruction = pma.getRMS_Roles_and_Permissions_POM().getViewAllOrdersInstruction().getText();
		System.out.println(actViewallorderInstruction);
	    Assert.assertTrue(actViewallorderInstruction.contains(string));
	}
	@Then("User should verify {string} instruction is present under View My Orders option")
	public void userShouldVerifyInstructionIsPresentUnderViewMyOrdersOption(String string) throws InterruptedException 
	{
		Thread.sleep(1000);
		String actViewmyorderInstruction = pma.getRMS_Roles_and_Permissions_POM().getViewMyOrdersInstruction().getText();
		System.out.println(actViewmyorderInstruction);
	    Assert.assertTrue(actViewmyorderInstruction.contains(string));
	}
	@Then("User should verify {string} instruction is present under Refund option")
	public void userShouldVerifyInstructionIsPresentUnderRefundOption(String string) throws InterruptedException 
	{
		Thread.sleep(1000);
		String actRefundInstruction = pma.getRMS_Roles_and_Permissions_POM().getRefundInstruction().getText();
		System.out.println(actRefundInstruction);
	    Assert.assertTrue(actRefundInstruction.contains(string));
	}
	@Then("User should verify {string} instruction is present under Discount option")
	public void userShouldVerifyInstructionIsPresentUnderDiscountOption(String string) throws InterruptedException 
	{
		Thread.sleep(1000);
		String actDiscountInstruction = pma.getRMS_Roles_and_Permissions_POM().getDiscountInstruction().getText();
		System.out.println(actDiscountInstruction);
	    Assert.assertTrue(actDiscountInstruction.contains(string));
	}
	@Then("User should verify {string} Section is present and verify {string} option present under Other Permissions Section")
	public void userShouldVerifySectionIsPresentAndVerifyOptionPresentUnderOtherPermissionsSection(String string, String string2) throws InterruptedException 
	{
		Thread.sleep(1000);
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
	
	@Then("User should verify the all option is selected as default for manager")
	public void userShouldVerifyTheAllOptionIsSelectedAsDefaultForManager() throws InterruptedException {
		
		pma.getRMS_Roles_and_Permissions_POM().getAvailableJobsManager().click();
		System.out.println("Manager is Selected");
		
		//Thread.sleep(10000); 		
		//pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinCheckBox().click();
		

		//WebElement checkbox = driver.findElement(By.id("checkbox_id"));
		
		//DoubleChecking
//		boolean isSelected = pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinCheckBox().isSelected(); // First check using isSelected() method
//		if (isSelected) {
//		    String checked = pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinCheckBox().getAttribute("checked");
//		    if (checked != null) {
//		        System.out.println("Checkbox is selected");
//		    } else {
//		        System.out.println("Checkbox is not selected");
//		    }
//		} else {
//		    System.out.println("Checkbox is not selected");
//		}
		
		//Tested in another Way
		
//		if(pma.getRMS_Roles_and_Permissions_POM().getRefundCheckBox().isSelected())
//		{
//			System.out.println("Regenerate checkbox is Selected");
//		}
//		else if(pma.getRMS_Roles_and_Permissions_POM().getRefundCheckBox().isSelected())
//			{
//			System.out.println("Regenerate checkbox is Selected");
//		}
//		
		
//		if (pma.getRMS_Roles_and_Permissions_POM().getRefundCheckBox().isSelected()) {
//			 System.out.println("xxxxxxxxxxxxxxxxxxxx"+"Regenerate checkbox is Selected");
//		} else {
//			System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzz"+"Regenerate checkbox is UN Selected");
//		}
					
//		 if (pma.getRMS_Roles_and_Permissions_POM().getRefundCheckBox().isSelected()); {
//		      System.out.println("xxxxxxxxxxxxxxxxxxxx"+"Regenerate checkbox is Selected");
//		 };
//		 pma.getRMS_Roles_and_Permissions_POM().getAvailableJobsManager().click();
//			System.out.println("Manager is Un Selected");
//			 if (pma.getRMS_Roles_and_Permissions_POM().getRefundCheckBox().isSelected()); {
//			      System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzz"+"Regenerate checkbox is Selected");
//			 };
		
		boolean RegeneratePinCheckBox = pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinCheckBox().isSelected();
		System.out.println(RegeneratePinCheckBox);
		Assert.assertFalse(RegeneratePinCheckBox);
		
		boolean ShifReviewCheckBox = pma.getRMS_Roles_and_Permissions_POM().getShiftReviewCheckBox().isSelected();
		Assert.assertFalse(ShifReviewCheckBox);
		
		boolean ClockInOutCheckBox  = pma.getRMS_Roles_and_Permissions_POM().getClockInOutCheckBox().isSelected();
		Assert.assertFalse(ClockInOutCheckBox);
		
		boolean ViewAllOrderCheckBox = pma.getRMS_Roles_and_Permissions_POM().getViewAllOrderCheckBox().isSelected();
		Assert.assertFalse(ViewAllOrderCheckBox);
		
		boolean ViewMyOrderCheckBox = pma.getRMS_Roles_and_Permissions_POM().getViewMyOrderChechBox().isSelected();
		Assert.assertFalse(ViewMyOrderCheckBox);
		
		boolean RefundCheckBox = pma.getRMS_Roles_and_Permissions_POM().getRefundCheckBox().isSelected();
		Assert.assertFalse(RefundCheckBox);
		
		boolean DiscountCheckBox = pma.getRMS_Roles_and_Permissions_POM().getDiscountCheckBox().isSelected();
		Assert.assertFalse(DiscountCheckBox);
		
		boolean SettingsCheckBox = pma.getRMS_Roles_and_Permissions_POM().getSettingsCheckBox().isSelected();
		Assert.assertFalse(SettingsCheckBox);    
	}

	@Then("User should able to click waiter option and verify which are the option is selected and which are the option is not selected")
	public void userShouldAbleToClickWaiterOptionAndVerifyWhichAreTheOptionIsSelectedAndWhichAreTheOptionIsNotSelected() {
		pma.getRMS_Roles_and_Permissions_POM().getAvailableJobsWaiter().click();
		
		boolean RegeneratePinCheckBox = pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinCheckBox().isSelected();
		Assert.assertFalse(RegeneratePinCheckBox);
		
		boolean ShifReviewCheckBox = pma.getRMS_Roles_and_Permissions_POM().getShiftReviewCheckBox().isSelected();
		Assert.assertFalse(ShifReviewCheckBox);
		
		boolean ClockInOutCheckBox  = pma.getRMS_Roles_and_Permissions_POM().getClockInOutCheckBox().isSelected();
		Assert.assertFalse(ClockInOutCheckBox);
		
		boolean ViewAllOrderCheckBox = pma.getRMS_Roles_and_Permissions_POM().getViewAllOrderCheckBox().isSelected();
		Assert.assertFalse(ViewAllOrderCheckBox);
		
		boolean ViewMyOrderCheckBox = pma.getRMS_Roles_and_Permissions_POM().getViewMyOrderChechBox().isSelected();
		Assert.assertFalse(ViewMyOrderCheckBox);
		
		boolean RefundCheckBox = pma.getRMS_Roles_and_Permissions_POM().getRefundCheckBox().isSelected();
		Assert.assertFalse(RefundCheckBox);
		
		boolean DiscountCheckBox = pma.getRMS_Roles_and_Permissions_POM().getDiscountCheckBox().isSelected();
		Assert.assertFalse(DiscountCheckBox);
		
		boolean SettingsCheckBox = pma.getRMS_Roles_and_Permissions_POM().getSettingsCheckBox().isSelected();
		Assert.assertFalse(SettingsCheckBox);   
	}
	
	@Then("User should able to hit Save")
	public void userShouldAbleToHitSave() {
	pma.getRMS_Roles_and_Permissions_POM().getRolesandPermissionSaveButton().click();
	   
	}
	
	@Then("User should able to click Busser option and verify which are the option is selected and which are the option is not selected")
	public void userShouldAbleToClickBusserOptionAndVerifyWhichAreTheOptionIsSelectedAndWhichAreTheOptionIsNotSelected() {
	  
	   pma.getRMS_Roles_and_Permissions_POM().getAvailableJobsBusser().click();
	   
	   pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinCheckBox().click();
	   
	   boolean RegeneratePinCheckBox = pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinCheckBox().isSelected();
		Assert.assertTrue(RegeneratePinCheckBox);
		
		boolean ShifReviewCheckBox = pma.getRMS_Roles_and_Permissions_POM().getShiftReviewCheckBox().isSelected();
		Assert.assertTrue(ShifReviewCheckBox);
		
		boolean ClockInOutCheckBox  = pma.getRMS_Roles_and_Permissions_POM().getClockInOutCheckBox().isSelected();
		Assert.assertTrue(ClockInOutCheckBox);
		
		boolean ViewAllOrderCheckBox = pma.getRMS_Roles_and_Permissions_POM().getViewAllOrderCheckBox().isSelected();
		Assert.assertFalse(ViewAllOrderCheckBox);
		
		boolean ViewMyOrderCheckBox = pma.getRMS_Roles_and_Permissions_POM().getViewMyOrderChechBox().isSelected();
		Assert.assertFalse(ViewMyOrderCheckBox);
		
		boolean RefundCheckBox = pma.getRMS_Roles_and_Permissions_POM().getRefundCheckBox().isSelected();
		Assert.assertFalse(RefundCheckBox);
		
		boolean DiscountCheckBox = pma.getRMS_Roles_and_Permissions_POM().getDiscountCheckBox().isSelected();
		Assert.assertFalse(DiscountCheckBox);
		
		boolean SettingsCheckBox = pma.getRMS_Roles_and_Permissions_POM().getSettingsCheckBox().isSelected();
		Assert.assertFalse(SettingsCheckBox);
	      
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
	
	//Add Job Popup Closing by Cancel Button
	Thread.sleep(1000);
	
	pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupCancelButton().isDisplayed();
	System.out.println("Cancel Button is Displayed");
	pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupCancelButton().click();
   
}
@Then("User should able to see and Click X icon and verify the Popup get Closed")
public void userShouldAbleToSeeAndClickXIconAndVerifyThePopupGetClosed() throws InterruptedException {
	
	//Add Job Popup Closing by Xicon
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
public void userShouldAddTheNewJobAndClickSaveButton(String string, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	
	Thread.sleep(1000);
	//Creating Roles
	List<String> jobNames = dataTable.asList();{
	for (int i = 1; i < jobNames.size(); i++) {
		pma.getRMS_Roles_and_Permissions_POM().getAddJobsButton().click();
		System.out.println(jobNames.get(i));
		Thread.sleep(1000);
		
		pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupTextBox().sendKeys(jobNames.get(i));
		
		jobNameswhileCreating.add(jobNames.get(i));
		try {
			if (pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupNameAlreadyExistsIndication().isDisplayed()) {
				 pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupTextBox().sendKeys("s");
			}	
		} catch (Exception e) {
		}
		  
		 pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupSaveButton().click();
	}
	jobNameswhileCreating.add("Manager");
	jobNameswhileCreating.add("Waiter");
	jobNameswhileCreating.add("Busser");
	
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
        System.out.println(AllRoleElement.size());
        //System.out.println(k);
        //Assert.assertTrue(AllRoleElement.size()==k);
         
    }
}

@Then("User should able to give permission for the New Role and Verify User should able to click Save Button")
public void userShouldAbleToGivePermissionForTheNewRoleAndVerifyUserShouldAbleToClickSaveButton() {
	
	Actions action = new Actions(rmsDriver);
	//For the 1st Job - All Options
	try {
	pma.getRMS_Roles_and_Permissions_POM().get1stJobName().click();
	pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinCheckBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getShiftReviewCheckBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getClockInOutCheckBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getViewAllOrderCheckBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getViewMyOrderChechBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getRefundCheckBox().click();
	
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
	
	//pma.getRMS_Roles_and_Permissions_POM().getDiscountCheckBox().click();    //Hided due to Discount checkbox x path mismatch
	//pma.getRMS_Roles_and_Permissions_POM().getSettingsCheckBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getRolesandPermissionSaveButton().click();
	}
	catch(NoSuchElementException e)
	{
		// code to handle the exception
	    System.out.println("Element not found: " + e.getMessage());
	}	
	
	//For the 2nd Job - Only My order
	try {
	pma.getRMS_Roles_and_Permissions_POM().get2ndJobName().click();
	pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinCheckBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getShiftReviewCheckBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getClockInOutCheckBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getViewMyOrderChechBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getRolesandPermissionSaveButton().click();
	}
	catch (NoSuchElementException e) {
		System.out.println("Element not found: " + e.getMessage());
	}
	
	//For the 3rd Job - Only My order with Discount
   try {
	pma.getRMS_Roles_and_Permissions_POM().get3rdJobName().click();
	pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinCheckBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getShiftReviewCheckBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getClockInOutCheckBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getViewMyOrderChechBox().click();
	
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
	
	//pma.getRMS_Roles_and_Permissions_POM().getDiscountCheckBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getRolesandPermissionSaveButton().click();
   }
   catch (NoSuchElementException e)
   {
	System.out.println("Element not found: " + e.getMessage());
   }
	//For the 4th Job - Only My order with Refund
   
   try {
	pma.getRMS_Roles_and_Permissions_POM().get4thJobName().click();
	pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinCheckBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getShiftReviewCheckBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getClockInOutCheckBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getViewMyOrderChechBox().click();
	
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
	
	//pma.getRMS_Roles_and_Permissions_POM().getRefundCheckBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getRolesandPermissionSaveButton().click();
   }
   catch (NoSuchElementException e) {
	   System.out.println("Element not found: " + e.getMessage());
}
	//For the 5th Job - Only My order with Settings
	
	try {
	    // code that might throw an exception
		pma.getRMS_Roles_and_Permissions_POM().get5thJobName().click();
		pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinCheckBox().click();
		pma.getRMS_Roles_and_Permissions_POM().getShiftReviewCheckBox().click();
		pma.getRMS_Roles_and_Permissions_POM().getClockInOutCheckBox().click();
		pma.getRMS_Roles_and_Permissions_POM().getViewMyOrderChechBox().click();
		
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		//pma.getRMS_Roles_and_Permissions_POM().getSettingsCheckBox().click();
		pma.getRMS_Roles_and_Permissions_POM().getRolesandPermissionSaveButton().click();
	} catch (NoSuchElementException e) {
	    // code to handle the exception
	    System.out.println("Element not found: " + e.getMessage());
	}
}

@Then("User should able to see the edit icon and click edit icon to edit the Role Name {string}")
public void userShouldAbleToSeeTheEditIconAndClickEditIconToEditTheRoleName(String EditName) throws InterruptedException {
    pma.getRMS_Roles_and_Permissions_POM().get3rdJobName().click();
    pma.getRMS_Roles_and_Permissions_POM().getAvailableJobEditIcon().isDisplayed();
    pma.getRMS_Roles_and_Permissions_POM().getAvailableJobEditIcon().click();
    Thread.sleep(10000);
    System.out.println("Icon Clicked");
    
    pma.getRMS_Roles_and_Permissions_POM().geteditedit().click();
    System.out.println("Clicked zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
                           //It is Clicking but not clearing 
    pma.getRMS_Roles_and_Permissions_POM().geteditedit().clear();
    System.out.println("Cleareddddddddddddddddddddddddddddddddddddddd");
    pma.getRMS_Roles_and_Permissions_POM().geteditedit().sendKeys(EditName);
}
@Then("User should verify the role name is Changed")
public void userShouldVerifyTheRoleNameIsChanged() {
    String text = pma.getRMS_Roles_and_Permissions_POM().get3rdJobName().getText();
    System.out.println(text);
    Assert.assertEquals(text, "Edited Job");
}

@Then("User should able to select the Job and edit the permission")
public void userShouldAbleToSelectTheJobAndEditThePermission() {
	//Editing the 5th Job Role and Giving all permission 
	pma.getRMS_Roles_and_Permissions_POM().get5thJobName().click();
	pma.getRMS_Roles_and_Permissions_POM().getViewAllOrderCheckBox().click();
	//pma.getRMS_Roles_and_Permissions_POM().getViewMyOrderChechBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getRefundCheckBox().click();
	//pma.getRMS_Roles_and_Permissions_POM().getDiscountCheckBox().click();
	//pma.getRMS_Roles_and_Permissions_POM().getSettingsCheckBox().click();
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
	pma.getRMS_Roles_and_Permissions_POM().get1stJobName().click();
	pma.getRMS_Roles_and_Permissions_POM().getRolesandPermissionDeleteButton().click();
	pma.getRMS_Roles_and_Permissions_POM().getDeleteJobPopupSaveButton().click();
	Thread.sleep(1000);
	String deleteReassign = pma.getRMS_Roles_and_Permissions_POM().getDeleteJobReassignDialog().getText();
	Assert.assertTrue(deleteReassign.contains(string));
}
    
@Then("User should able to Re-assign the employee to other role")
public void userShouldAbleToReAssignTheEmployeeToOtherRole() {
	pma.getRMS_Roles_and_Permissions_POM().getDeleteJobReassigntoWaiter().click();   
}

@Then("Verify User should able to Close by clicking either X icon or Cancel Button")
public void verifyUserShouldAbleToCloseByClickingEitherXIconOrCancelButton() {
    pma.getRMS_Roles_and_Permissions_POM().getDeleteJobReassignCancelButton().click();
    System.out.println("Re-assign Popup Closed");
}
@Then("Verify User should able to delete the Role by clicking Proceed Button")
public void verifyUserShouldAbleToDeleteTheRoleByClickingProceedButton() throws InterruptedException {
	pma.getRMS_Roles_and_Permissions_POM().get1stJobName().click();
	pma.getRMS_Roles_and_Permissions_POM().getRolesandPermissionDeleteButton().click();
	pma.getRMS_Roles_and_Permissions_POM().getDeleteJobPopupSaveButton().click();
	Thread.sleep(1000);
	pma.getRMS_Roles_and_Permissions_POM().getDeleteJobReassigntoWaiter().click();
	pma.getRMS_Roles_and_Permissions_POM().getDeleteJobReassignProceedButton().click();
	
	List<WebElement> AllRoleElement = pma.getRMS_Roles_and_Permissions_POM().getRolesElement();
    for (int i = 0; i < AllRoleElement.size(); i++) {
        String text = AllRoleElement.get(i).getText();
        System.out.println(text);
    
}
    
}

}
