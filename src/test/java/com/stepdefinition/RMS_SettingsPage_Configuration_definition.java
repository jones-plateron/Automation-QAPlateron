package com.stepdefinition;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BaseClass;
import com.feature.page.pom.RMS_SettingsPage_Configuration_POM;
import com.pagemanager.PageManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RMS_SettingsPage_Configuration_definition extends BaseClass {
	PageManager pma = new PageManager();
	
	public RMS_SettingsPage_Configuration_definition() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
	
	@When("User should able to Click Settings Sections")
	public void userShouldAbleToClickSettingsSections() {
		pma.getRMS_SettingsPage_Configuration_POM().getSettingsSections().click();
		String actName = pma.getRMS_SettingsPage_Configuration_POM().getSettingsHeader().getText();
	    Assert.assertTrue(actName.contains("Settings"));
	    System.out.println("Settings page Opened");
	}
	@Then("User should Click Bill Configuration and Verify the Bill Configuration Page Opens")
	public void userShouldClickBillConfigurationAndVerifyTheBillConfigurationPageOpens() {
		pma.getRMS_SettingsPage_Configuration_POM().getBillConfigurationOptionSections().click();
		String actText = pma.getRMS_SettingsPage_Configuration_POM().getBillConfigurationPageHeader().getText();
		Assert.assertTrue(actText.contains("Billing - Tax"));
		System.out.println("Bill Settings Opened");
		
	}
	@Then("User should able to Verify the Page Header as {string} and Verify it Contains {string} and {string} Sections")
	public void userShouldAbleToVerifyThePageHeaderAsAndVerifyItContainsAndSections(String string, String string2, String string3) {
		String actHeader = pma.getRMS_SettingsPage_Configuration_POM().getBillConfigurationPageHeader().getText();
		Assert.assertTrue(actHeader.contains(string));
		String actSection1 = pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxSectionHeader().getText();
	    Assert.assertTrue(actSection1.contains(string2));
	    //String actSection2 = pma.getRMS_SettingsPage_Configuration_POM().getServiceFeeSectionHeader().getText();
	    //Assert.assertTrue(actSection2.contains(string2));    
	}
	@Then("User should Verify Sales Tax section contains {string} ,{string} and {string} options")
	public void userShouldVerifySalesTaxSectionContainsAndOptions(String string, String string2, String string3) {
	    String actOption1 = pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxOptions().getText();
	    Assert.assertTrue(actOption1.contains(string));
	    String actOption2 = pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsOptions().getText();
	    Assert.assertTrue(actOption2.contains(string2));
	    String actOption3 = pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheTipafterDeductionsOptions().getText();
	    Assert.assertTrue(actOption3.contains(string3));
	}
	@Then("User should Verify the Instruction {string} under Sales Tax option")
	public void userShouldVerifyTheInstructionUnderSalesTaxOption(String string) {
		String actIns = pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxInstruction().getText();
	    Assert.assertTrue(actIns.contains(string));
	}
	@Then("User should Validate the TextBox of Salex Tax option")
	public void userShouldValidateTheTextBoxOfSalexTaxOption() {
		String actSymbol = pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxSymbol().getText();
		Assert.assertTrue(actSymbol.contains("%"));
		System.out.println("Sales Tax symbol is Verified");
		pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxTextBox().click();
		
		//Please enter valid value Validation 
		Actions action = new Actions(rmsDriver);
		action.keyDown(Keys.CONTROL).sendKeys("a");
	    action.sendKeys(Keys.BACK_SPACE).build().perform();
	    action.keyUp(Keys.CONTROL);	    
		pma.getRMS_SettingsPage_Configuration_POM().getBillSettingSaveButton().click();
		String actIndication = pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxTextboxIndication().getText();
		Assert.assertTrue(actIndication.contains("Please enter valid value"));
		pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxTextBox().click();
		 pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxTextBox().sendKeys("1");
		 boolean actStatus = pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxTextboxIndication().isDisplayed();
		 Assert.assertFalse(!actStatus);
		
		//Trying to give Alphabets
		pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxTextBox().click();
		action.keyDown(Keys.CONTROL).sendKeys("a");
	    action.sendKeys(Keys.BACK_SPACE).build().perform();
	    action.keyUp(Keys.CONTROL);
	    pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxTextBox().sendKeys("Robo");
	    String actText = pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxTextBox().getText();
		Assert.assertTrue(actText.isEmpty());
		
		//Trying to enter Special character
		pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxTextBox().sendKeys("!@$%%^&^&&&");
		String actText1 = pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxTextBox().getText();
		Assert.assertTrue(actText1.isEmpty());
		
		//Trying to enter decimal number
		pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxTextBox().sendKeys(".2");
		pma.getRMS_SettingsPage_Configuration_POM().getBillSettingSaveButton().click();
			
		//Conforming that given number is saved and displayed correctly
		String actGiven = pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxTextBox().getAttribute("value");
		System.out.println(actGiven);
        Assert.assertTrue(actGiven.contains(".2"));
        
        
	}
	@Then("User should Verify the Instruction {string} under Apply sales tax on the subtotal after deductions option")
	public void userShouldVerifyTheInstructionUnderApplySalesTaxOnTheSubtotalAfterDeductionsOption(String string) {
		String actText = pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxInstruction().getText();
		Assert.assertTrue(actText.contains(string));
	    
	}
	@Then("User should Validate the Toggle of Apply sales tax on the subtotal after deductions option")
	public void userShouldValidateTheToggleOfApplySalesTaxOnTheSubtotalAfterDeductionsOption() {
		
	    //Holding this
	}
	@Then("User should Verify the Instruction {string} under Apply sales tax on the tip after deductions option")
	public void userShouldVerifyTheInstructionUnderApplySalesTaxOnTheTipAfterDeductionsOption(String string) {
		String actText = pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheTipafterDeductionsInstruction().getText();
	    Assert.assertTrue(actText.contains(string));
	}
	@Then("User should Validate the Toggle of Apply sales tax on the tip after deductions")
	public void userShouldValidateTheToggleOfApplySalesTaxOnTheTipAfterDeductions() {
		//Holding this 
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
//22-03-2023
