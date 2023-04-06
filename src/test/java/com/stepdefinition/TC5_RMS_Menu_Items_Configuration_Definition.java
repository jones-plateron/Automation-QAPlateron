package com.stepdefinition;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.base.BaseClass;
import com.pagemanager.PageManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5_RMS_Menu_Items_Configuration_Definition extends BaseClass {

	PageManager pma = new PageManager();
	
	public String specialChar = "!@#$%%^&*()_+";
	public String upperCase = "AUTOMATIONTEXT";
	public String lowerCase = "automationtext";
	public String numbers = "1234567890";
	public String text = "!@#$%^&*()abcdefghijABCDEFGHIJ1234567890AutomationTestRegression";
	public List<String> modifiersList=new ArrayList<String>();
	
	
	// !@#$%^&*()abcdefghijABCDEFGHIJ1234567890Automation
	
	
	public TC5_RMS_Menu_Items_Configuration_Definition() {
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

	@When("User should verify the Modifier Name Edit and Delete options of category {string}")
	public void userShouldVerifyTheModifierNameEditAndDeleteOptionsOfCategory(String modifierName)
			throws InterruptedException {
		pma.getRMS_Menus_Configuration_POM().getEditModifierNameIconElement().click();
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierPopupHdrElement().isDisplayed());
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys("Edit");
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();
		Thread.sleep(500);
		System.out.println(pma.getRMS_Menus_Configuration_POM().getActiveModifierElement().getText());
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getActiveModifierElement().getText().contains(modifierName + "Edit"));
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
		Thread.sleep(1000);
//		System.out.println(pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupTextElement().getText());
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupTextElement().getText().equals("Are you sure want to delete the " +modifierName+ " from the list?"));
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupDeleteElement().click();
	}

	@When("User should verify the Add Modifier item slide pop-up and text box")
	public void userShouldVerifyTheAddModifierItemSlidePopUpAndTextBox() throws InterruptedException {
		Thread.sleep(900);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemButtonElement().click();
		Thread.sleep(900);
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
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException, IOException {
		List<Map<String,String>> modifierItemsAsMaps = dataTable.asMaps();
		
		pma.getRMS_Menus_Configuration_POM().getAddModifierbutton().click();
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys("Edit and Delete");
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();
		for (int i = 0; i < 2; i++) {
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
			}Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionTextBx().sendKeys(modifierItemsAsMaps.get(i).get("Description"));Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideSaveBtn().click();Thread.sleep(1000);
		}
		//Edit Item
		List<WebElement> modifierItemsList = pma.getRMS_Menus_Configuration_POM().getModifierItemsList();
		for (int i = 0; i < 2; i++) {
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
//			System.out.println("Are you sure want to delete the "+modifierItemName+" from the "+substring+"?");
//			System.out.println(deleteModifierPopText);
			Assert.assertTrue(deleteModifierPopText.equals("Are you sure want to delete the "+modifierItemName+" from the "+substring+" ?"));
			
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

		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
		Thread.sleep(1000);
		FileInputStream fileInputStream= new FileInputStream(file);
		Thread.sleep(1000);
		Workbook workbook = new XSSFWorkbook(fileInputStream);		
	     Sheet sheet = workbook.getSheet("Modifier List");
	     Row row = sheet.createRow(0);
	      Cell cell0 = row.createCell(0);
	      cell0.setCellValue("Modifier Name");
	      Cell cell1= row.createCell(1);
	      cell1.setCellValue("Item Name");
	      Cell cell2 = row.createCell(2);
	      cell2.setCellValue("Price");
	      FileOutputStream fileOutputStream = new FileOutputStream(file);
		//Create a Modifier-------------------------------------------------------------
		pma.getRMS_Menus_Configuration_POM().getAddModifierbutton().click();
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(mod1);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();
		for (int i = 0; i < 4; i++) {
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemButtonElement().click();Thread.sleep(900);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys(modifierItemsAsMaps.get(i).get("Modifier"));Thread.sleep(300);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().clear();Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(modifierItemsAsMaps.get(i).get("Amount"));Thread.sleep(300);
			if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Vegetarian")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeVegetarian().click();	
			} else if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Non-Vegetarian")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeNonVeg().click();	
			} else if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Vegan")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeVegan().click();	
			}Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionTextBx().sendKeys(modifierItemsAsMaps.get(i).get("Description"));Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideSaveBtn().click();Thread.sleep(1000);
			
			
			Sheet sheet1 = workbook.getSheet("Modifier List");
		      Row row1 = sheet1.createRow(i+1);
		      Cell catName = row1.createCell(0);
		      catName.setCellValue(mod1);
		      Cell itemName= row1.createCell(1);
		      itemName.setCellValue(modifierItemsAsMaps.get(i).get("Modifier"));
		      Cell price = row1.createCell(2);
		      price.setCellValue(modifierItemsAsMaps.get(i).get("Amount"));
		}
		//-----------------------------------------------------------------------------------
		pma.getRMS_Menus_Configuration_POM().getAddModifierbutton().click();
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(mod2);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();
		for (int i = 4; i < 8; i++) {
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemButtonElement().click();Thread.sleep(900);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys(modifierItemsAsMaps.get(i).get("Modifier"));Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().clear();Thread.sleep(300);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(modifierItemsAsMaps.get(i).get("Amount"));Thread.sleep(500);
			if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Vegetarian")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeVegetarian().click();	
			} else if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Non-Vegetarian")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeNonVeg().click();	
			} else if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Vegan")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeVegan().click();	
			}Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionTextBx().sendKeys(modifierItemsAsMaps.get(i).get("Description"));Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideSaveBtn().click();Thread.sleep(1000);
			
			Sheet sheet2 = workbook.getSheet("Modifier List");
			Row row1 = sheet2.createRow(i+1);
		      Cell catName = row1.createCell(0);
		      catName.setCellValue(mod2);
		      Cell itemName= row1.createCell(1);
		      itemName.setCellValue(modifierItemsAsMaps.get(i).get("Modifier"));
		      Cell price = row1.createCell(2);
		      price.setCellValue(modifierItemsAsMaps.get(i).get("Amount"));
		}
		//-----------------------------------------------------------------------------------
		//Random Category Name
//				String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvwxyz";
//				StringBuilder sb = new StringBuilder(10);
//				Random random = new Random();
//				for (int i = 0; i < 10; i++) {
//					int index = random.nextInt(alphaNumericString.length());
//					char randomChar = alphaNumericString.charAt(index);
//					sb.append(randomChar);
//				}
//			     String randomCateName = sb.toString();
		
		
		pma.getRMS_Menus_Configuration_POM().getAddModifierbutton().click();
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(mod3);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();
		for (int i = 8; i < 12; i++) {
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemButtonElement().click();Thread.sleep(900);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideNameTextBxElement().sendKeys(modifierItemsAsMaps.get(i).get("Modifier"));Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().clear();Thread.sleep(300);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlidePriceTextBxElement().sendKeys(modifierItemsAsMaps.get(i).get("Amount"));Thread.sleep(500);
			if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Vegetarian")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeVegetarian().click();	
			} else if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Non-Vegetarian")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeNonVeg().click();	
			} else if (modifierItemsAsMaps.get(i).get("Modifier Type").equals("Vegan")) {
				pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideModTypeVegan().click();	
			}Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideDescriptionTextBx().sendKeys(modifierItemsAsMaps.get(i).get("Description"));Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideSaveBtn().click();Thread.sleep(1000);
		
			Sheet sheet3 = workbook.getSheet("Modifier List");
			Row row1 = sheet3.createRow(i+1);
		      Cell catName = row1.createCell(0);
		      catName.setCellValue(mod3);
		      Cell itemName= row1.createCell(1);
		      itemName.setCellValue(modifierItemsAsMaps.get(i).get("Modifier"));
		      Cell price = row1.createCell(2);
		      price.setCellValue(modifierItemsAsMaps.get(i).get("Amount"));
		}
		workbook.write(fileOutputStream);
		
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
		
		Thread.sleep(500);
		//Add modifiers Section
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideAddModifierBtn().click();Thread.sleep(500);
//after bug fix Modificationv - with Error AddModifier button wont work
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().sendKeys("XXXXXX");Thread.sleep(300);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().sendKeys("000");
		Select slt = new Select(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuTypeDropDown());Thread.sleep(300);
		slt.selectByVisibleText("Vegan");Thread.sleep(100);//Fix
		
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideAddModifierBtn().click();Thread.sleep(500);
//		System.out.println(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideModifierListHdr().getText().equals("Modifier List"));
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideModifierListHdr().getText().equals("Modifier List"));Thread.sleep(500);

//======//ForNow
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideCloseBtn().click();Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getModifiersButtonUnderMenuItemsSec().click();Thread.sleep(100);
		List<WebElement> allCategoriesList = pma.getRMS_Menus_Configuration_POM().getAllCategoriesList(); //both Modifier and Category
		for (int i = 0; i < allCategoriesList.size(); i++) {
			modifiersList.add(allCategoriesList.get(i).getText());
		}
//		System.out.println(modifiersList);
		pma.getRMS_Menus_Configuration_POM().getCategoriesButtonUnderMenuItemsSec().click();Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getAddModifierItemButtonElement().click();Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideAddModifierBtn().click();Thread.sleep(100);
//======//Need to remove While Complete Run
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideAddModifierBtn().click();Thread.sleep(100);
//Bug*********************
		//after bug fix Modificationv - with Error AddModifier button wont work
				pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().sendKeys("XXXXXX");Thread.sleep(300);
				pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().sendKeys("000");
				Select sltR = new Select(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuTypeDropDown());Thread.sleep(300);
				sltR.selectByVisibleText("Vegan");Thread.sleep(100);//Fix
		
				pma.getRMS_Menus_Configuration_POM().getAddMenuSlideAddModifierBtn().click();Thread.sleep(100);
		
//Bug Fix************************
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
		Thread.sleep(100);
		if (k==modifiersList.size()) {
			Assert.assertTrue(true,"Modifiers Count Match Validation");
		}else {
			Assert.assertTrue(false,"Modifiers Count Match Validation");
		}
		//Cancel and Save button validation in Modifiers List
//		System.out.println("************************************************************************************************************************************");
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
		Select selt = new Select(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuTypeDropDown());Thread.sleep(100);
		selt.selectByVisibleText("Non-Vegetarian");Thread.sleep(100);
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
	public void userShouldAddMenuItemsUnderCategoriesAnd(String cateName1, String cateName2,io.cucumber.datatable.DataTable dataTable) throws InterruptedException, IOException {
		List<Map<String,String>> asMaps = dataTable.asMaps();
		
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
		Thread.sleep(1000);
		FileInputStream fileInputStream= new FileInputStream(file);
		Thread.sleep(1000);
		Workbook workbook = new XSSFWorkbook(fileInputStream);		
	     Sheet sheet = workbook.getSheet("Menu List");
	      Row row = sheet.createRow(0);
	      Cell cell0 = row.createCell(0);
	      cell0.setCellValue("Category Name");
	      Cell cell1= row.createCell(1);
	      cell1.setCellValue("Menu Name");
	      Cell cell2 = row.createCell(2);
	      cell2.setCellValue("Price");
	      Cell cell3 = row.createCell(3);
	      cell3.setCellValue("Menu Type");
	      FileOutputStream fileOutputStream = new FileOutputStream(file);
	     // workbook.write(fileOutputStream);
		
		//Random Category Name
		String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder(10);
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int index = random.nextInt(alphaNumericString.length());
			char randomChar = alphaNumericString.charAt(index);
			sb.append(randomChar);
		}
	     String randomCateName = sb.toString();  
	     pma.getRMS_Menus_Configuration_POM().getAddCategoryButton().click();Thread.sleep(100);
	     pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(randomCateName);Thread.sleep(100);
	     pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();Thread.sleep(100);		
		
		for (int i = 0; i < asMaps.size()/2; i++) {	Thread.sleep(400);
			pma.getRMS_Menus_Configuration_POM().getAddMenuInsideCateElement().click();
			pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().sendKeys(asMaps.get(i).get("MenuName"));Thread.sleep(100);
			Select slt2 = new Select(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuTypeDropDown());
			slt2.selectByVisibleText(asMaps.get(i).get("Modifier Type"));Thread.sleep(100);
			pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().sendKeys(asMaps.get(i).get("Price"));
			pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().sendKeys(asMaps.get(i).get("Description"));Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddMenuSlideSaveBtn().click();Thread.sleep(500);
		
			
			Sheet sht= workbook.getSheet("Menu List");
			Row createRow = sht.createRow(i+1);
			Cell createCel = createRow.createCell(0);
			createCel.setCellValue(randomCateName);
			Cell createCell = createRow.createCell(1);
			createCell.setCellValue(asMaps.get(i).get("MenuName"));
			Cell createCell1 = createRow.createCell(2);
			createCell1.setCellValue(asMaps.get(i).get("Price"));
			Cell createCell2 = createRow.createCell(3);
			createCell2.setCellValue(asMaps.get(i).get("Modifier Type"));
			
			
		}
		
		
		
		
		//Random Category Name
				String alphaNumericString1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvwxyz";
				StringBuilder sb1 = new StringBuilder(10);
				Random random1 = new Random();
				for (int i = 0; i < 10; i++) {
					int index = random1.nextInt(alphaNumericString1.length());
					char randomChar1 = alphaNumericString1.charAt(index);
					sb1.append(randomChar1);
				}
			     String randomCateName1 = sb1.toString();
		pma.getRMS_Menus_Configuration_POM().getAddCategoryButton().click();Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(randomCateName1);Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();Thread.sleep(100);
		for (int i = asMaps.size()/2; i < asMaps.size(); i++) {Thread.sleep(1000);
			pma.getRMS_Menus_Configuration_POM().getAddMenuInsideCateElement().click();Thread.sleep(200);
			pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().sendKeys(asMaps.get(i).get("MenuName"));Thread.sleep(200);
			Select slt2 = new Select(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuTypeDropDown());Thread.sleep(200);
			slt2.selectByVisibleText(asMaps.get(i).get("Modifier Type"));
			pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().sendKeys(asMaps.get(i).get("Price"));Thread.sleep(100);
			pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().sendKeys(asMaps.get(i).get("Description"));Thread.sleep(500);
			pma.getRMS_Menus_Configuration_POM().getAddMenuSlideSaveBtn().click();Thread.sleep(500);
			
			
			
			Sheet sht= workbook.getSheet("Menu List");
			Row createRow = sht.createRow(i+1);
			Cell createCel = createRow.createCell(0);
			createCel.setCellValue(randomCateName1);
			Cell createCell = createRow.createCell(1);
			createCell.setCellValue(asMaps.get(i).get("MenuName"));
			Cell createCell1 = createRow.createCell(2);
			createCell1.setCellValue(asMaps.get(i).get("Price"));
			Cell createCell2 = createRow.createCell(3);
			createCell2.setCellValue(asMaps.get(i).get("Modifier Type"));
			
			
			
		}
		workbook.write(fileOutputStream);
		//Need to Create for All - created
		
		
		
		
		
		
	}

	@Then("User should verify the add modifier slide list inside Menu")
	public void userShouldVerifyTheAddModifierSlideListInsideMenu() {
		//Covered in Previous Method - "User should verify the Add Menu Slide Pop-up and text box"
	}

	@Then("User should add Menu Items with modifiers under Category {string}")
	public void userShouldAddMenuItemsWithModifiersUnderCategory(String CateModifier,io.cucumber.datatable.DataTable dataTable) throws InterruptedException, IOException {
		
		//Random Category Name
		String alphaNumericString1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb1 = new StringBuilder(10);
		Random random1 = new Random();
		for (int i = 0; i < 10; i++) {
			int index = random1.nextInt(alphaNumericString1.length());
			char randomChar1 = alphaNumericString1.charAt(index);
			sb1.append(randomChar1);
		}
	     String randomCateName1 = sb1.toString();
		

		pma.getRMS_Menus_Configuration_POM().getAddCategoryButton().click();Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(randomCateName1);Thread.sleep(100);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();Thread.sleep(100);
		
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
		Thread.sleep(1000);
		FileInputStream fileInputStream= new FileInputStream(file);
		Thread.sleep(1000);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		
//InProgress?????		
		List<List<String>> asLists = dataTable.asLists();
		for (int i = 0,j=0; i < asLists.size(); i++) {
			List<String> list = asLists.get(i);
			Thread.sleep(500);
				pma.getRMS_Menus_Configuration_POM().getAddMenuInsideCateElement().click();Thread.sleep(100);
				pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().sendKeys(list.get(j));Thread.sleep(100);
				Select slt2 = new Select(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuTypeDropDown());Thread.sleep(100);
				slt2.selectByVisibleText(list.get(j+1));Thread.sleep(100);
				pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().sendKeys(list.get(j+2));Thread.sleep(100);
				
				pma.getRMS_Menus_Configuration_POM().getAddMenuSlideAddModifierBtn().click();			Thread.sleep(100);
				
				
				
				Sheet sht= workbook.getSheet("Menu List");
				Row createRow = sht.createRow(i+21);
				Cell createCel = createRow.createCell(0);
				createCel.setCellValue(randomCateName1);
				Cell createCell = createRow.createCell(1);
				createCell.setCellValue(list.get(j));
				Cell createCell1 = createRow.createCell(2);
				createCell1.setCellValue(list.get(j+2));
				Cell createCell2 = createRow.createCell(3);
				createCell2.setCellValue(list.get(j+1));
				
			     
				
				
				
				
				
				//Modifiers Selection
				if (i==0) {
					List<WebElement> addMenuSlideModifiersList = pma.getRMS_Menus_Configuration_POM().getAddMenuSlideModifiersList();
					for (int k = 0; k < addMenuSlideModifiersList.size()/2; k++) {
						rmsDriver.findElement(By.xpath("(//span[@class='label-text text-bottom'])["+(k+1)+"]")).click();Thread.sleep(300);
					}
					pma.getRMS_Menus_Configuration_POM().getAddMenuSlideModifiersListApplyBtnAfter().click();Thread.sleep(400);
					List<WebElement> ModifiersListReqOrOpt = pma.getRMS_Menus_Configuration_POM().getAddMenuSlideAddedModifiersListReqOrOpt();
					for (int k = 0; k < ModifiersListReqOrOpt.size(); k++) {
						Select slt = new Select(ModifiersListReqOrOpt.get(k));Thread.sleep(300);
						slt.selectByVisibleText("Required");Thread.sleep(300);
						Select slt1 = new Select(rmsDriver.findElement(By.xpath("(//tbody/tr[@class=' cursor-pointer']/td[2]/select[1])["+(k+1)+"]")));Thread.sleep(300);
						List<WebElement> options = slt1.getOptions();Thread.sleep(300);
						String optionText = options.get(options.size()-1).getText();Thread.sleep(300);
//						System.out.println(optionText);Thread.sleep(200);
//						System.out.println(rmsDriver.findElement(By.xpath("(//span[@class='td-overflow label-text text-left text-bottom'])["+(k+1)+"]")).getText());Thread.sleep(200);
						Assert.assertTrue(rmsDriver.findElement(By.xpath("(//span[@class='td-overflow label-text text-left text-bottom'])["+(k+1)+"]")).getText().contains(optionText));Thread.sleep(200);
					}
					pma.getRMS_Menus_Configuration_POM().getAddMenuSlideModifiersListSaveBtnAfter().click();Thread.sleep(100);
				} else if (i==1) {
					List<WebElement> addMenuSlideModifiersList1 = pma.getRMS_Menus_Configuration_POM().getAddMenuSlideModifiersList();
					//System.out.println(addMenuSlideModifiersList1);
					for (int k = addMenuSlideModifiersList1.size(); k > addMenuSlideModifiersList1.size()/2; k--) {Thread.sleep(200);
//						System.out.println(k);
						rmsDriver.findElement(By.xpath("(//span[@class='label-text text-bottom'])["+k+"]")).click();Thread.sleep(100);
					}
					pma.getRMS_Menus_Configuration_POM().getAddMenuSlideModifiersListApplyBtnAfter().click();Thread.sleep(100);
					List<WebElement> ModifiersListReqOrOpt = pma.getRMS_Menus_Configuration_POM().getAddMenuSlideAddedModifiersListReqOrOpt();
					for (int k = 0; k < ModifiersListReqOrOpt.size()/2; k++) {
						Select slt = new Select(ModifiersListReqOrOpt.get(k));Thread.sleep(300);
						slt.selectByVisibleText("Required");Thread.sleep(300);
						Select slt1 = new Select(rmsDriver.findElement(By.xpath("(//tbody/tr[@class=' cursor-pointer']/td[2]/select[1])["+(k+1)+"]")));Thread.sleep(300);
						List<WebElement> options = slt1.getOptions();Thread.sleep(300);
						String optionText = options.get(options.size()-1).getText();Thread.sleep(300);
						Assert.assertTrue(rmsDriver.findElement(By.xpath("(//span[@class='td-overflow label-text text-left text-bottom'])["+(k+1)+"]")).getText().contains(optionText));
					}
					pma.getRMS_Menus_Configuration_POM().getAddMenuSlideModifiersListSaveBtnAfter().click();Thread.sleep(200);
				} else if (i==2) {
					List<WebElement> addMenuSlideModifiersList2 = pma.getRMS_Menus_Configuration_POM().getAddMenuSlideModifiersList();
					for (int k = 0; k < addMenuSlideModifiersList2.size(); k++) {
						rmsDriver.findElement(By.xpath("(//span[@class='label-text text-bottom'])["+(k+1)+"]")).click();Thread.sleep(200);
					}
					pma.getRMS_Menus_Configuration_POM().getAddMenuSlideModifiersListApplyBtnAfter().click();Thread.sleep(200);
					pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideSaveBtn().click();Thread.sleep(100);
					Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideAreYouSureText().getText().contains("Are you sure all the modifiers are optional for this menu"));
					pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideLetMeModifyBtn().click();Thread.sleep(300);
					pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideSaveBtn().click();Thread.sleep(200);
					pma.getRMS_Menus_Configuration_POM().getAddModifierItemSlideYesProceedBtn().click();
				}
		}
		 FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);
	}

	@Then("User should verify the Menu items Edit option")
	public void userShouldVerifyTheMenuItemsEditOption() {
		//Covered in - User should verify the Add Menu Slide Pop-up and text box
	}

	@Then("User should verify the Menu items Delete option")
	public void userShouldVerifyTheMenuItemsDeleteOption() {
		//Covered in - User should verify the Add Menu Slide Pop-up and text box
	}

	@Then("User should verify the Menu items Count on Category Name")
	public void userShouldVerifyTheMenuItemsCountOnCategoryName() throws InterruptedException {
		Thread.sleep(100);
		List<WebElement> categoryListsElement = pma.getRMS_Menus_Configuration_POM().getCategoryListsElement();Thread.sleep(100);
		for (int i = 0; i < categoryListsElement.size(); i++) {Thread.sleep(100);
			String categoryName = categoryListsElement.get(i).getText();Thread.sleep(100);
			categoryListsElement.get(i).click();Thread.sleep(100);
			List<WebElement> menusListInsideCate = pma.getRMS_Menus_Configuration_POM().getMenusListInsideCate();Thread.sleep(100);
			int size = menusListInsideCate.size();Thread.sleep(100);
			String menusCountString = Integer.toString(size);Thread.sleep(100);
			Assert.assertTrue(categoryName.contains(menusCountString));Thread.sleep(100);
		}
	}

	@Then("User should verify the Category Count on Categories button")
	public void userShouldVerifyTheCategoryCountOnCategoriesButton() throws InterruptedException {
		Thread.sleep(100);
		List<WebElement> categoryListsElement = pma.getRMS_Menus_Configuration_POM().getCategoryListsElement();Thread.sleep(100);
		String categoriesCount = pma.getRMS_Menus_Configuration_POM().getCategoriesButtonUnderMenuItemsSec1().getText();
		int size = categoryListsElement.size();
		String string = Integer.toString(size);
		Assert.assertTrue(categoriesCount.contains(string));
	}

	@Then("User should Publish the menu after updation")
	public void userShouldPublishTheMenuAfterUpdation() throws InterruptedException {Thread.sleep(400);
		pma.getRMS_Menus_Configuration_POM().getPublishMenuBtnElement().click();Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getPublishMenuPopupPublishBtn().click();
	}
	@Then("User should add {string} and verify that publish menu status as {string} and count")
	public void userShouldAddAndVerifyThatPublishMenuStatusAsAndCount(String cateName, String status) throws InterruptedException {
		//Random Category Name
				String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvwxyz";
				StringBuilder sb = new StringBuilder(10);
				Random random = new Random();
				for (int i = 0; i < 10; i++) {
					int index = random.nextInt(alphaNumericString.length());
					char randomChar = alphaNumericString.charAt(index);
					sb.append(randomChar);
				}
			     String randomCateName = sb.toString();
		
		
		
		
		
		
		pma.getRMS_Menus_Configuration_POM().getAddCategoryButton().click();Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupTextBoxElement().sendKeys(randomCateName);Thread.sleep(500);
		pma.getRMS_Menus_Configuration_POM().getAddModifierPopupSaveBtnElement().click();Thread.sleep(500);
		
		pma.getRMS_Menus_Configuration_POM().getPublishMenuBtnElement().click();Thread.sleep(500);
		WebElement publishMenuPopTable = pma.getRMS_Menus_Configuration_POM().getPublishMenuPopTable();Thread.sleep(900);
		List<WebElement> findTableRows = publishMenuPopTable.findElements(By.tagName("tr"));Thread.sleep(900);
		for (int i = 0; i < findTableRows.size(); i++) {Thread.sleep(100);
			//System.out.println(findTableRows.get(i).getText());
			if (findTableRows.get(i).getText().contains(randomCateName)) {
			List<WebElement> findTableDatas = findTableRows.get(i).findElements(By.tagName("td"));Thread.sleep(200);
//				System.out.println(findTableDatas.get(1).getText());
			Assert.assertTrue(findTableDatas.get(1).getText().equals("Added"));Thread.sleep(200);
			}
		}
//		int size = findTableRows.size()-1;
//		String changeCount = Integer.toString(size);
//		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getTotalChangesTextInPublish().getText().contains(changeCount));
		
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getUnmappedCookingStnTextInPublish().getText().contains("Unmapped Items to Cooking Stations"));
		Thread.sleep(200);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getPublishMenuPopupHdr().getText().equals("Publish Menu"));Thread.sleep(200);
		WebElement firstRow = publishMenuPopTable.findElement(By.tagName("thead"));Thread.sleep(200);
		List<WebElement> datasInFirstRow =  firstRow.findElements(By.tagName("th"));
		Assert.assertTrue(datasInFirstRow.get(0).getText().contains("Menu Name"));Thread.sleep(200);
//		for (int i = 0; i < datasInFirstRow.size(); i++) {
//			System.out.println(datasInFirstRow.get(i).getText());	
//		}
		Assert.assertTrue(datasInFirstRow.get(1).getText().equals("Status"));Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getPublishMenuPopupCancelBtn().click();Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getPublishMenuBtnElement().click();Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getPublishMenuPopupCloseElement().click();Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getPublishMenuBtnElement().click();Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getPublishMenuPopupPublishBtn().click();Thread.sleep(200);
	}

	@Then("User should verify the Publish Menu pop-up and Click publish")
	public void userShouldVerifyThePublishMenuPopUpAndClickPublish() {
//		Covered in method - User should add {string} and verify that publish menu status as {string} and count
	}

	@Then("User should add {string} inside Category and verify that publish menu status as {string} and {string}")
	public void userShouldAddInsideCategoryAndVerifyThatPublishMenuStatusAsAnd(String menuName, String catStatus,
			String menuStatus) throws InterruptedException {
		String cateName = pma.getRMS_Menus_Configuration_POM().getCategoryNameHdrNEDElement().getText();
		pma.getRMS_Menus_Configuration_POM().getAddMenuInsideCateElement().click();Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().sendKeys(menuName);Thread.sleep(200);
		Select slt = new Select(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuTypeDropDown());
		slt.selectByVisibleText("Vegan");
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().sendKeys("12.5");Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().sendKeys("Publish Menu Description Text");Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideSaveBtn().click();Thread.sleep(200);
		
		pma.getRMS_Menus_Configuration_POM().getPublishMenuBtnElement().click();Thread.sleep(200);
		//Status Validation
		boolean point1=false,point2=false;
		WebElement publishMenuPopTable = pma.getRMS_Menus_Configuration_POM().getPublishMenuPopTable();Thread.sleep(900);
		List<WebElement> findTableRows = publishMenuPopTable.findElements(By.tagName("tr"));Thread.sleep(900);
		for (int i = 0; i < findTableRows.size(); i++) {Thread.sleep(100);
			//System.out.println(findTableRows.get(i).getText());
			if (findTableRows.get(i).getText().contains(menuName)) {
			List<WebElement> findTableDatas = findTableRows.get(i).findElements(By.tagName("td"));
//				System.out.println(findTableDatas.get(1).getText());
			Assert.assertTrue(findTableDatas.get(1).getText().equals(menuStatus));Thread.sleep(200);
			point1=true;
			}
			if (findTableRows.get(i).getText().contains(cateName)) {
				List<WebElement> findTableDatas = findTableRows.get(i).findElements(By.tagName("td"));
//					System.out.println(findTableDatas.get(1).getText());
				Assert.assertTrue(findTableDatas.get(1).getText().equals(catStatus));Thread.sleep(200);
				point2=true;
				}
		}
		Assert.assertTrue(point1);
		Assert.assertTrue(point2);
		pma.getRMS_Menus_Configuration_POM().getPublishMenuPopupPublishBtn().click();Thread.sleep(200);
	}

	@Then("User should Edit the {string} and verify that publish menu status as {string} and {string}")
	public void userShouldEditTheAndVerifyThatPublishMenuStatusAsAnd(String editMenu, String cateStatus, String menuStatus) throws InterruptedException {
		String cateName = pma.getRMS_Menus_Configuration_POM().getCategoryNameHdrNEDElement().getText();Thread.sleep(200);
		
		pma.getRMS_Menus_Configuration_POM().getEditFirstMenuItemIconInsideList().click();Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().sendKeys(" edit");Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getAddMenuSlideSaveBtn().click();Thread.sleep(200);
		
		pma.getRMS_Menus_Configuration_POM().getPublishMenuBtnElement().click();Thread.sleep(200);
		//Status Validation
		boolean point1=false,point2=false;
				WebElement publishMenuPopTable = pma.getRMS_Menus_Configuration_POM().getPublishMenuPopTable();Thread.sleep(900);
				List<WebElement> findTableRows = publishMenuPopTable.findElements(By.tagName("tr"));Thread.sleep(900);
				for (int i = 0; i < findTableRows.size(); i++) {Thread.sleep(100);
					//System.out.println(findTableRows.get(i).getText());
					if (findTableRows.get(i).getText().contains(editMenu+" edit")) {
					List<WebElement> findTableDatas = findTableRows.get(i).findElements(By.tagName("td"));
//						System.out.println(findTableDatas.get(1).getText());
					Assert.assertTrue(findTableDatas.get(1).getText().equals(menuStatus));Thread.sleep(200);
					point1=true;
					}
					if (findTableRows.get(i).getText().contains(cateName)) {
						List<WebElement> findTableDatas = findTableRows.get(i).findElements(By.tagName("td"));
//							System.out.println(findTableDatas.get(1).getText());
						Assert.assertTrue(findTableDatas.get(1).getText().equals(cateStatus));Thread.sleep(200);
						point2=true;
					}
				}
				Assert.assertTrue(point1);
				Assert.assertTrue(point2);
				pma.getRMS_Menus_Configuration_POM().getPublishMenuPopupPublishBtn().click();Thread.sleep(200);
	}

	@Then("User should delete the {string} and verify that publish menu status as {string} and {string}")
	public void userShouldDeleteTheAndVerifyThatPublishMenuStatusAsAnd(String deleteMenu, String cateStatus, String menuStatus) throws InterruptedException {
		String cateName = pma.getRMS_Menus_Configuration_POM().getCategoryNameHdrNEDElement().getText();Thread.sleep(200);
		
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierIconElementNName().click();Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getDeleteModifierItemPopDeleteElement().click();Thread.sleep(200);
		

		pma.getRMS_Menus_Configuration_POM().getPublishMenuBtnElement().click();Thread.sleep(200);
		boolean point1=false,point2=false;
		//Status Validation
				WebElement publishMenuPopTable = pma.getRMS_Menus_Configuration_POM().getPublishMenuPopTable();Thread.sleep(900);
				List<WebElement> findTableRows = publishMenuPopTable.findElements(By.tagName("tr"));Thread.sleep(900);
				for (int i = 0; i < findTableRows.size(); i++) {Thread.sleep(100);
					//System.out.println(findTableRows.get(i).getText());
					if (findTableRows.get(i).getText().contains(deleteMenu+" edit")) {
					List<WebElement> findTableDatas = findTableRows.get(i).findElements(By.tagName("td"));
//						System.out.println(findTableDatas.get(1).getText());
					Assert.assertTrue(findTableDatas.get(1).getText().equals(menuStatus));Thread.sleep(200);
					point1=true;
					}
					if (findTableRows.get(i).getText().contains(cateName)) {
						List<WebElement> findTableDatas = findTableRows.get(i).findElements(By.tagName("td"));
//							System.out.println(findTableDatas.get(1).getText());
						Assert.assertTrue(findTableDatas.get(1).getText().equals(cateStatus));Thread.sleep(200);
						point2=true;
						}
				}
				Assert.assertTrue(point1);
				Assert.assertTrue(point2);
				pma.getRMS_Menus_Configuration_POM().getPublishMenuPopupPublishBtn().click();Thread.sleep(200);
	}

	@Then("User should add some Menus and verify the status in Publish Menu")
	public void userShouldAddSomeMenusAndVerifyTheStatusInPublishMenu(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {Thread.sleep(500);
		String cateName = pma.getRMS_Menus_Configuration_POM().getCategoryNameHdrNEDElement().getText();Thread.sleep(200);
		List<Map<String, String>> asMaps = dataTable.asMaps();
		for (int i = 0; i < asMaps.size(); i++) {Thread.sleep(1000);
			pma.getRMS_Menus_Configuration_POM().getAddMenuInsideCateElement().click();Thread.sleep(200);
			pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().sendKeys(asMaps.get(i).get("MenuName"));Thread.sleep(200);
			Select slt = new Select(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuTypeDropDown());
			slt.selectByVisibleText(asMaps.get(i).get("Modifier Type"));Thread.sleep(200);
			pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().sendKeys(asMaps.get(i).get("Price"));Thread.sleep(200);
			pma.getRMS_Menus_Configuration_POM().getAddMenuSlideDescriptionTextBx().sendKeys(asMaps.get(i).get("Description"));Thread.sleep(200);
			pma.getRMS_Menus_Configuration_POM().getAddMenuSlideSaveBtn().click();
		}
		pma.getRMS_Menus_Configuration_POM().getPublishMenuBtnElement().click();Thread.sleep(200);
		boolean point2=false;int point1=0;
		//Status Validation
		WebElement publishMenuPopTable = pma.getRMS_Menus_Configuration_POM().getPublishMenuPopTable();Thread.sleep(900);
		List<WebElement> findTableRows = publishMenuPopTable.findElements(By.tagName("tr"));Thread.sleep(900);
		for (int i = 0; i < findTableRows.size(); i++) {Thread.sleep(100);
			//System.out.println(findTableRows.get(i).getText());
		for (int j = 0; j < asMaps.size(); j++) {
			
			if (findTableRows.get(i).getText().contains(asMaps.get(j).get("MenuName"))) {
			List<WebElement> findTableDatas = findTableRows.get(i).findElements(By.tagName("td"));
				System.out.println(findTableDatas.get(1).getText());
			Assert.assertTrue(findTableDatas.get(1).getText().equals("Added"));Thread.sleep(200);
			point1++;
			}
		}
			if (findTableRows.get(i).getText().contains(cateName)) {
				List<WebElement> findTableDatas = findTableRows.get(i).findElements(By.tagName("td"));
//					System.out.println(findTableDatas.get(1).getText());
				Assert.assertTrue(findTableDatas.get(1).getText().equals("Existing"));Thread.sleep(200);
				point2=true;
				}
		}
		Thread.sleep(200);
		Assert.assertTrue(point1==asMaps.size());
		Assert.assertTrue(point2);
		pma.getRMS_Menus_Configuration_POM().getPublishMenuPopupPublishBtn().click();Thread.sleep(2000);
		
		
	}

	@Then("User should perform rearrange and verify the status in publish Menu")
	public void userShouldPerformRearrangeAndVerifyTheStatusInPublishMenu() throws InterruptedException {
		Thread.sleep(900);
		List<WebElement> menusListInsideCate = pma.getRMS_Menus_Configuration_POM().getMenusListInsideCate();Thread.sleep(900);
		Actions act = new Actions(rmsDriver);Thread.sleep(500);
		int dest = menusListInsideCate.size()-1;
		act.dragAndDrop(menusListInsideCate.get(0), menusListInsideCate.get(dest)).build().perform();
		Thread.sleep(900);
		pma.getRMS_Menus_Configuration_POM().getPublishMenuBtnElement().click();Thread.sleep(200);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getPublishPopupRearrText().getText().equals("Some of the menus/categories have been rearranged."));Thread.sleep(200);
		pma.getRMS_Menus_Configuration_POM().getPublishMenuPopupPublishBtn().click();Thread.sleep(500);
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getUnmapCSTxtatTopPublishMenu().isDisplayed());Thread.sleep(100);
	}

	@Then("User should verify {string} notification bar with {string} text")
	public void userShouldVerifyNotificationBarWithText(String textMNF, String subTextMNF) throws InterruptedException {
	pma.getRMS_Menus_Configuration_POM().getAddMenuInsideCateElement().click();Thread.sleep(200);
	pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuNameTextBx().sendKeys("Menu Not Found");Thread.sleep(100);
	Select selt = new Select(pma.getRMS_Menus_Configuration_POM().getAddMenuSlideMenuTypeDropDown());Thread.sleep(100);
	selt.selectByVisibleText("Non-Vegetarian");Thread.sleep(100);
	pma.getRMS_Menus_Configuration_POM().getAddMenuSlidePriceTextBx().sendKeys("199");Thread.sleep(100);
	pma.getRMS_Menus_Configuration_POM().getAddMenuSlideSaveBtn().click();Thread.sleep(500);
	rmsDriver.navigate().refresh();
	Thread.sleep(6000);
	try {
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getMenuNotPublishedtext().getText().equals(textMNF));Thread.sleep(300);
	} catch (Exception e) {
		rmsDriver.navigate().refresh();
		Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getMenuNotPublishedtext().getText().equals(textMNF));Thread.sleep(300);
	}
	
	Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getMenuNotPublishedSubtext().getText().equals(subTextMNF));Thread.sleep(200);
	pma.getRMS_Menus_Configuration_POM().getMenuNotPublishedClose().click();Thread.sleep(300);
	rmsDriver.navigate().refresh();Thread.sleep(500);
	Assert.assertTrue(pma.getRMS_Menus_Configuration_POM().getMenuNotPublishedtext().isDisplayed());
	}
	
	@Then("Deleting Menus and Categories")
	public void deletingMenusAndCategories() throws InterruptedException {
		List<WebElement> categoryListsElement = pma.getRMS_Menus_Configuration_POM().getCategoryListsElement();Thread.sleep(100);
		for (int i = 0; i < categoryListsElement.size(); i++) {Thread.sleep(100);
			List<WebElement> menusListInsideCate = pma.getRMS_Menus_Configuration_POM().getMenusListInsideCate();Thread.sleep(100);			
			for (int j = 0; j < menusListInsideCate.size(); j++) {
				pma.getRMS_Menus_Configuration_POM().getDeleteModifierItemsIconInsideList1().click();
				pma.getRMS_Menus_Configuration_POM().getDeleteModifierItemPopDeleteElement().click();
			}
			pma.getRMS_Menus_Configuration_POM().getDeleteModifierIconElementNName().click();
			pma.getRMS_Menus_Configuration_POM().getDeleteModifierPopupDeleteElement().click();
			i--;
			categoryListsElement = pma.getRMS_Menus_Configuration_POM().getCategoryListsElement();Thread.sleep(100);
		}
		pma.getRMS_Menus_Configuration_POM().getPublishMenuBtnElement().click();
		pma.getRMS_Menus_Configuration_POM().getPublishMenuPopupPublishBtn().click();
		
	}
	

}// 04-04-2023 10:22///
