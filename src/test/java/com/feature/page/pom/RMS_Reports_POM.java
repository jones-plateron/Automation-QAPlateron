package com.feature.page.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

public class RMS_Reports_POM extends BaseClass{
PageManager pma = new PageManager();
	
	public RMS_Reports_POM() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
}
	public WebElement getReportsSectionElement() {
		return rmsDriver.findElement(By.xpath("//li[@id='Reports']"));
	}
	public WebElement getSalesSummaryElement() {
		return rmsDriver.findElement(By.xpath("//li[normalize-space()='Sales Summary']"));
	}
	public WebElement getSalesReportElement() {
		return rmsDriver.findElement(By.xpath("//li[normalize-space()='Sales Report']"));
	}
	public WebElement getTaxReportElement() {
		return rmsDriver.findElement(By.xpath("//li[normalize-space()='Tax Report']"));
	}
	public WebElement getHappyHourSalesElement() {
		return rmsDriver.findElement(By.xpath("//li[normalize-space()='Happy Hour Sales']"));
	}
	public WebElement getTopMenuItemsElement() {
		return rmsDriver.findElement(By.xpath("//li[normalize-space()='Top Menu Items']"));
	}
	public WebElement get6() {
		return rmsDriver.findElement(By.xpath(""));
	}
	public WebElement get7() {
		return rmsDriver.findElement(By.xpath(""));
	}
	public WebElement get8() {
		return rmsDriver.findElement(By.xpath(""));
	}
	
	
	
}
