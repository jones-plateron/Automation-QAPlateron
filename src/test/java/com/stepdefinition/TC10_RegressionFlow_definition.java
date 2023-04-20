package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
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

		// 1st Area => Area Name should be Area 1
		String area1 = pma.getPOS_FlowOne_POM().getArea1().getAttribute("Content-desc");
		String replaceAll = area1.replaceAll("[\\r\\n]+", "");
		String substring = replaceAll.substring(0, area1.length() - 11);
		String dataFromExcel = getDataFromExcel("Table List", 1, 0);
		Assert.assertTrue(substring.equals(dataFromExcel));

		// 2nd Area => Area Name should be Ground Floor
		pma.getPOS_FlowOne_POM().getAreaGroundTable().click();
		Thread.sleep(200);
		String groundFloor = pma.getPOS_FlowOne_POM().getAreaGroundTable().getAttribute("Content-desc");
		String replaceAll2 = groundFloor.replaceAll("[\\r\\n]+", "");
		String actGroundflr = replaceAll2.substring(0, area1.length() - 5);
		String GroundflrExcel = getDataFromExcel("Table List", 2, 0);
		Assert.assertTrue(actGroundflr.equals(GroundflrExcel));
		Thread.sleep(200);

		// 3rd Area => Area Name should be Area 2
		pma.getPOS_FlowOne_POM().getArea2().click();
		Thread.sleep(200);
		String area2 = pma.getPOS_FlowOne_POM().getArea2().getAttribute("Content-desc");
		String replaceAll3 = area2.replaceAll("[\\r\\n]+", "");
		String actArea2 = replaceAll3.substring(0, area1.length() - 11);
		String area2Excel = getDataFromExcel("Table List", 6, 0);
		Assert.assertTrue(actArea2.equals(area2Excel));
		Thread.sleep(500);

		// 4th Area => Area Name should be Area 3
		pma.getPOS_FlowOne_POM().getArea3().click();
		Thread.sleep(200);
		String area3 = pma.getPOS_FlowOne_POM().getArea3().getAttribute("content-desc");
		String replaceAll4 = area3.replaceAll("[\\r\\n]+", "");
		String actArea3 = replaceAll4.substring(0, area1.length() - 11);
		String area3Excel = getDataFromExcel("Table List", 7, 0);
		Assert.assertTrue(actArea3.equals(area3Excel));
		Thread.sleep(200);

		// 5th Area => Area Name should be AutoEdited
		pma.getPOS_FlowOne_POM().getAutomationArea().click();
		Thread.sleep(200);
		String autoEdited = pma.getPOS_FlowOne_POM().getAutomationArea().getAttribute("content-desc");
		String replaceAll5 = autoEdited.replaceAll("[\\r\\n]+", "");
		String automationArea = replaceAll5.substring(0, area1.length() - 7);
		String automationAreaExcel = getDataFromExcel("Table List", 8, 0);
		Assert.assertTrue(automationArea.equals(automationAreaExcel));
		Thread.sleep(200);
		
		//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Area Validation Done>>>>>>>>>>>>>>>>>>>>>>>>>\\
		for (int i = 0; i < 10; i++) {
		posDriver1.findElement(By.xpath("//android.view.View[@index='0']["+i+"]"));
		}
		
		String actTable = pma.getPOS_FlowOne_POM().getArea1Table1().getAttribute("content-desc");
		String replaceAll6 = actTable.replaceAll("[\\r\\n]+", "");
		//replaceAll6
		System.out.println(replaceAll6);
		
	}

	@Then("User should validate the GuestCount Popup")
	public void userShouldValidateTheGuestCountPopup() {

	}

}
