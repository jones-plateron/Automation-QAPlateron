package com.stepdefinition;

import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

public class RMS_Menu_Items_Configuration_Definition extends BaseClass{
	
	PageManager pma = new PageManager();
	
	//!@#$%^&*()abcdefghijABCDEFGHIJ1234567890Automation
	
	public RMS_Menu_Items_Configuration_Definition() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
	
	
	
	

	
}
