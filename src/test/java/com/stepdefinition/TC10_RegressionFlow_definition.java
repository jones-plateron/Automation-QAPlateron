package com.stepdefinition;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BaseClass;
import com.pagemanager.PageManager;

import io.cucumber.java.en.Then;

public class TC10_RegressionFlow_definition extends BaseClass {

	PageManager pma = new PageManager();

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
//
//		// 1st Area => Area Name should be Area 1
//		String area1 = pma.getPOS_FlowOne_POM().getArea1().getAttribute("Content-desc");
//		String replaceAll = area1.replaceAll("[\\r\\n]+", "");
//		String substring = replaceAll.substring(0, area1.length() - 11);
//		String dataFromExcel = getDataFromExcel("Table List", 1, 0);
//		Assert.assertTrue(substring.equals(dataFromExcel));
//
//		// 2nd Area => Area Name should be Ground Floor
//		pma.getPOS_FlowOne_POM().getAreaGroundfloor().click();
//		Thread.sleep(200);
//		String groundFloor = pma.getPOS_FlowOne_POM().getAreaGroundfloor().getAttribute("Content-desc");
//		String replaceAll2 = groundFloor.replaceAll("[\\r\\n]+", "");
//		String actGroundflr = replaceAll2.substring(0, area1.length() - 5);
//		String GroundflrExcel = getDataFromExcel("Table List", 2, 0);
//		Assert.assertTrue(actGroundflr.equals(GroundflrExcel));
//		Thread.sleep(200); 
//
//		// 3rd Area => Area Name should be Area 2
//		pma.getPOS_FlowOne_POM().getArea2().click();
//		Thread.sleep(200);
//		String area2 = pma.getPOS_FlowOne_POM().getArea2().getAttribute("Content-desc");
//		String replaceAll3 = area2.replaceAll("[\\r\\n]+", "");
//		String actArea2 = replaceAll3.substring(0, area1.length() - 11);
//		String area2Excel = getDataFromExcel("Table List", 6, 0);
//		Assert.assertTrue(actArea2.equals(area2Excel));
//		Thread.sleep(500);
//
//		// 4th Area => Area Name should be Area 3
//		pma.getPOS_FlowOne_POM().getArea3().click();
//		Thread.sleep(200);
//		String area3 = pma.getPOS_FlowOne_POM().getArea3().getAttribute("content-desc");
//		String replaceAll4 = area3.replaceAll("[\\r\\n]+", "");
//		String actArea3 = replaceAll4.substring(0, area1.length() - 11);
//		String area3Excel = getDataFromExcel("Table List", 7, 0);
//		Assert.assertTrue(actArea3.equals(area3Excel));
//		Thread.sleep(200);
//
		// 5th Area => Area Name should be AutoEdited
//		pma.getPOS_FlowOne_POM().getArea5().click();
//		Thread.sleep(200);
//		String autoEdited = pma.getPOS_FlowOne_POM().getAutomationArea().getAttribute("content-desc");
//		String replaceAll5 = autoEdited.replaceAll("[\\r\\n]+", "");
//		String automationArea = replaceAll5.substring(0, autoEdited.length() - 7);
//		String automationAreaExcel = getDataFromExcel("Table List", 8, 0);
//		Assert.assertTrue(automationArea.equals(automationAreaExcel));
		// Thread.sleep(200);
		
		int j = 0, k = 0,count=1,val;
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

		for (int i = 1; i <=map.size(); i++) {
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
			
			count=count+k;
			System.out.println(count);
			for (val=count,j = 0; j < map.get(getDataFromExcel("Table List", count, 0)); j++,val++) {
				Thread.sleep(500);
				switch (j) {

				case 0:
					String actTable1 = pma.getPOS_FlowOne_POM().getTable1().getAttribute("content-desc");
					String replaceAll = actTable1.replaceAll("[\\r\\n]+", "");
					String tableFromExcel = getDataFromExcel("Table List", val, 1);
					String seatFromExcel = getDataFromExcel("Table List", val, 2);
					Assert.assertEquals(tableFromExcel+"Seats "+ seatFromExcel, replaceAll);
					
					
					break;
				case 1:
					String actTable2 = pma.getPOS_FlowOne_POM().getTable2().getAttribute("content-desc");
					String replaceAll1 = actTable2.replaceAll("[\\r\\n]+", "");
					String tableFromExcel1 = getDataFromExcel("Table List", val, 1);
					String seatFromExcel1 = getDataFromExcel("Table List", val, 2);
					Assert.assertEquals(tableFromExcel1+"Seats "+ seatFromExcel1, replaceAll1);
					break;
				case 2:

					String actTable3 = pma.getPOS_FlowOne_POM().getTable3().getAttribute("content-desc");
					String replaceAll2 = actTable3.replaceAll("[\\r\\n]+", "");
					String tableFromExcel2 = getDataFromExcel("Table List", val, 1);
					String seatFromExcel2 = getDataFromExcel("Table List", val, 2);
					Assert.assertEquals(tableFromExcel2+"Seats "+ seatFromExcel2, replaceAll2);
					break;
				case 3:

					String actTable4 = pma.getPOS_FlowOne_POM().getTable4().getAttribute("content-desc");
					String replaceAll3 = actTable4.replaceAll("[\\r\\n]+", "");
					String tableFromExcel3 = getDataFromExcel("Table List", val, 1);
					String seatFromExcel13 = getDataFromExcel("Table List", val, 2);
					Assert.assertEquals(tableFromExcel3+"Seats "+ seatFromExcel13, replaceAll3);
					break;
				case 4:

					String actTable5 = pma.getPOS_FlowOne_POM().getTable5().getAttribute("content-desc");
					String replaceAll4 = actTable5.replaceAll("[\\r\\n]+", "");
					String tableFromExcel4 = getDataFromExcel("Table List", val, 1);
					String seatFromExcel4 = getDataFromExcel("Table List", val, 2);
					Assert.assertEquals(tableFromExcel4+"Seats "+ seatFromExcel4, replaceAll4);
					break;
				case 5:

					String actTable6 = pma.getPOS_FlowOne_POM().getTable6().getAttribute("content-desc");
					String replaceAll5 = actTable6.replaceAll("[\\r\\n]+", "");
					String tableFromExcel5 = getDataFromExcel("Table List", val, 1);
					String seatFromExcel5 = getDataFromExcel("Table List", val, 2);
					Assert.assertEquals(tableFromExcel5+"Seats "+ seatFromExcel5, replaceAll5);
					break;
				case 6:

					String actTable7 = pma.getPOS_FlowOne_POM().getTable7().getAttribute("content-desc");
					String replaceAll6 = actTable7.replaceAll("[\\r\\n]+", "");
					String tableFromExcel6 = getDataFromExcel("Table List", val, 1);
					String seatFromExcel6 = getDataFromExcel("Table List", val, 2);
					Assert.assertEquals(tableFromExcel6+"Seats "+ seatFromExcel6, replaceAll6);
					break;
				case 7:

					String actTable8 = pma.getPOS_FlowOne_POM().getTable8().getAttribute("content-desc");
					String replaceAll7 = actTable8.replaceAll("[\\r\\n]+", "");
					String tableFromExcel7 = getDataFromExcel("Table List", val, 1);
					String seatFromExcel7 = getDataFromExcel("Table List", val, 2);
					Assert.assertEquals(tableFromExcel7+"Seats "+ seatFromExcel7, replaceAll7);
					break;
				case 8:

					String actTable9 = pma.getPOS_FlowOne_POM().getTable9().getAttribute("content-desc");
					String replaceAll8 = actTable9.replaceAll("[\\r\\n]+", "");
					String tableFromExcel8 = getDataFromExcel("Table List", val, 1);
					String seatFromExcel8 = getDataFromExcel("Table List", val, 2);
					Assert.assertEquals(tableFromExcel8+"Seats "+ seatFromExcel8, replaceAll8);
					break;
				case 9:

					String actTable10 = pma.getPOS_FlowOne_POM().getTable10().getAttribute("content-desc");
					String replaceAll9 = actTable10.replaceAll("[\\r\\n]+", "");
					String tableFromExcel9 = getDataFromExcel("Table List", val, 1);
					String seatFromExcel9 = getDataFromExcel("Table List", val, 2);
					Assert.assertEquals(tableFromExcel9+"Seats "+ seatFromExcel9, replaceAll9);
					break;

				default:
					break;
				}

			}
			k = j;

		}
		
//		//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Area Validation Done>>>>>>>>>>>>>>>>>>>>>>>>>\\
		
		//Occupied Table Validation
		pma.getPOS_FlowOne_POM().getArea4().click();
		Thread.sleep(200);
		String actt = pma.getPOS_FlowOne_POM().getTable1().getAttribute("content-desc");
		pma.getPOS_FlowOne_POM().getTable1().click();
		String occWaName = pma.getPOS_FlowOne_POM().getOccupiedTableWaiterName().getAttribute("content-desc");
		String occWaNamet = occWaName.substring(0, occWaName.length()-23);
		Assert.assertTrue(actt.contains(occWaNamet));
		//Releasing this table validation 
		Thread.sleep(500);
		boolean displayed = pma.getPOS_FlowOne_POM().getReleasingthisTable().isDisplayed();
		Assert.assertTrue(displayed);
		//Clicking Cacncel btn
		pma.getPOS_FlowOne_POM().getCancelBtn().click();
		//Again Clicking the Table and Clicking Proceed Button 
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
	public void userShouldValidateTheGuestCountPopup() {
     pma.getPOS_FlowOne_POM().getArea5().click();
     String actTableName = pma.getPOS_FlowOne_POM().getTable1().getAttribute("content-desc");
     String  actTableNamere= actTableName.replaceAll("[\\r\\n]+", "");
     String actTableNamef = actTableNamere.substring(0, actTableNamere.length()-8);
     pma.getPOS_FlowOne_POM().getTable1().click();
     String actHeadr = pma.getPOS_FlowOne_POM().getGuestPopupHeadr().getAttribute("content-desc");
     Assert.assertTrue(actHeadr.contains(actTableNamef));
     //pma.getPOS_FlowOne_POM().getCancelBtn().click();
     Actions acc = new Actions(posDriver1);
     acc.dragAndDropBy(pma.getPOS_FlowOne_POM().getNoOfGuest5(), -600, 0).perform();
}
	}
