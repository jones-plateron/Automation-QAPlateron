package com.feature.page.pom;

import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

public class RMS_Employee_Management_POM extends BaseClass{
	
	PageManager pma = new PageManager();
	
	public RMS_Employee_Management_POM() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
	
	
	
	
	
	
	
	
	
}
