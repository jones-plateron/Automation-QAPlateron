package com.stepdefinition;

import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bill_Configuration_Definition extends BaseClass{
	
	PageManager pma = new PageManager();
	
	public Bill_Configuration_Definition() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
	
	
	
	@When("User should Click Settings Sections")
	public void userShouldClickSettingsSections() {
		
	}
	@Then("User should verify the Page redirection to Settings Page {string}")
	public void userShouldVerifyThePageRedirectionToSettingsPage(String datePageHdr) {
	}
	@Then("User should click Bill configuration and update the sales tax percentage #Excel Input")
	public void userShouldClickBillConfigurationAndUpdateTheSalesTaxPercentageExcelInput() {
	}
	@Then("User should Enable or Disable Apply sales tax on Subtotal after Deductions Option #Excel Input")
	public void userShouldEnableOrDisableApplySalesTaxOnSubtotalAfterDeductionsOptionExcelInput() {
	}
	@Then("User should Enable or Disable Apply sales tax on Tip after Deductions Option #Excel Input")
	public void userShouldEnableOrDisableApplySalesTaxOnTipAfterDeductionsOptionExcelInput() {
	}
	@Then("User should enter the Service Fee Percentage #Excel Input")
	public void userShouldEnterTheServiceFeePercentageExcelInput() {
	}
	@Then("User should enable or Disable the Service fee tax option #Excel Input")
	public void userShouldEnableOrDisableTheServiceFeeTaxOptionExcelInput() {
	}
	@Then("User should enable or Disable the Apply service fee on the subtotal after deductions #Excel Input")
	public void userShouldEnableOrDisableTheApplyServiceFeeOnTheSubtotalAfterDeductionsExcelInput() {
	}
	@Then("User should click Save button in Bill Configuration page")
	public void userShouldClickSaveButtonInBillConfigurationPage() {
	}
	@When("User should click gratuity configuration section")
	public void userShouldClickGratuityConfigurationSection() {
	}
	@Then("User enable or disable the Gratuity option #Excel Input")
	public void userEnableOrDisableTheGratuityOptionExcelInput() {
	}
	@Then("User should select Checkbox Guest Count or Order Amount #Excel Input")
	public void userShouldSelectCheckboxGuestCountOrOrderAmountExcelInput() {
	}
	@Then("User should enter the Gratuity Percentage #Excel Input")
	public void userShouldEnterTheGratuityPercentageExcelInput() {
	}
	@Then("User should verify and Enter Gratuity eligibility #Excel Input Two")
	public void userShouldVerifyAndEnterGratuityEligibilityExcelInputExcelInputTwo() {
	}
	@Then("User should Enter the Gratuity tax percentage #Excel Input")
	public void userShouldEnterTheGratuityTaxPercentageExcelInput() {
	}
	@Then("User should enable or Disable the Apply gratuity on subtotal after deductions #Excel Input")
	public void userShouldEnableOrDisableTheApplyGratuityOnSubtotalAfterDeductionsExcelInput() {
	}
	@Then("User should click save button in Gratuity configuration page")
	public void userShouldClickSaveButtonInGratuityConfigurationPage() {
	}

}
