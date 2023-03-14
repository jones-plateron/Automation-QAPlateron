package com.stepdefinition;

import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RMS_Roles_and_Permission extends BaseClass{
PageManager pma = new PageManager();
	
	public RMS_Roles_and_Permission() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
	
	@Then("User should verify by default {string},{string} and {string} Roles are available under the Jobs")
	public void userShouldVerifyByDefaultAndRolesAreAvailableUnderTheJobs(String string, String string2, String string3) {
	     
	    
	}
	@Then("User should able to click jobs option and verify the {string} option is selected by default")
	public void userShouldAbleToClickJobsOptionAndVerifyTheOptionIsSelectedByDefault(String string) {
	   
	}
	@Then("User should verify {string} Section is present and {string},{string} and {string} options is present under POS Access Section")
	public void userShouldVerifySectionIsPresentAndAndOptionsIsPresentUnderPOSAccessSection(String string, String string2, String string3, String string4) {
	   
	}
	@Then("User should verify {string} instruction under the Regenerate PIN option")
	public void userShouldVerifyInstructionUnderTheRegeneratePINOption(String string) {
	  
	}
	@Then("User should verify {string} instruction is present under Shift Review option")
	public void userShouldVerifyInstructionIsPresentUnderShiftReviewOption(String string) {
	    
	}
	@Then("User should verify {string} instruction is present under Clock-In\\/Clock-Out options")
	public void userShouldVerifyInstructionIsPresentUnderClockInClockOutOptions(String string) {
	    
	}
	@Then("User should verify {string} section is present and {string},{string},{string} and {string} options is present under Order Management Section")
	public void userShouldVerifySectionIsPresentAndAndOptionsIsPresentUnderOrderManagementSection(String string, String string2, String string3, String string4, String string5) {
	    
	}
	@Then("User should verify {string} instruction is present under View All Orders option")
	public void userShouldVerifyInstructionIsPresentUnderViewAllOrdersOption(String string) {
	    
	}
	@Then("User should verify {string} instruction is present under View My Orders option")
	public void userShouldVerifyInstructionIsPresentUnderViewMyOrdersOption(String string) {
	   
	}
	@Then("User should verify {string} instruction is present under Refund option")
	public void userShouldVerifyInstructionIsPresentUnderRefundOption(String string) {
	    
	}
	@Then("User should verify {string} instruction is present under Discount option")
	public void userShouldVerifyInstructionIsPresentUnderDiscountOption(String string) {
	   
	}
	@Then("User should verify {string} Section is present and verify {string} option present under Other Permissions Section")
	public void userShouldVerifySectionIsPresentAndVerifyOptionPresentUnderOtherPermissionsSection(String string, String string2) {
	    
	}
	@Then("User should verify {string} instruction is present under Settings option")
	public void userShouldVerifyInstructionIsPresentUnderSettingsOption(String string) {
	   
	}
	@Then("User should verify the all option is selected as default for manager")
	public void userShouldVerifyTheAllOptionIsSelectedAsDefaultForManager() {
	    
	}
	@Then("User should able to click waiter option and verify which are the option is selected and which are the option is not selected")
	public void userShouldAbleToClickWaiterOptionAndVerifyWhichAreTheOptionIsSelectedAndWhichAreTheOptionIsNotSelected() {
	    
	}
	@Then("User should able to hit Save")
	public void userShouldAbleToHitSave() {
	   
	}
	@Then("User should able to click Busser option and verify which are the option is selected and which are the option is not selected")
	public void userShouldAbleToClickBusserOptionAndVerifyWhichAreTheOptionIsSelectedAndWhichAreTheOptionIsNotSelected() {
	   
	}

@Then("User should able to click jobs option and verify the manager option is selected by default")
public void userShouldAbleToClickJobsOptionAndVerifyTheManagerOptionIsSelectedByDefault() {
    
}
@Then("User should able to click Add Jobs Button and verify the Add Jobs popup opens")
public void userShouldAbleToClickAddJobsButtonAndVerifyTheAddJobsPopupOpens() {
    
}
@Then("User should able to enter the {string} and verify {string} indication appears")
public void userShouldAbleToEnterTheAndVerifyIndicationAppears(String string, String string2) {
    
}
@When("User should able to clear the entered name and verify {string} indication appears")
public void userShouldAbleToClearTheEnteredNameAndVerifyIndicationAppears(String string) {
    
}
@Then("User should able to see and Click cancel Button and verify the Popup get closed")
public void userShouldAbleToSeeAndClickCancelButtonAndVerifyThePopupGetClosed() {
   
}
@Then("User should able to see and Click X icon and verify the Popup get Closed")
public void userShouldAbleToSeeAndClickXIconAndVerifyThePopupGetClosed() {
    
}

@Then("User should add the New job {string} and Click save Button")
public void userShouldAddTheNewJobAndClickSaveButton(String string, io.cucumber.datatable.DataTable dataTable) {
   
}
@Then("User should verify the New Jobs is added in the available job list")
public void userShouldVerifyTheNewJobsIsAddedInTheAvailableJobList() {
    
}
@Then("User should able to give permission for the New Role and Verify User should able to click Save Button")
public void userShouldAbleToGivePermissionForTheNewRoleAndVerifyUserShouldAbleToClickSaveButton() {
    // Write code here that turns the phrase above into concrete actions
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
