package com.stepdefinition;

import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;

import java.io.IOException;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BaseClass;
import com.pagemanager.PageManager;

import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC10_RegressionFlow_definition extends BaseClass {

	PageManager pma = new PageManager();
	String noOfGuest;

	public TC10_RegressionFlow_definition() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}

	@Then("User should validate the page header")
	public void userShouldValidateThePageHeader() {
		String SelectTableHeadr = pma.getPOS_FlowOne_POM().getSelectTableHeader().getAttribute("content-desc");
		System.out.println(SelectTableHeadr);
		Assert.assertTrue(SelectTableHeadr.equals("Select Table"));
	}

	@Then("User should validate the available Areas and Tables")
	public void userShouldValidateTheAvailableAreasAndTables() throws InterruptedException, IOException {

		int j = 0, k = 0, count = 1, val;
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		try {
			for (int i = 0; getDataFromExcel("Table List", i + 1, 0) != null; i++) {

				if (map.containsKey(getDataFromExcel("Table List", i + 1, 0))) {
					map.put(getDataFromExcel("Table List", i + 1, 0),
							map.get(getDataFromExcel("Table List", i + 1, 0)) + 1);
				} else {
					map.put(getDataFromExcel("Table List", i + 1, 0), 1);
				}
			}
		} catch (Exception e) {

		}
		System.out.println(map);

		for (int i = 1; i <= map.size(); i++) {
			switch (i) {
			case 1:
				pma.getPOS_FlowOne_POM().getArea1().click();
				break;
			case 2:
				pma.getPOS_FlowOne_POM().getArea2().click();
				break;
			case 3:
				pma.getPOS_FlowOne_POM().getArea3().click();
				break;
			case 4:
				pma.getPOS_FlowOne_POM().getArea4().click();
				break;
			case 5:
				pma.getPOS_FlowOne_POM().getArea5().click();
				break;

			default:
				break;
			}
//			System.out.println(map.get(getDataFromExcel("Table List", i + k, 0)));

			count = count + k;
			System.out.println(count);
			for (val = count, j = 0; j < map.get(getDataFromExcel("Table List", count, 0)); j++, val++) {
				Thread.sleep(500);
				switch (j) {

				case 0:
					String actTable1 = pma.getPOS_FlowOne_POM().getTable1().getAttribute("content-desc");
					String replaceAll = actTable1.replaceAll("[\\r\\n]+", "");
					String tableFromExcel = getDataFromExcel("Table List", val, 1);
					String seatFromExcel = getDataFromExcel("Table List", val, 2);
					Assert.assertEquals(tableFromExcel + "Seats " + seatFromExcel, replaceAll);

					break;
				case 1:
					String actTable2 = pma.getPOS_FlowOne_POM().getTable2().getAttribute("content-desc");
					String replaceAll1 = actTable2.replaceAll("[\\r\\n]+", "");
					String tableFromExcel1 = getDataFromExcel("Table List", val, 1);
					String seatFromExcel1 = getDataFromExcel("Table List", val, 2);
					Assert.assertEquals(tableFromExcel1 + "Seats " + seatFromExcel1, replaceAll1);
					break;
				case 2:

					String actTable3 = pma.getPOS_FlowOne_POM().getTable3().getAttribute("content-desc");
					String replaceAll2 = actTable3.replaceAll("[\\r\\n]+", "");
					String tableFromExcel2 = getDataFromExcel("Table List", val, 1);
					String seatFromExcel2 = getDataFromExcel("Table List", val, 2);
					Assert.assertEquals(tableFromExcel2 + "Seats " + seatFromExcel2, replaceAll2);
					break;
				case 3:

					String actTable4 = pma.getPOS_FlowOne_POM().getTable4().getAttribute("content-desc");
					String replaceAll3 = actTable4.replaceAll("[\\r\\n]+", "");
					String tableFromExcel3 = getDataFromExcel("Table List", val, 1);
					String seatFromExcel13 = getDataFromExcel("Table List", val, 2);
					Assert.assertEquals(tableFromExcel3 + "Seats " + seatFromExcel13, replaceAll3);
					break;
				case 4:

					String actTable5 = pma.getPOS_FlowOne_POM().getTable5().getAttribute("content-desc");
					String replaceAll4 = actTable5.replaceAll("[\\r\\n]+", "");
					String tableFromExcel4 = getDataFromExcel("Table List", val, 1);
					String seatFromExcel4 = getDataFromExcel("Table List", val, 2);
					Assert.assertEquals(tableFromExcel4 + "Seats " + seatFromExcel4, replaceAll4);
					break;
				case 5:

					String actTable6 = pma.getPOS_FlowOne_POM().getTable6().getAttribute("content-desc");
					String replaceAll5 = actTable6.replaceAll("[\\r\\n]+", "");
					String tableFromExcel5 = getDataFromExcel("Table List", val, 1);
					String seatFromExcel5 = getDataFromExcel("Table List", val, 2);
					Assert.assertEquals(tableFromExcel5 + "Seats " + seatFromExcel5, replaceAll5);
					break;
				case 6:

					String actTable7 = pma.getPOS_FlowOne_POM().getTable7().getAttribute("content-desc");
					String replaceAll6 = actTable7.replaceAll("[\\r\\n]+", "");
					String tableFromExcel6 = getDataFromExcel("Table List", val, 1);
					String seatFromExcel6 = getDataFromExcel("Table List", val, 2);
					Assert.assertEquals(tableFromExcel6 + "Seats " + seatFromExcel6, replaceAll6);
					break;
				case 7:

					String actTable8 = pma.getPOS_FlowOne_POM().getTable8().getAttribute("content-desc");
					String replaceAll7 = actTable8.replaceAll("[\\r\\n]+", "");
					String tableFromExcel7 = getDataFromExcel("Table List", val, 1);
					String seatFromExcel7 = getDataFromExcel("Table List", val, 2);
					Assert.assertEquals(tableFromExcel7 + "Seats " + seatFromExcel7, replaceAll7);
					break;
				case 8:

					String actTable9 = pma.getPOS_FlowOne_POM().getTable9().getAttribute("content-desc");
					String replaceAll8 = actTable9.replaceAll("[\\r\\n]+", "");
					String tableFromExcel8 = getDataFromExcel("Table List", val, 1);
					String seatFromExcel8 = getDataFromExcel("Table List", val, 2);
					Assert.assertEquals(tableFromExcel8 + "Seats " + seatFromExcel8, replaceAll8);
					break;
				case 9:

					String actTable10 = pma.getPOS_FlowOne_POM().getTable10().getAttribute("content-desc");
					String replaceAll9 = actTable10.replaceAll("[\\r\\n]+", "");
					String tableFromExcel9 = getDataFromExcel("Table List", val, 1);
					String seatFromExcel9 = getDataFromExcel("Table List", val, 2);
					Assert.assertEquals(tableFromExcel9 + "Seats " + seatFromExcel9, replaceAll9);
					break;

				default:
					break;
				}

			}
			k = j;

		}

//		//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Area Validation Done>>>>>>>>>>>>>>>>>>>>>>>>>\\

		// Occupied Table Validation
		pma.getPOS_FlowOne_POM().getArea4().click();
		Thread.sleep(200);
		String actt = pma.getPOS_FlowOne_POM().getTable1().getAttribute("content-desc");
		pma.getPOS_FlowOne_POM().getTable1().click();
		String occWaName = pma.getPOS_FlowOne_POM().getOccupiedTableWaiterName().getAttribute("content-desc");
		String occWaNamet = occWaName.substring(0, occWaName.length() - 23);
		Assert.assertTrue(actt.contains(occWaNamet));
		// Releasing this table validation
		Thread.sleep(500);
		boolean displayed = pma.getPOS_FlowOne_POM().getReleasingthisTable().isDisplayed();
		Assert.assertTrue(displayed);
		// Clicking Cacncel btn
		pma.getPOS_FlowOne_POM().getCancelBtn().click();
		// Again Clicking the Table and Clicking Proceed Button
		pma.getPOS_FlowOne_POM().getTable1().click();
		pma.getPOS_FlowOne_POM().getReleaseTableProceedBtn().click();
		pma.getPOS_FlowOne_POM().getArea4().click();
		Thread.sleep(200);
		pma.getPOS_FlowOne_POM().getArea4().click();
		String acttafterRelase = pma.getPOS_FlowOne_POM().getTable1().getAttribute("content-desc");
		Thread.sleep(500);
		Assert.assertTrue(!actt.equals(acttafterRelase));

	}

	@Then("User should validate the GuestCount Popup")
	public void userShouldValidateTheGuestCountPopup() throws InterruptedException {

		pma.getPOS_FlowOne_POM().getArea5().click();
		String actTableName = pma.getPOS_FlowOne_POM().getTable1().getAttribute("content-desc");
		String actTableNamere = actTableName.replaceAll("[\\r\\n]+", "");
		String actTableNamef = actTableNamere.substring(0, actTableNamere.length() - 8);
		pma.getPOS_FlowOne_POM().getTable1().click();
		String actHeadr = pma.getPOS_FlowOne_POM().getGuestPopupHeadr().getAttribute("content-desc");
		Assert.assertTrue(actHeadr.contains(actTableNamef));
		Thread.sleep(200);
		pma.getPOS_FlowOne_POM().getNoOfGuest5().click();
		pma.getPOS_FlowOne_POM().getCancelBtn().click();

	}

//++++++++Table Management Finished++++++++++\\
	@When("User should navigate to Menus Section through Dine-In")
	public void userShouldNavigateToMenusSectionThroughDineIn() {
		pma.getPOS_FlowOne_POM().getArea5().click();
		pma.getPOS_FlowOne_POM().getTable4().click();
		noOfGuest = pma.getPOS_FlowOne_POM().getNoOfGuest5().getAttribute("content-desc");

		pma.getPOS_FlowOne_POM().getNoOfGuest5().click();

		pma.getPOS_FlowOne_POM().getProceedButton().click();
		String actMenuHdr = pma.getPOS_FlowOne_POM().getMenuPageHeader().getAttribute("content-desc");
		Assert.assertEquals(actMenuHdr, "Menu");

	}

	@Then("User should Validate the Category and Menus #from Excel")
	public void userShouldValidateTheCategoryAndMenusFromExcel() throws IOException, InterruptedException {
		int j = 0, k = 0, count = 1, val;
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		try {
			for (int i = 0; getDataFromExcel("Menu List", i + 1, 0) != null; i++) {

				if (map.containsKey(getDataFromExcel("Menu List", i + 1, 0))) {
					map.put(getDataFromExcel("Menu List", i + 1, 0),
							map.get(getDataFromExcel("Menu List", i + 1, 0)) + 1);
				} else {
					map.put(getDataFromExcel("Menu List", i + 1, 0), 1);
				}
			}
		} catch (Exception e) {

		}
		System.out.println(map);

		for (int i = 1; i <= map.size(); i++) {
			switch (i) {
			case 1:
				pma.getPOS_FlowOne_POM().get1stCate().click();
				String attribute = pma.getPOS_FlowOne_POM().get1stCate().getAttribute("content-desc");
				System.out.println(attribute);
				break;
			case 2:
				pma.getPOS_FlowOne_POM().get2ndCate().click();
				String attribute2 = pma.getPOS_FlowOne_POM().get2ndCate().getAttribute("content-desc");
				System.out.println(attribute2);
				break;
			case 3:
				pma.getPOS_FlowOne_POM().get3rdCate().click();
				String attribute3 = pma.getPOS_FlowOne_POM().get3rdCate().getAttribute("content-desc");
				System.out.println(attribute3);

				break;
			case 4:
				pma.getPOS_FlowOne_POM().get4thCate().click();
				String attribute4 = pma.getPOS_FlowOne_POM().get4thCate().getAttribute("content-desc");
				System.out.println(attribute4);
				break;
			case 5:
				// pma.getPOS_FlowOne_POM().getArea5().click();
				break;

			default:
				break;
			}
			count = count + k;
			System.out.println(count);
			for (val = count, j = 0; j < map.get(getDataFromExcel("Menu List", count, 0)); j++, val++) {
				Thread.sleep(500);
				switch (j) {

				case 0:
					String actMenu1 = pma.getPOS_FlowOne_POM().get1stMenu().getAttribute("content-desc");// Getting Menu
																											// name and
																											// Price
																											// from POS
					String replaceAll1 = actMenu1.replaceAll("[\\r\\n]+", "");// removing the Nxt Line
					String menuName1 = getDataFromExcel("Menu List", val, 1);// Getting Menu Name From Excel
					String menuPrice1 = getDataFromExcel("Menu List", val, 2);// Getting Menu Price From Excel as String
					Float fl = Float.parseFloat(menuPrice1);// Changing this to Float
					String roundStringValue = roundStringValue(fl);// Rounding the value and again changing to String
					Assert.assertEquals(menuName1 + "$" + roundStringValue, replaceAll1); // Comparing Both value
					break;
				case 1:
					String actMenu2 = pma.getPOS_FlowOne_POM().get2ndMenu().getAttribute("content-desc");
					String replaceAll2 = actMenu2.replaceAll("[\\r\\n]+", "");
					String menuName2 = getDataFromExcel("Menu List", val, 1);
					String menuPrice2 = getDataFromExcel("Menu List", val, 2);
					Float fl2 = Float.parseFloat(menuPrice2);
					String roundStringValue2 = roundStringValue(fl2);
					Assert.assertEquals(menuName2 + "$" + roundStringValue2, replaceAll2);
					break;
				case 2:
					String actMenu3 = pma.getPOS_FlowOne_POM().get3rdMenu().getAttribute("content-desc");
					String replaceAll3 = actMenu3.replaceAll("[\\r\\n]+", "");
					String menuName3 = getDataFromExcel("Menu List", val, 1);
					String menuPrice3 = getDataFromExcel("Menu List", val, 2);
					Float fl3 = Float.parseFloat(menuPrice3);
					String roundStringValue3 = roundStringValue(fl3);
					Assert.assertEquals(menuName3 + "$" + roundStringValue3, replaceAll3);
					break;
				case 3:

					String actMenu4 = pma.getPOS_FlowOne_POM().get4thMenu().getAttribute("content-desc");
					String replaceAll4 = actMenu4.replaceAll("[\\r\\n]+", "");
					String menuName4 = getDataFromExcel("Menu List", val, 1);
					String menuPrice4 = getDataFromExcel("Menu List", val, 2);
					Float fl4 = Float.parseFloat(menuPrice4);
					String roundStringValue4 = roundStringValue(fl4);
					Assert.assertEquals(menuName4 + "$" + roundStringValue4, replaceAll4);
					break;
				case 4:

					String actMenu5 = pma.getPOS_FlowOne_POM().get5thMenu().getAttribute("content-desc");
					String replaceAll5 = actMenu5.replaceAll("[\\r\\n]+", "");
					String menuName5 = getDataFromExcel("Menu List", val, 1);
					String menuPrice5 = getDataFromExcel("Menu List", val, 2);
					Float fl5 = Float.parseFloat(menuPrice5);
					String roundStringValue5 = roundStringValue(fl5);
					Assert.assertEquals(menuName5 + "$" + roundStringValue5, replaceAll5);
					break;
				default:
					break;
				}

			}
			k = j;// Category and Menu Validation Done
		}
	}

	@Then("User should Validate the Modifier Popup")
	public void userShouldValidateTheModifierPopup() throws InterruptedException {

		// Modifier Validation
		pma.getPOS_FlowOne_POM().get3rdCate().click();
		// Modiifier Opens
		String modiMenu = pma.getPOS_FlowOne_POM().get1stMenu().getAttribute("content-desc");
		String replaceAll = modiMenu.replaceAll("[\\r\\n]", "");
		String emodiMenu = replaceAll.substring(0, replaceAll.length() - 5);
		pma.getPOS_FlowOne_POM().get1stMenu().click();
		Thread.sleep(2000);
		// Validating the Selected Menu with Modifier Header Menu
		String modiPopupMenu = pma.getPOS_FlowOne_POM().getModifierHeaderMenuName().getAttribute("content-desc");
		Assert.assertEquals(modiPopupMenu, emodiMenu);

		// Validating the Selected Menu is Reflected in RHS Menu
		String rhsMenuAt = pma.getPOS_FlowOne_POM().getRHSMenu().getAttribute("content-desc");
		String rhsMenu = rhsMenuAt.substring(0, rhsMenuAt.length() - 2);
		Assert.assertEquals(rhsMenu, modiPopupMenu);

		// 1st Menu=>Required one
		String requiredStatus = pma.getPOS_FlowOne_POM().getRequired().getAttribute("content-desc");
		Assert.assertTrue(requiredStatus.contains("*"));

		if (requiredStatus.contains("*")) {

			pma.getPOS_FlowOne_POM().getNewMMItem1().click();
			String mmItem1At = pma.getPOS_FlowOne_POM().getNewMMItem1().getAttribute("content-desc");// Getting Modifier
																										// Menu in Popup
			String mmItem1 = mmItem1At.substring(0, mmItem1At.length() - 7);
			pma.getPOS_FlowOne_POM().getApplyBtn().click();

			String rhsModiItemAt = pma.getPOS_FlowOne_POM().getRHSModi1().getAttribute("content-desc");// Getting
																										// Modifier Menu
																										// in RHS
			String rhsModiItem = rhsModiItemAt.substring(11);
			Assert.assertEquals(mmItem1, rhsModiItem);// Comparing Both
		} else {
			pma.getPOS_FlowOne_POM().getApplyBtn().click();
		}

		// Second Menu========>>>Modiifier Opens
		String modiMenu1 = pma.getPOS_FlowOne_POM().get2ndMenu().getAttribute("content-desc");
		String replaceAll1 = modiMenu1.replaceAll("[\\r\\n]", "");
		String emodiMenu1 = replaceAll1.substring(0, replaceAll.length() - 5);
		pma.getPOS_FlowOne_POM().get2ndMenu().click();
		Thread.sleep(5000);
		String modiPopupMenu1 = pma.getPOS_FlowOne_POM().getModifierHeaderMenuName().getAttribute("content-desc");
		Assert.assertEquals(modiPopupMenu1, emodiMenu1);

		// 2nd Menu=>Required and Optional
		String requiredStatus1 = pma.getPOS_FlowOne_POM().getRequired().getAttribute("content-desc");
		Assert.assertTrue(requiredStatus1.contains("*"));
		if (requiredStatus1.contains("*")) {
			String requiredNumString = requiredStatus1.substring(7, requiredStatus1.length() - 2);// Required number
																									// taking alone
			int requiredNum = Integer.parseInt(requiredNumString);// Converting the string number into Int
			for (int i = 1; i <= requiredNum; i++) {
				switch (i) {
				case 1:
					pma.getPOS_FlowOne_POM().getNewMMItem1().click();
					// Getting ContentDesc
					String mmItem1At1 = pma.getPOS_FlowOne_POM().getNewMMItem1().getAttribute("content-desc");
					String mmItem1re1 = mmItem1At1.replaceAll("[//rr//n]", "");
					String mmItem1s = mmItem1re1.substring(0, mmItem1re1.length() - 7);
					// Validiating with RHS
					Thread.sleep(500);
					String rhsModiItemAt1 = pma.getPOS_FlowOne_POM().getRHSModi1beforeapply()
							.getAttribute("content-desc");
					String rhsModiItem1 = rhsModiItemAt1.substring(11);
					Thread.sleep(2000);
					Assert.assertTrue(rhsModiItem1.contains(mmItem1s));

					break;
				case 2:
					pma.getPOS_FlowOne_POM().getNewMMItem2().click();
					// Getting ContentDesc
					String mmItem1At2 = pma.getPOS_FlowOne_POM().getNewMMItem2().getAttribute("content-desc");
					String mmItem1re2 = mmItem1At2.replaceAll("[//rr//n]", "");
					String mmItem2 = mmItem1re2.substring(0, mmItem1re2.length() - 7);
					// Validiating with RHS
					Thread.sleep(500);
					String rhsModiItemAt2 = pma.getPOS_FlowOne_POM().getRHSModi1beforeapply()
							.getAttribute("content-desc");
					String rhsModiItem2 = rhsModiItemAt2.substring(11);
					Assert.assertTrue(rhsModiItem2.contains(mmItem2));
					break;
				case 3:
					pma.getPOS_FlowOne_POM().getNewMMItem3().click();
					// Getting ContentDesc
					String mmItem1At3 = pma.getPOS_FlowOne_POM().getNewMMItem3().getAttribute("content-desc");
					String mmItem1re3 = mmItem1At3.replaceAll("[//rr//n]", "");
					String mmItem13 = mmItem1re3.substring(0, mmItem1re3.length() - 7);
					// Validiating with RHS
					Thread.sleep(500);
					String rhsModiItemAt3 = pma.getPOS_FlowOne_POM().getRHSModi1beforeapply()
							.getAttribute("content-desc");
					String rhsModiItem3 = rhsModiItemAt3.substring(11);
					Assert.assertTrue(rhsModiItem3.contains(mmItem13));
					break;
				case 4:
					pma.getPOS_FlowOne_POM().getNewMMItem4().click();
					// Getting ContentDesc
					String mmItem1At4 = pma.getPOS_FlowOne_POM().getNewMMItem4().getAttribute("content-desc");
					String mmItem1re4 = mmItem1At4.replaceAll("[//rr//n]", "");
					String mmItem14 = mmItem1re4.substring(0, mmItem1re4.length() - 7);
					// Validiating with RHS
					Thread.sleep(500);
					String rhsModiItemAt4 = pma.getPOS_FlowOne_POM().getRHSModi1beforeapply()
							.getAttribute("content-desc");
					String rhsModiItem4 = rhsModiItemAt4.substring(11);
					Assert.assertTrue(rhsModiItem4.contains(mmItem14));
					break;

				default:
					break;
				}
			}
		} else {
			pma.getPOS_FlowOne_POM().getApplyBtn().click();

		}
		pma.getPOS_FlowOne_POM().getApplyBtn().click();

		// 3rd Menu=>Both Optional
		pma.getPOS_FlowOne_POM().get3rdMenu().click();
		Thread.sleep(300);
		pma.getPOS_FlowOne_POM().getApplyBtn().click();
		Thread.sleep(200);

		// Cancel Popup validation
		pma.getPOS_FlowOne_POM().getCancelBtn().click();
		String getInstruction = pma.getPOS_FlowOne_POM().getCancelPopupInstruction().getAttribute("content-desc");
		Assert.assertEquals("Would you like to cancel the order", getInstruction);
		boolean displayed = pma.getPOS_FlowOne_POM().getKeepTheOrderBtn().isDisplayed();
		Assert.assertTrue(displayed);
		pma.getPOS_FlowOne_POM().getYesCancelBtn().click();
	}

//	for (int i = 1; i <= 10; i++) {
//		String menuName = getDataFromExcel("Menu List", i, 1);
//		String menuPrice = getDataFromExcel("Menu List", i, 2);
//		String formatStringValue = roundStringValue(Float.parseFloat(menuPrice));
//		System.out.println(menuName+"\r\n$"+formatStringValue);
//		String attribute = pma.getPOS_FlowOne_POM().getMenuItemName(menuName+"\r\n$"+roundStringValue(Float.parseFloat(menuPrice))).getAttribute("content-desc");
//		System.out.println(attribute);
//	}
//}
	@Then("User should validate the RHS")
	public void userShouldValidateTheRHS() throws InterruptedException {
		// RHS Validation
		pma.getPOS_FlowOne_POM().getArea5().click();Thread.sleep(500);
		String actTableAt = pma.getPOS_FlowOne_POM().getTable4().getAttribute("content-desc");
		String actTable = actTableAt.substring(0, actTableAt.length() - 9);

		pma.getPOS_FlowOne_POM().getTable4().click();

		pma.getPOS_FlowOne_POM().getNoOfGuest5().click();
		String guesNo = pma.getPOS_FlowOne_POM().getNoOfGuest5().getAttribute("content-desc");
		pma.getPOS_FlowOne_POM().getProceedButton().click();
		// Guest Count Validation
		String guesNoInMenuPage = pma.getPOS_FlowOne_POM().getGuestCountInMenuPage().getAttribute("content-desc");
		Assert.assertEquals("Guest - " + guesNo, guesNoInMenuPage);
		// Table Name Validation
		String tableNameMenuPageAt = pma.getPOS_FlowOne_POM().getTableNameInMenuPage().getAttribute("content-desc");
		Assert.assertEquals(actTable, tableNameMenuPageAt);

		// Menu Validation
		String actMenuAt = pma.getPOS_FlowOne_POM().getMenu1().getAttribute("content-desc");
		String actMenu = actMenuAt.substring(0, actMenuAt.length() - 6);
		pma.getPOS_FlowOne_POM().getMenu1().click();
		Thread.sleep(500);
		String actRhsMenuAt = pma.getPOS_FlowOne_POM().getRHSMenuValidation().getAttribute("content-desc");
		String actRHSMenu = actRhsMenuAt.substring(0, actRhsMenuAt.length() - 2);
		Assert.assertEquals(actMenu, actRHSMenu);
		
		// Plus Validation
		String menuCount = actRhsMenuAt.substring(11);// RHS Menu==>Taking Count Value Only
		int menucountInt = Integer.parseInt(menuCount);
		for (int i = 0; i < 4; i++) {
			pma.getPOS_FlowOne_POM().getPlusSymbol().click();
			menucountInt++;
		}
		String addictionCount = pma.getPOS_FlowOne_POM().getRHSMenuValidation().getAttribute("content-desc");
		String countString = Integer.toString(menucountInt);
		Assert.assertTrue(addictionCount.contains(countString));

		// Minus Validation
		String minusValidation = pma.getPOS_FlowOne_POM().getRHSMenuValidation().getAttribute("content-desc");
		String minusCount = minusValidation.substring(11);
		int intMenuCount = Integer.parseInt(minusCount);
		for (int i = 0; i < 4; i++) {
			pma.getPOS_FlowOne_POM().getMinusSymbol().click();
			intMenuCount--;
		}
		String afterMinusCount = pma.getPOS_FlowOne_POM().getRHSMenuValidation().getAttribute("content-desc");
		String afterString = Integer.toString(intMenuCount);
		Assert.assertTrue(afterMinusCount.contains(afterString));

		// Cancelling
		pma.getPOS_FlowOne_POM().getCancelBtn().click();
		String getInstruction = pma.getPOS_FlowOne_POM().getCancelPopupInstruction().getAttribute("content-desc");
		Assert.assertEquals("Would you like to cancel the order", getInstruction);
		boolean displayed = pma.getPOS_FlowOne_POM().getKeepTheOrderBtn().isDisplayed();
		Assert.assertTrue(displayed);
		pma.getPOS_FlowOne_POM().getYesCancelBtn().click();
	}

	@Then("User should Validate the Search Functionality")
	public void userShouldValidateTheSearchFunctionality() throws InterruptedException {

		pma.getPOS_FlowOne_POM().getArea5().click();Thread.sleep(500);
		pma.getPOS_FlowOne_POM().getTable4().click();
		pma.getPOS_FlowOne_POM().getNoOfGuest5().click();
		pma.getPOS_FlowOne_POM().getProceedButton().click();

		// Searching One Menu and Validating the Results
		pma.getPOS_FlowOne_POM().getSearchBarinMenuPg().click();
		pma.getPOS_FlowOne_POM().getSearchBarinMenuPg().sendKeys("Menu Item10");
		Thread.sleep(500);
		String searchedMenuAt = pma.getPOS_FlowOne_POM().getSearh1stMenu().getAttribute("content-desc");
		String searchedMenu = searchedMenuAt.substring(0, searchedMenuAt.length() - 7);
		Assert.assertEquals("Menu Item10", searchedMenu);

		// Searching the Menu and Clicking the Menu and Validating RHS
		pma.getPOS_FlowOne_POM().getSearchBarinMenuPg().click();
		pma.getPOS_FlowOne_POM().getSearchBarinMenuPg().sendKeys("Menu Item1");
		Thread.sleep(500);
		String actSearchedMenuAt = pma.getPOS_FlowOne_POM().getSearh1stMenu().getAttribute("content-desc");
		String actSearchedMenu = actSearchedMenuAt.substring(0, actSearchedMenuAt.length() - 6);
		pma.getPOS_FlowOne_POM().getSearh1stMenu().click();
		Thread.sleep(500);
		String rhsClickedMenuAt = pma.getPOS_FlowOne_POM().getRHSMenuValidation().getAttribute("content-desc");
		String rhsClickedMenu = rhsClickedMenuAt.substring(0, rhsClickedMenuAt.length() - 2);
		Assert.assertEquals(actSearchedMenu, rhsClickedMenu);

		// Menu Not Found Validation
		pma.getPOS_FlowOne_POM().getSearchBarinMenuPg().click();
		Thread.sleep(200);
		pma.getPOS_FlowOne_POM().getSearchBarinMenuPg().sendKeys(specialChar);
		pma.getPOS_FlowOne_POM().getMenuPageHeader().click();Thread.sleep(200);
		boolean displayed = pma.getPOS_FlowOne_POM().getMenuNotFound().isDisplayed();
		Assert.assertTrue(displayed);

	}

	public void userShouldClickSentToKitchenButton() throws InterruptedException {

		Actions act = new Actions(posDriver1);
		WebElement aElement = pma.getPOS_FlowOne_POM().getSTK1();
		int a = ((aElement.getSize().width) / 2) * -1;

		dragAndDropBy(act, pma.getPOS_FlowOne_POM().getSTK1(), a, 600, 0).perform();
		Thread.sleep(1500);

	}

	public Actions dragAndDropBy(Actions act, WebElement source, int startOffset, int xOffset, int yOffset) {
		return act
				.tick(act.getActivePointer().createPointerMove(Duration.ofMillis(100), Origin.fromElement(source),
						(startOffset + 25), 0))
				.tick(act.getActivePointer().createPointerDown(LEFT.asArg())).tick(act.getActivePointer()
						.createPointerMove(Duration.ofMillis(250), Origin.pointer(), xOffset, yOffset))
				.tick(act.getActivePointer().createPointerUp(LEFT.asArg()));
	}

}
