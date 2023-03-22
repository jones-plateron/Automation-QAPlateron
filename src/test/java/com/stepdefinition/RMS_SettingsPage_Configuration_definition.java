package com.stepdefinition;

import static org.testng.Assert.assertTrue;

import java.util.NoSuchElementException;

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
		String actText = pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsInstruction().getText();
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
	   String actName1 = pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageOptions().getText();
	   Assert.assertTrue(actName1.contains(string));
	   String actName2 = pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageInclusiveofSalesTaxOptions().getText();
	   Assert.assertTrue(actName2.contains(string2));
	   String actName3 = pma.getRMS_SettingsPage_Configuration_POM().getApplyServiceFeeOntheSubtotalafterDeductionsOption().getText();
	   Assert.assertTrue(actName3.contains(string3));
	   
	}
	@Then("User should Verify the Instruction {string} under Service Fee Percentage option")
	public void userShouldVerifyTheInstructionUnderServiceFeePercentageOption(String string) {
		String actName3 = pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageInstruction().getText();
		   Assert.assertTrue(actName3.contains(string));
	    
	}
	@Then("User should Validate the TextBox of Service Fee Percentage option")
	public void userShouldValidateTheTextBoxOfServiceFeePercentageOption() {
		
		String actSymbol = pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageSymbol().getText();
		Assert.assertTrue(actSymbol.contains("%"));
		System.out.println("Service Fee symbol is Verified");
		
		pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageTextBox().click();
		
		//Please enter valid value Validation 
		Actions action = new Actions(rmsDriver);
		action.keyDown(Keys.CONTROL).sendKeys("a");
	    action.sendKeys(Keys.BACK_SPACE).build().perform();
	    action.keyUp(Keys.CONTROL);	    
		pma.getRMS_SettingsPage_Configuration_POM().getBillSettingSaveButton().click();
		String actIndication = pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageTextBoxIndication().getText();
		Assert.assertTrue(actIndication.contains("Please enter valid value"));
		pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageTextBox().click();
		 pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageTextBox().sendKeys("1");
		 boolean actStatus = pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageTextBoxIndication().isDisplayed();
		 Assert.assertFalse(!actStatus);
		
		//Trying to give Alphabets
		pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageTextBox().click();
		action.keyDown(Keys.CONTROL).sendKeys("a");
	    action.sendKeys(Keys.BACK_SPACE).build().perform();
	    action.keyUp(Keys.CONTROL);
	    pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageTextBox().sendKeys("Robo");
	    String actText = pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageTextBox().getText();
		Assert.assertTrue(actText.isEmpty());
		
		//Trying to enter Special character
		pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageTextBox().sendKeys("!@$%%^&^&&&");
		String actText1 = pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageTextBox().getText();
		Assert.assertTrue(actText1.isEmpty());
		
		//Trying to enter decimal number
		pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageTextBox().sendKeys(".2");
		pma.getRMS_SettingsPage_Configuration_POM().getBillSettingSaveButton().click();
			
		//Conforming that given number is saved and displayed correctly
		String actGiven = pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageTextBox().getAttribute("value");
		System.out.println(actGiven);
        Assert.assertTrue(actGiven.contains(".2"));
		
	    
	}
	@Then("User should Verify the Instruction {string} under Service Fee Percentage inclusive of sales tax option")
	public void userShouldVerifyTheInstructionUnderServiceFeePercentageInclusiveOfSalesTaxOption(String string) {
		String actText = pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageInclusiveofSalesTaxInstruction().getText();
	    Assert.assertTrue(actText.contains(string));
	}
	@Then("User should Validate the Toggle of Service Fee Percentage inclusive of sales tax")
	public void userShouldValidateTheToggleOfServiceFeePercentageInclusiveOfSalesTax() {
	    //Holding this
	}
	@Then("User should Verify the Instruction {string} under Apply service fee on the subtotal after deductions")
	public void userShouldVerifyTheInstructionUnderApplyServiceFeeOnTheSubtotalAfterDeductions(String string) {
	    String actText = pma.getRMS_SettingsPage_Configuration_POM().getApplyServiceFeeOntheSubtotalafterDeductionsInstruction().getText();
	    Assert.assertTrue(actText.contains(string));
	}
	@Then("User should Validate the Toggle of Apply service fee on the subtotal after deductions")
	public void userShouldValidateTheToggleOfApplyServiceFeeOnTheSubtotalAfterDeductions() {
	   // Holding this
	}
	@Then("User Should able to Click Save Button")
	public void userShouldAbleToClickSaveButton() {
		pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxTextBox().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxTextBox().sendKeys("10");
		pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageTextBox().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageTextBox().sendKeys("15");
	    pma.getRMS_SettingsPage_Configuration_POM().getBillSettingSaveButton().click();
	}

//Bill Settings Finished>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.
	
	@Then("User should Click Gratuity Configuration and Verify the Gratuity Configuration Page Opens with {string}")
	public void userShouldClickGratuityConfigurationAndVerifyTheGratuityConfigurationPageOpensWith(String string) {
	   pma.getRMS_SettingsPage_Configuration_POM().getGratuityConfigurationSections().click();
	   String actName = pma.getRMS_SettingsPage_Configuration_POM().getGratuityConfigurationHeader().getText();
	   Assert.assertTrue(actName.contains(string));
	}
	@Then("User the Gratuity Page Contain {string} option with Toggle button and validate the toggle")
	public void userTheGratuityPageContainOptionWithToggleButtonAndValidateTheToggle(String string) {
	    String actName = pma.getRMS_SettingsPage_Configuration_POM().getEnableGratuityOptions().getText();
	    Assert.assertTrue(actName.contains(string));
	    
	    boolean enabled = pma.getRMS_SettingsPage_Configuration_POM().getEnableGratuityToggle().isEnabled();
	    System.out.println(enabled);
	}
	@Then("User the Gratuity Page Contain {string} with two option {string} and {string}")
	public void userTheGratuityPageContainWithTwoOptionAnd(String string, String string2, String string3) {
	    String actText = pma.getRMS_SettingsPage_Configuration_POM().getGratuityBasedonOption().getText();
	    Assert.assertTrue(actText.contains(string));
	    
	    String actText1 = pma.getRMS_SettingsPage_Configuration_POM().getGuestCountRadioButtonOption().getText();
	    Assert.assertTrue(actText1.contains(string2));
	    System.out.println(actText1);
	    
	    String actText2 = pma.getRMS_SettingsPage_Configuration_POM().getOrderAmountRadioButtonOption().getText();
	    Assert.assertTrue(actText2.contains(string3));
	    System.out.println(actText2);
	    
	}
	@Then("User should Verify {string} is visible when the Order Amount is Selected")
	public void userShouldVerifyIsVisibleWhenTheOrderAmountIsSelected(String string) {
		pma.getRMS_SettingsPage_Configuration_POM().getOrderAmountRadioButtonOption().click();
	    System.out.println("Order Amount Clicked Successfully");
	    
	    boolean displayed = pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsOptions().isDisplayed();
	    System.out.println(displayed);
	    
	    
	    boolean selected = pma.getRMS_SettingsPage_Configuration_POM().getTakeAwayCheckBox().isSelected();
	    System.out.println(selected);
	    
	    boolean selected2 = pma.getRMS_SettingsPage_Configuration_POM().getDineInCheckBox().isSelected();
	    System.err.println(selected2);
	    
	}
	@Then("User should Validate TakeAway and Dine-In")
	public void userShouldValidateTakeAwayAndDineIn() {
		//Holding this for confirmation
	   
	}
	@Then("User should Verify {string} is Hided when the Guest Count is Selected")
	public void userShouldVerifyIsHidedWhenTheGuestCountIsSelected(String string) {
		pma.getRMS_SettingsPage_Configuration_POM().getGuestCountRadioButtonOption().click();
		
		try {
			boolean displayed = pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityforOptions().isDisplayed();
			Assert.assertTrue(displayed);
		} catch (Exception e) {
          // e.printStackTrace();
			System.out.println("Apply Gratuity for is Hided");
		}
	}
	@Then("User should Verify {string} option is present and Validate the Textbox")
	public void userShouldVerifyOptionIsPresentAndValidateTheTextbox(String string) {
		String text = pma.getRMS_SettingsPage_Configuration_POM().getGratuityPercentageOption().getText();
	    Assert.assertTrue(text.contains(string));
	    
	    String text2 = pma.getRMS_SettingsPage_Configuration_POM().getGratuityPercentagesymbol().getText();
	    Assert.assertTrue(text2.contains("%"));
	    
	    //Textbox validation have to do 
	}
	@Then("User should Verify the Instruction {string} under Gratuity percentage option")
	public void userShouldVerifyTheInstructionUnderGratuityPercentageOption(String string) {
	    
	}
	@Then("User should Verify the Instruction {string} under Gratuity will be added on bill when subtotal reaches this amount option")
	public void userShouldVerifyTheInstructionUnderGratuityWillBeAddedOnBillWhenSubtotalReachesThisAmountOption(String string) {
	    
	}
	@Then("User should Verify {string} option is present and Validate the Toggle")
	public void userShouldVerifyOptionIsPresentAndValidateTheToggle(String string) {
	    
	}
	@Then("User should Verify the Instruction {string} under Apply gratuity on the subtotal after deductions option")
	public void userShouldVerifyTheInstructionUnderApplyGratuityOnTheSubtotalAfterDeductionsOption(String string) {
	    
	}
	@Then("User should able to Click Save Button")
	public void userShouldAbleToClickSaveButton1() {
	    
	}
}
//22-03-2023 18:32
