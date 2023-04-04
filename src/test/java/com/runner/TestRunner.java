package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.JvmReport;

//import com.reports.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

 
@CucumberOptions( tags="@AddTables", stepNotifications = true, dryRun = false, features= "src\\test\\resources\\Feature\\", glue = "com.stepdefinition", 
monochrome = true,publish = true, snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE ,plugin = {"pretty", "json:target//output.json"})

//parallel = "methods", threads = 10
public class TestRunner {

	@AfterClass
	public static void afterClass() {
		JvmReport.generateJVMReport(System.getProperty("user.dir")+"\\target\\output.json");
	}
		
}
