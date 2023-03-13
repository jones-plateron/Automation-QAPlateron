package com.pagemanager;

import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.feature.page.pom.RMS_Employee_Management_POM;

public class PageManager extends BaseClass{
	
	private RMS_Employee_Management_POM rMS_Employee_Management_POM; 
	
	public PageManager() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
	
	public RMS_Employee_Management_POM getRMS_Employee_Management_POM() {
		return (rMS_Employee_Management_POM==null)? rMS_Employee_Management_POM = new RMS_Employee_Management_POM (): rMS_Employee_Management_POM;
	}
	

}

