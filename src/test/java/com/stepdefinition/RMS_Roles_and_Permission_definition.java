package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BaseClass;
import com.pagemanager.PageManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RMS_Roles_and_Permission_definition extends BaseClass{
PageManager pma = new PageManager();
	
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
	public void userShouldVerifySectionIsPresentAndAndOptionsIsPresentUnderPOSAccessSection(String string, String string2, String string3, String string4) {
	   pma.getRMS_Roles_and_Permissions_POM().getAvailableJobsManager().click();
	   
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
	public void userShouldVerifyInstructionUnderTheRegeneratePINOption(String string)
	{
	  String actReInstruction = pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinInstructions().getText();
	  System.out.println(actReInstruction);
	  Assert.assertTrue(actReInstruction.contains(string));
	}
	
	@Then("User should verify {string} instruction is present under Shift Review option")
	public void userShouldVerifyInstructionIsPresentUnderShiftReviewOption(String string) 
	{
		String actShiftReviewInstruction = pma.getRMS_Roles_and_Permissions_POM().getShiftReviewInstruction().getText();
		System.out.println(actShiftReviewInstruction);
	    Assert.assertTrue(actShiftReviewInstruction.contains(string));
	}
	
	@Then("User should verify {string} instruction is present under Clock-In\\/Clock-Out options")
	public void userShouldVerifyInstructionIsPresentUnderClockInClockOutOptions(String string)
	{
		String actClockInOutInstruction = pma.getRMS_Roles_and_Permissions_POM().getClockInOutInstruction().getText();
		System.out.println(actClockInOutInstruction);
	    Assert.assertTrue(actClockInOutInstruction.contains(string));
	}
	
	@Then("User should verify {string} section is present and {string},{string},{string} and {string} options is present under Order Management Section")
	public void userShouldVerifySectionIsPresentAndAndOptionsIsPresentUnderOrderManagementSection(String string, String string2, String string3, String string4, String string5) 
	{
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
	public void userShouldVerifyInstructionIsPresentUnderViewAllOrdersOption(String string) 
	{
		String actViewallorderInstruction = pma.getRMS_Roles_and_Permissions_POM().getViewAllOrdersInstruction().getText();
	    Assert.assertTrue(actViewallorderInstruction.contains(string));
	}
	@Then("User should verify {string} instruction is present under View My Orders option")
	public void userShouldVerifyInstructionIsPresentUnderViewMyOrdersOption(String string) 
	{
		String actViewmyorderInstruction = pma.getRMS_Roles_and_Permissions_POM().getViewMyOrdersInstruction().getText();
	    Assert.assertTrue(actViewmyorderInstruction.contains(string));
	}
	@Then("User should verify {string} instruction is present under Refund option")
	public void userShouldVerifyInstructionIsPresentUnderRefundOption(String string) 
	{
		String actRefundInstruction = pma.getRMS_Roles_and_Permissions_POM().getRefundInstruction().getText();
	    Assert.assertTrue(actRefundInstruction.contains(string));
	}
	@Then("User should verify {string} instruction is present under Discount option")
	public void userShouldVerifyInstructionIsPresentUnderDiscountOption(String string) 
	{
		String actDiscountInstruction = pma.getRMS_Roles_and_Permissions_POM().getDiscountInstruction().getText();
	    Assert.assertTrue(actDiscountInstruction.contains(string));
	}
	@Then("User should verify {string} Section is present and verify {string} option present under Other Permissions Section")
	public void userShouldVerifySectionIsPresentAndVerifyOptionPresentUnderOtherPermissionsSection(String string, String string2) 
	{
	    String actOtherPermissionSection = pma.getRMS_Roles_and_Permissions_POM().getOtherPermissionsSection().getText();
	Assert.assertTrue(actOtherPermissionSection.contains(string));
	
	   String actSettingsPermission = pma.getRMS_Roles_and_Permissions_POM().getSettingsPermissions().getText();
		Assert.assertTrue(actSettingsPermission.contains(string2));
	}
	@Then("User should verify {string} instruction is present under Settings option")
	public void userShouldVerifyInstructionIsPresentUnderSettingsOption(String string) {
	   String actSettingsInstruction = pma.getRMS_Roles_and_Permissions_POM().getSettingsInstruction().getText();
	   Assert.assertTrue(actSettingsInstruction.contains(string));
	}
	
	@Then("User should verify the all option is selected as default for manager")
	public void userShouldVerifyTheAllOptionIsSelectedAsDefaultForManager() throws InterruptedException {
		
		Thread.sleep(1000);
//		if
//		(pma.getRMS_Roles_and_Permissions_POM().getRegeneratePinCheckBox().isSelected())
//		{
//			System.out.println("Regenerate checkbox is Selected");
//		}else
//			System.out.println("Regenerate checkbox is not Selected");
		
		
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

@Then("User should able to click Add Jobs Button and verify the Add Jobs popup opens")
public void userShouldAbleToClickAddJobsButtonAndVerifyTheAddJobsPopupOpens() {
	pma.getRMS_Roles_and_Permissions_POM().getAddJobsButton().click();
	String addJobPopupHeadingCheck = pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupHeading().getText();
	Assert.assertTrue(addJobPopupHeadingCheck.contains("Add Job"));
    
}
@Then("User should able to enter the {string} and verify {string} indication appears")
public void userShouldAbleToEnterTheAndVerifyIndicationAppears(String string, String string2) {
	//pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupTextBox().click();
	pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupTextBox().sendKeys(string);
	
	String specialCharacterIndication = pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupSpecialcharacterErrorIndication().getText();
    Assert.assertTrue(specialCharacterIndication.contains(string2));
}
@When("User should able to clear the entered name and verify {string} indication appears")
public void userShouldAbleToClearTheEnteredNameAndVerifyIndicationAppears(String string) {
    pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupTextBox().clear();
    
    String ValidJobIndication = pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupEnterValidJobErrorIndication().getText();
    Assert.assertTrue(ValidJobIndication.contains(string));
}
@Then("User should able to see and Click cancel Button and verify the Popup get closed")
public void userShouldAbleToSeeAndClickCancelButtonAndVerifyThePopupGetClosed() {
	pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupCancelButton().isDisplayed();
	pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupCancelButton().click();
   
}
@Then("User should able to see and Click X icon and verify the Popup get Closed")
public void userShouldAbleToSeeAndClickXIconAndVerifyThePopupGetClosed() {
    pma.getRMS_Roles_and_Permissions_POM().getAddJobsButton().click();
    pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupXicon().isDisplayed();
    pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupXicon().click();
}

@Then("User should add the New job {string} and Click save Button")
public void userShouldAddTheNewJobAndClickSaveButton(String string, io.cucumber.datatable.DataTable dataTable) {
   pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupTextBox().sendKeys(string);
   pma.getRMS_Roles_and_Permissions_POM().getAddJobPopupSaveButton().click();
}
@Then("User should verify the New Jobs is added in the available job list")
public void userShouldVerifyTheNewJobsIsAddedInTheAvailableJobList() {
	
	List<WebElement> AllRoleElement = pma.getRMS_Roles_and_Permissions_POM().getRolesElement();
    for (int i = 0; i < AllRoleElement.size(); i++) {
        String text = AllRoleElement.get(i).getText();
        System.out.println(text);
        //Assert.assertTrue(text.contains(string));
        
    }
    
}
@Then("User should able to give permission for the New Role and Verify User should able to click Save Button")
public void userShouldAbleToGivePermissionForTheNewRoleAndVerifyUserShouldAbleToClickSaveButton() {
    pma.getRMS_Roles_and_Permissions_POM().getAvailableJobsManager();
}
@Then("User should able to see the edit icon and click edit icon to edit the Role Name {string}")
public void userShouldAbleToSeeTheEditIconAndClickEditIconToEditTheRoleName(String string) {
    
}
@Then("User should verify the role name is Changed")
public void userShouldVerifyTheRoleNameIsChanged() {
    
}

@Then("User should able to select the Job and edit the permission")
public void userShouldAbleToSelectTheJobAndEditThePermission() {
    
}

@Then("User should able to delete the Role by clicking delete Button")
public void userShouldAbleToDeleteTheRoleByClickingDeleteButton() {
    
}
@Then("User should verify the delete popup opens and Verify {string}")
public void userShouldVerifyTheDeletePopupOpensAndVerify(String string) {
   
}
@Then("User should verify the popup get closed when User clicks X icon or Cancel Button")
public void userShouldVerifyThePopupGetClosedWhenUserClicksXIconOrCancelButton() {
    
}
@Then("User should verify the job gets deleted when User clicks delete Button")
public void userShouldVerifyTheJobGetsDeletedWhenUserClicksDeleteButton() {
    
}

@Then("Verify the Re-assign popup opens and Verify {string} instruction")
public void verifyTheReAssignPopupOpensAndVerifyInstruction(String string) {
	
}
    
@Then("User should able to Re-assign the employee to other role")
public void userShouldAbleToReAssignTheEmployeeToOtherRole() {
    
}
@Then("Verify User should able to Close by clicking either X icon or Cancel Button")
public void verifyUserShouldAbleToCloseByClickingEitherXIconOrCancelButton() {
    
}
@Then("Verify User should able to delete the Role by clicking Proceed Button")
public void verifyUserShouldAbleToDeleteTheRoleByClickingProceedButton() {
    
}
}
