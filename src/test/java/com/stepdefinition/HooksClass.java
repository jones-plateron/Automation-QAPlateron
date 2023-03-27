package com.stepdefinition;

import java.io.IOException;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
/*
 * Used For Driver Initializing, Quitting Driver and Screenshot
 */

public class HooksClass  extends BaseClass{

	@Before
	public void beforeClassMethod() throws IOException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@After
	public void afterClassMethod(Scenario scen) throws IOException {
		// close & Screenshot
		if(scen.isFailed()){
		  scen.attach(scenerioScreenshot(), "images/png","Scenario Output Screenshot");
		 }

		 //System.out.println(scen.isFailed());
		rmsDriver.quit();

	}

}
