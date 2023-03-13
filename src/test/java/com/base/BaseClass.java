package com.base;


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
	

}
