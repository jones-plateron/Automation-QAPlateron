package com.feature.page.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

public class RMS_Roles_and_Permissions_POM extends BaseClass {
PageManager pma = new PageManager();
	
	public RMS_Roles_and_Permissions_POM() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}

	public WebElement getJobsTab() {
		WebElement element = rmsDriver.findElement(By.xpath("//a[contains(text(),'Jobs')]"));
		return element;
	}
	
	public WebElement getManagerNameHeader() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[@class='page-header__page-title sm mb-3']"));
		return element;
}
	public WebElement getAvailableJobsNameHeader() {
		WebElement element = rmsDriver.findElement(By.xpath("//h3[@class='page-header__page-title sm mb-3']"));
		return element;
}
	
	public WebElement getAvailableJobsManager() {
		WebElement element = rmsDriver.findElement(By.xpath("(//div[@class='text-ellipsis'])[1]"));
		return element;
}
	public WebElement getAvailableJobsWaiter() {
		WebElement element = rmsDriver.findElement(By.xpath("(//div[@class='text-ellipsis'])[2]"));
		return element;
}
	
	public WebElement getAvailableJobsBusser() {
		WebElement element = rmsDriver.findElement(By.xpath("(//div[@class='text-ellipsis'])[3]"));
		return element;
}
	public WebElement getPOSAcessSection() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'POS Access')]"));
		return element;
	}		
	
//	public WebElement getAvailableJobsBakers() {
//		WebElement element = rmsDriver.findElement(By.xpath("////*[contains(text(),'Bakers')]"));
//		return element;
//	}
//	
//	public WebElement getAvailableJobsCleaner() {
//		WebElement element = rmsDriver.findElement(By.xpath("////*[contains(text(),'Cleaner')]"));
//		return element;
//	}
//	
//	public WebElement getAvailableJobsRobot1() {
//		WebElement element = rmsDriver.findElement(By.xpath("////*[contains(text(),'Robot 1')]"));
//		return element;
//	}
//	public WebElement getAvailableJobsBakers() {
//		WebElement element = rmsDriver.findElement(By.xpath("////*[contains(text(),'Bakers')]"));
//		return element;
//	}
//	
	
	////*[contains(text(),'Manager')]
	
	public List<WebElement> getRolesElement() {
        return rmsDriver.findElements(By.xpath("//li[@class='list-item cursor-pointer ']"));
    }
	//Changed locators Now
	public WebElement getRegeneratePinPermissions() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[normalize-space()='Regenerate PIN']"));
		return element;
	}	
	public WebElement getRegeneratePinInstructions() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'This permission allows the employee to regenerate PIN from POS. An SMS containing the new PIN would to sent to the employee')]"));
		return element;
	}

	public WebElement getShiftReviewPermissions() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[contains(text(),'Shift Review')]"));
		return element;
	}	
	
	public WebElement getShiftReviewInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'This permission allows the employee to review their shift')]"));
		return element;
	}

	public WebElement getClockInOutPermissions() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[normalize-space()='Clock-In/Clock-Out']"));
		return element;
	}
	
	public WebElement getClockInOutInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'This permission allows the employee to clock-in/clock-out')]"));
		return element;
	}

	public WebElement getOrderManagementSection() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'Order Management')]"));
		return element;
	}
	
	public WebElement getViewAllOrdersPermissions() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[contains(text(),'View All Orders')]"));
		return element;
	}
	public WebElement getViewAllOrdersInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'This permission allows the employee to view any order')]"));
		return element;
	}
	
	public WebElement getViewMyOrdersPermissions() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[contains(text(),'View My Orders')]"));
		return element;
	}
	public WebElement getViewMyOrdersInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'This permission allows the employee to view only the order that is waited by him/her in the restaurant')]"));
		return element;
	}

	public WebElement getRefundPermissions() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[contains(text(),'Refund')]"));
		return element;
	}
	public WebElement getRefundInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'This permission allows the employee to initiate refund to the order amount')]"));
		return element;
	}
	
	public WebElement getDiscountPermissions() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[contains(text(),'Discount')]"));
		return element;
	}
	public WebElement getDiscountInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'This permission allows the employee to apply discounts for the order')]"));
		return element;
	}
	
	public WebElement getOtherPermissionsSection() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'Other Permissions')]"));
		return element;
	}
		
	public WebElement getSettingsPermissions() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[contains(text(),'Settings')]"));
		return element;
	}
	
	public WebElement getSettingsInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'This permission enables the employee to view control the POS')]"));
		return element;
	}
	public WebElement getAddJobsButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[@class='btn btn-outline-primary btn-small d-flex justify-content-center align-items-center']"));
		return element;
	}
	//AddJob-Popup	
	
	public WebElement getAddJobPopupHeading() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[@class='modal-title text-ellipsis ']"));
		return element;
	}
	public WebElement getAddJobPopupJobName() {
		WebElement element = rmsDriver.findElement(By.xpath("//label[@class='page-subheader__help-title d-block mb-1']"));
		return element;
	}
	public WebElement getAddJobPopupTextBox() {
		WebElement element = rmsDriver.findElement(By.xpath("//input[@name='id']"));
		return element;
	}
	public WebElement getAddJobPopupSaveButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[@type='button'][normalize-space()='Save']"));
		return element;
	}

	public WebElement getAddJobPopupCancelButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
		return element;
	}
	public WebElement getAddJobPopupSpecialcharacterErrorIndication() {
		WebElement element = rmsDriver.findElement(By.xpath("//span[contains(text(),'Name should not include special character!!')]"));
		return element;
	}
	public WebElement getAddJobPopupEnterValidJobErrorIndication() {
		WebElement element = rmsDriver.findElement(By.xpath("//span[contains(text(),'Please enter valid job name')]"));
		return element;
	}
	public WebElement getAddJobPopupXicon() {
		WebElement element = rmsDriver.findElement(By.xpath("//i[@class='icon-close icon-5x']"));
		return element;
	}
	public WebElement getAvailableJobEditIcon() {
		WebElement element = rmsDriver.findElement(By.xpath("//i[@class='icon-edit black icon-3x']"));
		return element;
	}
	
	//CheckBox Locators	
	public WebElement getRegeneratePinCheckBox() {
		WebElement element = rmsDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]"));
		return element;
	}
	public WebElement getShiftReviewCheckBox() {
		WebElement element = rmsDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]"));
		return element;
	}
	public WebElement getClockInOutCheckBox() {
		WebElement element = rmsDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[2]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/label[1]/span[1]"));
		return element;
	}
	public WebElement getViewAllOrderCheckBox() {
		WebElement element = rmsDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]"));
		return element;
	}
	public WebElement getViewMyOrderChechBox() {
		WebElement element = rmsDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]"));
		return element;
	}
	public WebElement getRefundCheckBox() {
		WebElement element = rmsDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/label[1]/span[1]"));
		return element;
	}
	public WebElement getDiscountCheckBox() {
		WebElement element = rmsDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[2]/div[2]/div[2]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/label[1]/span[1]"));
		return element;
	}
	public WebElement getSettingsCheckBox() {
		WebElement element = rmsDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[2]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]"));
		return element;
	}
	public WebElement getRolesandPermissionSaveButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[@class='btn btn-primary btn btn-small medium d-flex align-items-center ']"));
		return element;
	}
	public WebElement getRolesandPermissionDeleteButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[@class='btn btn-outline-danger btn-small d-flex align-items-center ']"));
		return element;
	}
	//DeleteJob-Popup
	
	public WebElement getDeleteJobPopupHeader() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[@class='modal-title text-ellipsis ']"));
		return element;
	}
	public WebElement getDeleteJobPopupDialog() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'Would you like to delete')]"));
		return element;
	}
	public WebElement getDeleteJobPopupCancelButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[contains(@class,'btn btn-default')]"));
		return element;
	}
	public WebElement getDeleteJobPopupSaveButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[@class='btn btn-danger btn-small d-flex align-items-center ']"));
		return element;
	}
	
	//DeleteJob Reassign-Popup
	
	public WebElement getDeleteJobReassignDialog() {
		WebElement element = rmsDriver.findElement(By.xpath("//body/div[contains(@role,'dialog')]/div[contains(@class,'modal-dialog')]/div[contains(@class,'modal-content modal-lg')]/div[contains(@class,'pb-5')]/p[1]"));
		return element;
	}
	public WebElement getDeleteJobReassigntoWaiter() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[normalize-space()='Waiter']"));
		return element;
	}
	public WebElement getDeleteJobReassigntoManager() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[normalize-space()='Manager']"));
		return element;
	}
	public WebElement getDeleteJobReassigntoBusser() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[normalize-space()='Busser']"));
		return element;
	}
	public WebElement getDeleteJobReassignNextArrow() {
		WebElement element = rmsDriver.findElement(By.xpath("//span[contains(@class,'carousel-control-next-icon carousel-transition')]"));
		return element;
	}
	public WebElement getDeleteJobReassignPreviousArrow() {
		WebElement element = rmsDriver.findElement(By.xpath("//span[@class='carousel-control-prev-icon carousel-transition ']"));
		return element;
	}
	public WebElement getDeleteJobReassignProceedButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-small d-flex align-items-center cursor-na']"));
		return element;
	}
	public WebElement getDeleteJobReassignCancelButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[@class='btn btn-medium btn-default']"));
		return element;
	}
	
	public WebElement getDeleteJobReassignXicon() {
		WebElement element = rmsDriver.findElement(By.xpath("//i[@class='icon-close icon-5x']"));
		return element;
	}
	
}
