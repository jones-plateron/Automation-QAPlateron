package com.feature.page.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

public class RMS_SettingsPage_Configuration_POM extends BaseClass{
PageManager pma = new PageManager();
	
	public RMS_SettingsPage_Configuration_POM() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}

	public WebElement getSettingsSections() {
		WebElement element = rmsDriver.findElement(By.xpath("//i[@class='icon-settings mr-1']"));
		return element;
	}
	public WebElement getBillConfigurationOptionSections() {
		WebElement element = rmsDriver.findElement(By.xpath("//li[contains(text(),'Bill Configuration')]"));
		return element;
	}
	
	public WebElement getBillConfigurationPageHeader() {
		WebElement element = rmsDriver.findElement(By.xpath("//div[contains(text(),'Billing - Tax, Fees & Charges')]"));
		return element;
	}
	public WebElement getSalesTaxSectionHeader() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[@class='settings-body-header']"));
		return element;
	}
	
	public WebElement getSalesTaxOptions() {
		WebElement element = rmsDriver.findElement(By.xpath("(//h4[@class='accordion-body__header'])[1]"));
		return element;
	}
	public WebElement getSalesTaxInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'percentage of tax to be applied on the total amount of order')]"));
		return element;
	}
	public WebElement getSalesTaxTextBox() {
		WebElement element = rmsDriver.findElement(By.xpath("//input[@name='taxPercentage']"));//input[@id="taxPer"])[1]
		return element;
	}
	public WebElement getApplySalesTaxontheSubtotalafterDeductionsOptions() {
		WebElement element = rmsDriver.findElement(By.xpath("(//h4[@class='accordion-body__header'])[2]"));
		return element;
	}
	public WebElement getApplySalesTaxontheSubtotalafterDeductionsToggle() {
		WebElement element = rmsDriver.findElement(By.xpath("(//span[@class=\"toggle-slider round\"])[1]"));
		return element;
	}
	public WebElement getApplySalesTaxontheSubtotalafterDeductionsInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'turning tip would apply sales tax on subtotal before deductions')]"));
		return element;
	}
	public WebElement getApplySalesTaxontheTipafterDeductionsOptions() {
		WebElement element = rmsDriver.findElement(By.xpath("(//h4[@class='accordion-body__header'])[3]"));
		return element;
	}
	public WebElement getgetApplySalesTaxontheTipafterDeductionsToggle() {
		WebElement element = rmsDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[3]/div[1]/div[2]/label[1]/span[1]"));
		return element;
	}
	public WebElement getApplySalesTaxontheTipafterDeductionsInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'turning off would not apply sales tax on tip')]"));
		return element;
	}
	public WebElement getServiceFeeSectionHeader() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[@class='settings-body-footer']"));
		return element;
	}
	public WebElement getServiceFeePercentageOptions() {
		WebElement element = rmsDriver.findElement(By.xpath("(//h4[@class='accordion-body__header'])[4]"));
		return element;
	}
	public WebElement getServiceFeePercentageTextBox() {
		WebElement element = rmsDriver.findElement(By.xpath("//input[@name='serviceFeePercentage']"));
		return element;
	}
	public WebElement getServiceFeePercentageInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'if service fee applicable for the order')]"));
		return element;
	}
	
	public WebElement getServiceFeePercentageInclusiveofSalesTaxOptions() {
		WebElement element = rmsDriver.findElement(By.xpath("(//h4[@class='accordion-body__header'])[5]"));
		return element;
	}
	public WebElement getServiceFeePercentageInclusiveofSalesTaxToggle() {
		WebElement element = rmsDriver.findElement(By.xpath("(//span[@class='toggle-slider round'])[3]"));
		return element;
	}
	public WebElement getServiceFeePercentageInclusiveofSalesTaxInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'if tax to be applied for the service fee')]"));
		return element;
	}
	public WebElement getApplyServiceFeeOntheSubtotalafterDeductionsOption() {
		WebElement element = rmsDriver.findElement(By.xpath("(//h4[@class='accordion-body__header'])[6]"));
		return element;
	}
	public WebElement getApplyServiceFeeOntheSubtotalafterDeductionsToggle() {
		WebElement element = rmsDriver.findElement(By.xpath("(//span[@class='toggle-slider round'])[4]"));
		return element;
	}
	public WebElement getApplyServiceFeeOntheSubtotalafterDeductionsInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'turning off would apply service fee on subtotal before deductions')]"));
		return element;
	}
	public WebElement getBillSettingSaveButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-small d-flex align-items-center ']"));
		return element;
	}
	public WebElement getGratuityConfigurationSections() {
		WebElement element = rmsDriver.findElement(By.xpath("//li[@class='list-item cursor-pointer ' and contains(text(),'Gratuity Configuration' )]"));
		return element;
	}
	public WebElement getGratuityConfigurationHeader() {
		WebElement element = rmsDriver.findElement(By.xpath("//div[@class='page-header__page-title font-x-bold mb-3' and contains(text(),'Gratuity Configuration')]"));
		return element;
	}
	public WebElement getEnableGratuityOptions() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[@class='accordion-body__header' and contains(text(),'Enable Gratuity')]"));
		return element;
	}
	public WebElement getEnableGratuityToggle() {
		WebElement element = rmsDriver.findElement(By.xpath("//span[@class='toggle-slider round'][1]"));
		return element;
	}
	public WebElement getDateandTimeSecHeader() {
		return rmsDriver.findElement(By.xpath("//div[contains(text(),'Date and Time Format')]"));
	}
//	public WebElement get() {
//		WebElement element = rmsDriver.findElement(By.xpath(""));
//		return element;
//	}
//	public WebElement get() {
//		WebElement element = rmsDriver.findElement(By.xpath(""));
//		return element;
//	}
//	public WebElement get() {
//		WebElement element = rmsDriver.findElement(By.xpath(""));
//		return element;
//	}
//	public WebElement get() {
//		WebElement element = rmsDriver.findElement(By.xpath(""));
//		return element;
//	}
//	public WebElement get() {
//		WebElement element = rmsDriver.findElement(By.xpath(""));
//		return element;
//	}
//	
}
//21-03-2023 18.29

