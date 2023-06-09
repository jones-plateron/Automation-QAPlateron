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
		WebElement element = rmsDriver.findElement(By.xpath("//li[@id='Settings']"));
		return element;
	}
	public WebElement getSettingsHeader() {
		WebElement element = rmsDriver.findElement(By.xpath("//a[contains(text(),'Settings')]"));
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
	public WebElement getSalesTaxTextboxIndication() {
		WebElement element = rmsDriver.findElement(By.xpath("(//span[@class='invalid-feedback'])[1]"));
		return element;
	}
	
	public WebElement getSalesTaxSymbol() {
		WebElement element = rmsDriver.findElement(By.xpath("(//span[@class='input-group-text'])[1]"));//input[@id="taxPer"])[1]
		return element;
	}
	public WebElement getApplySalesTaxontheSubtotalafterDeductionsOptions() {
		WebElement element = rmsDriver.findElement(By.xpath("(//h4[@class='accordion-body__header'])[2]"));
		return element;
	}
	public WebElement getApplySalesTaxontheSubtotalafterDeductionsToggle() {
		WebElement element = rmsDriver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		return element;
	}
	public WebElement getApplySalesTaxontheSubtotalafterDeductionsToggle1() {
		WebElement element = rmsDriver.findElement(By.xpath("(//span[@class='toggle-slider round'])[1]"));
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
		WebElement element = rmsDriver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		return element;
	}
	public WebElement getgetApplySalesTaxontheTipafterDeductionsToggle1() {
		WebElement element = rmsDriver.findElement(By.xpath("(//span[@class='toggle-slider round'])[2]"));
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
		WebElement element = rmsDriver.findElement(By.xpath("//h4[normalize-space()='Service Fee Percentage']"));
		return element;
	}
	public WebElement getServiceFeePercentageSymbol() {
		WebElement element = rmsDriver.findElement(By.xpath("(//span[@class='input-group-text'])[2]"));
		return element;
	}
	public WebElement getServiceFeePercentageTextBox() {
		WebElement element = rmsDriver.findElement(By.xpath("//input[@name='serviceFeePercentage']"));
		return element;
	}
	public WebElement getServiceFeePercentageTextBoxIndication() {
		WebElement element = rmsDriver.findElement(By.xpath("(//span[@class='invalid-feedback'])[2]"));
		return element;
	}
	public WebElement getServiceFeePercentageInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'if service fee applicable for the order')]"));
		return element;
	}
	
	public WebElement getServiceFeePercentageInclusiveofSalesTaxOptions() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[normalize-space()='Service Fee Percentage inclusive of sales tax']"));
		return element;
	}
	public WebElement getServiceFeePercentageInclusiveofSalesTaxToggle() {
		WebElement element = rmsDriver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		return element;
	}
	public WebElement getServiceFeePercentageInclusiveofSalesTaxToggle1() {
		WebElement element = rmsDriver.findElement(By.xpath("//li[contains(@class,'list-item border-bottom pb-3 mt-3')]//span[contains(@class,'toggle-slider round')]"));
		return element;
	}
	public WebElement getServiceFeePercentageInclusiveofSalesTaxInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'if tax to be applied for the service fee')]"));
		return element;
	}
	public WebElement getApplyServiceFeeOntheSubtotalafterDeductionsOption() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[normalize-space()='Apply service fee on the subtotal after deductions']"));
		return element;
	}
	public WebElement getApplyServiceFeeOntheSubtotalafterDeductionsToggle() {
		WebElement element = rmsDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/ul[2]/li[3]/div[1]/div[2]/label[1]/span[1]"));
		return element;
	}
	public WebElement getApplyServiceFeeOntheSubtotalafterDeductionsToggle1() {
		WebElement element = rmsDriver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		return element;
	}
	public WebElement getApplyServiceFeeOntheSubtotalafterDeductionsInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'turning off would apply service fee on subtotal before deductions')]"));
		return element;
	}
	public WebElement getBillSettingSaveButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		return element;
	}
	public WebElement getGratuityConfigurationSections() {
		WebElement element = rmsDriver.findElement(By.xpath("//li[@class='list-item cursor-pointer ' and contains(text(),'Gratuity Configuration' )]"));
		return element;
	}
	public WebElement getGratuityConfigurationSections2() {
		WebElement element = rmsDriver.findElement(By.xpath("(.//*[text()='Gratuity Configuration'])[1]"));
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
		WebElement element = rmsDriver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		return element;
	}
	public WebElement getEnableGratuityToggle1() {
		WebElement element = rmsDriver.findElement(By.xpath("//span[@class='toggle-slider round']"));
		return element;
	}
	public WebElement getDateandTimeSecHeader() {
		return rmsDriver.findElement(By.xpath("//div[contains(text(),'Date and Time Format')]"));
	}

	public WebElement getGratuityBasedonOption() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[@class='accordion-body__header' and contains(text(),'Gratuity Based on')]"));
		return element;
	}
	public WebElement getGuestCountRadioButtonOption() {
		WebElement element = rmsDriver.findElement(By.xpath("(//*[@class='gratuity-label'])[1]"));
		return element;
	}
	public WebElement getOrderAmountRadioButtonOption() {
		WebElement element = rmsDriver.findElement(By.xpath("(//*[@class='gratuity-label'])[2]"));
		return element;
	}
	public WebElement getGratuityPercentageOption() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[@class='accordion-body__header' and contains(text(),'Gratuity percentage')]"));
		return element;
	}
	public WebElement getGratuityPercentageTextBox() {
		WebElement element = rmsDriver.findElement(By.xpath("//input[@name='gratuityPercentage']"));
		return element;
	}
	public WebElement getGratuityPercentageTextBoxIndication() {
		WebElement element = rmsDriver.findElement(By.xpath("(//span[@class='invalid-feedback'])[3]"));
		return element;
	}
	
	
	public WebElement getGratuityPercentageInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'if gratuity need not be applied please')]"));
		return element;
	}
	public WebElement getGratuityPercentagesymbol() {
		WebElement element = rmsDriver.findElement(By.xpath("(//span[@class='input-group-text'])[1]"));
		return element;
	}
	public WebElement getGratuitywillbeAddedonBillwhenSubtotalReachesthisAmountOption() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[@class='accordion-body__header' and contains(text(), 'Gratuity will be added on bill when subtotal reaches this amount')]"));
		return element;
	}
	public WebElement getGratuitywillbeAddedonBillwhenSubtotalReachesthisAmountSymbol() {
		WebElement element = rmsDriver.findElement(By.xpath("//span[normalize-space()='$']"));
		return element;
	}
	public WebElement getGratuitywillbeAddedonBillwhenSubtotalReachesthisAmountTextBox() {
		WebElement element = rmsDriver.findElement(By.xpath("//input[contains(@name,'orderFromValue')]"));
		return element;
	}
	public WebElement getGratuitywillbeAddedonBillwhenSubtotalReachesthisAmountTextBoxIndication() {
		WebElement element = rmsDriver.findElement(By.xpath("(//span[@class='invalid-feedback'])[4]"));
		return element;
	}
	public WebElement getGratuitywillbeAddedonBillwhenSubtotalReachesthisAmountInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'then gratuity is activated')]"));
		return element;
	}
	public WebElement getGratuitywillbeAddedonBillwhenGuestCountReachesthisNo() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[@class='accordion-body__header' and contains(text(),'Gratuity will be added on bill when Guest count reaches this No')]"));
		return element;
	}
	public WebElement getGratuitywillbeAddedonBillwhenGuestCountReachesthisNoInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[@class='muted' and contains(text(),'then gratuity is activated')]"));
		return element;
	}
	public WebElement getGratuitywillbeAddedonBillwhenGuestCountReachesthisNoTextbox() {
		WebElement element = rmsDriver.findElement(By.xpath("//input[@name='orderFromValue']"));
		return element;
	}
	
	public WebElement getTaxtobeAppliedonGratuityAmountOption() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[@class='accordion-body__header' and  contains(text(),'Tax to be applied on gratuity amount')]"));
		return element;
	}
	public WebElement getTaxtobeAppliedonGratuityAmountSymbol() {
		WebElement element = rmsDriver.findElement(By.xpath("(//span[@class='input-group-text'])[2]"));
		return element;
	}
	public WebElement getTaxtobeAppliedonGratuityAmountTextBox() {
		WebElement element = rmsDriver.findElement(By.xpath("//li[contains(@class,'list-item border-bottom pb-3 mt-3 py-1')]//div[contains(@class,'form-row form-row row d-flex flex-wrap align-items-center mb-1 justify-space-between')]//input[contains(@class,'')]"));
		return element;
	}
	public WebElement getTaxtobeAppliedonGratuityAmountTextBoxIndication() {
		WebElement element = rmsDriver.findElement(By.xpath("(//span[@class='invalid-feedback'])[5]"));
		return element;
	}
	public WebElement getApplyGratuityforOptions() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[@class='accordion-body__header' and contains(text(),'Apply Gratuity for')]"));
		return element;
	}
	public WebElement getTakeAwayCheckBox() {//(//span[@class=' label-text  text-bottom '])[1]
		WebElement element = rmsDriver.findElement(By.xpath("(//span[@class=' label-text  text-bottom '])[1]"));
		return element;
	}
	public WebElement getTakeAwayCheckBox1() {//(//span[@class=' label-text  text-bottom '])[1]
		WebElement element = rmsDriver.findElement(By.xpath("(//input[@type='checkbox'][@name='check'])[1]"));
		return element;
	}
	
	public WebElement getDineInCheckBox() {
		WebElement element = rmsDriver.findElement(By.xpath("(//span[@class=' label-text  text-bottom '])[2]"));
		return element;
	}
	public WebElement getDineInCheckBox1() {
		WebElement element = rmsDriver.findElement(By.xpath("(//input[@type='checkbox'][@name='check'])[2]"));
		return element;
	}
	public WebElement getTakeAwayText() {
		WebElement element = rmsDriver.findElement(By.xpath("//span[contains(text(),'TakeAway')]"));
		return element;
	}
	public WebElement getDineInText() {
		WebElement element = rmsDriver.findElement(By.xpath("//span[contains(text(),'Dine-In')]"));
		return element;
	}
	
	public WebElement getApplyGratuityontheSubtotalafterDeductionsOptions() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[@class='accordion-body__header' and contains(text(),'Apply gratuity on the subtotal after deductions')]"));
		return element;
	}
	public WebElement getApplyGratuityontheSubtotalafterDeductionsToggle() {
		WebElement element = rmsDriver.findElement(By.xpath("//span[@class='toggle-slider    round ']"));
		return element;
	}
	public WebElement getApplyGratuityontheSubtotalafterDeductionsToggle1() {
		WebElement element = rmsDriver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		return element;
	}
	public WebElement getApplyGratuityontheSubtotalafterDeductionsToggle2() {
		WebElement element = rmsDriver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
		return element;
	}
	public WebElement getApplyGratuityontheSubtotalafterDeductionsInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(text(),'turning off would apply gratuity on subtotal before deductions')]"));
		return element;
	}
	public WebElement getGratuityConfigurationSaveButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-small d-flex align-items-center ']"));
		return element;
	}
	public WebElement getPaymentSettingsSection() {
		WebElement element = rmsDriver.findElement(By.xpath("//li[normalize-space()='Payment Settings']"));
		return element;
	}
	public WebElement getPaymentModeCheckBox() {
		WebElement element = rmsDriver.findElement(By.xpath("//div[contains(@class,'nav-collapsed')]//div//div[1]//ul[1]//li[1]//div[1]//div[1]//label[1]//span[1]"));
		return element;
	}
	public WebElement getPaymentModeCheckBox1Satus() {
		WebElement element = rmsDriver.findElement(By.xpath("(//input[@name='enable_kds'])[1]"));
		return element;
	}
	public WebElement getPaymentsettingsPageSaveBtn() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-small d-flex align-items-center ']"));
		return element;
	}
	public WebElement getPaymentsettingsPageDisabledSaveBtn() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-small d-flex align-items-center cursor-na']"));
		return element;
	}
}

//23-03-2023 18:20
