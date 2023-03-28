package com.stepdefinition;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
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
		System.out.println(pma.getRMS_Menus_Configuration_POM().getAddModifierPopupHdrElement().getText());
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
		System.out.println(pma.getRMS_Menus_Configuration_POM().getActiveModifierElement().getText());
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getActiveModifierElement().getText()
				.contains(modifierName + "Edit"));
		modifierName = modifierName + "Edit";
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierIconElementNName().click();
		Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupCancelElement().click();
		Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierIconElementNName().click();
		Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupCloseElement().click();
		Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierIconElementNName().click();
		Thread.sleep(200);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupHdrElement().getText()
				.equals("Delete Modifier"));
		Thread.sleep(500);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupTextElement().getText()
				.equals("Are you sure want to delete the " + modifierName + " from the list?"));
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupDeleteElement().click();
	}

	@When("User should verify the Add Modifier item slide pop-up and text box")
	public void userShouldVerifyTheAddModifierItemSlidePopUpAndTextBox() throws InterruptedException {
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemButtonElement().click();
		Thread.sleep(200);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideHdrElement().getText().equals("Add Modifier Item"));
		Thread.sleep(200);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameHdrElement().isDisplayed());
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceHdrElement().isDisplayed());
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModifierTypeHdr().isDisplayed());
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionHdr().isDisplayed());
		Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys("Test");
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameErrorMsg().getText().equals("Please enter modifier name"));
		Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceErrMsgElement().getText().equals("Please enter valid price"));
		Thread.sleep(200);// Validation for Modifier Item Name
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys(specialChar);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().getAttribute("value").equals(specialChar));
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().clear();
		Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys(upperCase);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().getAttribute("value").equals(upperCase));
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().clear();
		Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys(lowerCase);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().getAttribute("value").equals(lowerCase));
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().clear();
		Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys(text);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().getAttribute("value").equals(text));
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().clear();
		Thread.sleep(200);
		String charsTwohund = "abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNJNHJ *(&^%$#$%^&*(HJHUhgg142356348978";
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys(charsTwohund);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().getAttribute("value").length() == 140);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().clear();
		// Validation for Price Txt Bx
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(specialChar);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().getAttribute("value").length()==0);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().clear();
		Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(upperCase);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().getAttribute("value").length()==0);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().clear();
		Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(lowerCase);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().getAttribute("value").length()==0);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().clear();
		Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(text);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().getAttribute("value").length()==10);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().clear();
		Thread.sleep(200);
		String number="1234567890";
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(number);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement()
				.getAttribute("value").equals(number));
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
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionHdr().getText().contains(RemainingCount);
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
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemButtonElement().click();Thread.sleep(300);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys(modifierItemsAsMaps.get(i).get("Modifier"));Thread.sleep(200);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().clear();Thread.sleep(100);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(modifierItemsAsMaps.get(i).get("Amount"));Thread.sleep(200);
			if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Vegetarian")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeVegetarian().click();	
			} else if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Non-Vegetarian")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeNonVeg().click();	
			} else if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Vegan")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeVegan().click();	
			}Thread.sleep(200);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionTextBx().sendKeys(modifierItemsAsMaps.get(i).get("Description"));Thread.sleep(200);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideSaveBtn().click();Thread.sleep(300);
		}
		//Edit and Delete Operation -//button[@class='mr-2 tooltip']
		
		for (int i = 0; i < modifierItemsAsMaps.size(); i++) {
			
			
			
		}
		
	}

	@When("User should click Modifier Name and verify Modifier Items Count")
	public void userShouldClickModifierNameAndVerifyModifierItemsCount() {
	}

	@Then("User should verify Modifier count in Modifier button")
	public void userShouldVerifyModifierCountInModifierButton() {
	}

	@Then("User should click Add Categories button and Add Category pop-up")
	public void userShouldClickAddCategoriesButtonAndAddCategoryPopUp() {
	}

	@Then("User should should Add new Category and verify Edit and Delete options of category")
	public void userShouldShouldAddNewCategoryAndVerifyEditAndDeleteOptionsOfCategory() {
	}

	@Then("User should verify the Add Menu Slide Pop-up and text box")
	public void userShouldVerifyTheAddMenuSlidePopUpAndTextBox() {
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

}// 27-03-2023 17:59
=======
	
	
	
	

	
}
>>>>>>> cbf4a082edc737fc9dd41292473311c25cf9afbc
