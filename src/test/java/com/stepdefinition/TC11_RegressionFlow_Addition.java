package com.stepdefinition;

import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

public class TC11_RegressionFlow_Addition extends BaseClass {

	PageManager pma = new PageManager();

	public TC11_RegressionFlow_Addition() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}

	

	
	
	
}
