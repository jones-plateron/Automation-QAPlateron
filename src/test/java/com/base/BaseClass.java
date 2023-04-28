package com.base;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pagemanager.PageManager;

import io.appium.java_client.AppiumDriver;

public class BaseClass {

	public static WebDriver rmsDriver;
	public static AppiumDriver posDriver1;
	public static AppiumDriver mobileDriver1;
//	PageManager pma = new PageManager();
	public String specialChar = "!@#$%%^&*()_+";
	public String upperCase = "AUTOMATIONTEXT";
	public String lowerCase = "automationtext";
	public String numbers = "1234567890";
	public String text = "!@#$%^&*()abcdefghijABCDEFGHIJ1234567890AutomationTestRegression";
	
	public BaseClass() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
		
	}
	
	
	
	
	
	public String getDataFromExcel(String sheet,int rowIndex, int cellIndex) throws IOException {
		String data=null;
		File file =new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet dataSheet = workbook.getSheet(sheet);
		Row row = dataSheet.getRow(rowIndex);
		Cell cell = row.getCell(cellIndex);
		CellType cellType = cell.getCellType();
//		CellType cellType = cell.getCellType();
		switch (cellType) {
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat reqFormat=new SimpleDateFormat("dd/MM/YYYY");
				String formatedDate = reqFormat.format(dateCellValue);
				data= formatedDate;
			}else {
				double numericCellValue = cell.getNumericCellValue();
				long roundedValue = Math.round(numericCellValue);
				if(roundedValue==numericCellValue) {
					String stringValue = String.valueOf(roundedValue);
					data=stringValue;
				}else {
					String stringValue = String.valueOf(numericCellValue);
					data=stringValue;
				}
			}
			break;
		case STRING:
			String stringCellValue = cell.getStringCellValue();
			data=stringCellValue;
			break;
		default:
			break;
		}
		return data;
	}
	
	public void posLoginWithEmployeePin(String employeePIN) {}
	
	
	
	public String randomNameGenerator() {
		String[] firstNames = {"Adam", "Alice", "Bobby", "Charlie", "David", "Emma", "Frank", "Grace", "Helen", "Ivy", "Kelly"};
	    String[] lastNames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor"};
	    Random rand = new Random();
	    int indexFN = rand.nextInt(firstNames.length);
	    int indexLN = rand.nextInt(lastNames.length);
	    
        String randomName = firstNames[indexFN] + " " + lastNames[indexLN];
        return randomName;
	}
	
	public String randomMobileNumberGeneration() {
		Random random1 = new Random();
        StringBuilder sb1 = new StringBuilder();
        for (int k = 0; k < 10; k++) {
            sb1.append(random1.nextInt(10));
            }
        String randomNum = sb1.toString();
		return randomNum;
	}
	
	
	
	
	
	
	
	
	
	public String formatStringValue(String val) {
		DecimalFormat df = new DecimalFormat("#.00");
//		df.setMinimumFractionDigits(2);
		String roundedVal = df.format(val);
		//		float roundedVal = Float.parseFloat(df.format(val));
		return roundedVal;
	}
	
	
	
	
	
	
	
	
	
	public float subtotalAfterApplyingDiscountWOExcludeItems(List<Float> menus,float discPercentage) {
		
		float discountAmtOfMenu,subTotalAfterDiscount=0,discountAmt=0,MenuAfterDiscount;
		DecimalFormat df = new DecimalFormat("#.##");
		for (int i = 0; i < menus.size(); i++) {
			Float menuItem = menus.get(i);
			discountAmtOfMenu=(menuItem*discPercentage/100);
			
			MenuAfterDiscount=(menuItem-discountAmtOfMenu);
			
			discountAmt=(discountAmt+roundFloatValue(discountAmtOfMenu));
			subTotalAfterDiscount=(subTotalAfterDiscount+MenuAfterDiscount);
		}
		
		float discountAmt1 = Float.valueOf(df.format(discountAmt));
		return discountAmt1;
	}
	public float roundFloatValue(float val) {
		DecimalFormat df = new DecimalFormat("#.00");
		df.setMinimumFractionDigits(2);
		float roundedVal = Float.parseFloat(df.format(val));
		//		float roundedVal = Float.parseFloat(df.format(val));
		return roundedVal;
	}
	public String roundStringValue(float val) {
		DecimalFormat df = new DecimalFormat("#.00");
		df.setMinimumFractionDigits(2);
		String roundedVal = df.format(val);
		//		float roundedVal = Float.parseFloat(df.format(val));
		return roundedVal;
	}
	
	public List<Map<String,Float>> calculationSummary(Map<String,Float> menus,Map<String,Float> entityPercentages){
		List<Map<String,Float>> allMenuEntityValues = new LinkedList<>();
		
		
		Set<Entry<String, Float>> eachMenu = menus.entrySet();
		for (Entry<String, Float> menuSet : eachMenu) {
			Map<String,Float> individualEntityValues= new LinkedHashMap<>();
//			String key = menuSet.getKey();
			Float value = menuSet.getValue();
			
			Float salesTaxPercentage = entityPercentages.get("salesTaxPercentage");
			Float serviceFeePercentage = entityPercentages.get("serviceFeePercentage");
			Float serviceFeeTaxPercentage = entityPercentages.get("serviceFeeTaxPercentage");
			Float gratuityPercentage = entityPercentages.get("gratuityPercentage");
			Float gratuityTaxPercentage = entityPercentages.get("gratuityTaxPercentage");
			
			Float salesTax= value*salesTaxPercentage/100;
			Float serviceFee= value*serviceFeePercentage/100;
			Float serviceFeeTax= serviceFee*serviceFeeTaxPercentage/100;
			Float gratuity= value*gratuityPercentage/100;
			Float gratuityTax= gratuity*gratuityTaxPercentage/100;
			
			individualEntityValues.put("salesTax", salesTax);
			individualEntityValues.put("serviceFee", serviceFee);
			individualEntityValues.put("serviceFeeTax", serviceFeeTax);
			individualEntityValues.put("gratuity", gratuity);
			individualEntityValues.put("gratuityTax", gratuityTax);
			
			allMenuEntityValues.add(individualEntityValues);
		}
		return allMenuEntityValues;
	}
	
	public Map<String,Float> grandCalculationSummary(Map<String,Float> menus,Map<String,Float> entityPercentages){
		List<Map<String,Float>> allIndividualMenuEntityValues = new LinkedList<>();
		Map<String,Float> grandEntitySummary=new LinkedHashMap<String, Float>();
		
		Set<Entry<String, Float>> eachMenu = menus.entrySet();
		for (Entry<String, Float> menuSet : eachMenu) {
			Map<String,Float> individualEntityValues= new LinkedHashMap<>();
//			String key = menuSet.getKey();
			Float value = menuSet.getValue();
			
			Float salesTaxPercentage = entityPercentages.get("salesTaxPercentage");
			Float serviceFeePercentage = entityPercentages.get("serviceFeePercentage");
			Float serviceFeeTaxPercentage = entityPercentages.get("serviceFeeTaxPercentage");
			Float gratuityPercentage = entityPercentages.get("gratuityPercentage");
			Float gratuityTaxPercentage = entityPercentages.get("gratuityTaxPercentage");
			
			Float salesTax= value*salesTaxPercentage/100;
			Float serviceFee= value*serviceFeePercentage/100;
			Float serviceFeeTax= serviceFee*serviceFeeTaxPercentage/100;
			Float gratuity= value*gratuityPercentage/100;
			Float gratuityTax= gratuity*gratuityTaxPercentage/100;
			
			individualEntityValues.put("salesTax", salesTax);
			individualEntityValues.put("serviceFee", serviceFee);
			individualEntityValues.put("serviceFeeTax", serviceFeeTax);
			individualEntityValues.put("gratuity", gratuity);
			individualEntityValues.put("gratuityTax", gratuityTax);
			
			allIndividualMenuEntityValues.add(individualEntityValues);
		}
		float salesTax=0,serviceFee=0,serviceFeeTax=0,gratuity=0,gratuityTax=0;
		for (int i = 0; i < allIndividualMenuEntityValues.size(); i++) {			
			Map<String, Float> eachMap = allIndividualMenuEntityValues.get(i);
			
			salesTax = salesTax+eachMap.get("salesTax");
			serviceFee = serviceFee+eachMap.get("serviceFee");
			serviceFeeTax = serviceFeeTax+eachMap.get("serviceFeeTax");
			gratuity = gratuity+eachMap.get("gratuity");
			gratuityTax = gratuityTax+eachMap.get("gratuityTax");
		}
		
		grandEntitySummary.put("salesTax", salesTax);
		grandEntitySummary.put("serviceFee", serviceFee);
		grandEntitySummary.put("serviceFeeTax", serviceFeeTax);
		grandEntitySummary.put("gratuity", gratuity);
		grandEntitySummary.put("gratuityTax", gratuityTax);
		
		return grandEntitySummary;
	}
	
	//Exclude Items Added, Need to add Discount percentage
	public Map<String,Float> grandCalculationSummaryAfterDiscount(Map<String,Float> menus,Map<String,Float> entityPercentages,List<String> Excluded,float discountPercentage){
		List<Map<String,Float>> allIndividualMenuEntityValues = new LinkedList<>();
		Map<String,Float> grandEntitySummary=new LinkedHashMap<String, Float>();
		
		Set<Entry<String, Float>> eachMenu = menus.entrySet();
		for (Entry<String, Float> menuSet : eachMenu) {
			Map<String,Float> individualEntityValues= new LinkedHashMap<>();
			String key = menuSet.getKey();
			float discountAmt=0;
			boolean tag=false;
				
				for (int j = 0; j < Excluded.size(); j++) {
					if (key.equals(Excluded.get(j))) {
						Float value = menuSet.getValue();   	//Discount Accommodation
						//Float value= menuP -(menuP*discountPercentage/100);
						
						
						Float salesTaxPercentage = entityPercentages.get("salesTaxPercentage");
						Float serviceFeePercentage = entityPercentages.get("serviceFeePercentage");
						Float serviceFeeTaxPercentage = entityPercentages.get("serviceFeeTaxPercentage");
						Float gratuityPercentage = entityPercentages.get("gratuityPercentage");
						Float gratuityTaxPercentage = entityPercentages.get("gratuityTaxPercentage");
						
						Float salesTax= value*salesTaxPercentage/100;
						Float serviceFee= value*serviceFeePercentage/100;
						Float serviceFeeTax= serviceFee*serviceFeeTaxPercentage/100;
						Float gratuity= value*gratuityPercentage/100;
						Float gratuityTax= gratuity*gratuityTaxPercentage/100;
						
						individualEntityValues.put("salesTax", salesTax);
						individualEntityValues.put("serviceFee", serviceFee);
						individualEntityValues.put("serviceFeeTax", serviceFeeTax);
						individualEntityValues.put("gratuity", gratuity);
						individualEntityValues.put("gratuityTax", gratuityTax);
						
						allIndividualMenuEntityValues.add(individualEntityValues);
						
						tag=true;
					}
				}
				
				if (tag==false) {

					Float menuP = menuSet.getValue();   	//Discount Accommodation
					Float valueBeforeRound= menuP -(menuP*discountPercentage/100);
					float value = roundFloatValue(valueBeforeRound);
					
					discountAmt=roundFloatValue((menuP*discountPercentage/100));
					
					Float salesTaxPercentage = entityPercentages.get("salesTaxPercentage");
					Float serviceFeePercentage = entityPercentages.get("serviceFeePercentage");
					Float serviceFeeTaxPercentage = entityPercentages.get("serviceFeeTaxPercentage");
					Float gratuityPercentage = entityPercentages.get("gratuityPercentage");
					Float gratuityTaxPercentage = entityPercentages.get("gratuityTaxPercentage");
					
					Float salesTax= menuP*salesTaxPercentage/100;
					Float serviceFee= value*serviceFeePercentage/100;
					Float serviceFeeTax= serviceFee*serviceFeeTaxPercentage/100;
					Float gratuity= value*gratuityPercentage/100;
					Float gratuityTax= gratuity*gratuityTaxPercentage/100;
					
					individualEntityValues.put("salesTax", salesTax);
					individualEntityValues.put("serviceFee", serviceFee);
					individualEntityValues.put("serviceFeeTax", serviceFeeTax);
					individualEntityValues.put("gratuity", gratuity);
					individualEntityValues.put("gratuityTax", gratuityTax);
					individualEntityValues.put("discount", discountAmt);
					
					allIndividualMenuEntityValues.add(individualEntityValues);
				}
				float salesTax=0,serviceFee=0,serviceFeeTax=0,gratuity=0,gratuityTax=0,totalDiscountAmt=0;
				for (int i = 0; i < allIndividualMenuEntityValues.size(); i++) {			
					Map<String, Float> eachMap = allIndividualMenuEntityValues.get(i);
					
					salesTax = salesTax+eachMap.get("salesTax");
					serviceFee = serviceFee+eachMap.get("serviceFee");
					serviceFeeTax = serviceFeeTax+eachMap.get("serviceFeeTax");
					gratuity = gratuity+eachMap.get("gratuity");
					gratuityTax = gratuityTax+eachMap.get("gratuityTax");
					totalDiscountAmt = totalDiscountAmt+eachMap.get("discount");
					}
				
				grandEntitySummary.put("salesTax", salesTax);
				grandEntitySummary.put("serviceFee", serviceFee);
				grandEntitySummary.put("serviceFeeTax", serviceFeeTax);
				grandEntitySummary.put("gratuity", gratuity);
				grandEntitySummary.put("gratuityTax", gratuityTax);
				grandEntitySummary.put("discount", totalDiscountAmt);
			}
		
		return grandEntitySummary;
	}
	
	
	
	
	public Map<String,Float> roundCalculationSummary(Map<String,Float> summary) {
		Map<String,Float> roundedCalculationSummary= new LinkedHashMap<>();
		
		Set<Entry<String, Float>> entitySet = summary.entrySet();
		
		for (Entry<String, Float> entry : entitySet) {
			float roundFloatValue = roundFloatValue(entry.getValue());
			roundedCalculationSummary.put(entry.getKey(), roundFloatValue);
		}
		return roundedCalculationSummary;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public float salesTax(List<Float> menuPrices,float salTaxPercentage) { //Modified for Menu wise and Round off
		float tot=0;
		for (int i = 0; i < menuPrices.size(); i++) {
			float indvMenu = menuPrices.get(i);
			tot =tot +indvMenu*salTaxPercentage/100;
		}
		float roundedValue = roundFloatValue(tot);		
		return roundedValue;
	}
	public float serviceFee(List<Float> menuPrices,float serFeePercentage) { //Modified for Menu wise and Round off
		float tot=0;
		for (int i = 0; i < menuPrices.size(); i++) {
			float indvMenu = menuPrices.get(i);
			tot =tot +indvMenu*serFeePercentage/100;
		}
		float roundedValue = roundFloatValue(tot);		
		return roundedValue;
	}
	public float serviceFeeDiscount(float menuPrices,float serFeePercentage) { //Modified for Menu wise and Round off
		 float tot =menuPrices*serFeePercentage/100;
		float roundedValue = roundFloatValue(tot);		
		return roundedValue;
	}
	public float serviceFeeTax(float SalesTax,float serFeeTxPercentage) {
		float serviceFeeTax=(SalesTax*serFeeTxPercentage/100);
		float roundedValue = roundFloatValue(serviceFeeTax);
		return roundedValue;
	}
	public float gratuity(List<Float> menuPrices,float gratuityPercentage) { //Modified for Menu wise and Round off
		float tot=0;
		for (int i = 0; i < menuPrices.size(); i++) {
			float indvMenu = menuPrices.get(i);
			tot =tot +indvMenu*gratuityPercentage/100;
		}
		float roundedValue = roundFloatValue(tot);		
		return roundedValue;
	}
	public float gratuityDiscount(float menuPrices,float gratuityPercentage) { //Modified for Menu wise and Round off
		float tot=(menuPrices*gratuityPercentage/100);
		float roundedValue = roundFloatValue(tot);		
		return roundedValue;
	}
	public float gratuityTax(float gratuity,float gratuityTaxPercentage) {
		float gratuityTax=(gratuity*gratuityTaxPercentage/100);
		float roundedValue = roundFloatValue(gratuityTax);
		return roundedValue;
	}
	public String getAttributeJsExecutor(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) rmsDriver;
		Object script = js.executeScript("return arguments[0].getAttribute('value')",element);
		String text = (String) script;
		return text;
	}
	
	public void screenCaptureAsJpeg(String screenshotPath) throws IOException {
		TakesScreenshot screenShot = (TakesScreenshot) rmsDriver;
		File screenshotAsFile = screenShot.getScreenshotAs(OutputType.FILE);
		File fileCopy = new File(screenshotPath);
		FileUtils.copyFile(screenshotAsFile, fileCopy);
	}
	public void sendKeysByJsExecutor(WebElement element, String text) {
		JavascriptExecutor js = (JavascriptExecutor) rmsDriver;
		js.executeScript("arguments[0].setAttribute('value','"+text+"')",element);
	}
	public byte[] screenShot() {
		TakesScreenshot tk = (TakesScreenshot) rmsDriver;
		byte[] b = tk.getScreenshotAs(OutputType.BYTES);
		return b;
	}
	public byte[] scenerioScreenshot() {
		byte[] scrFile = ((TakesScreenshot) rmsDriver).getScreenshotAs(OutputType.BYTES);
		return scrFile;
	}
	
	public void clickWebElement(WebElement element) {
		element.click();
	}
	public void clickWebElementUsingJavascript(WebElement element) {
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) rmsDriver;
		javascriptExecutor.executeScript("arguments[0].click", element);
	}
	public void sendValueToWebElement(WebElement element, String value) {
		element.sendKeys(value);
	}
	public void sendValueToWebElementUsingJavascript(WebElement element, String value) {
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) rmsDriver;
		javascriptExecutor.executeScript("arguments[0].value("+value+")",element);
	}
	public String getValueFromWebElement(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	public void selectWebElementUsingIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public void selectWebElementUsingValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public void selectWebElementUsingVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public void deselectWebElementUsingIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}
	public void deselectWebElementUsingValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}
	public void deselectWebElementUsingVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}
	
	public void writeValueToCell(String sheetName,int rowIndex,int cellIndex,String Data) throws IOException {
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
		FileInputStream fileInputStream= new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet dataSheet = workbook.getSheet(sheetName);
		Row row;

//		try {
//			row = dataSheet.getRow(rowIndex);
//		} catch (Exception e) {
			row = dataSheet.getRow(rowIndex);
//		}
		
		
		Cell cell = row.createCell(cellIndex);
		cell.setCellValue(Data);
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);
	}
	
//	public void getValueFromCell(String sheetName,int rowIndex,int cellIndex) throws IOException {
//		File file =new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
//		FileInputStream fileInputStream = new FileInputStream(file);
//		Workbook workbook = new XSSFWorkbook(fileInputStream);
//		Sheet dataSheet = workbook.getSheet(sheetName);
//		Row row = dataSheet.getRow(rowIndex);
//		Cell cell = row.createCell(cellIndex);
//		cell.setCellValue(Data);
//		FileOutputStream fileOutputStream = new FileOutputStream(file);
//		workbook.write(fileOutputStream);
//	}


}
