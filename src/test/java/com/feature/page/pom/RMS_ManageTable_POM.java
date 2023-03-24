package com.feature.page.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

public class RMS_ManageTable_POM extends BaseClass {
PageManager pma = new PageManager();
	
	public RMS_ManageTable_POM() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);

}
	
	public WebElement getPOSSystemSections() {
		WebElement element = rmsDriver.findElement(By.xpath("//span[contains(@class,'menu-name')][normalize-space()='POS System']"));
		return element;
	}
	
	public WebElement getPOSSetupTab() {
		WebElement element = rmsDriver.findElement(By.xpath("//a[normalize-space()='POS Setup']"));
		return element;
	}
	public WebElement getPOSSetupQr() {
		WebElement element = rmsDriver.findElement(By.xpath("//figure[contains(@class,'w-20')]//*[name()='svg']"));
		return element;
	}
	public WebElement getPOSSetupQrInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[@class='empty-state__title font-bold mt-0']"));
		return element;
	}
	public WebElement getManageTableTab() {
		WebElement element = rmsDriver.findElement(By.xpath("//section[@class='page-header position-sticky pb-0']//li[1]"));
		return element;
	}
	public WebElement getDineInTab() {
		WebElement element = rmsDriver.findElement(By.xpath("//li[contains(@class,'switch-tag small cursor-pointer switch-tag-active')]"));
		return element;
	}
	public WebElement getTakeOutTab() {
		WebElement element = rmsDriver.findElement(By.xpath("//li[@class='switch-tag small cursor-pointer switch-tag-active ']"));
		return element;
	}
	public WebElement getAddTableButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[contains(@class,'btn btn-outline-primary btn-small d-flex align-items-center')]"));
		return element;
	}
	public WebElement getAddTablePopupHeader() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[@class='modal-title text-ellipsis 'and contains(text(),'Add Table')]"));
		return element;
	}
	public WebElement getAreaDuringAddArea() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(@class,'form-label d-flex justify-content-between')]"));
		return element;
	}
	public WebElement getAreaDuringSelectArea() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[normalize-space()='Area']"));
		return element;
	}
	public WebElement getAddAreaButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(@class,'primarytext-color cursor-pointer') and contains(text(),'+ Add Area')]"));
		return element;
	}
	public WebElement getSelectAreaButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(@class,'primarytext-color cursor-pointer') and contains(text(),'Select Area')]"));
		return element;
	}
	public WebElement getAreaSelectDropDown() {
		WebElement element = rmsDriver.findElement(By.xpath("//select[@placeholder='Select']"));
		return element;
	}
	public WebElement getAreaTextBox() {
		WebElement element = rmsDriver.findElement(By.xpath("//input[@placeholder='Enter area name']"));
		return element;
	}
	public WebElement getTextName() {
		WebElement element = rmsDriver.findElement(By.xpath("//label[normalize-space()='Table Name']"));
		return element;
	}
	public WebElement getTextNameTextBox() {
		WebElement element = rmsDriver.findElement(By.xpath("//input[contains(@name,'tableName')]"));
		return element;
	}
	public WebElement getSeatingCapacity() {
		WebElement element = rmsDriver.findElement(By.xpath("//label[normalize-space()='Seating Capacity']"));
		return element;
	}
	public WebElement getSeatingCapacityTextBox() {
		WebElement element = rmsDriver.findElement(By.xpath("//input[contains(@name,'seatingCapacity')]"));
		return element;
	}
	public WebElement getAddTableCancelButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[@class='btn  btn-outline-default btn-small d-flex align-items-center ']"));
		return element;
	}
	public WebElement getAddTableSaveButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-small d-flex align-items-center ']"));
		return element;
	}
	public WebElement getAddTableXIcon() {
		WebElement element = rmsDriver.findElement(By.xpath("//i[contains(@class,'icon-close icon-5x')]"));
		return element;
	}
	public WebElement getSearchTextBox() {
		WebElement element = rmsDriver.findElement(By.xpath("//input[@placeholder='Search by table/area']"));
		return element;
	}
	
}