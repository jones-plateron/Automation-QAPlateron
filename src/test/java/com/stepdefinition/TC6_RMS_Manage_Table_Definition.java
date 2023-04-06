package com.stepdefinition;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;
import com.pagemanager.PageManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC6_RMS_Manage_Table_Definition extends BaseClass {

	PageManager pma = new PageManager();
	List<WebElement> areaListWebElement = new ArrayList<WebElement>();

	public TC6_RMS_Manage_Table_Definition() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}

	@When("User should able to Click POS System Sections and Verify page redirected to POS System")
	public void userShouldAbleToClickPOSSystemSectionsAndVerifyPageRedirectedToPOSSystem() throws InterruptedException {
		Thread.sleep(2000);
		pma.getRMS_ManageTable_POM().getPOSSystemSections().click();
		// System.out.println("Clickedddddddddddddddddddddddd");
		Thread.sleep(2000);
		String displayed = pma.getRMS_ManageTable_POM().getManageTableTab().getText();
		System.out.println(displayed);
		// Assert.assertTrue(displayed);

	}

	@When("User should able to verify POS System has two Section Manage Table and POS Setup")
	public void userShouldAbleToVerifyPOSSystemHasTwoSectionManageTableAndPOSSetup() {

		boolean displayed = pma.getRMS_ManageTable_POM().getManageTableTab().isDisplayed();
		System.out.println(displayed);
		Assert.assertTrue(displayed);

		boolean displayed2 = pma.getRMS_ManageTable_POM().getPOSSetupTab().isDisplayed();
		Assert.assertTrue(displayed2);

	}

	@Then("User should able to Click POS Setup section")
	public void userShouldAbleToClickPOSSetupSection() {

		pma.getRMS_ManageTable_POM().getPOSSetupTab().click();

	}

	@Then("User should validate the POS Setup page")
	public void userShouldValidateThePOSSetupPage() {

		String text = pma.getRMS_ManageTable_POM().getPOSSetupQrInstruction().getText();
		System.out.println(text);
		Assert.assertTrue(text.contains("Please scan the QR code to download the latest POS version"));
	}

	@Then("User should able to verify Manage Table has two button DineIn and TakeOut")
	public void userShouldAbleToVerifyManageTableHasTwoButtonDineInAndTakeOut() {
		pma.getRMS_ManageTable_POM().getManageTableTab().click();
		boolean displayed = pma.getRMS_ManageTable_POM().getDineInTab().isDisplayed();
		Assert.assertTrue(displayed);
		boolean displayed2 = pma.getRMS_ManageTable_POM().getTakeOutTab().isDisplayed();
		Assert.assertTrue(displayed2);
	}

	@Then("User should able to Click TakeOut Button")
	public void userShouldAbleToClickTakeOutButton() {
		pma.getRMS_ManageTable_POM().getTakeOutTab().click();
	}

	@Then("User should Verify the Page is Redirected to TakeOut page")
	public void userShouldVerifyThePageIsRedirectedToTakeOutPage() {

		boolean displayed = pma.getRMS_ManageTable_POM().getTakeOutAvoidqueue().isDisplayed();
		Assert.assertTrue(displayed);
	}

	@Then("User should able to See {string} and {string} on top of the QR Frame")
	public void userShouldAbleToSeeAndOnTopOfTheQRFrame(String string, String string2) {
		String text = pma.getRMS_ManageTable_POM().getTakeOutAvoidqueue().getText();
		Assert.assertTrue(text.contains(string));

		String text2 = pma.getRMS_ManageTable_POM().getTakeOutUnderAvoidQ().getText();
		Assert.assertTrue(text2.contains(string2));
	}

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Restaurant Name
	@Then("User should able to see Restaurant name inside the frame")
	public void userShouldAbleToSeeRestaurantNameInsideTheFrame() {

		String text1 = pma.getRMS_ManageTable_POM().getResHeader().getText();
		String text2 = pma.getRMS_ManageTable_POM().getTakeOutResName().getText();
		Assert.assertTrue(text1.equals(text2));

		System.out.println(text2);

	}

	@Then("User should able to verify the QR Code is displayed")
	public void userShouldAbleToVerifyTheQRCodeIsDisplayed() {
		boolean qr = pma.getRMS_ManageTable_POM().getTakeOutQr().isDisplayed();
		Assert.assertTrue(qr);

	}

	@Then("User should able to Verify the Words {string} below the QR Code")
	public void userShouldAbleToVerifyTheWordsBelowTheQRCode(String string) {
		String text = pma.getRMS_ManageTable_POM().getTakeOutUnderQr().getText();
		Assert.assertTrue(text.contains(string));
	}

	@Then("User should able to see the Powered by {string} and plateron Logo below the frame")
	public void userShouldAbleToSeeThePoweredByAndPlateronLogoBelowTheFrame(String string) {
		String text = pma.getRMS_ManageTable_POM().getTakeOutPowereby().getText();
		Assert.assertTrue(text.contains(string));
	}

	@Then("User should able to see Print Button Below the Frame")
	public void userShouldAbleToSeePrintButtonBelowTheFrame() {
		boolean displayed = pma.getRMS_ManageTable_POM().getTakeOutPrintButton().isDisplayed();
		Assert.assertTrue(displayed);
	}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Take-Out page finished

	@Then("User should able to Click Add Table Button on top right corner of the page")
	public void userShouldAbleToClickAddTableButtonOnTopRightCornerOfThePage() {
		pma.getRMS_ManageTable_POM().getDineInTab().click();
		String text = pma.getRMS_ManageTable_POM().getDineInTab().getText();
		System.out.println(text);
		pma.getRMS_ManageTable_POM().getAddTableButton().click();
	}

	@Then("User should able to Verify the Add Table Popup opens")
	public void userShouldAbleToVerifyTheAddTablePopupOpens() {
		boolean displayed = pma.getRMS_ManageTable_POM().getAddTablePopupHeader().isDisplayed();
		Assert.assertTrue(displayed);
	}

	@Then("User should able to see the Area Option and +Add Area Button")
	public void userShouldAbleToSeeTheAreaOptionAndAddAreaButton() {
		boolean displayed = pma.getRMS_ManageTable_POM().getAreaDuringAddArea().isDisplayed();
		Assert.assertTrue(displayed);

		boolean displayed2 = pma.getRMS_ManageTable_POM().getAddAreaButton().isDisplayed();
		Assert.assertTrue(displayed2);
	}

	@Then("User should able to see the Cancel button and Save button")
	public void userShouldAbleToSeeTheCancelButtonAndSaveButton() {
		boolean displayed = pma.getRMS_ManageTable_POM().getAddTableCancelButton().isDisplayed();
		Assert.assertTrue(displayed);
		boolean displayed2 = pma.getRMS_ManageTable_POM().getAddTableSaveButton().isDisplayed();
		Assert.assertTrue(displayed2);
	}

	@Then("User should able to See and Click X Icon on top of the Popup")
	public void userShouldAbleToSeeAndClickXIconOnTopOfThePopup() {
		boolean displayed = pma.getRMS_ManageTable_POM().getAddTableXIcon().isDisplayed();
		Assert.assertTrue(displayed);

		pma.getRMS_ManageTable_POM().getAddTableXIcon().click();
	}

	@Then("User should click +Add Area Button and Verify Select Area Words {string} appearing")
	public void userShouldClickAddAreaButtonAndVerifySelectAreaWordsAppearing(String string) {
		pma.getRMS_ManageTable_POM().getAddTableButton().click();
		pma.getRMS_ManageTable_POM().getAddAreaButton().click();
	}

	@Then("User should able to See Area TextBox and Validate the TextBox")
	public void userShouldAbleToSeeAreaTextBoxAndValidateTheTextBox() {

		pma.getRMS_ManageTable_POM().getAddTableSaveButton().click();
		boolean displayed = pma.getRMS_ManageTable_POM().getAreaTextBoxIndication().isDisplayed();
		Assert.assertTrue(displayed);
		pma.getRMS_ManageTable_POM().getAreaTextBox()
				.sendKeys("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
		String attribute = pma.getRMS_ManageTable_POM().getAreaTextBox().getAttribute("value");
		Assert.assertTrue(attribute.length() == 49);

	}

	@Then("User should able to see the Table Name and Seating Capacity option")
	public void userShouldAbleToSeeTheTableNameAndSeatingCapacityOption() {
		boolean displayed = pma.getRMS_ManageTable_POM().getTableName().isDisplayed();
		Assert.assertTrue(displayed);
		boolean displayed2 = pma.getRMS_ManageTable_POM().getSeatingCapacity().isDisplayed();
		Assert.assertTrue(displayed2);
	}

	@Then("User should able to Validate the Table Name Textbox")
	public void userShouldAbleToValidateTheTableNameTextbox() {
		pma.getRMS_ManageTable_POM().getAddTableSaveButton().click();
		boolean displayed = pma.getRMS_ManageTable_POM().getTableNameIndication().isDisplayed();
		Assert.assertTrue(displayed);
		pma.getRMS_ManageTable_POM().getTableNameTextBox().sendKeys(
				"abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
		String attribute = pma.getRMS_ManageTable_POM().getTableNameTextBox().getAttribute("value");
		Assert.assertTrue(attribute.length() == 100);
		pma.getRMS_ManageTable_POM().getAddTableSaveButton().click();
	}

	@Then("User should able to Validate the Seating Capacity Textbox")
	public void userShouldAbleToValidateTheSeatingCapacityTextbox() throws InterruptedException {

		pma.getRMS_ManageTable_POM().getAddTableSaveButton().click();
		Thread.sleep(200);
//	boolean displayed = pma.getRMS_ManageTable_POM().getSeatingCapacityTextBoxIndication().isDisplayed();
//	Assert.assertTrue(displayed);
		pma.getRMS_ManageTable_POM().getSeatingCapacityTextBox().sendKeys("Boo");
		String attribute = pma.getRMS_ManageTable_POM().getSeatingCapacityTextBox().getAttribute("value");
		Assert.assertTrue(attribute.isEmpty());
		pma.getRMS_ManageTable_POM().getSeatingCapacityTextBox().sendKeys("12");
		pma.getRMS_ManageTable_POM().getAddTableCancelButton().click();
	}

	@Then("User should able enter AreaName in the Area TextBox and enter the Table Name and Seating Capacity inside the Text Box")
	public void userShouldAbleEnterAreaNameInTheAreaTextBoxAndEnterTheTableNameAndSeatingCapacityInsideTheTextBox(
			io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> addArea = dataTable.asMaps();
		for (int i = 0; i < addArea.size(); i++) {
			pma.getRMS_ManageTable_POM().getAddTableButton().click();
			pma.getRMS_ManageTable_POM().getAddAreaButton().click();
			pma.getRMS_ManageTable_POM().getAreaTextBox().sendKeys(addArea.get(i).get("Area Name"));
			pma.getRMS_ManageTable_POM().getTableNameTextBox().sendKeys(addArea.get(i).get("Table Name"));
			pma.getRMS_ManageTable_POM().getSeatingCapacityTextBox().sendKeys(addArea.get(i).get("Seating Capacity"));
			pma.getRMS_ManageTable_POM().getAddTableSaveButton().click();

		}

	}

	@Then("User should able to see and Click the Dropdown under the Area")
	public void userShouldAbleToSeeAndClickTheDropdownUnderTheArea() throws InterruptedException {
		Thread.sleep(2500);
		areaListWebElement = pma.getRMS_ManageTable_POM().getAreaLists();
		pma.getRMS_ManageTable_POM().getAddTableButton().click();
		pma.getRMS_ManageTable_POM().getAreaSelectDropDown().click();

	}

	@Then("User should Verify all Available area is showing under the Dropdown")
	public void userShouldVerifyAllAvailableAreaIsShowingUnderTheDropdown() throws InterruptedException {

		Select select = new Select(pma.getRMS_ManageTable_POM().getAreaSelectDropDown());
		List<WebElement> optionsDD = select.getOptions();

		int count = 0;
//	for (int i = 0; i < optionsDD.size(); i++) {
//		System.out.println(optionsDD.get(i).getText());
//	}
//	for (int i = 0; i < areaListWebElement.size(); i++) {
//		System.out.println(areaListWebElement.get(i).getText());
//	}

		for (int i = 0; i < areaListWebElement.size(); i++) {
			String areaNameList = areaListWebElement.get(i).getText();
			for (int j = 0; j < optionsDD.size(); j++) {
				String areaNameDD = optionsDD.get(j).getText();
				if (areaNameList.equals(areaNameDD)) {
					count++;
					break;
				}

			}
		}

		System.out.println(count);
		System.out.println(optionsDD.size());
		System.out.println(areaListWebElement.size());
		// Assert.assertTrue(count==areaListWebElement.size());

	}

	@Then("User should able to Select any Area and verify the selected area is showing inside the dropdown")
	public void userShouldAbleToSelectAnyAreaAndVerifyTheSelectedAreaIsShowingInsideTheDropdown() {

		Select selectDropdown = new Select(pma.getRMS_ManageTable_POM().getAreaSelectDropDown());
		List<WebElement> options = selectDropdown.getOptions();
		selectDropdown.selectByVisibleText("Area 1");
		selectDropdown.getFirstSelectedOption().getText();
		System.out.println(selectDropdown.getFirstSelectedOption().getText());

		// After Verifying
		pma.getRMS_ManageTable_POM().getAddTableXIcon().click();
	}

	@Then("User should able to enter Table Name,Seating Capacity and Click Save Button")
	public void userShouldAbleToEnterTableNameSeatingCapacityAndClickSaveButton(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> CreateTable = dataTable.asMaps();
		for (int i = 0; i < CreateTable.size(); i++) {
			pma.getRMS_ManageTable_POM().getAddTableButton().click();
			Select selectDropdown = new Select(pma.getRMS_ManageTable_POM().getAreaSelectDropDown());
			Thread.sleep(200);
			selectDropdown.selectByVisibleText("Ground Floor");
			pma.getRMS_ManageTable_POM().getTableNameTextBox().sendKeys(CreateTable.get(i).get("Table Name"));
			pma.getRMS_ManageTable_POM().getSeatingCapacityTextBox()
					.sendKeys(CreateTable.get(i).get("Seating Capacity"));
			pma.getRMS_ManageTable_POM().getAddTableSaveButton().click();

		}

	}

	@Then("User should able to select any area and verify the Area Header and Total Table count under the Area Name")
	public void userShouldAbleToSelectAnyAreaAndVerifyTheAreaHeaderAndTotalTableCountUnderTheAreaName()
			throws InterruptedException {
		// rmsDriver.navigate().refresh();
		Thread.sleep(800);
		List<WebElement> areaLists = pma.getRMS_ManageTable_POM().getAreaLists();
		for (int i = 0; i < areaLists.size(); i++) {
			String text = areaLists.get(i).getText();
			if (text.contains("Ground Floor")) {
				areaLists.get(i).click();
				break;

			}
		}
		String text = pma.getRMS_ManageTable_POM().getAreaHeader().getText();
		Assert.assertTrue(text.contains("Ground Floor"));
		Thread.sleep(12000);
		
		List<WebElement> getallTables = pma.getRMS_ManageTable_POM().getallTables();//Getting total table count
		int TotalCount = getallTables.size();
		System.out.println(TotalCount);
		String TotalTablecount = String.valueOf(TotalCount);
		
		String text1 = pma.getRMS_ManageTable_POM().getTotalTables().getText();//Getting total table count in heading
		Assert.assertTrue(text1.contains(TotalTablecount));

	}

	@Then("User should able to Edit any Area name")
	public void userShouldAbleToEditAnyAreaName() throws InterruptedException {

		// Editing Area Name doing here
		Actions action = new Actions(rmsDriver);
		List<WebElement> areaLists = pma.getRMS_ManageTable_POM().getAreaLists();
		for (int i = 0; i < areaLists.size(); i++) {
			String text = areaLists.get(i).getText();
			if (text.contains("Automation Area")) {
				try {
		    		areaLists.get(i).click();
				} catch (ElementNotInteractableException e) {
					Actions act = new Actions(rmsDriver);
					act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN);
					areaLists.get(i).click();
				}
				pma.getRMS_ManageTable_POM().getAreaEditIcon().click();
				action.keyDown(Keys.CONTROL).sendKeys("a");
				action.sendKeys(Keys.BACK_SPACE).build().perform();
				action.keyUp(Keys.CONTROL);
				Thread.sleep(200);
				action.sendKeys("Edited Area").build().perform();
				Thread.sleep(200);
				break;
			}
			}
		
			pma.getRMS_ManageTable_POM().getTotalTables().click();
			Thread.sleep(1000);
			String areaHeader = pma.getRMS_ManageTable_POM().getAreaHeader().getText();
			System.out.println(areaHeader);
			Thread.sleep(200);
		
		
			// Again Editing back the area name
			List<WebElement> areaLists2 = pma.getRMS_ManageTable_POM().getAreaLists();
			for (int j = 0; j < areaLists2.size(); j++) {
				String text1 = areaLists2.get(j).getText();
				if (text1.contains("Edited Area")) {
					Thread.sleep(2000);
					areaLists2.get(j).click();
			
					pma.getRMS_ManageTable_POM().getAreaEditIcon().click();
					action.keyDown(Keys.CONTROL).sendKeys("a");
					action.sendKeys(Keys.BACK_SPACE).build().perform();
					action.keyUp(Keys.CONTROL);
					Thread.sleep(2000);
					action.sendKeys("Automation Area").build().perform();
					Thread.sleep(2000);
				}
			}
		}
	

	@Then("User should able to select any Area and Select any Table")
	public void userShouldAbleToSelectAnyAreaAndSelectAnyTable() throws InterruptedException {
		List<WebElement> areaLists = pma.getRMS_ManageTable_POM().getAreaLists();
		for (int i = 0; i < areaLists.size(); i++) {
			String text = areaLists.get(i).getText();
			if (text.contains("Ground Floor")) {
				Thread.sleep(2000);
				areaLists.get(i).click();

			}
			List<WebElement> tables = pma.getRMS_ManageTable_POM().getTables();
			tables.get(0).getText();
		}
	}

	@Then("User should able to see Table,Seats and Waiter Name {string} , {string} and {string}")
	public void userShouldAbleToSeeTableSeatsAndWaiterNameAnd(String string, String string2, String string3) {

		boolean displayed = pma.getRMS_ManageTable_POM().getInsideTableTableName().get(0).isDisplayed();
		Assert.assertTrue(displayed);

		List<WebElement> insidePreviewSeatNum = pma.getRMS_ManageTable_POM().getInsideTableSeatNum();
		insidePreviewSeatNum.get(0);

		String text = pma.getRMS_ManageTable_POM().getInsideTableWaiterName().get(0).getText();
		Assert.assertTrue(text.contains("Waiter Name"));

	}

	@Then("User should able to see and Click Preview option")
	public void userShouldAbleToSeeAndClickPreviewOption() {
		
		boolean displayed = pma.getRMS_ManageTable_POM().getPreviewButton().isDisplayed();
		Assert.assertTrue(displayed);

		pma.getRMS_ManageTable_POM().getPreviewButton().click();

	}

	@Then("User should verify preview Popuop Opens and user should able to see Header as Print Screen {string}")
	public void userShouldVerifyPreviewPopuopOpensAndUserShouldAbleToSeeHeaderAsPrintScreen(String string) {

		boolean displayed = pma.getRMS_ManageTable_POM().getPrintScreenHeader().isDisplayed();
		Assert.assertTrue(displayed);

		String text = pma.getRMS_ManageTable_POM().getPrintScreenHeader().getText();
		Assert.assertTrue(text.contains(string));

	}

	@Then("User should able to verify Restaurant Name and Table Name inside the Frame")
	public void userShouldAbleToVerifyRestaurantNameAndTableNameInsideTheFrame() throws InterruptedException {

		String resHeader = pma.getRMS_ManageTable_POM().getResHeader().getText();

		String insidePreviewResName = pma.getRMS_ManageTable_POM().getInsidePreviewResName().getText();
		Assert.assertTrue(insidePreviewResName.equals(resHeader));
		Thread.sleep(4000);
		String insideTable = pma.getRMS_ManageTable_POM().getInsideTableTableName().get(0).getText();
		System.out.println(insideTable);

		String InsidePreviewTableName = pma.getRMS_ManageTable_POM().getInsidePreviewTableName().getText();
		System.out.println(InsidePreviewTableName);
		Assert.assertTrue(insideTable.contains(InsidePreviewTableName));

	}

	@Then("User should able to see {string} word inside the frame")
	public void userShouldAbleToSeeWordInsideTheFrame(String string) {
		String text = pma.getRMS_ManageTable_POM().getInsidePreviewUnderQr().getText();
		Assert.assertTrue(text.contains(string));

	}

	@Then("User should able to see and Click the Cancel button")
	public void userShouldAbleToSeeAndClickTheCancelButton() {
		boolean displayed = pma.getRMS_ManageTable_POM().getInsidePreviewCancelButton().isDisplayed();
		Assert.assertTrue(displayed);
	}

	@Then("User should able to See print Button {string}")
	public void userShouldAbleToSeePrintButton(String string) {
		boolean displayed = pma.getRMS_ManageTable_POM().getInsidePreviewPrintButton().isDisplayed();
		Assert.assertTrue(displayed);
		pma.getRMS_ManageTable_POM().getInsidePreviewCancelButton().click();
	}

	@Then("User should able to Delete any Table")
	public void userShouldAbleToDeleteAnyTable() throws InterruptedException {

		// Threedots click and Click Delete Button
		String tableName = pma.getRMS_ManageTable_POM().getInsideTableTableName().get(0).getText();

		pma.getRMS_ManageTable_POM().getTableThreeDots().get(0).click();
		pma.getRMS_ManageTable_POM().getDeleteTable().click();

		// DeleteTable popup validation
		String text = pma.getRMS_ManageTable_POM().getDeleteTablePopHeader().getText();
		Assert.assertTrue(text.contains("Delete Table"));

//		String text2 = pma.getRMS_ManageTable_POM().getDeleteTablePopupInstruction().getText();
//	    Assert.assertTrue(text2.contains(tableName));

		// X-Icon
		pma.getRMS_ManageTable_POM().getDeleteTablepopupXicon().click();

		// Deleting Table "Ground Floor Tables"
		String totalTablebeforeDelete = pma.getRMS_ManageTable_POM().getTotalTables().getText();
		System.out.println(totalTablebeforeDelete);
		pma.getRMS_ManageTable_POM().getTableThreeDots().get(0).click();
		pma.getRMS_ManageTable_POM().getDeleteTable().click();
		pma.getRMS_ManageTable_POM().getDeleteTablepopupDeletebutton().click();// Table Deleted here
		Thread.sleep(200);
		String totalTableafterDelete = pma.getRMS_ManageTable_POM().getTotalTables().getText();
		System.out.println(totalTableafterDelete);Thread.sleep(200);
		Assert.assertTrue(!totalTablebeforeDelete.equals(totalTableafterDelete));

	}

	@Then("User should able to search any table and validate it")
	public void userShouldAbleToSearchAnyTableAndValidateIt() throws InterruptedException {

		pma.getRMS_ManageTable_POM().getSearch().sendKeys("xyz");
		Thread.sleep(2000);
		String attribute = pma.getRMS_ManageTable_POM().getSearch().getAttribute("value");
		List<WebElement> insideTableTableName = pma.getRMS_ManageTable_POM().getInsideTableTableName();
		for (int i = 0; i < insideTableTableName.size(); i++) {
			String text = insideTableTableName.get(i).getText();
			if (text.contains(attribute)) {
				Assert.assertTrue(true);
			} else {
				boolean displayed = pma.getRMS_ManageTable_POM().getNomatchingTable().isDisplayed();
				Assert.assertTrue(displayed);

			}
		}
		pma.getRMS_ManageTable_POM().getSearch().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		pma.getRMS_ManageTable_POM().getSearch().sendKeys("/';[];'/");
		boolean displayed = pma.getRMS_ManageTable_POM().getNomatchingTable().isDisplayed();
		Assert.assertTrue(displayed);
	}

	@Then("User should able to rearrange the Area and Validate the Rearrange Position")
	public void userShouldAbleToRearrangeTheAreaAndValidateTheRearrangePosition() throws InterruptedException {

		Thread.sleep(2000);
		Actions actions = new Actions(rmsDriver);

		WebElement dragArea = pma.getRMS_ManageTable_POM().getAreaLists1();

		WebElement dropArea = pma.getRMS_ManageTable_POM().getAreaLists2();

		Thread.sleep(3000);

		actions.clickAndHold(dragArea);
		actions.moveToElement(dropArea);
		actions.release().build().perform();

		// actions.dragAndDrop(dragArea,dropArea).build().perform();

	}

	@Then("User should able to rearrange the Table and Validate the Rearranged Position")
	public void userShouldAbleToRearrangeTheTableAndValidateTheRearrangedPosition()  throws InterruptedException {

		Actions actions = new Actions(rmsDriver);

		// For Rearrange "Ground Floor Area is selected"
		List<WebElement> areaLists = pma.getRMS_ManageTable_POM().getAreaLists();
		for (int i = 0; i < areaLists.size(); i++) {
			String text = areaLists.get(i).getText();
			if (text.contains("Ground Floor")) {
				Thread.sleep(2000);
				areaLists.get(i).click();
			}
			
		}

		actions.dragAndDrop(pma.getRMS_ManageTable_POM().getTables().get(0),
				pma.getRMS_ManageTable_POM().getTables().get(3)).build().perform();
		actions.dragAndDrop(pma.getRMS_ManageTable_POM().getTables().get(0),
				pma.getRMS_ManageTable_POM().getTables().get(1)).build().perform();

	}
	@Then("Store all the Date in Excel")
	public void storeAllTheDateInExcel() throws InterruptedException, IOException {
		
	    List<WebElement> areaLists = pma.getRMS_ManageTable_POM().getAreaLists();
	   
	    File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
		Thread.sleep(1000);
		FileInputStream fileInputStream= new FileInputStream(file);
		Thread.sleep(1000);
		Workbook workbook = new XSSFWorkbook(fileInputStream);		
	     Sheet sheet = workbook.getSheet("Table List");
	      Row row = sheet.createRow(0);
	      Cell cell0 = row.createCell(0);
	      cell0.setCellValue("Area Name");
	      Cell cell1= row.createCell(1);
	      cell1.setCellValue("Table Name");
	      Cell cell2 = row.createCell(2);
	      cell2.setCellValue("Seating Capacity");
	      FileOutputStream fileOutputStream = new FileOutputStream(file);
	    
	   int k=1;
	    for (int i = 0; i < areaLists.size(); i++) {
	    	Thread.sleep(200);
	    	try {
	    		areaLists.get(i).click();
			} catch (ElementNotInteractableException e) {
				Actions act = new Actions(rmsDriver);
				act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN);
				areaLists.get(i).click();
			}
	    	//
	    	
	    	
	    	 List<WebElement> getallTables = pma.getRMS_ManageTable_POM().getallTables();
	    	 Thread.sleep(100);
	    	for (int j = 0; j < getallTables.size(); j++) {
	    		String text = rmsDriver.findElement(By.xpath("(//div[@class='primary-name'])["+(j+1)+"]")).getText();
	    		String replaceAll = text.replaceAll("[\\r\\n]+", "");
	    		String TableName = replaceAll.substring(5);
	    		String seatsCount = rmsDriver.findElement(By.xpath("(//p[@class='w-85 form-label__small-text font-bold'])["+(j+1)+"]")).getText();
	    		
	    	Row row1 = sheet.createRow(k);
	  	    Cell areaName = row1.createCell(0);
	  	    areaName.setCellValue(areaLists.get(i).getText());
	  	    Cell tableName= row1.createCell(1);
	  	    tableName.setCellValue(TableName);
	  	    Cell seats = row1.createCell(2);
	  	    seats.setCellValue(seatsCount);
	  	    k++;
			}
	    	Thread.sleep(300);
		}
	    workbook.write(fileOutputStream);
	   
	}
}