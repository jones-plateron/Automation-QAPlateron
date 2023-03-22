package com.stepdefinition;

import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

import io.cucumber.java.en.Then;

public class RMS_SettingsPage_Configuration_definition extends BaseClass {
	PageManager pma = new PageManager();
	
	public RMS_SettingsPage_Configuration_definition() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
	
	@Then("User should able to Click Settings Sections")
	public void userShouldAbleToClickSettingsSections() {
	    
	}
	@Then("User should Click Bill Configuration and Verify the Bill Configuration Page Opens")
	public void userShouldClickBillConfigurationAndVerifyTheBillConfigurationPageOpens() {
	    
	}
	@Then("User should able to Verify the Page Header as {string} and Verify it Contains {string} and {string} Sections")
	public void userShouldAbleToVerifyThePageHeaderAsAndVerifyItContainsAndSections(String string, String string2, String string3) {
	    
	}
	@Then("User should Verify Sales Tax section contains {string} ,{string} and {string} options")
	public void userShouldVerifySalesTaxSectionContainsAndOptions(String string, String string2, String string3) {
	    
	}
	@Then("User should Verify the Instruction {string} under Sales Tax option")
	public void userShouldVerifyTheInstructionUnderSalesTaxOption(String string) {
	    
	}
	@Then("User should Validate the TextBox of Salex Tax option")
	public void userShouldValidateTheTextBoxOfSalexTaxOption() {
	   
	}
	@Then("User should Verify the Instruction {string} under Apply sales tax on the subtotal after deductions option")
	public void userShouldVerifyTheInstructionUnderApplySalesTaxOnTheSubtotalAfterDeductionsOption(String string) {
	    
	}
	@Then("User should Validate the Toggle of Apply sales tax on the subtotal after deductions option")
	public void userShouldValidateTheToggleOfApplySalesTaxOnTheSubtotalAfterDeductionsOption() {
	    
	}
	@Then("User should Verify the Instruction {string} under Apply sales tax on the tip after deductions option")
	public void userShouldVerifyTheInstructionUnderApplySalesTaxOnTheTipAfterDeductionsOption(String string) {
	    
	}
	@Then("User should Validate the Toggle of Apply sales tax on the tip after deductions")
	public void userShouldValidateTheToggleOfApplySalesTaxOnTheTipAfterDeductions() {
	   
	}
	@Then("User should Verify Service Fee section contain {string},{string} and {string} options")
	public void userShouldVerifyServiceFeeSectionContainAndOptions(String string, String string2, String string3) {
	   
	}
	@Then("User should Verify the Instruction {string} under Service Fee Percentage option")
	public void userShouldVerifyTheInstructionUnderServiceFeePercentageOption(String string) {
	    
	}
	@Then("User should Validate the TextBox of Service Fee Percentage option")
	public void userShouldValidateTheTextBoxOfServiceFeePercentageOption() {
	    
	}
	@Then("User should Verify the Instruction {string} under Service Fee Percentage inclusive of sales tax option")
	public void userShouldVerifyTheInstructionUnderServiceFeePercentageInclusiveOfSalesTaxOption(String string) {
	    
	}
	@Then("User should Validate the Toggle of Service Fee Percentage inclusive of sales tax")
	public void userShouldValidateTheToggleOfServiceFeePercentageInclusiveOfSalesTax() {
	    
	}
	@Then("User should Verify the Instruction {string} under Apply service fee on the subtotal after deductions")
	public void userShouldVerifyTheInstructionUnderApplyServiceFeeOnTheSubtotalAfterDeductions(String string) {
	    
	}
	@Then("User should Validate the Toggle of Apply service fee on the subtotal after deductions")
	public void userShouldValidateTheToggleOfApplyServiceFeeOnTheSubtotalAfterDeductions() {
	    
	}
	@Then("User Should able to Click Save Button")
	public void userShouldAbleToClickSaveButton() {
	    
	}


}
