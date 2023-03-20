package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
<<<<<<< HEAD
@CucumberOptions( tags="@Rolesandpermission1233", stepNotifications = true, dryRun = false, features= "src\\test\\resources\\Feature\\", glue = "com.stepdefinition", 
=======
@CucumberOptions( tags="@EmployeeCreation", stepNotifications = true, dryRun = false, features= "src\\test\\resources\\Feature\\", glue = "com.stepdefinition", 
>>>>>>> b92b992cabde1c4d85ef73018bbc94147c68e6c0
monochrome = true,publish = true, snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE ,plugin = {"pretty", "json:target//output.json"})
public class TestRunner {

	@AfterClass
	public static void afterClass() {
		JvmReport.generateJVMReport(System.getProperty("user.dir")+"\\target\\output.json");
	}
	
	
}
