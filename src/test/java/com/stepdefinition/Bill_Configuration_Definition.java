package com.stepdefinition;

import java.io.IOException;

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
	public void userShouldClickSettingsSections() throws InterruptedException {
		Thread.sleep(2000);
		pma.getRMS_SettingsPage_Configuration_POM().getSettingsSections().click();
	}
	@Then("User should verify the Page redirection to Settings Page {string}")
	public void userShouldVerifyThePageRedirectionToSettingsPage(String datePageHdr) {
		Assert.assertTrue(pma.getRMS_SettingsPage_Configuration_POM().getDateandTimeSecHeader().getText().contains(datePageHdr));
	}
	@Then("User should click Bill configuration and update the sales tax percentage #Excel Input")
	public void userShouldClickBillConfigurationAndUpdateTheSalesTaxPercentageExcelInput() throws InterruptedException, IOException {
		pma.getRMS_SettingsPage_Configuration_POM().getBillConfigurationOptionSections().click();
		
		String dataFromExcel = getDataFromExcel("Bill Configuration", 1, 1);
	      pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxTextBox().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));Thread.sleep(500);
//	      pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxTextBox().sendKeys(SalTx);
	      pma.getRMS_SettingsPage_Configuration_POM().getSalesTaxTextBox().sendKeys(dataFromExcel);
	      Thread.sleep(3000);
	}
	@Then("User should Enable or Disable Apply sales tax on Subtotal after Deductions Option #Excel Input")
	public void userShouldEnableOrDisableApplySalesTaxOnSubtotalAfterDeductionsOptionExcelInput() throws InterruptedException, IOException {
//		System.out.println(pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().isEnabled());
//		
//		System.out.println("xxxxxxxxxxxxxxxxxxxxxxx"+rmsDriver.findElement(By.cssSelector("#root > div > main > div > div.page-inner__content.pb-1.pt-1 > div.card.border.mw-750 > div > ul:nth-child(1) > li:nth-child(2) > div > div.form-toggle.ml-1 > label > span")).getCssValue("cursor")); 
//
//		pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().click();
//		System.out.println(pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().isEnabled());
		
		//System.out.println(pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().isDisplayed());
		//System.out.println(pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().isSelected());
//		System.out.println(pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().getText());
//		System.out.println(pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().getAttribute("checked"));
//		System.out.println(pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().isDisplayed());
//		System.out.println(pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().isSelected());
//		System.out.println(pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().getText());
//		System.out.println(pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().getAttribute("checked"));
//		
//		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
//		FileInputStream fileInputStream= new FileInputStream(file);Thread.sleep(1000);//Bill Configuration
//		Workbook workbook = new XSSFWorkbook(fileInputStream);		
//	     Sheet sheet = workbook.getSheet("Bill Configuration");
//	      Row row = sheet.getRow(2);
//	      Cell cell = row.getCell(1);
//	      String salTxafterDeduct = cell.getStringCellValue();
	      
		
	      String salTxafterDeduct = getDataFromExcel("Bill Configuration", 2, 1);
	      
		if(salTxafterDeduct=="ON") {
			if(pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().getAttribute("value").equals("true")) {	
			}else if (pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().getAttribute("value").equals("false")) {
				pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().click();
			}
		}else if (salTxafterDeduct=="OFF") {
			if(pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().getAttribute("value").equals("true")) {
				pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().click();	
			}else if (pma.getRMS_SettingsPage_Configuration_POM().getApplySalesTaxontheSubtotalafterDeductionsToggle().getAttribute("value").equals("false")) {
			}
		}else {
			Assert.assertTrue(false, "Invalid State");
		}
	}
	@Then("User should Enable or Disable Apply sales tax on Tip after Deductions Option #Excel Input")
	public void userShouldEnableOrDisableApplySalesTaxOnTipAfterDeductionsOptionExcelInput() throws InterruptedException, IOException {
//		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
//		FileInputStream fileInputStream= new FileInputStream(file);Thread.sleep(1000);//Bill Configuration
//		Workbook workbook = new XSSFWorkbook(fileInputStream);		
//	     Sheet sheet = workbook.getSheet("Bill Configuration");
//	      Row row = sheet.getRow(3);
//	      Cell cell = row.getCell(1);
//	      String salTxOnTipafterDeduct = cell.getStringCellValue();
		String salTxOnTipafterDeduct = getDataFromExcel("Bill Configuration", 3, 1);
		if(salTxOnTipafterDeduct=="ON") {
			if(pma.getRMS_SettingsPage_Configuration_POM().getgetApplySalesTaxontheTipafterDeductionsToggle().getAttribute("value").equals("true")) {	
			}else if (pma.getRMS_SettingsPage_Configuration_POM().getgetApplySalesTaxontheTipafterDeductionsToggle().getAttribute("value").equals("false")) {
				pma.getRMS_SettingsPage_Configuration_POM().getgetApplySalesTaxontheTipafterDeductionsToggle().click();
			}
		}else if (salTxOnTipafterDeduct=="OFF") {
			if(pma.getRMS_SettingsPage_Configuration_POM().getgetApplySalesTaxontheTipafterDeductionsToggle().getAttribute("value").equals("true")) {
				pma.getRMS_SettingsPage_Configuration_POM().getgetApplySalesTaxontheTipafterDeductionsToggle().click();	
			}else if (pma.getRMS_SettingsPage_Configuration_POM().getgetApplySalesTaxontheTipafterDeductionsToggle().getAttribute("value").equals("false")) {
			}
		}else {
			Assert.assertTrue(false, "Invalid State");
		}
	
	
	}
	@Then("User should enter the Service Fee Percentage #Excel Input")
	public void userShouldEnterTheServiceFeePercentageExcelInput() throws IOException, InterruptedException {
//		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
//		FileInputStream fileInputStream= new FileInputStream(file);Thread.sleep(1000);//Bill Configuration
//		Workbook workbook = new XSSFWorkbook(fileInputStream);		
//	     Sheet sheet = workbook.getSheet("Bill Configuration");
//	      Row row = sheet.getRow(3);
//	      Cell cell = row.getCell(1);
//	      double serFee = cell.getNumericCellValue(); // Need Float Validation
//	      int serFeeInt=(int) serFee;
//	      String SerFeeString = Integer.toString(serFeeInt);
		String serviceFeePerc = getDataFromExcel("Bill Configuration", 4, 1);
	      pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageTextBox().sendKeys(serviceFeePerc);
	      
	}
	@Then("User should enable or Disable the Service fee tax option #Excel Input")
	public void userShouldEnableOrDisableTheServiceFeeTaxOptionExcelInput() throws IOException, InterruptedException {
//		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
//		FileInputStream fileInputStream= new FileInputStream(file);Thread.sleep(1000);//Bill Configuration
//		Workbook workbook = new XSSFWorkbook(fileInputStream);		
//	     Sheet sheet = workbook.getSheet("Bill Configuration");
//	      Row row = sheet.getRow(5);
//	      Cell cell = row.getCell(1);
//	      String serFeeTx = cell.getStringCellValue(); // Need Float Validation
	    String SerFeeTXCheckBx = getDataFromExcel("Bill Configuration", 5, 1);  
		
	      if(SerFeeTXCheckBx=="ON") {
				if(pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageInclusiveofSalesTaxToggle().getAttribute("value").equals("true")) {	
				}else if (pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageInclusiveofSalesTaxToggle().getAttribute("value").equals("false")) {
					pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageInclusiveofSalesTaxToggle().click();
				}
			}else if (SerFeeTXCheckBx=="OFF") {
				if(pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageInclusiveofSalesTaxToggle().getAttribute("value").equals("true")) {
					pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageInclusiveofSalesTaxToggle().click();	
				}else if (pma.getRMS_SettingsPage_Configuration_POM().getServiceFeePercentageInclusiveofSalesTaxToggle().getAttribute("value").equals("false")) {
				}
			}else {
				Assert.assertTrue(false, "Invalid State");
			}
	}
	@Then("User should enable or Disable the Apply service fee on the subtotal after deductions #Excel Input")
	public void userShouldEnableOrDisableTheApplyServiceFeeOnTheSubtotalAfterDeductionsExcelInput() throws IOException, InterruptedException {
//		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
//		FileInputStream fileInputStream= new FileInputStream(file);Thread.sleep(1000);//Bill Configuration
//		Workbook workbook = new XSSFWorkbook(fileInputStream);		
//	     Sheet sheet = workbook.getSheet("Bill Configuration");
//	      Row row = sheet.getRow(5);
//	      Cell cell = row.getCell(1);
//	      String serFeeonSubToAfterDedu = cell.getStringCellValue(); // Need Float Validation
	    String serFeeonSubToAfterDedu = getDataFromExcel("Bill Configuration", 7, 1);
		
		
	      if(serFeeonSubToAfterDedu=="ON") {
				if(pma.getRMS_SettingsPage_Configuration_POM().getApplyServiceFeeOntheSubtotalafterDeductionsToggle().getAttribute("value").equals("true")) {	
				}else if (pma.getRMS_SettingsPage_Configuration_POM().getApplyServiceFeeOntheSubtotalafterDeductionsToggle().getAttribute("value").equals("false")) {
					pma.getRMS_SettingsPage_Configuration_POM().getApplyServiceFeeOntheSubtotalafterDeductionsToggle().click();
				}
			}else if (serFeeonSubToAfterDedu=="OFF") {
				if(pma.getRMS_SettingsPage_Configuration_POM().getApplyServiceFeeOntheSubtotalafterDeductionsToggle().getAttribute("value").equals("true")) {
					pma.getRMS_SettingsPage_Configuration_POM().getApplyServiceFeeOntheSubtotalafterDeductionsToggle().click();	
				}else if (pma.getRMS_SettingsPage_Configuration_POM().getApplyServiceFeeOntheSubtotalafterDeductionsToggle().getAttribute("value").equals("false")) {
				}
			}else {
				Assert.assertTrue(false, "Invalid State");
			}
	}
	@Then("User should click Save button in Bill Configuration page")
	public void userShouldClickSaveButtonInBillConfigurationPage() {
		pma.getRMS_SettingsPage_Configuration_POM().getBillSettingSaveButton().click();
	}
	@When("User should click gratuity configuration section")
	public void userShouldClickGratuityConfigurationSection() {
		pma.getRMS_SettingsPage_Configuration_POM().getGratuityConfigurationSections().click();
	}
	@Then("User enable or disable the Gratuity option #Excel Input")
	public void userEnableOrDisableTheGratuityOptionExcelInput() throws IOException, InterruptedException {
//		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
//		FileInputStream fileInputStream= new FileInputStream(file);Thread.sleep(1000);//Bill Configuration
//		Workbook workbook = new XSSFWorkbook(fileInputStream);		
//	     Sheet sheet = workbook.getSheet("Bill Configuration");
//	      Row row = sheet.getRow(8);
//	      Cell cell = row.getCell(1);
//	      String GradEnable = cell.getStringCellValue(); // Need Float Validation
		
		String GradEnable = getDataFromExcel("Bill Configuration", 8, 1);
	      
	      if(GradEnable=="ON") {
				if(pma.getRMS_SettingsPage_Configuration_POM().getEnableGratuityToggle().getAttribute("value").equals("true")) {	
				}else if (pma.getRMS_SettingsPage_Configuration_POM().getEnableGratuityToggle().getAttribute("value").equals("false")) {
					pma.getRMS_SettingsPage_Configuration_POM().getEnableGratuityToggle().click();
				}
			}else if (GradEnable=="OFF") {
				if(pma.getRMS_SettingsPage_Configuration_POM().getEnableGratuityToggle().getAttribute("value").equals("true")) {
					pma.getRMS_SettingsPage_Configuration_POM().getEnableGratuityToggle().click();	
				}else if (pma.getRMS_SettingsPage_Configuration_POM().getEnableGratuityToggle().getAttribute("value").equals("false")) {
				}
			}else {
				Assert.assertTrue(false, "Invalid State");
			}
	}
	@Then("User should select Checkbox Guest Count or Order Amount #Excel Input")
	public void userShouldSelectCheckboxGuestCountOrOrderAmountExcelInput() throws IOException, InterruptedException {
//		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
//		FileInputStream fileInputStream= new FileInputStream(file);Thread.sleep(1000);//Bill Configuration
//		Workbook workbook = new XSSFWorkbook(fileInputStream);		
//	     Sheet sheet = workbook.getSheet("Bill Configuration");
//	      Row row = sheet.getRow(9);
//	      Cell cell = row.getCell(1);
//	      String CheckboxOption = cell.getStringCellValue();
	      
		String CheckboxOption = getDataFromExcel("Bill Configuration", 9, 1);
		
	      if (CheckboxOption.equals("Guest Count")) {
	    	  pma.getRMS_SettingsPage_Configuration_POM().getGuestCountRadioButtonOption().click();
	    	   
	    	  
		} else if (CheckboxOption.equals("Order Amount")) {
			pma.getRMS_SettingsPage_Configuration_POM().getOrderAmountRadioButtonOption().click();
			
			// Need to Add takeAway & Dine-In
			
		}else {
			Assert.assertTrue(false,"Invalid Comments");
		}
	      
	}
	@Then("User should enter the Gratuity Percentage #Excel Input")
	public void userShouldEnterTheGratuityPercentageExcelInput() throws IOException, InterruptedException {
//		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
//		FileInputStream fileInputStream= new FileInputStream(file);Thread.sleep(1000);//Bill Configuration
//		Workbook workbook = new XSSFWorkbook(fileInputStream);		
//	     Sheet sheet = workbook.getSheet("Bill Configuration");
//	      Row row = sheet.getRow(10);
//	      Cell cell = row.getCell(1);
//	      double gratPer = cell.getNumericCellValue();
//	      int toConvert=(int) gratPer;
//	      String gratuityPercentage = Integer.toString(toConvert);
		
		String gratuityPercentage = getDataFromExcel("Bill Configuration", 10, 1);
	      pma.getRMS_SettingsPage_Configuration_POM().getGratuityPercentageTextBox().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	      pma.getRMS_SettingsPage_Configuration_POM().getGratuityPercentageTextBox().sendKeys(gratuityPercentage);
	}
	@Then("User should verify and Enter Gratuity eligibility #Excel Input Two")
	public void userShouldVerifyAndEnterGratuityEligibilityExcelInputExcelInputTwo() throws IOException, InterruptedException {
//		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
//		FileInputStream fileInputStream= new FileInputStream(file);Thread.sleep(500);//Bill Configuration
//		Workbook workbook = new XSSFWorkbook(fileInputStream);		
//	     Sheet sheet = workbook.getSheet("Bill Configuration");
//	      Row row = sheet.getRow(9);
//	      Cell cell = row.getCell(1);
//	      String CheckboxOption = cell.getStringCellValue();
		
			String CheckboxOption = getDataFromExcel("Bill Configuration", 9, 1);
	      if (CheckboxOption.equals("Guest Count")) {
//	    	  Row gCouRow = sheet.getRow(11);
//		      Cell gCouCell = gCouRow.getCell(1);
//		      double guestCnt = gCouCell.getNumericCellValue();
//	    	  int count=(int) guestCnt;
//	    	  String guestCount = Integer.toString(count);
	    	  String countOfGuest = getDataFromExcel("Bill Configuration", 11, 1);
//	    	  //pma.getRMS_SettingsPage_Configuration_POM().textboxforGuestCount $#$%^&*^%$#%^&*^%$^&*&^%$#$%^&^%$//enter count to Text Box
	    	  
		} else if (CheckboxOption.equals("Order Amount")) {
//			Row oAmtRow = sheet.getRow(11);
//		      Cell oAmtCell = oAmtRow.getCell(1);
//		      double ordAmt = oAmtCell.getNumericCellValue();
//	    	  int amount=(int) ordAmt;
//	    	  String orderAmount = Integer.toString(amount);
			String orderAmount = getDataFromExcel("Bill Configuration", 12, 1);
	    	  pma.getRMS_SettingsPage_Configuration_POM().getGratuitywillbeAddedonBillwhenSubtotalReachesthisAmountTextBox().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	    	  pma.getRMS_SettingsPage_Configuration_POM().getGratuitywillbeAddedonBillwhenSubtotalReachesthisAmountTextBox().sendKeys(orderAmount);
		}else {
			Assert.assertTrue(false,"Invalid Comments");
		}
	}
	@Then("User should Enter the Gratuity tax percentage #Excel Input")
	public void userShouldEnterTheGratuityTaxPercentageExcelInput() throws InterruptedException, IOException {
//		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
//		FileInputStream fileInputStream= new FileInputStream(file);Thread.sleep(1000);//Bill Configuration
//		Workbook workbook = new XSSFWorkbook(fileInputStream);		
//	     Sheet sheet = workbook.getSheet("Bill Configuration");
//	      Row row = sheet.getRow(13);
//	      Cell cell = row.getCell(1);
//	      double grdFeeTx = cell.getNumericCellValue(); // Need Float Validation
//	      int gratFeeTxInt=(int) grdFeeTx;
//	      String gratFeeTxIntStr = Integer.toString(gratFeeTxInt);
		
		String gratFeeTxIntStr = getDataFromExcel("Bill Configuration", 13, 1);
		
	      pma.getRMS_SettingsPage_Configuration_POM().getTaxtobeAppliedonGratuityAmountTextBox().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	      pma.getRMS_SettingsPage_Configuration_POM().getTaxtobeAppliedonGratuityAmountTextBox().sendKeys(gratFeeTxIntStr);
	}
	@Then("User should enable or Disable the Apply gratuity on subtotal after deductions #Excel Input")
	public void userShouldEnableOrDisableTheApplyGratuityOnSubtotalAfterDeductionsExcelInput() throws InterruptedException, IOException {
//		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
//		FileInputStream fileInputStream= new FileInputStream(file);Thread.sleep(1000);//Bill Configuration
//		Workbook workbook = new XSSFWorkbook(fileInputStream);		
//	     Sheet sheet = workbook.getSheet("Bill Configuration");
//	      Row row = sheet.getRow(16);
//	      Cell cell = row.getCell(1);
//	      String grdSubafterDeduct = cell.getStringCellValue();
		String grdSubafterDeduct = getDataFromExcel("Bill Configuration", 16, 1);
		
		if(grdSubafterDeduct=="ON") {
			if(pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsToggle().getAttribute("value").equals("true")) {	
			}else if (pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsToggle().getAttribute("value").equals("false")) {
				pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsToggle().click();
			}
		}else if (grdSubafterDeduct=="OFF") {
			if(pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsToggle().getAttribute("value").equals("true")) {
				pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsToggle().click();	
			}else if (pma.getRMS_SettingsPage_Configuration_POM().getApplyGratuityontheSubtotalafterDeductionsToggle().getAttribute("value").equals("false")) {
			}
		}else {
			Assert.assertTrue(false, "Invalid State");
		}
	}
	@Then("User should click save button in Gratuity configuration page")
	public void userShouldClickSaveButtonInGratuityConfigurationPage() {
		pma.getRMS_SettingsPage_Configuration_POM().getGratuityConfigurationSaveButton().click();
	}

}

//22-03-23	17:46
