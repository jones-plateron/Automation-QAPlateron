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
	public WebElement getTipReportElement() {
		return rmsDriver.findElement(By.xpath("//li[normalize-space()='Tip Report']"));
	}
	public WebElement getGratuityReportElement() {
		return rmsDriver.findElement(By.xpath("//li[normalize-space()='Gratuity Report']"));
	}
	public WebElement getTimesheetSectionElement() {
		return rmsDriver.findElement(By.xpath("//li[normalize-space()='Timesheet']"));
	}
	public WebElement getRefundReportElement() {
		return rmsDriver.findElement(By.xpath("//li[normalize-space()='Refund Report']"));
	}
	public WebElement getVoidReportElement() {
		return rmsDriver.findElement(By.xpath("//li[normalize-space()='Void Report']"));
	}
	public WebElement getDiscountsSectionElement() {
		return rmsDriver.findElement(By.xpath("//li[normalize-space()='Discounts']"));
	}
	public WebElement getEmployeeNameFilter() {
		return rmsDriver.findElement(By.xpath("(//span[@class='cursor-pointer w-150p text-left  placeholder-text'])[1]"));
	}
	public WebElement getOrderTypeFilter() {
		return rmsDriver.findElement(By.xpath("(//span[@class='cursor-pointer w-150p text-left  placeholder-text'])[2]"));
	}
	public WebElement getPaymenyModeFilter() {
		return rmsDriver.findElement(By.xpath("(//span[@class='cursor-pointer w-150p text-left  placeholder-text'])[3]"));
	}
	public WebElement get() {
		return rmsDriver.findElement(By.xpath(""));
	}
	public WebElement get12() {
		return rmsDriver.findElement(By.xpath(""));
	}
	public WebElement get8() {
		return rmsDriver.findElement(By.xpath("(//span[@class='cursor-pointer w-150p text-left  placeholder-text'])[1]"));
	}
	public WebElement get9() {
		return rmsDriver.findElement(By.xpath(""));
	}
	public WebElement get10() {
		return rmsDriver.findElement(By.xpath(""));
	}
	public WebElement get11() {
		return rmsDriver.findElement(By.xpath(""));
	}
	public WebElement get121() {
		return rmsDriver.findElement(By.xpath(""));
	}
	public WebElement get81() {
		return rmsDriver.findElement(By.xpath("(//span[@class='cursor-pointer w-150p text-left  placeholder-text'])[1]"));
	}
	public WebElement get91() {
		return rmsDriver.findElement(By.xpath(""));
	}
	public WebElement get102() {
		return rmsDriver.findElement(By.xpath(""));
	}
	public WebElement get112() {
		return rmsDriver.findElement(By.xpath(""));
	}
	public WebElement get122() {
		return rmsDriver.findElement(By.xpath(""));
	}
	
	
	
	
}
