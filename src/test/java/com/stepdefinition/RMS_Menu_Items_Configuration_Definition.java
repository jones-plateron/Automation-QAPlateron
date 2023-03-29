package com.stepdefinition;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.base.BaseClass;
import com.pagemanager.PageManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RMS_Menu_Items_Configuration_Definition extends BaseClass {

	PageManager pma = new PageManager();
	
	public String specialChar = "!@#$%%^&*()_+";
	public String upperCase = "AUTOMATIONTEXT";
	public String lowerCase = "automationtext";
	public String numbers = "1234567890";
	public String text = "!@#$%^&*()abcdefghijABCDEFGHIJ1234567890AutomationTestRegression";
	public List<String> modifiersList=new ArrayList<String>();
	
	
	// !@#$%^&*()abcdefghijABCDEFGHIJ1234567890Automation
	
	
	public RMS_Menu_Items_Configuration_Definition() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}

	@When("User shoild click Menus section and verify the page redirection")
	public void userShoildClickMenusSectionAndVerifyThePageRedirection() {
		pma.getRMS_Menus_Configuration_POM().getHomeMenusSectionelement().click();
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getTopMenuItemsSectionElement().isDisplayed());
	}

	@When("User should click Modifiers button and verify the Add Modifiers Popup {string}")
	public void userShouldClickModifiersButtonAndVerifyTheAddModifiersPopup(String modifierName)
			throws InterruptedException {
		String erMsg = "Please enter valid modifier name";
		Thread.sleep(1000);
		pma.getRMS_Menus_Configuration_POM().getModifiersButtonUnderMenuItemsSec().click();
		pma.getRMS_Menus_Configuration_POM().getAddModifierbutton().click();
		//System.out.println(pma.getRMS_Menus_Configuration_POM().getAddModifierPopupHdrElement().getText());
		Assert.assertTrue(
				pma.getRMS_Menus_Configuration_POM().getAddModifierPopupHdrElement().getText().equals("Add Modifier"));
		Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys("AutoText");
		Thread.sleep(1000);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement()
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(500);
		Assert.assertTrue(
				pma.getRMS_Menus_Configuration_POM().getAddModifierPopupErrorMsgElement().getText().equals(erMsg));
		Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupCancelBtnElement().click();
		pma.getRMS_Menus_Configuration_POM().getAddModifierbutton().click();
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupCloseBtnElement().click();
		pma.getRMS_Menus_Configuration_POM().getAddModifierbutton().click();
		Thread.sleep(500);
		String specialChar = "!@#$%%^&*()_+";
		String upperCase = "AUTOMATIONTEXT";
		String lowerCase = "automationtext";
		String numbers = "1234567890";
		String text = "!@#$%^&*()abcdefghijABCDEFGHIJ1234567890AutomationTestRegression";
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(specialChar);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().getAttribute("value").equals(specialChar));
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().clear();
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(upperCase);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().getAttribute("value").equals(upperCase));
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().clear();
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(lowerCase);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().getAttribute("value").equals(lowerCase));
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().clear();
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(numbers);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().getAttribute("value").equals(numbers));
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().clear();
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(text);
		Thread.sleep(500);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().getAttribute("value").length() == 50);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().clear();
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(modifierName);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();

	}

	@When("User should verify the Modifier Name Edit and Delete options options of category {string}")
	public void userShouldVerifyTheModifierNameEditAndDeleteOptionsOptionsOfCategory(String modifierName)
			throws InterruptedException {
		pma.getRMS_Menus_Configuration_POM().getEditModifierNameIconElement().click();
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierPopupHdrElement().isDisplayed());
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys("Edit");
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();
		Thread.sleep(500);
		//System.out.println(pma.getRMS_Menus_Configuration_POM().getActiveModifierElement().getText());
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getActiveModifierElement().getText()
				.contains(modifierName + "Edit"));
		modifierName = modifierName + "Edit";
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierIconElementNName().click();
		Thread.sleep(400);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupCancelElement().click();
		Thread.sleep(400);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierIconElementNName().click();
		Thread.sleep(400);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupCloseElement().click();
		Thread.sleep(400);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierIconElementNName().click();
		Thread.sleep(400);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupHdrElement().getText()
				.equals("Delete Modifier"));
		Thread.sleep(500);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupTextElement().getText()
				.equals("Are you sure want to delete the " + modifierName + " from the list?"));
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupDeleteElement().click();
	}

	@When("User should verify the Add Modifier item slide pop-up and text box")
	public void userShouldVerifyTheAddModifierItemSlidePopUpAndTextBox() throws InterruptedException {
		Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemButtonElement().click();
		Thread.sleep(500);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideHdrElement().getText().equals("Add Modifier Item"));
		Thread.sleep(500);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameHdrElement().isDisplayed());
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceHdrElement().isDisplayed());
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModifierTypeHdr().isDisplayed());
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionHdr().isDisplayed());
		Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys("Test");
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameErrorMsg().getText().equals("Please enter modifier name"));
		Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceErrMsgElement().getText().equals("Please enter valid price"));
		Thread.sleep(500);// Validation for Modifier Item Name
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys(specialChar);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().getAttribute("value").equals(specialChar));
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().clear();
		Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys(upperCase);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().getAttribute("value").equals(upperCase));
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().clear();
		Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys(lowerCase);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().getAttribute("value").equals(lowerCase));
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().clear();
		Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys(text);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().getAttribute("value").equals(text));
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().clear();
		Thread.sleep(500);
		String charsTwohund = "abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNJNHJ *(&^%$#$%^&*(HJHUhgg142356348978";
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys(charsTwohund);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().getAttribute("value").length() == 140);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().clear();
		// Validation for Price Txt Bx
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(specialChar);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().getAttribute("value").length()==0);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().clear();
		Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(upperCase);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().getAttribute("value").length()==0);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().clear();
		Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(lowerCase);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().getAttribute("value").length()==0);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().clear();
		Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(text);Thread.sleep(200);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().getAttribute("value").length()==5);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().clear();
		Thread.sleep(500);
		String number="1234567890";
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(number);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement()
				.getAttribute("value").equals("12345"));
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().clear();
		
		//Validation on Description Text Box
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionTextBx().sendKeys(charsTwohund);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionTextBx().getAttribute("value").length()==140);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionTextBx().clear();
		for (int i = 1; i < 141; i++) {
			Random random = new Random();
	        int randomInt = random.nextInt(26) + 65; // generates a random integer between 65 and 90 (ASCII codes for A-Z)
	        char randomChar = (char) randomInt;
	        String dumText=""+randomChar;
	        pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionTextBx().sendKeys(dumText);
	        int j=140-i;
	        String RemainingCount = Integer.toString(j);
	        //System.out.println(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionHdr().getText());
	        Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionHdr().getText().contains(RemainingCount));
		}
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideCloseBtn().click();
		Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemButtonElement().click();
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideCancelBtn().click();
		
		//Bug on Save Button
//		pma.getRMS_Menus_Configuration_POM().getAddModifierItemButtonElement().click();
//		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideSaveBtn().click();
//		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameErrorMsg().isDisplayed());
	}

	@When("User should add Modifier Items under Modifier {string} {string} {string} then Edit and Delete Modifier")
	public void userShouldAddModifierItemsUnderModifierThenEditAndDeleteModifier(String mod1, String mod2, String mod3,
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String,String>> modifierItemsAsMaps = dataTable.asMaps();
		
		pma.getRMS_Menus_Configuration_POM().getAddModifierbutton().click();
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys("Edit and Delete");
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();
		for (int i = 0; i < modifierItemsAsMaps.size(); i++) {
			Thread.sleep(1000);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemButtonElement().click();Thread.sleep(900);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys(modifierItemsAsMaps.get(i).get("Modifier"));Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().clear();Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(modifierItemsAsMaps.get(i).get("Amount"));Thread.sleep(500);
			if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Vegetarian")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeVegetarian().click();	
			} else if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Non-Vegetarian")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeNonVeg().click();	
			} else if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Vegan")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeVegan().click();	
			}Thread.sleep(1000);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionTextBx().sendKeys(modifierItemsAsMaps.get(i).get("Description"));Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideSaveBtn().click();Thread.sleep(1000);
		}
		//Edit Item
		List<WebElement> modifierItemsList = pma.getRMS_Menus_Configuration_POM().getModifierItemsList();
		for (int i = 0; i < modifierItemsList.size(); i++) {
			int j=i+1;
			Thread.sleep(500);
			List<WebElement> editModifierItemsIconInsideList1 = pma.getRMS_Menus_Configuration_POM().getEditModifierItemsIconInsideList();
			String nameMod = rmsDriver.findElement(By.xpath("(//h4[@class='card-title line-wrap'])["+j+"]")).getText();
			String descriptionMod = rmsDriver.findElement(By.xpath("(//p[@class='card-text w-break mb-1'])["+j+"]")).getText();
			String priceMod = rmsDriver.findElement(By.xpath("(//div[@class='d-flex mw-60'])["+j+"]")).getText();
//			System.out.println(nameMod);
//			System.out.println(priceMod);
//			System.out.println(descriptionMod);			
			Thread.sleep(500);
			editModifierItemsIconInsideList1.get(i+1).click();
			Thread.sleep(500);
			String insideNameText = pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().getAttribute("value");Thread.sleep(500);
			String insidePriceText = pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().getAttribute("value");Thread.sleep(500);
			String insideDescripText = pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionTextBx().getAttribute("value");Thread.sleep(500);
//			System.out.println(insideNameText);
//			System.out.println(insidePriceText);
//			System.out.println(insideDescripText);
			Thread.sleep(500);
			Assert.assertTrue(nameMod.equals(insideNameText));
			Assert.assertTrue(priceMod.contains(insidePriceText));
			Assert.assertTrue(descriptionMod.equals(insideDescripText));
			Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys(" Edited Name");Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(".5");Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeNonVeg().click();Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionTextBx().sendKeys(" Edited Description");Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideSaveBtn().click();Thread.sleep(500);
		}
		
		//Modifier Items Count
		String activeModifier = pma.getRMS_Menus_Configuration_POM().getActiveModifierElement().getText();Thread.sleep(500);
		List<WebElement> modifierItemsCount = pma.getRMS_Menus_Configuration_POM().getModifierItemsList();Thread.sleep(1000);
		int size = modifierItemsCount.size();
		String string = Integer.toString(size);
		//System.out.println(string);
		Thread.sleep(500);
		Assert.assertTrue(activeModifier.contains(string));
		
		
		//Delete Item
		List<WebElement> deleteModifierItemsIconInsideList = pma.getRMS_Menus_Configuration_POM().getDeleteModifierItemsIconInsideList();
		//String activeModifier = pma.getRMS_Menus_Configuration_POM().getActiveModifierElement().getText();
		for (int i = 0; i < deleteModifierItemsIconInsideList.size(); i++) {
			String modifierItemName = pma.getRMS_Menus_Configuration_POM().getModifierItemNameInsideList().getText();
			String substring = activeModifier.substring(0, 15);
			pma.getRMS_Menus_Configuration_POM().getDeleteModifierItemsIconInsideList1().click();			
			pma.getRMS_Menus_Configuration_POM().getDeleteModifierItemPopHdr().isDisplayed();
			String deleteModifierPopText = pma.getRMS_Menus_Configuration_POM().getDeleteModifierItemPopText().getText();
//			System.out.println(activeModifier);
//			System.out.println(modifierItemName+substring);
//			System.out.println(deleteModifierPopText);
			Assert.assertTrue(deleteModifierPopText.equals("Are you sure want to delete the "+modifierItemName+" from the "+substring+"?"));
			
			pma.getRMS_Menus_Configuration_POM().getDeleteModifierItemPopCloseElement().click();
			Thread.sleep(900);
			pma.getRMS_Menus_Configuration_POM().getDeleteModifierItemsIconInsideList1().click();Thread.sleep(200);
			pma.getRMS_Menus_Configuration_POM().getDeleteModifierItemPopCancelElement().click();
			Thread.sleep(900);
			pma.getRMS_Menus_Configuration_POM().getDeleteModifierItemsIconInsideList1().click();Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getDeleteModifierItemPopDeleteElement().click();
			Thread.sleep(900);
		}
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierIconElementNName().click();Thread.sleep(500);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupHdrElement().getText().equals("Delete Modifier"));Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupTextElement().getText().equals("Are you sure want to delete the Edit and Delete from the list?");
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupCloseElement().click();Thread.sleep(500);
		
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierIconElementNName().click();Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupCancelElement().click();Thread.sleep(500);
		
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierIconElementNName().click();Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupDeleteElement().click();Thread.sleep(500);

		//Create a Modifier
		pma.getRMS_Menus_Configuration_POM().getAddModifierbutton().click();
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(mod1);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();
		for (int i = 0; i < 4; i++) {
			Thread.sleep(1000);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemButtonElement().click();Thread.sleep(900);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys(modifierItemsAsMaps.get(i).get("Modifier"));Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().clear();Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(modifierItemsAsMaps.get(i).get("Amount"));Thread.sleep(500);
			if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Vegetarian")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeVegetarian().click();	
			} else if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Non-Vegetarian")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeNonVeg().click();	
			} else if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Vegan")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeVegan().click();	
			}Thread.sleep(1000);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionTextBx().sendKeys(modifierItemsAsMaps.get(i).get("Description"));Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideSaveBtn().click();Thread.sleep(1000);
		}
		pma.getRMS_Menus_Configuration_POM().getAddModifierbutton().click();
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(mod2);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();
		for (int i = 4; i < 8; i++) {
			Thread.sleep(1000);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemButtonElement().click();Thread.sleep(900);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys(modifierItemsAsMaps.get(i).get("Modifier"));Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().clear();Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(modifierItemsAsMaps.get(i).get("Amount"));Thread.sleep(500);
			if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Vegetarian")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeVegetarian().click();	
			} else if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Non-Vegetarian")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeNonVeg().click();	
			} else if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Vegan")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeVegan().click();	
			}Thread.sleep(1000);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionTextBx().sendKeys(modifierItemsAsMaps.get(i).get("Description"));Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideSaveBtn().click();Thread.sleep(1000);
		}
		pma.getRMS_Menus_Configuration_POM().getAddModifierbutton().click();
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(mod3);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();
		for (int i = 8; i < 12; i++) {
			Thread.sleep(1000);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemButtonElement().click();Thread.sleep(900);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys(modifierItemsAsMaps.get(i).get("Modifier"));Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().clear();Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(modifierItemsAsMaps.get(i).get("Amount"));Thread.sleep(500);
			if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Vegetarian")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeVegetarian().click();	
			} else if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Non-Vegetarian")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeNonVeg().click();	
			} else if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Vegan")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeVegan().click();	
			}Thread.sleep(1000);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionTextBx().sendKeys(modifierItemsAsMaps.get(i).get("Description"));Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideSaveBtn().click();Thread.sleep(1000);
		}
		
	}

	@When("User should click Modifier Name and verify Modifier Items Count")
	public void userShouldClickModifierNameAndVerifyModifierItemsCount() {
		//Covered in Above
	}

	@Then("User should verify Modifier count in Modifier button")
	public void userShouldVerifyModifierCountInModifierButton() throws InterruptedException {
		//Modifier Count
		String modifiersCountText = pma.getRMS_Menus_Configuration_POM().getModifiersButtonUnderMenuItemsSec1().getText();
		Thread.sleep(900);
		List<WebElement> allCategoriesList = pma.getRMS_Menus_Configuration_POM().getAllCategoriesList(); //both Modifier and Category
		for (int i = 0; i < allCategoriesList.size(); i++) {
			modifiersList.add(allCategoriesList.get(i).getText());
		}
		int size = allCategoriesList.size();
		String Count = Integer.toString(size);Thread.sleep(900);
		Assert.assertTrue(modifiersCountText.contains(Count));
	}

	@Then("User should verify Add Categories button and Add Category pop-up")
	public void userShouldVerifyAddCategoriesButtonAndAddCategoryPopUp() throws InterruptedException {
		pma.getRMS_Menus_Configuration_POM().getAddCategoryButton().click();Thread.sleep(500);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierPopupHdrElement().getText().equals("Add Category"));
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextElement().getText().equals("Category Name"));
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupCloseBtnElement().click();Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddCategoryButton().click();Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupCancelBtnElement().click();
		pma.getRMS_Menus_Configuration_POM().getAddCategoryButton().click();Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierPopupErrorMsgElement().getText().equals("Please enter valid category name"));
		
		
		Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(specialChar);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().getAttribute("value").equals(specialChar));
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();Thread.sleep(100);
		String nameOfCategory1 = pma.getRMS_Menus_Configuration_POM().getCategoryNameHdrNEDElement().getText();Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierIconElementNName().click();
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupHdrElement().getText().equals("Delete Category"));
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupTextElement().getText().equals("Are you sure want to delete the "+nameOfCategory1+" from the list?"));
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupDeleteElement().click();Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getAddCategoryButton().click();Thread.sleep(100);
		
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(upperCase);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().getAttribute("value").equals(upperCase));
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();Thread.sleep(100);
		String nameOfCategory2 = pma.getRMS_Menus_Configuration_POM().getCategoryNameHdrNEDElement().getText();Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierIconElementNName().click();
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupHdrElement().getText().equals("Delete Category"));
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupTextElement().getText().equals("Are you sure want to delete the "+nameOfCategory2+" from the list?"));
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupDeleteElement().click();Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getAddCategoryButton().click();Thread.sleep(100);
		
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(lowerCase);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().getAttribute("value").equals(lowerCase));
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();Thread.sleep(100);
		String nameOfCategory3 = pma.getRMS_Menus_Configuration_POM().getCategoryNameHdrNEDElement().getText();Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierIconElementNName().click();
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupHdrElement().getText().equals("Delete Category"));
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupTextElement().getText().equals("Are you sure want to delete the "+nameOfCategory3+" from the list?"));
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupDeleteElement().click();Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getAddCategoryButton().click();Thread.sleep(100);
		
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(numbers);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().getAttribute("value").equals(numbers));
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();Thread.sleep(100);
		String nameOfCategory4 = pma.getRMS_Menus_Configuration_POM().getCategoryNameHdrNEDElement().getText();Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierIconElementNName().click();
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupHdrElement().getText().equals("Delete Category"));
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupTextElement().getText().equals("Are you sure want to delete the "+nameOfCategory4+" from the list?"));
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupDeleteElement().click();Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getAddCategoryButton().click();Thread.sleep(100);
		
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(text);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().getAttribute("value").length()==50);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().clear();Thread.sleep(100);
		
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys("Category1");
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();Thread.sleep(100);
	}

	@Then("User should should Add new Category and verify Edit and Delete options of category")
	public void userShouldShouldAddNewCategoryAndVerifyEditAndDeleteOptionsOfCategory() throws InterruptedException {
		pma.getRMS_Menus_Configuration_POM().getEditModifierNameIconElement().click();
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(text);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().getAttribute("value").length()==50);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();Thread.sleep(100);
		String nameOfCategory = pma.getRMS_Menus_Configuration_POM().getCategoryNameHdrNEDElement().getText();
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getCategoryNameHdrNEDElement().getText().length()==50);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierIconElementNName().click();
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupHdrElement().getText().equals("Delete Category"));
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupTextElement().getText().equals("Are you sure want to delete the "+nameOfCategory+" from the list?"));
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupCloseElement().click();
		
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierIconElementNName().click();
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupCancelElement().click();
		
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierIconElementNName().click();
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupHdrElement().getText().equals("Delete Category"));
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupTextElement().getText().equals("Are you sure want to delete the "+nameOfCategory+" from the list?"));
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupDeleteElement().click();
	}

	@Then("User should verify the Add Menu Slide Pop-up and text box")
	public void userShouldVerifyTheAddMenuSlidePopUpAndTextBox() throws InterruptedException {
		pma.getRMS_Menus_Configuration_POM().getAddCategoryButton().click();Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys("Menu Validations");
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemButtonElement().click();Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideSaveBtn().click();Thread.sleep(300);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameErrorMsg().getText().equals("Please enter menu name"));
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameHdr().getText().equals("Menu Name"));
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuTypeHdr().getText().equals("Menu Type"));
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceHdr().getText().equals("Price"));
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionHdr().getText().contains("Description"));
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionHdr().getText().contains("(Remaining characters -140/140)"));
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideApplyModifiersHdr().getText().equals("Apply modifiers"));
		//text box validations
		//Name
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().sendKeys(specialChar);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().getAttribute("value").equals(specialChar));
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().clear();
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().sendKeys(numbers);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().getAttribute("value").equals(numbers));
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().clear();
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().sendKeys(upperCase);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().getAttribute("value").equals(upperCase));
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().clear();
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().sendKeys(lowerCase);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().getAttribute("value").equals(lowerCase));
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().clear();
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().sendKeys(text+text+text+text);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().getAttribute("value").length()==140);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().clear();
		//Price
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().sendKeys(specialChar);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().getAttribute("value").length()==0);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().clear();
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().sendKeys(numbers);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().getAttribute("value").length()==5);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().clear();
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().sendKeys(upperCase);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().getAttribute("value").length()==0);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().clear();
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().sendKeys(lowerCase);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().getAttribute("value").length()==0);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().clear();
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().sendKeys(text);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().getAttribute("value").length()==5);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().clear();
		//Description
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().sendKeys(specialChar);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().getAttribute("value").equals(specialChar));
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().clear();
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().sendKeys(numbers);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().getAttribute("value").equals(numbers));
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().clear();
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().sendKeys(upperCase);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().getAttribute("value").equals(upperCase));
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().clear();
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().sendKeys(lowerCase);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().getAttribute("value").equals(lowerCase));
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().clear();
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().sendKeys(text+text+text+text);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().getAttribute("value").length()==140);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().clear();
		
		for (int i = 1; i < 141; i++) {
			Random random = new Random();
	        int randomInt = random.nextInt(26) + 65; // generates a random integer between 65 and 90 (ASCII codes for A-Z)
	        char randomChar = (char) randomInt;
	        String dumText=""+randomChar;
	        pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().sendKeys(dumText);
	        int j=140-i;
	        String RemainingCount = Integer.toString(j);
	        //System.out.println(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionHdr().getText());
			Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionHdr().getText().contains(RemainingCount));
		}
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuTypeDropDown().click();
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().click();
		//Error Message Verification
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameErrorMsg().getText().equals("Please enter menu name"));
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuTypeDropDownErrorMsg().getText().equals("Please select menu type"));
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceErrorMsg().getText().equals("Please enter valid price"));
		
		//Add modifiers Section
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideAddModifierBtn().click();
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideModifierListHdr().getText().equals("Modifier List"));

//======//ForNow
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideCloseBtn().click();
		pma.getRMS_Menus_Configuration_POM().getModifiersButtonUnderMenuItemsSec().click();
		List<WebElement> allCategoriesList = pma.getRMS_Menus_Configuration_POM().getAllCategoriesList(); //both Modifier and Category
		for (int i = 0; i < allCategoriesList.size(); i++) {
			modifiersList.add(allCategoriesList.get(i).getText());
		}
		System.out.println(modifiersList);
		pma.getRMS_Menus_Configuration_POM().getCategoriesButtonUnderMenuItemsSec().click();
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemButtonElement().click();Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideAddModifierBtn().click();
//======//Need to remove While Complete Run
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideAddModifierBtn().click();
//Bug*********************
		//modifier Match validations
		List<WebElement> addMenuSlideModifiersList = pma.getRMS_Menus_Configuration_POM().getAddMenuSlideModifiersList();
		int k=0;
		for (int i = 0; i < addMenuSlideModifiersList.size(); i++) {
			String textMatch = addMenuSlideModifiersList.get(i).getText();
			for (int j = 0; j <modifiersList.size() ; j++) {
				if (modifiersList.get(j).contains(textMatch)) {
					k++;break;
				}
			}
		}
		
		if (k==modifiersList.size()) {
			Assert.assertTrue(true,"Modifiers Count Match Validation");
		}else {
			Assert.assertTrue(false,"Modifiers Count Match Validation");
		}
		//Cancel and Save button validation in Modifiers List
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideModifiersListCancelBtn().click();Thread.sleep(300);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideAddModifierBtn().click();Thread.sleep(300);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideModifiersListApplyBtn().click();Thread.sleep(300);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideModifiersListConfirtext().getText().contains("You have not selected any modifier for"));
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideModifiersListLetMeSelectBtn().click();Thread.sleep(300);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideModifiersListApplyBtn().click();Thread.sleep(300);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideModifiersListYesItsOkBtn().click();Thread.sleep(300);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideCloseBtn().click();Thread.sleep(100);
		
		//Create a Menu and Validate Edit and Delete Options of Menu Items
		pma.getRMS_Menus_Configuration_POM().getAddMenuInsideCateElement().click();Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().sendKeys("Test Menu");Thread.sleep(100);
		Select slt = new Select(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuTypeDropDown());Thread.sleep(100);
		slt.selectByVisibleText("Non-Vegetarian");Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().sendKeys("1.99");Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideSaveBtn().click();Thread.sleep(100);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getPublishMenuBtnElement().isDisplayed());
		
		pma.getRMS_Menus_Configuration_POM().getEditFirstMenuItemIconInsideList().click();Thread.sleep(100);
		
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().sendKeys("_Edit");Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().clear();Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().sendKeys("10.99");Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().sendKeys("This is a Text1 to Validate the Menu Description - Category");Thread.sleep(500);
		Select slt1 = new Select(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuTypeDropDown());Thread.sleep(100);
		slt1.selectByVisibleText("Vegetarian");Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideSaveBtn().click();Thread.sleep(100);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getPublishMenuBtnElement().isDisplayed());Thread.sleep(300);
//Validation of Data Match of Menu
		String activeCategory = pma.getRMS_Menus_Configuration_POM().getActiveModifierElement().getText();
		CharSequence subActiveCategory = activeCategory.subSequence(0, 16);
		String menuName = pma.getRMS_Menus_Configuration_POM().getModifierItemNameInsideList().getText();Thread.sleep(100);
		String menuDescription = pma.getRMS_Menus_Configuration_POM().getModifierItemDescriptionInsideList().getText();Thread.sleep(100);
		String menuPrice = pma.getRMS_Menus_Configuration_POM().getModifierItemPriceInsideList().getText();Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getEditFirstMenuItemIconInsideList().click();Thread.sleep(100);
		String menuNameInside = pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().getAttribute("value");Thread.sleep(100);
		String menuPriceInside = pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().getAttribute("value");Thread.sleep(100);
		String menuDescriptionInside = pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().getAttribute("value");Thread.sleep(100);
		
		Assert.assertTrue(menuName.equals(menuNameInside));
		Assert.assertTrue(menuPrice.contains(menuPriceInside));
		Assert.assertTrue(menuDescription.contains(menuDescriptionInside));
		Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideCloseBtn().click();Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierItemsIconInsideList1().click();Thread.sleep(100);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getDeleteModifierItemPopHdr().getText().equals("Delete Menu"));
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierItemPopCloseElement().click();Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierItemsIconInsideList1().click();Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierItemPopCancelElement().click();Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierItemsIconInsideList1().click();Thread.sleep(100);
		
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierItemPopText().getText().equals("Are you sure want to delete the "+menuName+" from the "+subActiveCategory+"?");Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierItemPopDeleteElement().click();Thread.sleep(100);
		//for Category delete
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierIconElementNName().click();Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupDeleteElement().click();Thread.sleep(100);
	}

	@Then("User should add Menu Items under Categories {string} and {string}")
	public void userShouldAddMenuItemsUnderCategoriesAnd(String string, String string2,
			io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		// For other transformations you can register a DataTableType.
	}

	@Then("User should verify the add modifier slide list inside Menu")
	public void userShouldVerifyTheAddModifierSlideListInsideMenu() {
	}

	@Then("User should add Menu Items with modifiers under Category {string}")
	public void userShouldAddMenuItemsWithModifiersUnderCategory(String string,
			io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		// For other transformations you can register a DataTableType.
	}

	@Then("User should verify the Menu items Edit option")
	public void userShouldVerifyTheMenuItemsEditOption() {
	}

	@Then("User should verify the Menu items Delete option")
	public void userShouldVerifyTheMenuItemsDeleteOption() {
	}

	@Then("User should verify the Menu items Count on Category Name")
	public void userShouldVerifyTheMenuItemsCountOnCategoryName() {
	}

	@Then("User should verify the Category Count on Categories button")
	public void userShouldVerifyTheCategoryCountOnCategoriesButton() {
	}

	@Then("User should Publish the menu after updation")
	public void userShouldPublishTheMenuAfterUpdation() {
	}

	@When("User should click Menus section and verify the page redirection")
	public void userShouldClickMenusSectionAndVerifyThePageRedirection() {
	}

	@Then("User should add {string} and verify that publish menu status as {string} and count")
	public void userShouldAddAndVerifyThatPublishMenuStatusAsAndCount(String string, String string2) {
	}

	@Then("User should verify the Publish Menu pop-up and Click publish")
	public void userShouldVerifyThePublishMenuPopUpAndClickPublish() {
	}

	@Then("User should add {string} inside Category and verify that publish menu status as {string} and {string}")
	public void userShouldAddInsideCategoryAndVerifyThatPublishMenuStatusAsAnd(String string, String string2,
			String string3) {
	}

	@Then("User should Edit the {string} and verify that publish menu status as {string} and {string}")
	public void userShouldEditTheAndVerifyThatPublishMenuStatusAsAnd(String string, String string2, String string3) {
	}

	@Then("User should delete the {string} and verify that publish menu status as {string} and {string}")
	public void userShouldDeleteTheAndVerifyThatPublishMenuStatusAsAnd(String string, String string2, String string3) {
	}

	@Then("User should add some Menus and verify the status in Publish Menu")
	public void userShouldAddSomeMenusAndVerifyTheStatusInPublishMenu(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
	}

	@Then("User should perform rearrange and verify the status in publish Menu")
	public void userShouldPerformRearrangeAndVerifyTheStatusInPublishMenu() {
	}

	@Then("User should perform rearrange Only and verify the {string} in publish Menu")
	public void userShouldPerformRearrangeOnlyAndVerifyTheInPublishMenu(String string) {
	}

	@Then("User should verify {string} notification bar with {string} text")
	public void userShouldVerifyNotificationBarWithText(String string, String string2) {
	}

}// 28-03-2023 18:28///+ some Change
