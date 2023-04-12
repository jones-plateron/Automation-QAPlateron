package com.feature.page.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

public class RMS_Discount_Configuration_POM extends BaseClass {

	PageManager pma = new PageManager();

	public RMS_Discount_Configuration_POM() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}

	public WebElement getDiscountSection() {
		return rmsDriver.findElement(By.xpath("//img[contains(@class,'mr-1 discount-side-nav-image')]"));
	}

	public WebElement getDiscountConfigurationHeader() {
		return rmsDriver.findElement(By.xpath("//*[contains(text(),'Discount Configuration')]"));
	}

	public WebElement getCreateDiscountBtn() {
		return rmsDriver.findElement(By.xpath("//*[contains(text(),'Create Discount')]"));
	}

	public WebElement getDiscountName() {
		return rmsDriver.findElement(By.xpath("//h4[contains(text(),'Discount Name')]"));
	}

	public WebElement getDiscountNameTxtBx() {
		return rmsDriver.findElement(By.xpath("//input[@name='discountName']"));
	}
	public WebElement getDiscountNameTxtBxIndication() {
		return rmsDriver.findElement(By.xpath("//span[normalize-space()='Please enter a discount name']"));
	}

	public WebElement getDiscountPercentage() {
		return rmsDriver.findElement(By.xpath("//h4[normalize-space()='Discount Percentage']"));
	}
	
	public WebElement getDiscountPercentageTxtBx() {
		return rmsDriver.findElement(By.xpath("//input[contains(@name,'discountPercentage')]"));
	}
	public WebElement getDiscountPercentageTxtBxIndication() {
		return rmsDriver.findElement(By.xpath("//span[normalize-space()='Please enter discount percentage']"));
	}

	public WebElement getDiscountPercentageSymbol() {
		return rmsDriver.findElement(By.xpath("//span[normalize-space()='%']"));
	}

	public WebElement getMinimumOrderAmnt() {
		return rmsDriver.findElement(By.xpath("//*[contains(text(),'Minimum Order Amount')]"));
	}

	public WebElement getMinimumOrderAmntSymbol() {
		return rmsDriver.findElement(By.xpath("//span[normalize-space()='$']"));
	}

	public WebElement getMinimumOrderAmntTxtBx() {
		return rmsDriver.findElement(By.xpath("//input[@name='minOrderAmount']"));
	}

	public WebElement getOrderType() {
		return rmsDriver.findElement(By.xpath("//h4[normalize-space()='Order Type']"));
	}
	public WebElement getOrderTypeIndication() {
		return rmsDriver.findElement(By.xpath("//div[normalize-space()='Select order type']"));
	}

	public WebElement getDineInCheckBx() {
		return rmsDriver.findElement(By.xpath("//div[contains(@class,'order-type-checkbox')]//div[1]//label[1]//span[1]"));
	}
	public WebElement getDineInCheckBx1() {
		return rmsDriver.findElement(By.xpath("(//input[@name='check'])[1]"));
	}
	
	public WebElement geTakeOutCheckBx1() {
		return rmsDriver.findElement(By.xpath("(//input[@name='check'])[2]"));
	}
	public WebElement geTakeOutCheckBx() {
		return rmsDriver.findElement(By.xpath("(//span[@class=' label-text  text-bottom '])[2]"));
	}

	public WebElement getExcludeHappyHourItems() {
		return rmsDriver.findElement(By.xpath("//h4[normalize-space()='Exclude Happy Hour Items']"));
	}

	public WebElement getExcludeHappyHourItemsToggle() {
		return rmsDriver.findElement(By.xpath("//span[contains(@class,'toggle-slider round')]"));
	}

	public WebElement getExcludeHappyHourItemsInstruction() {
		return rmsDriver.findElement(By.xpath("//p[contains(text(),'be applied on Happy Hour')]"));
	}

	public WebElement getExcludeMenu() {
		return rmsDriver.findElement(By.xpath("//h4[normalize-space()='Exclude Menu List']"));
	}

	public WebElement getExcludeMenuInstruction() {
		return rmsDriver.findElement(By.xpath("//p[contains(text(),'in this excluded list')]"));
	}

	public WebElement getExcludeMenuBtn() {
		return rmsDriver.findElement(By.xpath("//button[contains(@class,'btn exclude-items-btn')]"));
	}

	public WebElement getDiscountTempCancel() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
	}

	public WebElement getDiscountTempSave() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Save']"));
	}

	public WebElement getExcludeMenuSlideHeader() {
		return rmsDriver.findElement(By.xpath("//h4[normalize-space()='Excluded List']"));
	}

	public WebElement getExcludeMenuSlideXicon() {
		return rmsDriver.findElement(By.xpath("//i[@class='icon-close icon-5x']"));
	}
	public List<WebElement> getExcludeMenuSlideCate() {
		List<WebElement> element = rmsDriver.findElements(By.xpath("//div[@class='task-group__header justify-content-between cursor-pointer']"));
		return element;
	}
	public List<WebElement> getExcludeMenuSlideCateCheckBx() {
		List<WebElement> element = rmsDriver.findElements(By.xpath("//span[@class='label-text text-bottom ']"));
		return element;
	}
	public WebElement getExcludeCate1() {
		return rmsDriver.findElement(By.xpath("(//span[@class='label-text text-bottom '])[1]"));
	}
	public WebElement getExcludeSelectedMenu() {
		return rmsDriver.findElement(By.xpath("//span[contains(@class,'font-bold')]"));
	}
	public WebElement getExcludeSelectedNotifi() {
		return rmsDriver.findElement(By.xpath("//div[@class=' notification-container']"));
	}
	public List<WebElement> getExcludeMenuSlideMenu() {
		return rmsDriver.findElements(By.xpath("//div[@class='task-group__header']"));
	} 
	public WebElement getExcludeMenuSlideCancelBtn() {
		return rmsDriver.findElement(By.xpath("(//button[normalize-space()='Cancel'])[2]"));
	}
	public WebElement getExcludeMenuSlideApply() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Apply']"));
	}
	public WebElement getExcludeMenuSlideSearchBar() {
		return rmsDriver.findElement(By.xpath("//input[@placeholder='Search menu items']"));
	}
	/////////////////////////Outside Template\\\\\\\\\\\\\\\\\\\\\\
	public List<WebElement> getOT() {
		return rmsDriver.findElements(By.xpath("//div[@class='discount-card-container ']"));
	}
	public List<WebElement> getOTDiscountName() {
		return rmsDriver.findElements(By.xpath("//h2[@class='discount-title-container ']"));
	}
	public List<WebElement> getOTDiscountItems() {
		return rmsDriver.findElements(By.xpath("//div[@class='discount-item-container ']"));
	}
	public List<WebElement> getOTStatus() {
		return rmsDriver.findElements(By.xpath("//h4[@class='accordion-body__header']"));
	}
	public List<WebElement> getOT3Dots() {
		return rmsDriver.findElements(By.xpath("//i[@class='icon-icon-ellipsis-v icon-3x']"));
	}
	public WebElement getOTEdit() {
		return rmsDriver.findElement(By.xpath("//p[normalize-space()='Edit']"));
	}
	public WebElement getOTDelete() {
		return rmsDriver.findElement(By.xpath("//p[normalize-space()='Delete']"));
	}
	public WebElement getOTDeleteDialog() {
		return rmsDriver.findElement(By.xpath("//div[contains(@role,'dialog')]//p[1]"));
	}
	public WebElement getOTDeletePopDelete() {
		return rmsDriver.findElement(By.xpath("//button[@class='btn btn-danger btn-small d-flex align-items-center ']"));
	}
	public List<WebElement> getOTActiveToggle() {
		return rmsDriver.findElements(By.xpath("//span[@class='toggle-slider round discount-toggle ']"));
	}
}
