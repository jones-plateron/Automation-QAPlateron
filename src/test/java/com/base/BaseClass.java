package com.base;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
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
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.AppiumDriver;

public class BaseClass {

	public static WebDriver rmsDriver;
	public static AppiumDriver posDriver1;
	public static AppiumDriver mobileDriver1;
	
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
		int cellType = cell.getCellType();
//		CellType cellType = cell.getCellType();
		switch (cellType) {
		case 0:
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
		case 1:
			String stringCellValue = cell.getStringCellValue();
			data=stringCellValue;
			break;
		default:
			break;
		}
		return data;
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
		File file =new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sheet\\Configsheet.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet dataSheet = workbook.getSheet(sheetName);
		Row row = dataSheet.getRow(rowIndex);
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
