package com.stepdefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BaseClass;
import com.pagemanager.PageManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC8_Discount_Configuration_definition extends BaseClass {

	PageManager pma = new PageManager();

	public String specialChar = "!@#$%%^&*()_+";
	public String upperCase = "AUTOMATIONTEXT";
	public String lowerCase = "automationtext";
	public String numbers = "1234567890";
	public String text = "!@#$%^&*()abcdefghijABCDEFGHIJ1234567890AutomationTestRegression";
	
	public TC8_Discount_Configuration_definition() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);

}
	@When("User should redirects to Discount Configuration and Verify the Redirection")
	public void userShouldRedirectsToDiscountConfigurationAndVerifyTheRedirection() throws InterruptedException {
	    pma.getRMS_Discount_Configuration_POM().getDiscountSection().click();Thread.sleep(300);
	    boolean displayed = pma.getRMS_Discount_Configuration_POM().getDiscountConfigurationHeader().isDisplayed();
	    Assert.assertTrue(displayed);
	    
	}
	@Then("User should Click Create Discount button and verify the page redirection")
	public void userShouldClickCreateDiscountButtonAndVerifyThePageRedirection() {
	    pma.getRMS_Discount_Configuration_POM().getCreateDiscountBtn().click();
	    boolean displayed = pma.getRMS_Discount_Configuration_POM().getDiscountName().isDisplayed();
	    Assert.assertTrue(displayed);
	}
	@Then("User should validate the Discount Name Textbox and Error Message {string}")
	public void userShouldValidateTheDiscountNameTextboxAndErrorMessage(String string) {
	    pma.getRMS_Discount_Configuration_POM().getDiscountTempSave().click();
	    String actTxt = pma.getRMS_Discount_Configuration_POM().getDiscountNameTxtBxIndication().getText();
	    Assert.assertTrue(actTxt.contains(string));
	    //Special Characters
	    pma.getRMS_Discount_Configuration_POM().getDiscountNameTxtBx().sendKeys(specialChar);
	    String givenTxt1 = pma.getRMS_Discount_Configuration_POM().getDiscountNameTxtBx().getAttribute("value");
	    Assert.assertTrue(givenTxt1.equals(specialChar));
	    pma.getRMS_Discount_Configuration_POM().getDiscountNameTxtBx().clear();
	    //UpperCase
	    pma.getRMS_Discount_Configuration_POM().getDiscountNameTxtBx().sendKeys(upperCase);
	    String givenTxt2 = pma.getRMS_Discount_Configuration_POM().getDiscountNameTxtBx().getAttribute("value");
	    Assert.assertTrue(givenTxt2.equals(upperCase));
	    pma.getRMS_Discount_Configuration_POM().getDiscountNameTxtBx().clear();
	    //LowerCase
	    pma.getRMS_Discount_Configuration_POM().getDiscountNameTxtBx().sendKeys(lowerCase);
	    String givenTxt3 = pma.getRMS_Discount_Configuration_POM().getDiscountNameTxtBx().getAttribute("value");
	    Assert.assertTrue(givenTxt3.equals(lowerCase));
	    pma.getRMS_Discount_Configuration_POM().getDiscountNameTxtBx().clear();
	    //Numbers
	    pma.getRMS_Discount_Configuration_POM().getDiscountNameTxtBx().sendKeys(numbers);
	    String givenTxt4 = pma.getRMS_Discount_Configuration_POM().getDiscountNameTxtBx().getAttribute("value");
	    Assert.assertTrue(givenTxt4.equals(numbers));
	    pma.getRMS_Discount_Configuration_POM().getDiscountNameTxtBx().clear();
	    //Length Text
	    pma.getRMS_Discount_Configuration_POM().getDiscountNameTxtBx().sendKeys(text);
	    String givenTxt5 = pma.getRMS_Discount_Configuration_POM().getDiscountNameTxtBx().getAttribute("value");
	    Assert.assertTrue(givenTxt5.equals("!@#$%^&*()abcdefghijABCDE"));
	    pma.getRMS_Discount_Configuration_POM().getDiscountNameTxtBx().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	    
	}
	@Then("User should Validate the Discount percentage Textbox and Error Message {string}")
	public void userShouldValidateTheDiscountPercentageTextboxAndErrorMessage(String string) throws InterruptedException {
		pma.getRMS_Discount_Configuration_POM().getDiscountTempSave().click();
		String actTxt = pma.getRMS_Discount_Configuration_POM().getDiscountPercentageTxtBxIndication().getText();
		Assert.assertTrue(actTxt.contains(string));
		
	    //Special Characters
	    pma.getRMS_Discount_Configuration_POM().getDiscountPercentageTxtBx().sendKeys(specialChar);
	    String givenTxt1 = pma.getRMS_Discount_Configuration_POM().getDiscountPercentageTxtBx().getAttribute("value");
	    Assert.assertTrue(givenTxt1.isEmpty());
	    pma.getRMS_Discount_Configuration_POM().getDiscountPercentageTxtBx().clear();
	    //UpperCase
	    pma.getRMS_Discount_Configuration_POM().getDiscountPercentageTxtBx().sendKeys(upperCase);
	    String givenTxt2 = pma.getRMS_Discount_Configuration_POM().getDiscountPercentageTxtBx().getAttribute("value");
	    Assert.assertTrue(givenTxt2.isEmpty());
	    pma.getRMS_Discount_Configuration_POM().getDiscountPercentageTxtBx().clear();
	    //LowerCase
	    pma.getRMS_Discount_Configuration_POM().getDiscountPercentageTxtBx().sendKeys(lowerCase);
	    String givenTxt3 = pma.getRMS_Discount_Configuration_POM().getDiscountPercentageTxtBx().getAttribute("value");
	    Assert.assertTrue(givenTxt3.isEmpty());
	    pma.getRMS_Discount_Configuration_POM().getDiscountPercentageTxtBx().clear();
	  
	    
	    pma.getRMS_Discount_Configuration_POM().getDiscountPercentageTxtBx().clear();
	    //Numbers
	    pma.getRMS_Discount_Configuration_POM().getDiscountPercentageTxtBx().sendKeys(numbers);
	    String givenTxt4 = pma.getRMS_Discount_Configuration_POM().getDiscountPercentageTxtBx().getAttribute("value");
	    Assert.assertTrue(givenTxt4.equals("12"));
	    pma.getRMS_Discount_Configuration_POM().getDiscountPercentageTxtBx().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	  //Length Text
//	    pma.getRMS_Discount_Configuration_POM().getDiscountPercentageTxtBx().sendKeys(text);
//	    String givenTxt5 = pma.getRMS_Discount_Configuration_POM().getDiscountPercentageTxtBx().getAttribute("value");
//	    Thread.sleep(200);
//	    System.out.println(givenTxt5);
	  //Assert.assertTrue(givenTxt5.isEmpty());
	}
	@Then("User should validate the Minimum Order Amount Textbox")
	public void userShouldValidateTheMinimumOrderAmountTextbox() {
		
		//Default Value
		String defaultValue = pma.getRMS_Discount_Configuration_POM().getMinimumOrderAmntTxtBx().getAttribute("value");
		Assert.assertTrue(defaultValue.contains("0"));
	    //Special Characters
		pma.getRMS_Discount_Configuration_POM().getMinimumOrderAmntTxtBx().clear();
	    pma.getRMS_Discount_Configuration_POM().getMinimumOrderAmntTxtBx().sendKeys(specialChar);
	    String givenTxt1 = pma.getRMS_Discount_Configuration_POM().getMinimumOrderAmntTxtBx().getAttribute("value");
	    Assert.assertTrue(givenTxt1.isEmpty());
	    pma.getRMS_Discount_Configuration_POM().getMinimumOrderAmntTxtBx().clear();
	    //UpperCase
	    pma.getRMS_Discount_Configuration_POM().getMinimumOrderAmntTxtBx().sendKeys(upperCase);
	    String givenTxt2 = pma.getRMS_Discount_Configuration_POM().getMinimumOrderAmntTxtBx().getAttribute("value");
	    Assert.assertTrue(givenTxt2.isEmpty());
	    pma.getRMS_Discount_Configuration_POM().getMinimumOrderAmntTxtBx().clear();
	    //LowerCase
	    pma.getRMS_Discount_Configuration_POM().getMinimumOrderAmntTxtBx().sendKeys(lowerCase);
	    String givenTxt3 = pma.getRMS_Discount_Configuration_POM().getMinimumOrderAmntTxtBx().getAttribute("value");
	    Assert.assertTrue(givenTxt3.isEmpty());
	    pma.getRMS_Discount_Configuration_POM().getMinimumOrderAmntTxtBx().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	    //Numbers
	    pma.getRMS_Discount_Configuration_POM().getMinimumOrderAmntTxtBx().sendKeys(numbers);
	    String givenTxt4 = pma.getRMS_Discount_Configuration_POM().getMinimumOrderAmntTxtBx().getAttribute("value");
	    Assert.assertTrue(numbers.contains(givenTxt4));
	    pma.getRMS_Discount_Configuration_POM().getMinimumOrderAmntTxtBx().clear();
	    //Length Text
	    pma.getRMS_Discount_Configuration_POM().getMinimumOrderAmntTxtBx().sendKeys(text);
	    String givenTxt5 = pma.getRMS_Discount_Configuration_POM().getMinimumOrderAmntTxtBx().getAttribute("value");
	    Assert.assertTrue(text.contains(givenTxt5));
	    pma.getRMS_Discount_Configuration_POM().getMinimumOrderAmntTxtBx().clear();
	    
	}
	@Then("User should validate the DineIn and TakeOut CheckBox and Error Message {string}")
	public void userShouldValidateTheDineInAndTakeOutCheckBoxAndErrorMessage(String string) {
	    pma.getRMS_Discount_Configuration_POM().getDineInCheckBx().click();
	    pma.getRMS_Discount_Configuration_POM().geTakeOutCheckBx().click();
	    pma.getRMS_Discount_Configuration_POM().getDiscountTempSave().click();
	    String text = pma.getRMS_Discount_Configuration_POM().getOrderTypeIndication().getText();
	    Assert.assertTrue(text.contains(string));
	    
	}
	@Then("User should validate the Exclude Happy Hour Items Toggle")
	public void userShouldValidateTheExcludeHappyHourItemsToggle() throws InterruptedException {
		
	    pma.getRMS_Discount_Configuration_POM().getExcludeHappyHourItemsToggle().click();Thread.sleep(300);
	    pma.getRMS_Discount_Configuration_POM().getExcludeHappyHourItemsToggle().click();
	}
	@Then("User should validate the Exclude Menu and Exclude Menu Slide")
	public void userShouldValidateTheExcludeMenuAndExcludeMenuSlide() throws InterruptedException {
	   pma.getRMS_Discount_Configuration_POM().getExcludeMenuBtn().click();Thread.sleep(300);
	   String actTxt = pma.getRMS_Discount_Configuration_POM().getExcludeMenuSlideHeader().getText();
	   
	   System.out.println(actTxt);
	   Assert.assertTrue(actTxt.contains("Excluded List"));Thread.sleep(300);
	   //Closing by X-icon
	   pma.getRMS_Discount_Configuration_POM().getExcludeMenuSlideXicon().click();
	   
	   //Closing By Cancel Button
	   Thread.sleep(300);
	   pma.getRMS_Discount_Configuration_POM().getExcludeMenuBtn().click();
	   pma.getRMS_Discount_Configuration_POM().getExcludeMenuSlideCancelBtn().click();Thread.sleep(200);
	   
	   Thread.sleep(300);
	   pma.getRMS_Discount_Configuration_POM().getExcludeMenuBtn().click();
//	   pma.getRMS_Discount_Configuration_POM().getExcludeCate1().click();
	   
	   List<WebElement> excludeMenuSlideCate = pma.getRMS_Discount_Configuration_POM().getExcludeMenuSlideCateCheckBx();
	   Thread.sleep(300);
	   for (int i = 0; i < excludeMenuSlideCate.size(); i++) {
		   excludeMenuSlideCate.get(0).click();
		   break;
	}
	   Thread.sleep(300);
	   String text2 = pma.getRMS_Discount_Configuration_POM().getExcludeSelectedMenu().getText();
	   System.out.println(text2);
	   String substring = text2.substring(12,text2.length()-1);
	   System.out.println(substring);
	   String text3 = pma.getRMS_Discount_Configuration_POM().getExcludeSelectedNotifi().getText();
	   System.out.println(text3);
	   
	   Assert.assertTrue(text3.contains(substring));
	   pma.getRMS_Discount_Configuration_POM().getExcludeMenuSlideCancelBtn().click();Thread.sleep(200);
	   pma.getRMS_Discount_Configuration_POM().getDiscountTempCancel().click();
	}
	
	@Then("User should able to Create Discount Template")
	public void userShouldAbleToCreateDiscountTemplate() throws IOException, InterruptedException {
		
		for (int i = 1; i < 7; i++) {
			
			//Discount Name
	    String discountName = getDataFromExcel("Discount", (i), 0);
	    pma.getRMS_Discount_Configuration_POM().getDiscountNameTxtBx().sendKeys(discountName);Thread.sleep(300);
	    
	    //Discount percentage
	    String discountPercentage = getDataFromExcel("Discount",(i), 1);
	    pma.getRMS_Discount_Configuration_POM().getDiscountPercentageTxtBx().sendKeys(discountPercentage);Thread.sleep(300);
	    
	    //Minimum Order Amount
	    String minimumAmt = getDataFromExcel("Discount",(i), 2);
	    pma.getRMS_Discount_Configuration_POM().getMinimumOrderAmntTxtBx().sendKeys(minimumAmt);Thread.sleep(300);
	    
	    //Dine-In Click
	    String dineIn = getDataFromExcel("Discount", i, 3);
	    if (dineIn.equals("Yes")) {
	    	if (pma.getRMS_Discount_Configuration_POM().getDineInCheckBx1().getAttribute("value").equals("false")) {
	    		pma.getRMS_Discount_Configuration_POM().getDineInCheckBx().click();
			} 
		}
	    else if (dineIn.equals("No")) {
			if (pma.getRMS_Discount_Configuration_POM().getDineInCheckBx1().getAttribute("value").equals("true")) {
				pma.getRMS_Discount_Configuration_POM().getDineInCheckBx().click();
			}
		}
	    //Take-Out
	    Thread.sleep(300);
	    String TakeOut = getDataFromExcel("Discount", i, 4);
	    if (TakeOut.equals("Yes")) {
	    	if (pma.getRMS_Discount_Configuration_POM().geTakeOutCheckBx1().getAttribute("value").equals("false")) {
	    		pma.getRMS_Discount_Configuration_POM().geTakeOutCheckBx().click();
			} 
		}       
	    else if (TakeOut.equals("No")) { Thread.sleep(300);
			if (pma.getRMS_Discount_Configuration_POM().geTakeOutCheckBx1().getAttribute("value").equals("true")) {
				pma.getRMS_Discount_Configuration_POM().geTakeOutCheckBx().click();
			}
		}
	    
	    //Exclude Menu Btn
	    String excludeMenu = getDataFromExcel("Discount", i, 6);
	    if (excludeMenu.equals("Yes")) {
	    	if (i%2==0) {
	    		pma.getRMS_Discount_Configuration_POM().getExcludeMenuBtn().click();
		    	List<WebElement> excludeMenuSlideCateCheckBx = pma.getRMS_Discount_Configuration_POM().getExcludeMenuSlideCateCheckBx();Thread.sleep(500);
		    	excludeMenuSlideCateCheckBx.get(0).click();
		    	Thread.sleep(500);
			}
	    	else if (i%2==1) {
	    		pma.getRMS_Discount_Configuration_POM().getExcludeMenuBtn().click();
		    	List<WebElement> excludeMenuSlideCateCheckBx = pma.getRMS_Discount_Configuration_POM().getExcludeMenuSlideCateCheckBx();
		    	excludeMenuSlideCateCheckBx.get(excludeMenuSlideCateCheckBx.size()-1).click();
			}
			pma.getRMS_Discount_Configuration_POM().getExcludeMenuSlideApply().click();
		}else if(excludeMenu.equals("No")) {
			
		}
	    pma.getRMS_Discount_Configuration_POM().getDiscountTempSave().click();
	    Thread.sleep(300);
	    pma.getRMS_Discount_Configuration_POM().getCreateDiscountBtn().click();
	}
		Thread.sleep(300);
		pma.getRMS_Discount_Configuration_POM().getDiscountTempCancel().click();
		}
	@Then("User should Validate the Template")
	public void userShouldValidateTheTemplate() {
	    List<WebElement> ot = pma.getRMS_Discount_Configuration_POM().getOT();
	    for (int i = 0; i < ot.size(); i++) {
	    	String text2 = ot.get(i).getText();
	    	System.out.println(text2);
			
		}
	}
	@Then("User should Create new Template and Make InActive")
	public void userShouldCreateNewTemplateAndMakeInActive() throws InterruptedException {

	   // Validating the Delete popup by Deleting one Template 
	   List<WebElement> otDiscountName = pma.getRMS_Discount_Configuration_POM().getOTDiscountName();
	   for (int i = 0; i < otDiscountName.size(); i++) {
		   String text2 = otDiscountName.get(0).getText();
		   System.out.println(text2);
		   List<WebElement> ot3Dots = pma.getRMS_Discount_Configuration_POM().getOT3Dots();
		   for (int j = 0; j < ot3Dots.size(); j++) {
			   ot3Dots.get(0).click();
			   pma.getRMS_Discount_Configuration_POM().getOTDelete().click();
			   String text3 = pma.getRMS_Discount_Configuration_POM().getOTDeleteDialog().getText();
			   System.out.println(text3);Thread.sleep(500);
			   Assert.assertTrue(text3.contains("Would you like to delete "+text2+" Discount ?"));
			   pma.getRMS_Discount_Configuration_POM().getOTDeletePopDelete().click();
			   break;			
		}
	  break;
	}
	   Thread.sleep(300);
	  //Inactiving One Template
	    List<WebElement>  toggle = pma.getRMS_Discount_Configuration_POM().getOTActiveToggle();
	   for (int i = 0; i < toggle.size(); i++) {
		   toggle.get(i).click();
		   break;
	}
}
	   
	
	@Then("User should able to Delete the Discount Template")
	public void userShouldAbleToDeleteTheDiscountTemplate() throws InterruptedException, IOException {
		
	   List<WebElement> ot3Dots = pma.getRMS_Discount_Configuration_POM().getOT3Dots();
	   
	   String deleteStatus = getDataFromExcel("Discount", 1, 7);
	   if (deleteStatus.equals("Yes")) {
	   for (int i = 0; i < ot3Dots.size(); i++) {Thread.sleep(300);
		   Thread.sleep(1000);
		   ot3Dots.get(0).click();
		   pma.getRMS_Discount_Configuration_POM().getOTDelete().click();
		   pma.getRMS_Discount_Configuration_POM().getOTDeletePopDelete().click();
		   Thread.sleep(300);
		   ot3Dots = pma.getRMS_Discount_Configuration_POM().getOT3Dots();
		   i--;
	}
	   }
	}
}