package com.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BaseClass;
import com.pagemanager.PageManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bill_Configuration_Definition extends BaseClass{
	
	PageManager pma = new PageManager();
	
	public Bill_Configuration_Definition() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
	
	
	
	@When("User should Click Settings Sections")
	public void userShouldClickSettingsSections() {
		pma.getrMS_SettingsPage_Configuration_POM().getSettingsSections().click();
	}
	@Then("User should verify the Page redirection to Settings Page {string}")
	public void userShouldVerifyThePageRedirectionToSettingsPage(String datePageHdr) {
		Assert.assertTrue(pma.getrMS_SettingsPage_Configuration_POM().getDateandTimeSecHeader().getText().contains(datePageHdr));
	}
	@Then("User should click Bill configuration and update the sales tax percentage #Excel Input")
	public void userShouldClickBillConfigurationAndUpdateTheSalesTaxPercentageExcelInput() throws InterruptedException, IOException {
		pma.getrMS_SettingsPage_Configuration_POM().getBillConfigurationOptionSections().click();
//		pma.getrMS_SettingsPage_Configuration_POM().
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
//		Thread.sleep(2000);
		FileInputStream fileInputStream= new FileInputStream(file);Thread.sleep(1000);//Bill Configuration
		Workbook workbook = new XSSFWorkbook(fileInputStream);		
	     Sheet sheet = workbook.getSheet("Bill Configuration");
	      Row row = sheet.getRow(1);
	      Cell cell = row.getCell(1);
	      double SalesTax = cell.getNumericCellValue();
	      int sT = (int) SalesTax;
	      String SalTx = Integer.toString(sT);
	      pma.getrMS_SettingsPage_Configuration_POM().getSalesTaxTextBox().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));Thread.sleep(500);
	      pma.getrMS_SettingsPage_Configuration_POM().getSalesTaxTextBox().sendKeys(SalTx);
	      Thread.sleep(3000);
	}
	@Then("User should Enable or Disable Apply sales tax on Subtotal after Deductions Option #Excel Input")
	public void userShouldEnableOrDisableApplySalesTaxOnSubtotalAfterDeductionsOptionExcelInput() throws InterruptedException, IOException {
//		System.out.println(pma.getrMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().isDisplayed());
//		System.out.println(pma.getrMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().isSelected());
//		System.out.println(pma.getrMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().isEnabled());
//		System.out.println(pma.getrMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().getText());
//		System.out.println(pma.getrMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().getAttribute("checked"));
		
		
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
		FileInputStream fileInputStream= new FileInputStream(file);Thread.sleep(1000);//Bill Configuration
		Workbook workbook = new XSSFWorkbook(fileInputStream);		
	     Sheet sheet = workbook.getSheet("Bill Configuration");
	      Row row = sheet.getRow(2);
	      Cell cell = row.getCell(1);
	      String salTxafterDeduct = cell.getStringCellValue();
		if(salTxafterDeduct=="ON") {
			if(pma.getrMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().getAttribute("")=="ON") {	
			}else if (pma.getrMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().getAttribute("")=="OFF") {
				pma.getrMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().click();
			}
		}else if (salTxafterDeduct=="OFF") {
			if(pma.getrMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().getAttribute("")=="ON") {
				pma.getrMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().click();	
			}else if (pma.getrMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().getAttribute("")=="OFF") {
			}
		}else {
			Assert.assertTrue(false, "Invalid State");
		}
	}
	@Then("User should Enable or Disable Apply sales tax on Tip after Deductions Option #Excel Input")
	public void userShouldEnableOrDisableApplySalesTaxOnTipAfterDeductionsOptionExcelInput() throws InterruptedException, IOException {
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
		FileInputStream fileInputStream= new FileInputStream(file);Thread.sleep(1000);//Bill Configuration
		Workbook workbook = new XSSFWorkbook(fileInputStream);		
	     Sheet sheet = workbook.getSheet("Bill Configuration");
	      Row row = sheet.getRow(3);
	      Cell cell = row.getCell(1);
	      String salTxOnTipafterDeduct = cell.getStringCellValue();
		if(salTxOnTipafterDeduct=="ON") {
			if(pma.getrMS_SettingsPage_Configuration_POM().getgetApplySalesTaxontheTipafterDeductionsToggle().getAttribute("")=="ON") {	
			}else if (pma.getrMS_SettingsPage_Configuration_POM().getgetApplySalesTaxontheTipafterDeductionsToggle().getAttribute("")=="OFF") {
				pma.getrMS_SettingsPage_Configuration_POM().getgetApplySalesTaxontheTipafterDeductionsToggle().click();
			}
		}else if (salTxOnTipafterDeduct=="OFF") {
			if(pma.getrMS_SettingsPage_Configuration_POM().getgetApplySalesTaxontheTipafterDeductionsToggle().getAttribute("")=="ON") {
				pma.getrMS_SettingsPage_Configuration_POM().getgetApplySalesTaxontheTipafterDeductionsToggle().click();	
			}else if (pma.getrMS_SettingsPage_Configuration_POM().getgetApplySalesTaxontheTipafterDeductionsToggle().getAttribute("")=="OFF") {
			}
		}else {
			Assert.assertTrue(false, "Invalid State");
		}
	
	
	}
	@Then("User should enter the Service Fee Percentage #Excel Input")
	public void userShouldEnterTheServiceFeePercentageExcelInput() throws IOException, InterruptedException {
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
		FileInputStream fileInputStream= new FileInputStream(file);Thread.sleep(1000);//Bill Configuration
		Workbook workbook = new XSSFWorkbook(fileInputStream);		
	     Sheet sheet = workbook.getSheet("Bill Configuration");
	      Row row = sheet.getRow(3);
	      Cell cell = row.getCell(1);
	      double serFee = cell.getNumericCellValue(); // Need Float Validation
	      int serFeeInt=(int) serFee;
	      String SerFeeString = Integer.toString(serFeeInt);
	      pma.getrMS_SettingsPage_Configuration_POM().getServiceFeePercentageTextBox().sendKeys(SerFeeString);
	      
	}
	@Then("User should enable or Disable the Service fee tax option #Excel Input")
	public void userShouldEnableOrDisableTheServiceFeeTaxOptionExcelInput() throws IOException, InterruptedException {
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
		FileInputStream fileInputStream= new FileInputStream(file);Thread.sleep(1000);//Bill Configuration
		Workbook workbook = new XSSFWorkbook(fileInputStream);		
	     Sheet sheet = workbook.getSheet("Bill Configuration");
	      Row row = sheet.getRow(4);
	      Cell cell = row.getCell(1);
	      String serFeeTx = cell.getStringCellValue(); // Need Float Validation
	      
	      if(serFeeTx=="ON") {
				if(pma.getrMS_SettingsPage_Configuration_POM().getServiceFeePercentageInclusiveofSalesTaxToggle().getAttribute("")=="ON") {	
				}else if (pma.getrMS_SettingsPage_Configuration_POM().getServiceFeePercentageInclusiveofSalesTaxToggle().getAttribute("")=="OFF") {
					pma.getrMS_SettingsPage_Configuration_POM().getServiceFeePercentageInclusiveofSalesTaxToggle().click();
				}
			}else if (serFeeTx=="OFF") {
				if(pma.getrMS_SettingsPage_Configuration_POM().getServiceFeePercentageInclusiveofSalesTaxToggle().getAttribute("")=="ON") {
					pma.getrMS_SettingsPage_Configuration_POM().getServiceFeePercentageInclusiveofSalesTaxToggle().click();	
				}else if (pma.getrMS_SettingsPage_Configuration_POM().getServiceFeePercentageInclusiveofSalesTaxToggle().getAttribute("")=="OFF") {
				}
			}else {
				Assert.assertTrue(false, "Invalid State");
			}
	}
	@Then("User should enable or Disable the Apply service fee on the subtotal after deductions #Excel Input")
	public void userShouldEnableOrDisableTheApplyServiceFeeOnTheSubtotalAfterDeductionsExcelInput() throws IOException, InterruptedException {
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
		FileInputStream fileInputStream= new FileInputStream(file);Thread.sleep(1000);//Bill Configuration
		Workbook workbook = new XSSFWorkbook(fileInputStream);		
	     Sheet sheet = workbook.getSheet("Bill Configuration");
	      Row row = sheet.getRow(5);
	      Cell cell = row.getCell(1);
	      String serFeeonSubToAfterDedu = cell.getStringCellValue(); // Need Float Validation
	      
	      if(serFeeonSubToAfterDedu=="ON") {
				if(pma.getrMS_SettingsPage_Configuration_POM().getApplyServiceFeeOntheSubtotalafterDeductionsToggle().getAttribute("")=="ON") {	
				}else if (pma.getrMS_SettingsPage_Configuration_POM().getApplyServiceFeeOntheSubtotalafterDeductionsToggle().getAttribute("")=="OFF") {
					pma.getrMS_SettingsPage_Configuration_POM().getApplyServiceFeeOntheSubtotalafterDeductionsToggle().click();
				}
			}else if (serFeeonSubToAfterDedu=="OFF") {
				if(pma.getrMS_SettingsPage_Configuration_POM().getApplyServiceFeeOntheSubtotalafterDeductionsToggle().getAttribute("")=="ON") {
					pma.getrMS_SettingsPage_Configuration_POM().getApplyServiceFeeOntheSubtotalafterDeductionsToggle().click();	
				}else if (pma.getrMS_SettingsPage_Configuration_POM().getApplyServiceFeeOntheSubtotalafterDeductionsToggle().getAttribute("")=="OFF") {
				}
			}else {
				Assert.assertTrue(false, "Invalid State");
			}
	}
	@Then("User should click Save button in Bill Configuration page")
	public void userShouldClickSaveButtonInBillConfigurationPage() {
		pma.getrMS_SettingsPage_Configuration_POM().getBillSettingSaveButton().click();
	}
	@When("User should click gratuity configuration section")
	public void userShouldClickGratuityConfigurationSection() {
		pma.getrMS_SettingsPage_Configuration_POM().getGratuityConfigurationSections().click();
	}
	@Then("User enable or disable the Gratuity option #Excel Input")
	public void userEnableOrDisableTheGratuityOptionExcelInput() throws IOException, InterruptedException {
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
		FileInputStream fileInputStream= new FileInputStream(file);Thread.sleep(1000);//Bill Configuration
		Workbook workbook = new XSSFWorkbook(fileInputStream);		
	     Sheet sheet = workbook.getSheet("Bill Configuration");
	      Row row = sheet.getRow(8);
	      Cell cell = row.getCell(1);
	      String GradEnable = cell.getStringCellValue(); // Need Float Validation
	      
	      if(GradEnable=="ON") {
				if(pma.getrMS_SettingsPage_Configuration_POM().getEnableGratuityToggle().getAttribute("")=="ON") {	
				}else if (pma.getrMS_SettingsPage_Configuration_POM().getEnableGratuityToggle().getAttribute("")=="OFF") {
					pma.getrMS_SettingsPage_Configuration_POM().getEnableGratuityToggle().click();
				}
			}else if (GradEnable=="OFF") {
				if(pma.getrMS_SettingsPage_Configuration_POM().getEnableGratuityToggle().getAttribute("")=="ON") {
					pma.getrMS_SettingsPage_Configuration_POM().getEnableGratuityToggle().click();	
				}else if (pma.getrMS_SettingsPage_Configuration_POM().getEnableGratuityToggle().getAttribute("")=="OFF") {
				}
			}else {
				Assert.assertTrue(false, "Invalid State");
			}
	}
	@Then("User should select Checkbox Guest Count or Order Amount #Excel Input")
	public void userShouldSelectCheckboxGuestCountOrOrderAmountExcelInput() throws IOException, InterruptedException {
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
		FileInputStream fileInputStream= new FileInputStream(file);Thread.sleep(1000);//Bill Configuration
		Workbook workbook = new XSSFWorkbook(fileInputStream);		
	     Sheet sheet = workbook.getSheet("Bill Configuration");
	      Row row = sheet.getRow(9);
	      Cell cell = row.getCell(1);
	      String CheckboxOption = cell.getStringCellValue();
	      
	      //To be Continued
	}
	@Then("User should enter the Gratuity Percentage #Excel Input")
	public void userShouldEnterTheGratuityPercentageExcelInput() {
	}
	@Then("User should verify and Enter Gratuity eligibility #Excel Input Two")
	public void userShouldVerifyAndEnterGratuityEligibilityExcelInputExcelInputTwo() {
	}
	@Then("User should Enter the Gratuity tax percentage #Excel Input")
	public void userShouldEnterTheGratuityTaxPercentageExcelInput() {
	}
	@Then("User should enable or Disable the Apply gratuity on subtotal after deductions #Excel Input")
	public void userShouldEnableOrDisableTheApplyGratuityOnSubtotalAfterDeductionsExcelInput() {
	}
	@Then("User should click save button in Gratuity configuration page")
	public void userShouldClickSaveButtonInGratuityConfigurationPage() {
	}

}
