package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

/* @description Process JSON report and Generate JVMReport
 */

public class JvmReport {
	
	public static void generateJVMReport(String jsonFile) {
		
		File f = new File(System.getProperty("user.dir")+"\\target");
		
		Configuration config = new Configuration(f, "Regression Testing Report ");
		config.addClassifications("Operating Platform", "Windows");
		config.addClassifications("Application Type", "Mobile");
		config.addClassifications("Version", "11");
		config.addClassifications("Driver", "Appium");
		config.addClassifications("Build Version", " ");
		List<String> li = new ArrayList<String>();
		li.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(li, config);
		builder.generateReports();
	}

}
