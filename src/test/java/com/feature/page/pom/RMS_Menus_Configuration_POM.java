package com.feature.page.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

public class RMS_Menus_Configuration_POM extends BaseClass{
PageManager pma = new PageManager();
	
	public RMS_Menus_Configuration_POM() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
	
	public WebElement get() {
		return rmsDriver.findElement(By.xpath(""));
	}
	
	
	
	
}

//23-03-2023 13:39
